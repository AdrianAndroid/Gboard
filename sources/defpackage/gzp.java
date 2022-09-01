package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* renamed from: gzp  reason: default package */
/* loaded from: classes.dex */
public final class gzp {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/deeplink/FirebaseDynamicLinkHelper");

    public static gzh a(String str) {
        byte[] e;
        int read;
        if (str != null) {
            try {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    int length = decode.length;
                    int i = length - 4;
                    int i2 = length < 4 ? 0 : ((decode[i + 3] & 255) << 24) + ((decode[i + 2] & 255) << 16) + ((decode[i + 1] & 255) << 8) + (decode[i] & 255);
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(decode, 0, length), Math.min(Math.max(i2, length) + 10, 8192));
                        try {
                            if (i2 <= 10000000) {
                                e = new byte[i2];
                                int i3 = 0;
                                while (i3 < i2 && (read = gZIPInputStream.read(e, i3, i2 - i3)) != -1) {
                                    i3 += read;
                                }
                                if (i3 < i2) {
                                    e = Arrays.copyOf(e, i3);
                                } else {
                                    int read2 = gZIPInputStream.read();
                                    if (read2 != -1) {
                                        byte[][] bArr = {e, new byte[]{(byte) read2}, lyp.e(gZIPInputStream)};
                                        int i4 = 0;
                                        for (int i5 = 0; i5 < 3; i5++) {
                                            i4 += bArr[i5].length;
                                        }
                                        e = new byte[i4];
                                        int i6 = 0;
                                        for (int i7 = 0; i7 < 3; i7++) {
                                            byte[] bArr2 = bArr[i7];
                                            int length2 = bArr2.length;
                                            System.arraycopy(bArr2, 0, e, i6, length2);
                                            i6 += length2;
                                        }
                                    }
                                }
                            } else {
                                e = lyp.e(gZIPInputStream);
                            }
                            gZIPInputStream.close();
                            return (gzh) nfm.z(gzh.g, e, nfb.b());
                        } catch (Throwable th) {
                            try {
                                gZIPInputStream.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (ngd e3) {
                    ((ltd) ((ltd) a.a(hip.a).i(e3)).k("com/google/android/libraries/inputmethod/deeplink/FirebaseDynamicLinkHelper", "getDeeplinkInfo", 243, "FirebaseDynamicLinkHelper.java")).t("Failed to parse the protocol buffer.");
                    return null;
                }
            } catch (IllegalArgumentException e4) {
                ((ltd) ((ltd) a.a(hip.a).i(e4)).k("com/google/android/libraries/inputmethod/deeplink/FirebaseDynamicLinkHelper", "getDeeplinkInfo", 245, "FirebaseDynamicLinkHelper.java")).t("Failed to decode the base64 content, it may be corrupted.");
                return null;
            } catch (RuntimeException e5) {
                ((ltd) ((ltd) a.a(hip.a).i(e5)).k("com/google/android/libraries/inputmethod/deeplink/FirebaseDynamicLinkHelper", "getDeeplinkInfo", 248, "FirebaseDynamicLinkHelper.java")).t("Failed to decompress the zip content, it may be corrupted.");
                return null;
            }
        }
        return null;
    }
}
