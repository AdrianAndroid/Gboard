package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* renamed from: jbj  reason: default package */
/* loaded from: classes.dex */
public final class jbj {
    private static final ltg e = ltg.j("com/google/android/libraries/inputmethod/utils/SignatureUtils");
    public static final byte[] a = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};
    public static final byte[] b = {25, 117, -78, -15, 113, 119, -68, -119, -91, -33, -13, 31, -98, 100, -90, -54, -30, -127, -91, 61, -63, -47, -43, -101, 29, 20, Byte.MAX_VALUE, -31, -56, 42, -6, 0};
    public static final byte[] c = {-16, -3, 108, 91, 65, 15, 37, -53, 37, -61, -75, 51, 70, -56, -105, 47, -82, 48, -8, -18, 116, 17, -33, -111, 4, Byte.MIN_VALUE, -83, 107, 45, 96, -37, -125};
    public static final byte[] d = {97, 102, 101, -13, -111, -49, 72, -83, -83, -126, 0, 110, -76, 104, 80, -97, 38, -104, -36, -10, -95, 80, 75, -103, -71, -35, -18, -41, -87, 106, -50, Byte.MAX_VALUE};

    public static byte[] a(Context context) {
        return b(context, context.getPackageName());
    }

    public static byte[] b(Context context, String str) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr == null || signatureArr.length != 1) {
                ((ltd) ((ltd) e.c()).k("com/google/android/libraries/inputmethod/utils/SignatureUtils", "getSignatureSha256DigestForPackage", 116, "SignatureUtils.java")).t("signature length in package info is not 1");
                return null;
            }
            try {
                return MessageDigest.getInstance("SHA-256").digest(signatureArr[0].toByteArray());
            } catch (NoSuchAlgorithmException unused) {
                ((ltd) ((ltd) e.c()).k("com/google/android/libraries/inputmethod/utils/SignatureUtils", "getSignatureSha256DigestForPackage", 124, "SignatureUtils.java")).t("failed to get SHA-256 digest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            ((ltd) ((ltd) ((ltd) e.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/SignatureUtils", "getSignatureSha256DigestForPackage", 'o', "SignatureUtils.java")).t("failed to get package info");
            return null;
        }
    }
}
