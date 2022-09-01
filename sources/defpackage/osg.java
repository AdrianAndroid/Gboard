package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: osg  reason: default package */
/* loaded from: classes2.dex */
public final class osg {
    public final our a;
    public boolean c;
    ose[] e;
    int f;
    public int b = Integer.MAX_VALUE;
    int g = 0;
    int h = 0;
    int d = 4096;

    public osg(our ourVar) {
        ose[] oseVarArr = new ose[8];
        this.e = oseVarArr;
        this.f = oseVarArr.length - 1;
        this.a = ourVar;
    }

    public final void a() {
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    public final void b(ose oseVar) {
        int i = oseVar.i;
        int i2 = this.d;
        if (i > i2) {
            a();
            return;
        }
        e((this.h + i) - i2);
        int i3 = this.g;
        ose[] oseVarArr = this.e;
        int length = oseVarArr.length;
        if (i3 + 1 > length) {
            ose[] oseVarArr2 = new ose[length + length];
            System.arraycopy(oseVarArr, 0, oseVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = oseVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = oseVar;
        this.g++;
        this.h += i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(ouu ouuVar) {
        int[] iArr = oti.a;
        long j = 0;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < ouuVar.b(); i2++) {
            j2 += oti.b[ouuVar.a(i2) & 255];
        }
        if (((int) ((j2 + 7) >> 3)) >= ouuVar.b()) {
            d(ouuVar.b(), 127, 0);
            this.a.I(ouuVar);
            return;
        }
        our ourVar = new our();
        byte b = 0;
        while (i < ouuVar.b()) {
            int a = ouuVar.a(i) & 255;
            int i3 = oti.a[a];
            byte b2 = oti.b[a];
            j = (j << b2) | i3;
            int i4 = b + b2;
            while (i4 >= 8) {
                i4 = (i4 == 1 ? 1 : 0) - 8;
                ourVar.N((int) (j >> i4));
            }
            i++;
            b = i4;
        }
        if (b > 0) {
            ourVar.N((int) ((j << (8 - b)) | (255 >>> b)));
        }
        ouu r = ourVar.r();
        d(r.b(), 127, 128);
        this.a.I(r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i, int i2, int i3) {
        if (i < i2) {
            this.a.N(i | i3);
            return;
        }
        this.a.N(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.a.N(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.a.N(i4);
    }

    public final void e(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].i;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            ose[] oseVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(oseVarArr, i5, oseVarArr, i5 + i3, this.g);
            ose[] oseVarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(oseVarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }
}
