package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: erp  reason: default package */
/* loaded from: classes.dex */
final class erp {
    private final int a;
    private final int b;
    private final float[] c;
    private final int d;

    public erp(int i, int i2, float[] fArr, int i3) {
        this.a = i;
        this.b = i2;
        this.c = fArr;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof erp)) {
            return false;
        }
        erp erpVar = (erp) obj;
        return this.a == erpVar.a && this.b == erpVar.b && this.d == erpVar.d && Arrays.equals(this.c, erpVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(this.d)});
    }
}
