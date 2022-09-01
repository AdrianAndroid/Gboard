package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;

/* compiled from: PG */
/* renamed from: fsz  reason: default package */
/* loaded from: classes.dex */
public final class fsz implements fsy {
    private final Context a;

    public fsz(Context context) {
        this.a = context;
    }

    @Override // defpackage.fsy
    public final boolean a(File file) {
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = "com.google.ccc.abuse.droidguard";
        try {
            X509Certificate[][] b = xp.b(file.getAbsolutePath());
            Signature[] signatureArr = new Signature[b.length];
            for (int i = 0; i < b.length; i++) {
                signatureArr[i] = new Signature(b[i][0].getEncoded());
            }
            packageInfo.signatures = signatureArr;
            return fno.b(this.a).c(packageInfo).b;
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
