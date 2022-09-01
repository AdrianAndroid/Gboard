package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.UserManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gkm  reason: default package */
/* loaded from: classes.dex */
public final class gkm {
    public static final /* synthetic */ int a = 0;
    private static UserManager b;
    private static volatile boolean c = !e();

    private gkm() {
    }

    public static Context a(Context context) {
        return (!e() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
    }

    public static mko b(final Context context, final Runnable runnable) {
        if (d(context)) {
            runnable.run();
            return mkk.a;
        }
        return iq.b(new rl() { // from class: gkk
            @Override // defpackage.rl
            public final Object a(rj rjVar) {
                Runnable runnable2 = runnable;
                Context context2 = context;
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                gkl gklVar = new gkl(atomicBoolean, runnable2, rjVar);
                context2.registerReceiver(gklVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                if (!gkm.d(context2) || !atomicBoolean.compareAndSet(false, true)) {
                    rjVar.a(new epv(atomicBoolean, context2, gklVar, 11), mjl.a);
                    return "DirectBootUtils.runWhenUnlocked";
                }
                context2.unregisterReceiver(gklVar);
                runnable2.run();
                rjVar.c(null);
                return "DirectBootUtils.runWhenUnlocked";
            }
        });
    }

    public static boolean c(Context context) {
        return e() && !f(context);
    }

    public static boolean d(Context context) {
        return !e() || f(context);
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean f(android.content.Context r7) {
        /*
            boolean r0 = defpackage.gkm.c
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<gkm> r0 = defpackage.gkm.class
            monitor-enter(r0)
            boolean r2 = defpackage.gkm.c     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            return r1
        Lf:
            r2 = 1
        L10:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L48
            android.os.UserManager r3 = defpackage.gkm.b     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L23
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> L52
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> L52
            defpackage.gkm.b = r3     // Catch: java.lang.Throwable -> L52
        L23:
            android.os.UserManager r3 = defpackage.gkm.b     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L29
            r5 = 1
            goto L4c
        L29:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.NullPointerException -> L3b java.lang.Throwable -> L52
            if (r6 != 0) goto L39
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L3b java.lang.Throwable -> L52
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.NullPointerException -> L3b java.lang.Throwable -> L52
            if (r7 != 0) goto L48
        L39:
            r5 = 1
            goto L48
        L3b:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L52
            defpackage.gkm.b = r4     // Catch: java.lang.Throwable -> L52
            int r2 = r2 + 1
            goto L10
        L48:
            if (r5 == 0) goto L4c
            defpackage.gkm.b = r4     // Catch: java.lang.Throwable -> L52
        L4c:
            if (r5 == 0) goto L50
            defpackage.gkm.c = r1     // Catch: java.lang.Throwable -> L52
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            return r5
        L52:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            goto L56
        L55:
            throw r7
        L56:
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkm.f(android.content.Context):boolean");
    }
}
