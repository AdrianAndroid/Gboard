package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: opr  reason: default package */
/* loaded from: classes2.dex */
public final class opr {
    private ExecutorService c;
    public int a = 5;
    public final Deque b = new ArrayDeque();
    private final Deque d = new ArrayDeque();
    private final Deque e = new ArrayDeque();

    public opr() {
    }

    private final void g(Deque deque, Object obj) {
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        e();
    }

    public final synchronized ExecutorService a() {
        if (this.c == null) {
            this.c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), oqs.o("OkHttp Dispatcher", false));
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(oqh oqhVar) {
        this.e.add(oqhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(oqg oqgVar) {
        g(this.d, oqgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(oqh oqhVar) {
        g(this.e, oqhVar);
    }

    public final void e() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.b.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                oqg oqgVar = (oqg) it.next();
                if (this.d.size() >= 64) {
                    break;
                }
                for (oqg oqgVar2 : this.d) {
                    oqh oqhVar = oqgVar2.a;
                    if (oqgVar2.a().equals(oqgVar.a())) {
                        i++;
                    }
                }
                if (i < this.a) {
                    it.remove();
                    arrayList.add(oqgVar);
                    this.d.add(oqgVar);
                }
            }
            f();
        }
        int size = arrayList.size();
        while (i < size) {
            ((oqg) arrayList.get(i)).c(a());
            i++;
        }
    }

    public final synchronized void f() {
        this.d.size();
        this.e.size();
    }

    public opr(ExecutorService executorService) {
        this.c = executorService;
    }
}
