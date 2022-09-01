package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: krs  reason: default package */
/* loaded from: classes.dex */
public final class krs {
    private static krs a;
    private boolean b;
    private File c;

    private krs(Context context) {
        Method method;
        this.b = false;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null");
        }
        ClassLoader classLoader = context.getClassLoader();
        String str = null;
        if (classLoader != null) {
            try {
                Class<?> loadClass = classLoader.loadClass("android.os.SystemProperties");
                if (loadClass != null && (method = loadClass.getMethod("get", String.class)) != null) {
                    String str2 = (String) method.invoke(loadClass, "blackbox.tracing");
                    if (!TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        this.b = Boolean.parseBoolean(str);
        File file = new File(context.getCacheDir(), "blackbox_states.log");
        this.c = file;
        if (!this.b) {
            return;
        }
        file.getAbsolutePath();
    }

    public static void a(String str, int i, String str2) {
        krs krsVar = a;
        if (krsVar == null || !krsVar.b) {
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("Module can't be null");
        }
        if (str.indexOf(44) >= 0) {
            throw new IllegalArgumentException("Module identifiers can't contain the ', character");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(',');
        sb.append(i);
        if (str2 != null) {
            sb.append(',');
            sb.append(str2);
        }
        krsVar.c(sb.toString());
    }

    public static synchronized void b(Context context) {
        synchronized (krs.class) {
            if (a == null) {
                a = new krs(context);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0064 A[Catch: all -> 0x0060, IOException -> 0x0067, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:10:0x0027, B:45:0x005c, B:40:0x0064, B:43:0x0067, B:33:0x0049, B:24:0x004e), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void c(java.lang.CharSequence r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.io.File r2 = r5.c     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            r3 = 1
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.io.PrintStream r2 = new java.io.PrintStream     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            java.lang.String r4 = "UTF8"
            r2.<init>(r1, r3, r4)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            java.nio.channels.FileLock r0 = r0.lock()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r2.append(r6)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r3 = 10
            r2.append(r3)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r6.toString()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r0.release()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r2.close()     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L60
            r1.close()     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L60
            monitor-exit(r5)
            return
        L2f:
            monitor-exit(r5)
            return
        L31:
            r6 = move-exception
            goto L59
        L33:
            r6 = move-exception
            goto L39
        L35:
            r6 = move-exception
            goto L5a
        L37:
            r6 = move-exception
            r2 = r0
        L39:
            r0 = r1
            goto L40
        L3b:
            r6 = move-exception
            r1 = r0
            goto L5a
        L3e:
            r6 = move-exception
            r2 = r0
        L40:
            java.lang.String r1 = "StateTracer"
            java.lang.String r3 = "Failed to append state"
            android.util.Log.w(r1, r3, r6)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L53 java.lang.Throwable -> L60
        L4c:
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.io.IOException -> L53 java.lang.Throwable -> L60
            monitor-exit(r5)
            return
        L53:
            monitor-exit(r5)
            return
        L55:
            monitor-exit(r5)
            return
        L57:
            r6 = move-exception
            r1 = r0
        L59:
            r0 = r2
        L5a:
            if (r0 == 0) goto L62
            r0.close()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L67
            goto L62
        L60:
            r6 = move-exception
            goto L68
        L62:
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L67
        L67:
            throw r6     // Catch: java.lang.Throwable -> L60
        L68:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krs.c(java.lang.CharSequence):void");
    }
}
