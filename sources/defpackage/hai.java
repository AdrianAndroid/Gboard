package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Printer;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* renamed from: hai  reason: default package */
/* loaded from: classes.dex */
public final class hai implements Application.ActivityLifecycleCallbacks, ifw {
    private final Application a;

    public hai(Application application) {
        oll.e(application, "application");
        this.a = application;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        oll.e(context, "applicationContext");
        this.a.registerActivityLifecycleCallbacks(this);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.a.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        oll.e(activity, "activity");
        oll.e(activity, "<this>");
        if (activity instanceof hah) {
            oll.e(activity, "<this>");
            View decorView = activity.getWindow().getDecorView();
            oll.d(decorView, "window.decorView");
            hqs.e(decorView, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        oll.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        oll.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        oll.e(activity, "activity");
        if (hqs.g(activity)) {
            Window window = activity.getWindow();
            tw.d(window, false);
            window.setNavigationBarColor(0);
            window.setStatusBarColor(0);
            oll.e(activity, "<this>");
            View findViewById = activity.findViewById(16908290);
            if (findViewById != null) {
                aad.V(findViewById, hak.a);
            }
            ((hah) activity).gb();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        oll.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        oll.e(activity, "activity");
        oll.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        oll.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        oll.e(activity, "activity");
    }
}
