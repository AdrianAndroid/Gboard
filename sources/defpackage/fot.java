package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fot  reason: default package */
/* loaded from: classes.dex */
public final class fot implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final fot a = new fot();
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicBoolean c = new AtomicBoolean();
    private final ArrayList d = new ArrayList();
    private boolean e = false;

    private fot() {
    }

    public static void b(Application application) {
        fot fotVar = a;
        synchronized (fotVar) {
            if (!fotVar.e) {
                application.registerActivityLifecycleCallbacks(fotVar);
                application.registerComponentCallbacks(fotVar);
                fotVar.e = true;
            }
        }
    }

    private final void d(boolean z) {
        synchronized (a) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((fos) it.next()).a(z);
            }
        }
    }

    public final void a(fos fosVar) {
        synchronized (a) {
            this.d.add(fosVar);
        }
    }

    public final boolean c() {
        return this.b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            d(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            d(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i != 20 || !this.b.compareAndSet(false, true)) {
            return;
        }
        this.c.set(true);
        d(true);
    }
}
