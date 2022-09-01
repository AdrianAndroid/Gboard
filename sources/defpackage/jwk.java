package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

/* compiled from: PG */
/* renamed from: jwk  reason: default package */
/* loaded from: classes.dex */
final class jwk implements jwg {
    private final String a;
    private final /* synthetic */ int b;
    private final Object c;

    public jwk(String str, String str2, int i) {
        this.b = i;
        this.a = str;
        this.c = str2;
    }

    public jwk(String str, lgb lgbVar, int i) {
        this.b = i;
        this.a = str;
        this.c = lgbVar;
    }

    public final String toString() {
        return this.b != 0 ? this.a : this.a;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [lgb, java.lang.Object] */
    @Override // defpackage.jwg
    public final String a(InputStream inputStream, jrr jrrVar) {
        if (this.b != 0) {
            Checksum checksum = (Checksum) this.c.a();
            CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, checksum);
            try {
                byte[] bArr = new byte[2048];
                while (checkedInputStream.read(bArr) > 0) {
                    jrrVar.a();
                }
                String hexString = Long.toHexString(checksum.getValue());
                checkedInputStream.close();
                return hexString;
            } catch (Throwable th) {
                try {
                    checkedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance((String) this.c);
            DigestInputStream digestInputStream = new DigestInputStream(inputStream, messageDigest);
            try {
                byte[] bArr2 = new byte[2048];
                while (digestInputStream.read(bArr2) > 0) {
                    jrrVar.a();
                }
                String i = lyk.f.i(messageDigest.digest());
                digestInputStream.close();
                return i;
            } catch (Throwable th3) {
                try {
                    digestInputStream.close();
                } catch (Throwable th4) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    } catch (Exception unused2) {
                    }
                }
                throw th3;
            }
        } catch (NoSuchAlgorithmException e) {
            throw new IOException(e);
        }
    }
}
