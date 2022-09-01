package defpackage;

import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: gor  reason: default package */
/* loaded from: classes.dex */
public final class gor {
    public static final ltg a = ltg.j("com/google/android/libraries/gsa/s3/lib/Tee");
    public final InputStream b;
    public final int c;
    public final int d;
    public final byte[] g;
    public blb k;
    public final int[] l;
    public boolean m;
    public int f = Integer.MAX_VALUE;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public final InputStream e = new gop(this);

    public gor(InputStream inputStream, int i) {
        jdg.v(true);
        this.b = inputStream;
        this.g = new byte[i * 1000];
        this.d = i * 500;
        this.c = i;
        int[] iArr = new int[16];
        this.l = iArr;
        Arrays.fill(iArr, Integer.MAX_VALUE);
        iArr[0] = 0;
    }

    public final void a(int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.g;
        int length = bArr2.length;
        if (i + i3 <= length) {
            System.arraycopy(bArr2, i, bArr, i2, i3);
        } else if (i >= length) {
            System.arraycopy(bArr2, i - length, bArr, i2, i3);
        } else {
            int i4 = length - i;
            System.arraycopy(bArr2, i, bArr, i2, i4);
            System.arraycopy(bArr2, 0, bArr, i2 + i4, i3 - i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(int i) {
        this.l[i] = Integer.MAX_VALUE;
    }

    public final synchronized fxa c() {
        goq goqVar;
        if (this.m) {
            throw new blb("No splits possible, buffers rewound.", 393240);
        }
        int i = 1;
        while (i != 16 && this.l[i] != Integer.MAX_VALUE) {
            i++;
        }
        if (i == 16) {
            throw new blb("No splits possible, too many siblings.", 393242);
        }
        goqVar = new goq(this, i);
        int i2 = this.f;
        if (i2 == Integer.MAX_VALUE) {
            this.l[i] = 0;
        } else {
            this.l[i] = i2;
        }
        return new fxa(goqVar);
    }
}
