package defpackage;

/* compiled from: PG */
/* renamed from: oyr  reason: default package */
/* loaded from: classes2.dex */
public final class oyr extends oys {
    private static final long[] c = new long[256];
    private long d = -1;

    static {
        for (int i = 0; i < 256; i++) {
            long j = i;
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1));
                j >>>= 1;
                if (i3 == 0) {
                    j ^= -3932672073523589310L;
                }
            }
            c[i] = j;
        }
    }

    public oyr() {
        this.a = 8;
        this.b = "CRC64";
    }

    @Override // defpackage.oys
    public final void a(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            int i4 = i + 1;
            long[] jArr = c;
            byte b = bArr[i];
            long j = this.d;
            this.d = (j >>> 8) ^ jArr[(b ^ ((int) j)) & 255];
            i = i4;
        }
    }

    @Override // defpackage.oys
    public final byte[] b() {
        long j = this.d ^ (-1);
        this.d = -1L;
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (j >> (i * 8));
        }
        return bArr;
    }
}
