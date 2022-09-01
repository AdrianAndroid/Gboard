package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lkm  reason: default package */
/* loaded from: classes.dex */
public final class lkm extends lkp {
    private static final long serialVersionUID = 0;

    public lkm(Comparable comparable) {
        super(comparable);
    }

    @Override // defpackage.lkp
    public final void c(StringBuilder sb) {
        sb.append('(');
        sb.append(this.b);
    }

    @Override // defpackage.lkp
    public final void d(StringBuilder sb) {
        sb.append(this.b);
        sb.append(']');
    }

    @Override // defpackage.lkp
    public final boolean e(Comparable comparable) {
        return lrh.b(this.b, comparable) < 0;
    }

    @Override // defpackage.lkp
    public final int hashCode() {
        return this.b.hashCode() ^ (-1);
    }

    public final String toString() {
        return "/" + this.b + "\\";
    }
}
