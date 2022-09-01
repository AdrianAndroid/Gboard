package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lya  reason: default package */
/* loaded from: classes.dex */
final class lya extends lxl {
    private final MessageDigest b;
    private final int c;
    private boolean d;

    public lya(MessageDigest messageDigest, int i) {
        this.b = messageDigest;
        this.c = i;
    }

    private final void f() {
        jdg.G(!this.d, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.lxl
    protected final void c(byte[] bArr, int i) {
        f();
        this.b.update(bArr, 0, i);
    }

    @Override // defpackage.lxv
    public final lxt k() {
        f();
        this.d = true;
        if (this.c == this.b.getDigestLength()) {
            return lxt.g(this.b.digest());
        }
        return lxt.g(Arrays.copyOf(this.b.digest(), this.c));
    }
}
