package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: hiq  reason: default package */
/* loaded from: classes.dex */
final class hiq implements Application.ActivityLifecycleCallbacks, ifw {
    private static final hhl a = hhq.e("max_activity_font_scale", 1.5d);
    private final Application b;

    public hiq(Application application) {
        this.b = application;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("activity font scale max value: ".concat(String.valueOf(String.valueOf(a.c()))));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ActivityFontScaleRestrictionModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.b.registerActivityLifecycleCallbacks(this);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.b.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        float floatValue = ((Double) a.c()).floatValue();
        Resources resources = activity.getResources();
        if (resources.getConfiguration().fontScale > floatValue) {
            Configuration configuration = resources.getConfiguration();
            configuration.fontScale = floatValue;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
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
}
