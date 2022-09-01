package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lkn  reason: default package */
/* loaded from: classes.dex */
public final class lkn extends lkp {
    public static final lkn a = new lkn();
    private static final long serialVersionUID = 0;

    private lkn() {
        super("");
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.lkp
    public final int a(lkp lkpVar) {
        return lkpVar == this ? 0 : -1;
    }

    @Override // defpackage.lkp
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.lkp
    public final void c(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // defpackage.lkp, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((lkp) obj);
    }

    @Override // defpackage.lkp
    public final void d(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.lkp
    public final boolean e(Comparable comparable) {
        return true;
    }

    @Override // defpackage.lkp
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
