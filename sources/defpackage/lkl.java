package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lkl  reason: default package */
/* loaded from: classes.dex */
public final class lkl extends lkp {
    public static final lkl a = new lkl();
    private static final long serialVersionUID = 0;

    private lkl() {
        super("");
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.lkp
    public final int a(lkp lkpVar) {
        return lkpVar == this ? 0 : 1;
    }

    @Override // defpackage.lkp
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.lkp
    public final void c(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.lkp, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((lkp) obj);
    }

    @Override // defpackage.lkp
    public final void d(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // defpackage.lkp
    public final boolean e(Comparable comparable) {
        return false;
    }

    @Override // defpackage.lkp
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
