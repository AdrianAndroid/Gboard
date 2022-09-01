package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: ua  reason: default package */
/* loaded from: classes2.dex */
public final class ua implements Application.ActivityLifecycleCallbacks {
    public Object a;
    private Activity b;
    private final int c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;

    public ua(Activity activity) {
        this.b = activity;
        this.c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.b == activity) {
            this.b = null;
            this.e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.e || this.f || this.d || !ub.a(this.a, this.c, activity)) {
            return;
        }
        this.f = true;
        this.a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
