package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fta  reason: default package */
/* loaded from: classes.dex */
public final class fta implements fsy {
    protected static final byte[] a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    protected static final byte[] b = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};
    private final byte[] c = b;
    private final byte[] d = a;

    @Override // defpackage.fsy
    public final boolean a(File file) {
        try {
            X509Certificate[][] b2 = xp.b(file.getAbsolutePath());
            if (b2.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(b2[0][0].getEncoded());
            if (Arrays.equals(this.d, digest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.c, digest);
        } catch (asv e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
