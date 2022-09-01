package defpackage;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lxs  reason: default package */
/* loaded from: classes.dex */
public final class lxs extends lxt implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;

    public lxs(int i) {
        this.a = i;
    }

    @Override // defpackage.lxt
    public final int a() {
        return this.a;
    }

    @Override // defpackage.lxt
    public final int b() {
        return 32;
    }

    @Override // defpackage.lxt
    public final long c() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    @Override // defpackage.lxt
    public final boolean d(lxt lxtVar) {
        return this.a == lxtVar.a();
    }

    @Override // defpackage.lxt
    public final byte[] e() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }
}
