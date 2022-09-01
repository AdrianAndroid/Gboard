package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lko  reason: default package */
/* loaded from: classes.dex */
public final class lko extends lkp {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lko(Comparable comparable) {
        super(comparable);
        jdg.u(comparable);
    }

    @Override // defpackage.lkp
    public final void c(StringBuilder sb) {
        sb.append('[');
        sb.append(this.b);
    }

    @Override // defpackage.lkp
    public final void d(StringBuilder sb) {
        sb.append(this.b);
        sb.append(')');
    }

    @Override // defpackage.lkp
    public final boolean e(Comparable comparable) {
        return lrh.b(this.b, comparable) <= 0;
    }

    @Override // defpackage.lkp
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "\\" + this.b + "/";
    }
}
