package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ldm  reason: default package */
/* loaded from: classes.dex */
public final class ldm {
    public static final ltg a = ltg.j("com/google/audio/hearing/common/CircularByteBuffer");
    public final byte[] b;
    public final int c;
    private int f = 0;
    public long d = 0;
    public final ArrayList e = new ArrayList();

    public ldm(int i) {
        this.b = new byte[i];
        this.c = i;
    }

    public final synchronized long a() {
        return this.d;
    }

    public final synchronized boolean b(byte[] bArr, int i) {
        int i2 = this.c;
        if (i > i2) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i3 = this.f;
        if (i3 + i <= i2) {
            System.arraycopy(bArr, 0, this.b, i3, i);
        } else {
            int i4 = i2 - i3;
            System.arraycopy(bArr, 0, this.b, i3, i4);
            System.arraycopy(bArr, i4, this.b, 0, i - i4);
        }
        this.f = (this.f + i) % this.c;
        this.d += i;
        return true;
    }
}
