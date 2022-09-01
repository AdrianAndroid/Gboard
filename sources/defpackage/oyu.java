package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: oyu  reason: default package */
/* loaded from: classes2.dex */
public final class oyu extends oys {
    private final MessageDigest c = MessageDigest.getInstance("SHA-256");

    public oyu() {
        this.a = 32;
        this.b = "SHA-256";
    }

    @Override // defpackage.oys
    public final void a(byte[] bArr, int i, int i2) {
        this.c.update(bArr, i, i2);
    }

    @Override // defpackage.oys
    public final byte[] b() {
        byte[] digest = this.c.digest();
        this.c.reset();
        return digest;
    }
}
