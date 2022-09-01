package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: ub  reason: default package */
/* loaded from: classes2.dex */
public final class ub {
    protected static final Class a;
    protected static final Field b;
    protected static final Field c;
    public static final Method d;
    public static final Method e;
    protected static final Method f;
    private static final Handler g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            defpackage.ub.g = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            defpackage.ub.a = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r2 = r0
        L24:
            defpackage.ub.b = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L32
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r2 = r0
        L34:
            defpackage.ub.c = r2
            java.lang.Class r2 = defpackage.ub.a
            java.lang.String r3 = "performStopActivity"
            r4 = 3
            r5 = 2
            r6 = 0
            if (r2 != 0) goto L41
        L3f:
            r2 = r0
            goto L59
        L41:
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L57
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L57
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L57
            r7[r1] = r8     // Catch: java.lang.Throwable -> L57
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r7)     // Catch: java.lang.Throwable -> L57
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            goto L3f
        L59:
            defpackage.ub.d = r2
            java.lang.Class r2 = defpackage.ub.a
            if (r2 != 0) goto L61
        L5f:
            r2 = r0
            goto L75
        L61:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L73
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L73
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L73
            r7[r1] = r8     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r7)     // Catch: java.lang.Throwable -> L73
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L73
            goto L75
        L73:
            goto L5f
        L75:
            defpackage.ub.e = r2
            java.lang.Class r2 = defpackage.ub.a
            boolean r3 = c()
            if (r3 == 0) goto Lba
            if (r2 != 0) goto L82
            goto Lba
        L82:
            r3 = 9
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Lba
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            r3[r6] = r7     // Catch: java.lang.Throwable -> Lba
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r3[r1] = r6     // Catch: java.lang.Throwable -> Lba
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r3[r5] = r6     // Catch: java.lang.Throwable -> Lba
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lba
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lba
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lba
            r5 = 4
            r3[r5] = r4     // Catch: java.lang.Throwable -> Lba
            java.lang.Class<android.content.res.Configuration> r4 = android.content.res.Configuration.class
            r5 = 5
            r3[r5] = r4     // Catch: java.lang.Throwable -> Lba
            java.lang.Class<android.content.res.Configuration> r4 = android.content.res.Configuration.class
            r5 = 6
            r3[r5] = r4     // Catch: java.lang.Throwable -> Lba
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lba
            r5 = 7
            r3[r5] = r4     // Catch: java.lang.Throwable -> Lba
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lba
            r5 = 8
            r3[r5] = r4     // Catch: java.lang.Throwable -> Lba
            java.lang.String r4 = "requestRelaunchActivity"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)     // Catch: java.lang.Throwable -> Lba
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> Lba
            r0 = r2
        Lba:
            defpackage.ub.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub.<clinit>():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean a(Object obj, int i, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                g.postAtFrontOfQueue(new bw(b.get(activity), obj2, 10));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean b(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (c() && f == null) {
            return false;
        } else {
            if (e == null && d == null) {
                return false;
            }
            try {
                Object obj2 = c.get(activity);
                if (obj2 == null || (obj = b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                ua uaVar = new ua(activity);
                application.registerActivityLifecycleCallbacks(uaVar);
                Handler handler = g;
                handler.post(new bw(uaVar, obj2, 8));
                if (c()) {
                    f.invoke(obj, obj2, null, null, 0, false, null, null, false, false);
                } else {
                    activity.recreate();
                }
                handler.post(new bw(application, uaVar, 9));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    private static boolean c() {
        return Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27;
    }
}
