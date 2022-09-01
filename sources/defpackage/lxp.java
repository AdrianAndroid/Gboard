package defpackage;

import java.util.zip.Checksum;

/* compiled from: PG */
/* renamed from: lxp  reason: default package */
/* loaded from: classes.dex */
final class lxp extends lxl {
    private final Checksum b;

    public lxp(Checksum checksum) {
        this.b = checksum;
    }

    @Override // defpackage.lxl
    protected final void c(byte[] bArr, int i) {
        this.b.update(bArr, 0, i);
    }

    @Override // defpackage.lxv
    public final lxt k() {
        return lxt.h((int) this.b.getValue());
    }
}
