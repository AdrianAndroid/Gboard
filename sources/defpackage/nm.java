package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: nm  reason: default package */
/* loaded from: classes2.dex */
public final class nm {
    public int[] a;
    public List b;

    public final nl a(int i) {
        nl nlVar;
        List list = this.b;
        if (list == null) {
            return null;
        }
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            nlVar = (nl) this.b.get(size);
        } while (nlVar.a != i);
        return nlVar;
    }

    public final void b(nl nlVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            nl nlVar2 = (nl) this.b.get(i);
            if (nlVar2.a == nlVar.a) {
                this.b.remove(i);
            }
            if (nlVar2.a >= nlVar.a) {
                this.b.add(i, nlVar);
                return;
            }
        }
        this.b.add(nlVar);
    }

    public final void c() {
        int[] iArr = this.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.b = null;
    }

    public final void d(int i) {
        int[] iArr = this.a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.a = iArr2;
            Arrays.fill(iArr2, -1);
            return;
        }
        int length = iArr.length;
        if (i < length) {
            return;
        }
        while (length <= i) {
            length += length;
        }
        int[] iArr3 = new int[length];
        this.a = iArr3;
        int length2 = iArr.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        int[] iArr4 = this.a;
        Arrays.fill(iArr4, length2, iArr4.length, -1);
    }

    public final void e(int i, int i2) {
        int[] iArr = this.a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        d(i3);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.a, i, i3, -1);
        List list = this.b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            nl nlVar = (nl) this.b.get(size);
            int i4 = nlVar.a;
            if (i4 >= i) {
                nlVar.a = i4 + i2;
            }
        }
    }

    public final void f(int i, int i2) {
        int[] iArr = this.a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        d(i3);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.a;
        int length = iArr3.length;
        Arrays.fill(iArr3, length - i2, length, -1);
        List list = this.b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            nl nlVar = (nl) this.b.get(size);
            int i4 = nlVar.a;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.b.remove(size);
                } else {
                    nlVar.a = i4 - i2;
                }
            }
        }
    }

    public final void g(int i) {
        List list = this.b;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (((nl) this.b.get(size)).a >= i) {
                    this.b.remove(size);
                }
            }
        }
        i(i);
    }

    public final nl h(int i, int i2, int i3) {
        List list = this.b;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            nl nlVar = (nl) this.b.get(i4);
            int i5 = nlVar.a;
            if (i5 >= i2) {
                return null;
            }
            if (i5 >= i && (i3 == 0 || nlVar.b == i3 || nlVar.d)) {
                return nlVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r5) {
        /*
            r4 = this;
            int[] r0 = r4.a
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.length
            if (r5 < r0) goto L9
            return
        L9:
            java.util.List r0 = r4.b
            r1 = -1
            if (r0 != 0) goto L10
        Le:
            r0 = -1
            goto L45
        L10:
            nl r0 = r4.a(r5)
            if (r0 == 0) goto L1b
            java.util.List r2 = r4.b
            r2.remove(r0)
        L1b:
            java.util.List r0 = r4.b
            int r0 = r0.size()
            r2 = 0
        L22:
            if (r2 >= r0) goto L33
            java.util.List r3 = r4.b
            java.lang.Object r3 = r3.get(r2)
            nl r3 = (defpackage.nl) r3
            int r3 = r3.a
            if (r3 >= r5) goto L34
            int r2 = r2 + 1
            goto L22
        L33:
            r2 = -1
        L34:
            if (r2 == r1) goto Le
            java.util.List r0 = r4.b
            java.lang.Object r0 = r0.get(r2)
            nl r0 = (defpackage.nl) r0
            java.util.List r3 = r4.b
            r3.remove(r2)
            int r0 = r0.a
        L45:
            if (r0 != r1) goto L51
            int[] r0 = r4.a
            int r2 = r0.length
            java.util.Arrays.fill(r0, r5, r2, r1)
            int[] r5 = r4.a
            int r5 = r5.length
            return
        L51:
            int[] r2 = r4.a
            int r2 = r2.length
            int r0 = r0 + 1
            int r0 = java.lang.Math.min(r0, r2)
            int[] r2 = r4.a
            java.util.Arrays.fill(r2, r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm.i(int):void");
    }
}
