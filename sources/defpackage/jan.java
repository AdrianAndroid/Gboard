package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* compiled from: PG */
/* renamed from: jan  reason: default package */
/* loaded from: classes.dex */
public final class jan {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/utils/FileOperationUtils");
    public static final jan b = new jan();

    static {
        new BigDecimal(1024);
        new MathContext(2, RoundingMode.HALF_UP);
        new MathContext(4, RoundingMode.HALF_UP);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000b A[Catch: IOException -> 0x001e, TryCatch #0 {IOException -> 0x001e, blocks: (B:3:0x0003, B:9:0x000b, B:11:0x0011), top: B:2:0x0003 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0017 -> B:6:0x0019). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(java.io.InputStream r8, int r9, java.io.OutputStream r10) {
        /*
            r0 = 0
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r1]     // Catch: java.io.IOException -> L1e
            if (r9 <= r1) goto L8
            goto L19
        L8:
            r3 = r9
        L9:
            if (r9 <= 0) goto L1c
            int r3 = r8.read(r2, r0, r3)     // Catch: java.io.IOException -> L1e
            if (r3 <= 0) goto L1c
            r10.write(r2, r0, r3)     // Catch: java.io.IOException -> L1e
            int r3 = r9 - r3
            r9 = r3
            if (r3 <= r1) goto L9
        L19:
            r3 = 1024(0x400, float:1.435E-42)
            goto L9
        L1c:
            r8 = 1
            return r8
        L1e:
            r8 = move-exception
            r7 = r8
            ltg r8 = defpackage.jan.a
            ltv r1 = r8.c()
            java.lang.String r2 = "Failed to copy file"
            java.lang.String r3 = "com/google/android/libraries/inputmethod/utils/FileOperationUtils"
            java.lang.String r4 = "copyStreamWithoutClose"
            r5 = 742(0x2e6, float:1.04E-42)
            java.lang.String r6 = "FileOperationUtils.java"
            defpackage.f.h(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jan.d(java.io.InputStream, int, java.io.OutputStream):boolean");
    }

    public static final byte[] n(File file) {
        if (file.isDirectory() || !file.canRead()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "readBytes", 812, "FileOperationUtils.java")).w("Cannot read from %s", file.getPath());
            return null;
        }
        long length = file.length();
        if (length == 0) {
            return gvw.a;
        }
        if (length > 2147483639) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "readBytes", 820, "FileOperationUtils.java")).w("Attempted to read too many bytes from %s", file.getPath());
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[(int) length];
            lyp.d(fileInputStream, bArr);
            fileInputStream.close();
            return bArr;
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "readBytes", 828, "FileOperationUtils.java")).w("Failed to read %s", file.getPath());
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [ngz, java.lang.Object] */
    public final ngz a(File file, nhf nhfVar) {
        nfb b2 = nfb.b();
        if (file.isDirectory() || !file.canRead()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "readProto", 837, "FileOperationUtils.java")).w("Cannot read from %s", file.getPath());
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ?? g = nhfVar.g(fileInputStream, b2);
                fileInputStream.close();
                return g;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (IOException | IllegalStateException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "readProto", 845, "FileOperationUtils.java")).w("Failed to read %s", file.getPath());
            return null;
        }
    }

    public final File b(String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "createDirIfNotExists", 887, "FileOperationUtils.java")).w("Could not create the directory %s", str);
        }
        return file;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00ab: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:34:0x00ab */
    public final boolean c(File file, File file2) {
        IOException e;
        AutoCloseable autoCloseable;
        Throwable th;
        FileInputStream fileInputStream;
        if (!file.exists()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "copy", 445, "FileOperationUtils.java")).w("Cannot copy non-existing file %s", file.getPath());
            return false;
        } else if (file.isDirectory()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "copy", 449, "FileOperationUtils.java")).w("Cannot copy directory %s", file.getPath());
            return false;
        } else {
            e(file2);
            AutoCloseable autoCloseable2 = null;
            try {
                try {
                    try {
                        lyu a2 = lyu.a();
                        try {
                            fileInputStream = new FileInputStream(file);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            a2.d(fileOutputStream);
                            boolean d = d(fileInputStream, (int) file.length(), fileOutputStream);
                            gvt.a(fileInputStream);
                            return d;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw a2.b(th);
                            } finally {
                                a2.close();
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        autoCloseable2 = autoCloseable;
                        gvt.a(autoCloseable2);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "copy", 471, "FileOperationUtils.java")).G("Failed to copy from %s to %s", file.getAbsoluteFile(), file2.getAbsolutePath());
                    gvt.a(null);
                    return false;
                }
            } catch (IOException e3) {
                e = e3;
                ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "copy", 471, "FileOperationUtils.java")).G("Failed to copy from %s to %s", file.getAbsoluteFile(), file2.getAbsolutePath());
                gvt.a(null);
                return false;
            } catch (Throwable th5) {
                th = th5;
                gvt.a(autoCloseable2);
                throw th;
            }
        }
    }

    public final boolean e(File file) {
        return f(file, null);
    }

    public final boolean f(File file, FileFilter fileFilter) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(fileFilter);
            for (int i = 0; listFiles != null && i < listFiles.length; i++) {
                e(listFiles[i]);
            }
        }
        return file.delete();
    }

    public final boolean g(File file) {
        return file != null && file.exists();
    }

    public final boolean h(File file) {
        if (file.exists()) {
            return true;
        }
        if (file.mkdirs()) {
            if (file.setWritable(true)) {
                return true;
            }
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "mkdirs", 280, "FileOperationUtils.java")).w("Cannot set writable %s", file);
            return false;
        } else if (file.exists()) {
            return true;
        } else {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "mkdirs", 288, "FileOperationUtils.java")).w("Cannot create directory %s", file);
            return false;
        }
    }

    public final boolean i(File file, File file2) {
        if (!file.exists()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "move", 333, "FileOperationUtils.java")).w("Cannot move non-existing file %s", file.getPath());
            return false;
        } else if (file.isDirectory()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "move", 337, "FileOperationUtils.java")).w("Cannot move directory %s", file.getPath());
            return false;
        } else {
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "move", 343, "FileOperationUtils.java")).w("Cannot overwrite directory %s", file2.getPath());
                    return false;
                }
                e(file2);
            }
            return file.renameTo(file2);
        }
    }

    public final boolean j(File file, File file2) {
        try {
            lwm.j(file, file2);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean k(byte[] bArr, File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null && h(parentFile)) {
            if (file.isDirectory()) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "writeBytes", 790, "FileOperationUtils.java")).w("Cannot write bytes to directory %s", file.getPath());
                return false;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                return true;
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "writeBytes", 797, "FileOperationUtils.java")).w("Failed to write to %s", file.getPath());
            }
        }
        return false;
    }

    public final boolean l(File file, ngz ngzVar) {
        File parentFile = file.getParentFile();
        if (parentFile != null && h(parentFile)) {
            if (file.isDirectory()) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "writeProto", 869, "FileOperationUtils.java")).w("Cannot write bytes to directory %s", file.getPath());
                return false;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ngzVar.p(fileOutputStream);
                fileOutputStream.close();
                return true;
            } catch (IOException | IllegalStateException e) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "writeProto", 878, "FileOperationUtils.java")).w("Failed to write to %s", file.getPath());
            }
        }
        return false;
    }

    public final void m(String str, String str2) {
        File file = new File(str, str2);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    return;
                }
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "createFileIfNotExists", 898, "FileOperationUtils.java")).G("Could not create the file: %s/%s", str, str2);
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "createFileIfNotExists", 902, "FileOperationUtils.java")).G("Could not create the file: %s/%s", str, str2);
            }
        }
    }
}
