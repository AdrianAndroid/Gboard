package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: ang  reason: default package */
/* loaded from: classes.dex */
public final class ang {
    public static final Executor a = Executors.newCachedThreadPool();
    public volatile ane b;
    private final Set c;
    private final Set d;
    private final Handler e;

    public ang(Callable callable) {
        this(callable, false);
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            asa.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ana) arrayList.get(i)).a(th);
        }
    }

    public final synchronized void b(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ana) arrayList.get(i)).a(obj);
        }
    }

    public final void c(ane aneVar) {
        if (this.b != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.b = aneVar;
        this.e.post(new od(this, 19));
    }

    public final synchronized void d(ana anaVar) {
        if (this.b != null && this.b.b != null) {
            anaVar.a(this.b.b);
        }
        this.d.add(anaVar);
    }

    public final synchronized void e(ana anaVar) {
        if (this.b != null && this.b.a != null) {
            anaVar.a(this.b.a);
        }
        this.c.add(anaVar);
    }

    public final synchronized void f(ana anaVar) {
        this.d.remove(anaVar);
    }

    public final synchronized void g(ana anaVar) {
        this.c.remove(anaVar);
    }

    public ang(Callable callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.d = new LinkedHashSet(1);
        this.e = new Handler(Looper.getMainLooper());
        this.b = null;
        if (z) {
            try {
                c((ane) callable.call());
                return;
            } catch (Throwable th) {
                c(new ane(th));
                return;
            }
        }
        a.execute(new anf(this, callable));
    }
}
