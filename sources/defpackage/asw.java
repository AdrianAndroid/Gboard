package defpackage;

import java.security.cert.X509Certificate;

/* compiled from: PG */
/* renamed from: asw  reason: default package */
/* loaded from: classes.dex */
public final class asw extends asx {
    private final byte[] a;

    public asw(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.a = bArr;
    }

    @Override // defpackage.asx, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.a;
    }
}
