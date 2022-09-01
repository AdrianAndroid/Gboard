package defpackage;

/* compiled from: PG */
/* renamed from: bhv  reason: default package */
/* loaded from: classes.dex */
public final class bhv implements bhw {
    public int a = 0;
    private int d = 0;
    private byte[] b = new byte[8];
    private float[] c = new float[16];

    private final void h(byte b) {
        int i = this.a;
        byte[] bArr = this.b;
        int length = bArr.length;
        if (i == length) {
            byte[] bArr2 = new byte[length + length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            this.b = bArr2;
        }
        byte[] bArr3 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        bArr3[i2] = b;
    }

    private final void i(int i) {
        float[] fArr = this.c;
        int length = fArr.length;
        if (length < this.d + i) {
            float[] fArr2 = new float[length + length];
            System.arraycopy(fArr, 0, fArr2, 0, length);
            this.c = fArr2;
        }
    }

    @Override // defpackage.bhw
    public final void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        h((byte) ((true != z ? 0 : 2) | 4 | (z2 ? 1 : 0)));
        i(5);
        float[] fArr = this.c;
        int i = this.d;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        int i5 = i4 + 1;
        fArr[i4] = f4;
        this.d = i5 + 1;
        fArr[i5] = f5;
    }

    @Override // defpackage.bhw
    public final void b() {
        h((byte) 8);
    }

    @Override // defpackage.bhw
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        h((byte) 2);
        i(6);
        float[] fArr = this.c;
        int i = this.d;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        int i5 = i4 + 1;
        fArr[i4] = f4;
        int i6 = i5 + 1;
        fArr[i5] = f5;
        this.d = i6 + 1;
        fArr[i6] = f6;
    }

    public final void d(bhw bhwVar) {
        int i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            byte b = this.b[i3];
            if (b == 0) {
                float[] fArr = this.c;
                int i4 = i2 + 1;
                i = i4 + 1;
                bhwVar.f(fArr[i2], fArr[i4]);
            } else if (b != 1) {
                if (b == 2) {
                    float[] fArr2 = this.c;
                    int i5 = i2 + 1;
                    int i6 = i5 + 1;
                    int i7 = i6 + 1;
                    int i8 = i7 + 1;
                    int i9 = i8 + 1;
                    bhwVar.c(fArr2[i2], fArr2[i5], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                    i2 = i9 + 1;
                } else if (b == 3) {
                    float[] fArr3 = this.c;
                    int i10 = i2 + 1;
                    int i11 = i10 + 1;
                    int i12 = i11 + 1;
                    bhwVar.g(fArr3[i2], fArr3[i10], fArr3[i11], fArr3[i12]);
                    i2 = i12 + 1;
                } else if (b == 8) {
                    bhwVar.b();
                } else {
                    boolean z = (b & 2) != 0;
                    float[] fArr4 = this.c;
                    int i13 = i2 + 1;
                    float f = fArr4[i2];
                    int i14 = i13 + 1;
                    float f2 = fArr4[i13];
                    int i15 = i14 + 1;
                    float f3 = fArr4[i14];
                    int i16 = i15 + 1;
                    int i17 = i16 + 1;
                    bhwVar.a(f, f2, f3, z, 1 == (b & 1), fArr4[i15], fArr4[i16]);
                    i2 = i17;
                }
            } else {
                float[] fArr5 = this.c;
                int i18 = i2 + 1;
                i = i18 + 1;
                bhwVar.e(fArr5[i2], fArr5[i18]);
            }
            i2 = i;
        }
    }

    @Override // defpackage.bhw
    public final void e(float f, float f2) {
        h((byte) 1);
        i(2);
        float[] fArr = this.c;
        int i = this.d;
        int i2 = i + 1;
        fArr[i] = f;
        this.d = i2 + 1;
        fArr[i2] = f2;
    }

    @Override // defpackage.bhw
    public final void f(float f, float f2) {
        h((byte) 0);
        i(2);
        float[] fArr = this.c;
        int i = this.d;
        int i2 = i + 1;
        fArr[i] = f;
        this.d = i2 + 1;
        fArr[i2] = f2;
    }

    @Override // defpackage.bhw
    public final void g(float f, float f2, float f3, float f4) {
        h((byte) 3);
        i(4);
        float[] fArr = this.c;
        int i = this.d;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        this.d = i4 + 1;
        fArr[i4] = f4;
    }
}
