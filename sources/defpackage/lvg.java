package defpackage;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lvg  reason: default package */
/* loaded from: classes.dex */
public final class lvg extends lvi {
    public final int[] a;
    public final int b;
    private final lur c;
    private final lur d;

    public lvg(lur lurVar, lur lurVar2) {
        int h;
        this.c = lurVar;
        this.d = lurVar2;
        int b = lurVar2.b();
        int i = 0;
        lxj.c(b <= 28, "metadata size too large");
        int[] iArr = new int[b];
        this.a = iArr;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            lty e = e(i);
            long j2 = e.c | j;
            if (j2 != j || (h = h(e, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[h] = e.b ? iArr[h] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    private final int h(lty ltyVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (ltyVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.lvi
    public final int a() {
        return this.b;
    }

    @Override // defpackage.lvi
    public final Object b(lty ltyVar) {
        lxj.c(!ltyVar.b, "key must be single valued");
        int h = h(ltyVar, this.a, this.b);
        if (h >= 0) {
            return ltyVar.d(f(this.a[h]));
        }
        return null;
    }

    @Override // defpackage.lvi
    public final Set c() {
        return new lve(this);
    }

    @Override // defpackage.lvi
    public final void d(luy luyVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            lty e = e(i2 & 31);
            if (!e.b) {
                luyVar.a(e, e.d(f(i2)), obj);
            } else {
                luyVar.b(e, new lvf(this, e, i2), obj);
            }
        }
    }

    public final lty e(int i) {
        return (i >= 0 ? this.d : this.c).c(i);
    }

    public final Object f(int i) {
        return (i >= 0 ? this.d : this.c).e(i);
    }
}
