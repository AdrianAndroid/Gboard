package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lrh  reason: default package */
/* loaded from: classes.dex */
public final class lrh extends lzf implements Serializable, lfe {
    public static final lrh a = new lrh(lkn.a, lkl.a);
    private static final long serialVersionUID = 0;
    public final lkp b;
    public final lkp c;

    private lrh(lkp lkpVar, lkp lkpVar2) {
        this.b = lkpVar;
        this.c = lkpVar2;
        if (lkpVar.compareTo(lkpVar2) > 0 || lkpVar == lkl.a || lkpVar2 == lkn.a) {
            throw new IllegalArgumentException("Invalid range: ".concat(r(lkpVar, lkpVar2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static leq c() {
        return lrf.a;
    }

    public static lrc d() {
        return lrg.a;
    }

    public static lrh e(Comparable comparable, Comparable comparable2) {
        return g(lkp.g(comparable), lkp.f(comparable2));
    }

    public static lrh f(Comparable comparable, Comparable comparable2) {
        return g(lkp.g(comparable), lkp.g(comparable2));
    }

    public static lrh g(lkp lkpVar, lkp lkpVar2) {
        return new lrh(lkpVar, lkpVar2);
    }

    public static lrh i(Comparable comparable, Comparable comparable2) {
        return g(lkp.f(comparable), lkp.f(comparable2));
    }

    private static String r(lkp lkpVar, lkp lkpVar2) {
        StringBuilder sb = new StringBuilder(16);
        lkpVar.c(sb);
        sb.append("..");
        lkpVar2.d(sb);
        return sb.toString();
    }

    @Override // defpackage.lfe
    public final boolean equals(Object obj) {
        if (obj instanceof lrh) {
            lrh lrhVar = (lrh) obj;
            if (this.b.equals(lrhVar.b) && this.c.equals(lrhVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final lrh h(lrh lrhVar) {
        lkp lkpVar;
        int compareTo = this.b.compareTo(lrhVar.b);
        int compareTo2 = this.c.compareTo(lrhVar.c);
        if (compareTo < 0 || compareTo2 > 0) {
            if (compareTo <= 0 && compareTo2 >= 0) {
                return lrhVar;
            }
            lkp lkpVar2 = compareTo >= 0 ? this.b : lrhVar.b;
            if (compareTo2 <= 0) {
                lkpVar = this.c;
            } else {
                lkpVar = lrhVar.c;
            }
            jdg.D(lkpVar2.compareTo(lkpVar) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, lrhVar);
            return g(lkpVar2, lkpVar);
        }
        return this;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final Comparable j() {
        return this.b.b();
    }

    public final Comparable k() {
        return this.c.b();
    }

    @Override // defpackage.lfe
    /* renamed from: l */
    public final boolean a(Comparable comparable) {
        jdg.u(comparable);
        return this.b.e(comparable) && !this.c.e(comparable);
    }

    public final boolean m(lrh lrhVar) {
        return this.b.compareTo(lrhVar.b) <= 0 && this.c.compareTo(lrhVar.c) >= 0;
    }

    public final boolean n() {
        return this.b != lkn.a;
    }

    public final boolean o() {
        return this.c != lkl.a;
    }

    public final boolean p(lrh lrhVar) {
        return this.b.compareTo(lrhVar.c) <= 0 && lrhVar.b.compareTo(this.c) <= 0;
    }

    public final boolean q() {
        return this.b.equals(this.c);
    }

    Object readResolve() {
        lrh lrhVar = a;
        return equals(lrhVar) ? lrhVar : this;
    }

    public final String toString() {
        return r(this.b, this.c);
    }
}
