package defpackage;

import android.os.Looper;
import android.util.Log;

/* compiled from: PG */
/* renamed from: fto  reason: default package */
/* loaded from: classes.dex */
public final class fto {
    private static volatile ClassLoader a;
    private static volatile Thread b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (fto.class) {
            if (a == null) {
                a = b();
            }
            classLoader = a;
        }
        return classLoader;
    }

    private static synchronized ClassLoader b() {
        synchronized (fto.class) {
            ClassLoader classLoader = null;
            if (b == null) {
                b = c();
                if (b == null) {
                    return null;
                }
            }
            synchronized (b) {
                try {
                    classLoader = b.getContextClassLoader();
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + message);
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread c() {
        SecurityException e;
        ftn ftnVar;
        ftn ftnVar2;
        ThreadGroup threadGroup;
        synchronized (fto.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            ftnVar2 = null;
                            break;
                        }
                        ftnVar2 = threadArr[i];
                        if ("GmsDynamite".equals(ftnVar2.getName())) {
                            break;
                        }
                        i++;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    ftnVar = null;
                }
                if (ftnVar2 == null) {
                    try {
                        ftnVar = new ftn(threadGroup);
                        try {
                            ftnVar.setContextClassLoader(null);
                            ftnVar.start();
                        } catch (SecurityException e3) {
                            e = e3;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                            ftnVar2 = ftnVar;
                            return ftnVar2;
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        ftnVar = ftnVar2;
                    }
                    ftnVar2 = ftnVar;
                }
            }
            return ftnVar2;
        }
    }
}
