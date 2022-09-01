package com.google.android.libraries.inputmethod.nativelib;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NativeLibHelper {
    public static volatile Context a;
    private static volatile boolean e;
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/nativelib/NativeLibHelper");
    private static final AtomicBoolean d = new AtomicBoolean();
    private static final qo f = new qo();
    public static volatile llw b = lrq.b;
    private static final AtomicBoolean g = new AtomicBoolean(false);

    private NativeLibHelper() {
    }

    public static boolean a(String str, boolean z) {
        String str2 = (String) b.getOrDefault(str, str);
        Long l = null;
        if ("integrated_shared_object".equals(str2) && !g.getAndSet(true)) {
            l = Long.valueOf(SystemClock.elapsedRealtime());
        }
        boolean d2 = d(str2, z);
        if (l != null) {
            ieh.j().g(ihn.a, SystemClock.elapsedRealtime() - l.longValue());
        }
        return d2;
    }

    static boolean b(String str, boolean z) {
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e2) {
            ((ltd) ((ltd) ((ltd) c.b()).i(e2)).k("com/google/android/libraries/inputmethod/nativelib/NativeLibHelper", "loadLibraryInternal", 159, "NativeLibHelper.java")).G("Failed to load library %s due to %s.", str, e2);
            Context context = a;
            if (context == null) {
                UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Context is not available when loading native library: ".concat(String.valueOf(str)));
                ieh.j().e(idd.NATIVE_LIB_LOAD_FAILED, unsatisfiedLinkError);
                if (z) {
                    throw unsatisfiedLinkError;
                }
                return false;
            }
            boolean e3 = e(context, str);
            ieh.j().e(idd.NATIVE_LIB_RELINKER, Boolean.valueOf(e3));
            if (e3) {
                return true;
            }
            String format = String.format("lib%s.so", str);
            String str2 = context.getApplicationInfo().sourceDir;
            String format2 = String.format("lib/%s/lib%s.so", Build.CPU_ABI, str);
            String format3 = String.format(Locale.US, "%s/%s%d", context.getFilesDir(), "temp_lib_", Integer.valueOf(jam.e(context)));
            String format4 = String.format(Locale.US, "%s/%s", format3, format);
            synchronized (c(str)) {
                try {
                    System.load(format4);
                } catch (UnsatisfiedLinkError e4) {
                    ((ltd) ((ltd) ((ltd) c.b()).i(e4)).k("com/google/android/libraries/inputmethod/nativelib/NativeLibHelper", "loadLibraryInternal", 195, "NativeLibHelper.java")).G("Failed to load library %s due to %s.", format4, e4);
                    if (d.compareAndSet(false, true)) {
                        gxo.a(19).execute(new ihi(context, 3));
                    }
                    try {
                        if (!e) {
                            synchronized (NativeLibHelper.class) {
                                if (!e) {
                                    e = true;
                                    new File(format3).mkdirs();
                                }
                            }
                        }
                        ZipFile zipFile = new ZipFile(str2);
                        try {
                            ZipEntry entry = zipFile.getEntry(format2);
                            if (entry == null) {
                                ((ltd) ((ltd) c.c()).k("com/google/android/libraries/inputmethod/nativelib/NativeLibHelper", "unzip", 274, "NativeLibHelper.java")).G("There is no zip entry in %s for library %s", str2, format2);
                            } else {
                                InputStream inputStream = zipFile.getInputStream(entry);
                                if (inputStream == null) {
                                    ((ltd) ((ltd) c.c()).k("com/google/android/libraries/inputmethod/nativelib/NativeLibHelper", "unzip", 279, "NativeLibHelper.java")).G("Failed to create input stream from %s for library %s", str2, format2);
                                } else {
                                    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(format4);
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int read = bufferedInputStream.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, read);
                                        }
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                        bufferedInputStream.close();
                                        inputStream.close();
                                    } catch (Throwable th) {
                                        try {
                                            bufferedInputStream.close();
                                        } catch (Throwable th2) {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        }
                                        throw th;
                                    }
                                }
                            }
                            zipFile.close();
                            System.load(format4);
                            ieh.j().e(idd.NATIVE_LIB_UNZIP_LOAD, true);
                        } catch (Throwable th3) {
                            try {
                                zipFile.close();
                            } catch (Throwable th4) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                            }
                            throw th3;
                        }
                    } catch (IOException | UnsatisfiedLinkError e5) {
                        ltg ltgVar = c;
                        ((ltd) ((ltd) ((ltd) ltgVar.b()).i(e5)).k("com/google/android/libraries/inputmethod/nativelib/NativeLibHelper", "loadLibraryInternal", 214, "NativeLibHelper.java")).G("Failed to unzip library %s due to %s.", format2, e5);
                        ((ltd) ((ltd) ltgVar.c()).k("com/google/android/libraries/inputmethod/nativelib/NativeLibHelper", "loadLibraryInternal", 216, "NativeLibHelper.java")).w("Error loading native library %s.", str);
                        UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("Error loading native library:" + str);
                        ieh.j().e(idd.NATIVE_LIB_LOAD_FAILED, unsatisfiedLinkError2);
                        ieh.j().e(idd.NATIVE_LIB_UNZIP_LOAD, false);
                        if (z) {
                            throw unsatisfiedLinkError2;
                        }
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static synchronized Object c(String str) {
        synchronized (NativeLibHelper.class) {
            qo qoVar = f;
            Object obj = qoVar.get(str);
            if (obj == null) {
                Object obj2 = new Object();
                qoVar.put(str, obj2);
                return obj2;
            }
            return obj;
        }
    }

    private static boolean d(String str, boolean z) {
        if (jam.b) {
            return true;
        }
        return b(str, z);
    }

    private static boolean e(Context context, String str) {
        try {
            synchronized (c(str)) {
                ce.g(jbt.m(context), str, new HashSet(), null);
            }
            return true;
        } catch (RuntimeException | UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public static void loadIntegratedSharedObjectLibrary(boolean z) {
        d("integrated_shared_object", z);
    }
}
