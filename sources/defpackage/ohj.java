package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ohj  reason: default package */
/* loaded from: classes2.dex */
public final class ohj {
    public final our a;
    ohh[] b;
    int c;
    public int d;
    private int e;

    public ohj(our ourVar) {
        ohh[] ohhVarArr = new ohh[8];
        this.b = ohhVarArr;
        this.d = ohhVarArr.length - 1;
        this.a = ourVar;
    }

    public final void a(ohh ohhVar) {
        int i;
        int i2 = ohhVar.h;
        if (i2 > 4096) {
            Arrays.fill(this.b, (Object) null);
            this.d = this.b.length - 1;
            this.c = 0;
            this.e = 0;
            return;
        }
        int i3 = (this.e + i2) - 4096;
        if (i3 > 0) {
            int length = this.b.length - 1;
            int i4 = 0;
            while (true) {
                i = this.d;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.b[length].h;
                i3 -= i5;
                this.e -= i5;
                this.c--;
                i4++;
                length--;
            }
            ohh[] ohhVarArr = this.b;
            int i6 = i + 1;
            System.arraycopy(ohhVarArr, i6, ohhVarArr, i6 + i4, this.c);
            this.d += i4;
        }
        int i7 = this.c;
        ohh[] ohhVarArr2 = this.b;
        int length2 = ohhVarArr2.length;
        if (i7 + 1 > length2) {
            ohh[] ohhVarArr3 = new ohh[length2 + length2];
            System.arraycopy(ohhVarArr2, 0, ohhVarArr3, length2, length2);
            this.d = this.b.length - 1;
            this.b = ohhVarArr3;
        }
        int i8 = this.d;
        this.d = i8 - 1;
        this.b[i8] = ohhVar;
        this.c++;
        this.e += i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ouu ouuVar) {
        c(ouuVar.b(), 127, 0);
        this.a.I(ouuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i, int i2, int i3) {
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
}
