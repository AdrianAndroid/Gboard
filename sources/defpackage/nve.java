package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: nve  reason: default package */
/* loaded from: classes2.dex */
final class nve implements nvg {
    final int a;
    final nvg[] b;
    private final int c;

    private nve(int i, nvg[] nvgVarArr, int i2) {
        this.a = i;
        this.b = nvgVarArr;
        this.c = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nvg b(nvg nvgVar, int i, nvg nvgVar2, int i2, int i3) {
        int d = d(i, i3);
        int d2 = d(i2, i3);
        if (d == d2) {
            nvg b = b(nvgVar, i, nvgVar2, i2, i3 + 5);
            return new nve(d, new nvg[]{b}, ((nve) b).c);
        }
        int e = e(i, i3);
        int e2 = e(i2, i3);
        nvg nvgVar3 = e > e2 ? nvgVar : nvgVar2;
        if (e > e2) {
            nvgVar = nvgVar2;
        }
        return new nve(d | d2, new nvg[]{nvgVar, nvgVar3}, nvgVar.a() + nvgVar3.a());
    }

    private static int d(int i, int i2) {
        return 1 << e(i, i2);
    }

    private static int e(int i, int i2) {
        return (i >>> i2) & 31;
    }

    @Override // defpackage.nvg
    public final int a() {
        return this.c;
    }

    @Override // defpackage.nvg
    public final nvg c(Object obj, Object obj2, int i, int i2) {
        int d = d(i, i2);
        int bitCount = Integer.bitCount(this.a & (d - 1));
        int i3 = this.a;
        if ((i3 & d) == 0) {
            nvg[] nvgVarArr = this.b;
            nvg[] nvgVarArr2 = new nvg[nvgVarArr.length + 1];
            System.arraycopy(nvgVarArr, 0, nvgVarArr2, 0, bitCount);
            nvgVarArr2[bitCount] = new nvf(obj, obj2, 0);
            nvg[] nvgVarArr3 = this.b;
            System.arraycopy(nvgVarArr3, bitCount, nvgVarArr2, bitCount + 1, nvgVarArr3.length - bitCount);
            return new nve(i3 | d, nvgVarArr2, this.c + 1);
        }
        nvg[] nvgVarArr4 = this.b;
        nvg[] nvgVarArr5 = (nvg[]) Arrays.copyOf(nvgVarArr4, nvgVarArr4.length);
        nvg c = this.b[bitCount].c(obj, obj2, i, i2 + 5);
        nvgVarArr5[bitCount] = c;
        int i4 = this.c;
        int a = c.a();
        return new nve(this.a, nvgVarArr5, (i4 + a) - this.b[bitCount].a());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedIndex(");
        sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.a)));
        for (nvg nvgVar : this.b) {
            sb.append(nvgVar);
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}
