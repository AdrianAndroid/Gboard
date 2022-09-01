package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lkp  reason: default package */
/* loaded from: classes.dex */
public abstract class lkp implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b;

    public lkp(Comparable comparable) {
        this.b = comparable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lkp f(Comparable comparable) {
        return new lkm(comparable);
    }

    public static lkp g(Comparable comparable) {
        return new lko(comparable);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(lkp lkpVar) {
        if (lkpVar != lkn.a) {
            if (lkpVar == lkl.a) {
                return -1;
            }
            int b = lrh.b(this.b, lkpVar.b);
            if (b != 0) {
                return b;
            }
            boolean z = this instanceof lkm;
            if (z == (lkpVar instanceof lkm)) {
                return 0;
            }
            if (!z) {
                return -1;
            }
        }
        return 1;
    }

    public Comparable b() {
        return this.b;
    }

    public abstract void c(StringBuilder sb);

    public abstract void d(StringBuilder sb);

    public abstract boolean e(Comparable comparable);

    public final boolean equals(Object obj) {
        if (obj instanceof lkp) {
            try {
                if (compareTo((lkp) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
