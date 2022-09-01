package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: kmo  reason: default package */
/* loaded from: classes.dex */
public final class kmo {
    private static final String[] a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] b;
    private static final String[] c;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        String str = "";
        strArr[1] = true != (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? str : "androidx.test.services.storage.runfiles";
        b = strArr;
        String[] strArr2 = new String[3];
        strArr2[0] = Build.VERSION.SDK_INT <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : str;
        if (Build.VERSION.SDK_INT <= 25) {
            str = "com.google.android.inputmethod.latin.dev.inputcontent";
        }
        strArr2[1] = str;
        strArr2[2] = "com.google.android.apps.docs.storage.legacy";
        c = strArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x019c, code lost:
        if (r15.startsWith(b(r2)) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r0.b == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
        if (r0.b != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020c A[Catch: IOException -> 0x023c, FileNotFoundException -> 0x024b, TryCatch #3 {FileNotFoundException -> 0x024b, IOException -> 0x023c, blocks: (B:92:0x0132, B:99:0x017c, B:101:0x0184, B:103:0x018c, B:105:0x0194, B:108:0x0208, B:110:0x020c, B:112:0x01b0, B:114:0x01b6, B:116:0x01bc, B:119:0x01c7, B:121:0x01d5, B:123:0x01d9, B:128:0x01e4, B:131:0x01e7, B:133:0x01f6, B:135:0x01fa, B:140:0x0205, B:143:0x01a1, B:146:0x0212, B:147:0x021f, B:148:0x0220, B:149:0x022d, B:150:0x022e, B:151:0x023b), top: B:91:0x0132 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.InputStream a(android.content.Context r14, android.net.Uri r15) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmo.a(android.content.Context, android.net.Uri):java.io.InputStream");
    }

    private static String b(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    private static void c(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(fileNotFoundException, e);
            } catch (Exception unused) {
            }
        }
    }

    private static File[] d(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
