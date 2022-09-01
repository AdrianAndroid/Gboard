package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: gof  reason: default package */
/* loaded from: classes.dex */
public final class gof {
    private static final ltg a = ltg.j("com/google/android/libraries/gsa/s3/S3NetworkUtils");

    public static void a(nwo nwoVar, String str) {
        if (nwoVar.a == 200) {
            return;
        }
        String b = nwoVar.b("X-Speech-S3-Res-Code", "");
        Integer num = null;
        if (!TextUtils.isEmpty(b)) {
            try {
                num = Integer.valueOf(Integer.parseInt(b));
            } catch (NumberFormatException unused) {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/gsa/s3/S3NetworkUtils", "parseErrorHeader", 63, "S3NetworkUtils.java")).w("Failed to parse error header: %s", b);
            }
        }
        if (num != null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/gsa/s3/S3NetworkUtils", "verifyResponseData", 41, "S3NetworkUtils.java")).J("[%s] response code: %d, internal error header: %s", str, Integer.valueOf(nwoVar.a), b);
            throw new bmz(num.intValue());
        } else {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/gsa/s3/S3NetworkUtils", "verifyResponseData", 46, "S3NetworkUtils.java")).E("[%s] response code: %d", str, nwoVar.a);
            throw new bmx(nwoVar.a);
        }
    }
}
