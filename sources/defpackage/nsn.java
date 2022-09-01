package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* renamed from: nsn  reason: default package */
/* loaded from: classes2.dex */
public final class nsn extends nsu implements Closeable {
    public final nsv a;
    public ScheduledFuture b;
    private final nsu h = new nsu(this, this.f);
    private ArrayList i;
    private nso j;
    private Throwable k;
    private boolean l;

    public nsn(nsu nsuVar) {
        super(nsuVar, nsuVar.f);
        this.a = nsuVar.b();
    }

    @Override // defpackage.nsu
    public final nsu a() {
        return this.h.a();
    }

    @Override // defpackage.nsu
    public final nsv b() {
        return this.a;
    }

    @Override // defpackage.nsu
    public final Throwable c() {
        if (i()) {
            return this.k;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j(null);
    }

    @Override // defpackage.nsu
    public final void d(nso nsoVar, Executor executor) {
        l(nsoVar, "cancellationListener");
        l(executor, "executor");
        e(new nsq(executor, nsoVar, this));
    }

    public final void e(nsq nsqVar) {
        synchronized (this) {
            if (i()) {
                nsqVar.a();
            } else {
                ArrayList arrayList = this.i;
                if (arrayList != null) {
                    arrayList.add(nsqVar);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    this.i = arrayList2;
                    arrayList2.add(nsqVar);
                    nsn nsnVar = this.e;
                    if (nsnVar != null) {
                        this.j = new nyr(this, 1);
                        nsnVar.e(new nsq(nsp.a, this.j, this));
                    }
                }
            }
        }
    }

    @Override // defpackage.nsu
    public final void f(nsu nsuVar) {
        this.h.f(nsuVar);
    }

    @Override // defpackage.nsu
    public final void g(nso nsoVar) {
        h(nsoVar, this);
    }

    public final void h(nso nsoVar, nsu nsuVar) {
        synchronized (this) {
            ArrayList arrayList = this.i;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    nsq nsqVar = (nsq) this.i.get(size);
                    if (nsqVar.a == nsoVar && nsqVar.b == nsuVar) {
                        this.i.remove(size);
                        break;
                    }
                }
                if (this.i.isEmpty()) {
                    nsn nsnVar = this.e;
                    if (nsnVar != null) {
                        nsnVar.h(this.j, nsnVar);
                    }
                    this.j = null;
                    this.i = null;
                }
            }
        }
    }

    @Override // defpackage.nsu
    public final boolean i() {
        synchronized (this) {
            if (this.l) {
                return true;
            }
            if (!super.i()) {
                return false;
            }
            j(super.c());
            return true;
        }
    }

    public final void j(Throwable th) {
        int i;
        ScheduledFuture scheduledFuture;
        boolean z;
        synchronized (this) {
            if (!this.l) {
                z = true;
                this.l = true;
                scheduledFuture = this.b;
                if (scheduledFuture != null) {
                    this.b = null;
                } else {
                    scheduledFuture = null;
                }
                this.k = th;
            } else {
                scheduledFuture = null;
                z = false;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (z) {
            synchronized (this) {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                nso nsoVar = this.j;
                this.j = null;
                this.i = null;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    nsq nsqVar = (nsq) arrayList.get(i2);
                    if (nsqVar.b == this) {
                        nsqVar.a();
                    }
                }
                int size2 = arrayList.size();
                for (i = 0; i < size2; i++) {
                    nsq nsqVar2 = (nsq) arrayList.get(i);
                    if (nsqVar2.b != this) {
                        nsqVar2.a();
                    }
                }
                nsn nsnVar = this.e;
                if (nsnVar == null) {
                    return;
                }
                nsnVar.h(nsoVar, nsnVar);
            }
        }
    }

    public nsn(nsu nsuVar, nsv nsvVar) {
        super(nsuVar, nsuVar.f);
        this.a = nsvVar;
    }
}
