package defpackage;

/* compiled from: PG */
/* renamed from: oyy  reason: default package */
/* loaded from: classes2.dex */
public final class oyy {
    public final byte[] a;
    public final int b;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public oyy(int i) {
        this.b = i;
        this.a = new byte[i];
    }

    public final int a(int i) {
        int i2 = this.d;
        int i3 = (i2 - i) - 1;
        if (i >= i2) {
            i3 += this.b;
        }
        return this.a[i3] & 255;
    }

    public final void b(int i, int i2) {
        int i3;
        if (i < 0 || i >= this.e) {
            throw new oxz();
        }
        int min = Math.min(this.f - this.d, i2);
        this.g = i2 - min;
        this.h = i;
        int i4 = this.d;
        int i5 = (i4 - i) - 1;
        if (i >= i4) {
            i5 += this.b;
        }
        do {
            byte[] bArr = this.a;
            int i6 = this.d;
            i3 = i6 + 1;
            this.d = i3;
            int i7 = i5 + 1;
            bArr[i6] = bArr[i5];
            i5 = i7 == this.b ? 0 : i7;
            min--;
        } while (min > 0);
        if (this.e >= i3) {
            return;
        }
        this.e = i3;
    }
} final int read(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int read = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read <= 0) {
                return read;
            }
            byteBuffer.position(byteBuffer.position() + read);
            return read;
        }
        byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.a.available(), 4096), byteBuffer.remaining()))];
        int read2 = this.a.read(bArr);
        if (read2 <= 0) {
            return read2;
        }
        byteBuffer.put(bArr, 0, read2);
        return read2;
    }
}
