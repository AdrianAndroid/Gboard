package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: kcm  reason: default package */
/* loaded from: classes.dex */
public final class kcm implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final /* synthetic */ int c = 0;
    private Boolean i;
    private volatile String j;
    private volatile Activity k;
    private final jlr m;
    public final List a = new CopyOnWriteArrayList();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger b = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();
    private final AtomicInteger h = new AtomicInteger();
    private boolean l = false;

    public kcm(jlr jlrVar, byte[] bArr) {
        this.m = jlrVar;
    }

    private final void a(Activity activity) {
        c(kcn.b(activity.getApplicationContext()), activity);
    }

    private final void b() {
        if (!this.l && this.d.get() == 0) {
            if (this.m.c()) {
                this.l = true;
                return;
            }
            throw new IllegalStateException("Primes did not observe lifecycle events in the expected order. Either you are initializing Primes incorrectly, or your tests are calling lifecycle methods incorrectly.");
        }
    }

    private final void c(boolean z, Activity activity) {
        Boolean bool = this.i;
        if (bool == null || bool.booleanValue() != z) {
            this.i = Boolean.valueOf(z);
            if (z) {
                for (kck kckVar : this.a) {
                    if (kckVar instanceof kci) {
                        ((kci) kckVar).b(activity);
                    }
                }
                return;
            }
            for (kck kckVar2 : this.a) {
                if (kckVar2 instanceof kch) {
                    ((kch) kckVar2).c(activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.d.incrementAndGet();
        this.k = null;
        for (kck kckVar : this.a) {
            if (kckVar instanceof kca) {
                ((kca) kckVar).a(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.h.getAndIncrement() == 0) {
            b();
        }
        this.k = null;
        for (kck kckVar : this.a) {
            if (kckVar instanceof kcb) {
                ((kcb) kckVar).b(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f.getAndIncrement() == 0) {
            b();
        }
        this.j = null;
        for (kck kckVar : this.a) {
            if (kckVar instanceof kcc) {
                ((kcc) kckVar).b(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.b.getAndIncrement() == 0) {
            b();
        }
        this.k = null;
        this.j = activity.getClass().getSimpleName();
        for (kck kckVar : this.a) {
            if (kckVar instanceof kcd) {
                ((kcd) kckVar).a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (kck kckVar : this.a) {
            if (kckVar instanceof kce) {
                ((kce) kckVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.e.getAndIncrement() == 0) {
            b();
        }
        this.k = null;
        a(activity);
        for (kck kckVar : this.a) {
            if (kckVar instanceof kcf) {
                ((kcf) kckVar).b(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.g.getAndIncrement() == 0) {
            b();
        }
        this.k = activity;
        for (kck kckVar : this.a) {
            if (kckVar instanceof kcg) {
                ((kcg) kckVar).a();
            }
        }
        a(activity);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        for (kck kckVar : this.a) {
            if (kckVar instanceof kcj) {
                ((kcj) kckVar).a();
            }
        }
        if (i >= 20 && this.k != null) {
            c(false, this.k);
        }
        this.k = null;
    }
}
