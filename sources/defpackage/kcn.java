package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* renamed from: kcn  reason: default package */
/* loaded from: classes.dex */
public final class kcn {
    public static volatile ActivityManager a;
    static volatile boolean b;

    private kcn() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r3 == null) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = "/proc/"
            int r1 = android.os.Process.myPid()
            r2 = 0
            if (r1 > 0) goto La
            goto L45
        La:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L40
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L40
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L40
            r5.append(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L40
            java.lang.String r0 = "/cmdline"
            r5.append(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L40
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L40
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L40
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L40
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L37
            defpackage.jdg.u(r0)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L37
            java.lang.String r2 = r0.trim()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L37
        L30:
            r3.close()     // Catch: java.io.IOException -> L45
            goto L45
        L34:
            r0 = move-exception
            r2 = r3
            goto L3a
        L37:
            goto L42
        L39:
            r0 = move-exception
        L3a:
            if (r2 == 0) goto L3f
            r2.close()     // Catch: java.io.IOException -> L3f
        L3f:
            throw r0
        L40:
            r3 = r2
        L42:
            if (r3 == 0) goto L45
            goto L30
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcn.a():java.lang.String");
    }

    public static boolean b(Context context) {
        Object systemService = context.getSystemService("activity");
        jdg.u(systemService);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = context.getPackageName();
            String concat = String.valueOf(packageName).concat(":");
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(concat))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
