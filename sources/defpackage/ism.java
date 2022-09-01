package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ism  reason: default package */
/* loaded from: classes.dex */
public final class ism {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/taskscheduler/TaskSchedulerFactory");
    private static final isl b = new isl();
    private static final Object c = new Object();
    private static volatile isf d;

    public static isf a(Context context) {
        isf isfVar = d;
        if (isfVar == null) {
            synchronized (c) {
                isfVar = d;
                if (isfVar == null) {
                    try {
                        isfVar = new isj(context.getApplicationContext());
                    } catch (RuntimeException e) {
                        ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSchedulerFactory", "getJobSchedulerImpl", '4', "TaskSchedulerFactory.java")).t("Failed to instance JobSchedulerImpl.");
                        isfVar = null;
                    }
                    if (isfVar == null) {
                        ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSchedulerFactory", "createInstance", 44, "TaskSchedulerFactory.java")).t("Use dummy task scheduler.");
                        isfVar = b;
                    }
                    d = isfVar;
                }
            }
        }
        return isfVar;
    }
}
