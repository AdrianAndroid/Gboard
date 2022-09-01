package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* renamed from: jmf  reason: default package */
/* loaded from: classes.dex */
public final class jmf {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            int i3 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[i2 >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static MessageDigest b() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            if (messageDigest == null) {
                return null;
            }
            return messageDigest;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String c(kcq kcqVar, Uri uri) {
        String a2;
        try {
            InputStream inputStream = (InputStream) kcqVar.q(uri, kpo.b());
            MessageDigest b = b();
            if (b == null) {
                a2 = "";
            } else {
                byte[] bArr = new byte[8192];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    b.update(bArr, 0, read);
                }
                a2 = a(b.digest());
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return a2;
        } catch (IOException unused) {
            jmk.c("%s: Failed to open file, uri = %s", "FileValidator", uri);
            return "";
        }
    }

    public static void d(kcq kcqVar, jie jieVar, Uri uri, String str) {
        try {
            if (!kcqVar.v(uri)) {
                jmk.d("%s: Downloaded file %s is not present at %s", "FileValidator", lre.aA(jieVar), uri);
                nzv a2 = jhv.a();
                a2.a = jhu.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                throw a2.e();
            }
            int i = ker.i(jieVar.e);
            if (i != 0 && i == 2) {
                return;
            }
            if (e(kcqVar, uri, str)) {
                return;
            }
            jmk.d("%s: Downloaded file at uri = %s, checksum = %s verification failed", "FileValidator", uri, str);
            nzv a3 = jhv.a();
            a3.a = jhu.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            throw a3.e();
        } catch (IOException e) {
            jmk.e(e, "%s: Failed to validate download file %s", "FileValidator", lre.aA(jieVar));
            nzv a4 = jhv.a();
            a4.a = jhu.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR;
            a4.c = e;
            throw a4.e();
        }
    }

    public static boolean e(kcq kcqVar, Uri uri, String str) {
        return c(kcqVar, uri).equals(str);
    }
}
