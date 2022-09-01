package defpackage;

import android.app.Activity;
import android.app.Application;

/* compiled from: PG */
/* renamed from: agh  reason: default package */
/* loaded from: classes.dex */
final class agh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
