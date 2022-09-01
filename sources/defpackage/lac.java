package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* compiled from: PG */
/* renamed from: lac  reason: default package */
/* loaded from: classes.dex */
public final class lac {
    public final kzr a;
    public final oir b;
    private final Context c;
    private PackageInfo d;

    public lac(Context context, kzr kzrVar) {
        oir oirVar = new oir();
        this.a = kzrVar;
        this.c = context;
        this.b = oirVar;
    }

    public static X509Certificate b(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            Log.e("SplitCompat", "Cannot decode certificate.", e);
            return null;
        }
    }

    public final PackageInfo a() {
        if (this.d == null) {
            try {
                this.d = this.c.getPackageManager().getPackageInfo(this.c.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.d;
    }
}
