package defpackage;

import java.util.zip.CRC32;

/* compiled from: PG */
/* renamed from: oyq  reason: default package */
/* loaded from: classes2.dex */
public final class oyq extends oys {
    private final CRC32 c = new CRC32();

    public oyq() {
        this.a = 4;
        this.b = "CRC32";
    }

    @Override // defpackage.oys
    public final void a(byte[] bArr, int i, int i2) {
        this.c.update(bArr, i, i2);
    }

    @Override // defpackage.oys
    public final byte[] b() {
        long value = this.c.getValue();
        byte[] bArr = {(byte) value, (byte) (value >>> 8), (byte) (value >>> 16), (byte) (value >>> 24)};
        this.c.reset();
        return bArr;
    }
}
