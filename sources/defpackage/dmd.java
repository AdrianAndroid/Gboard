package defpackage;

/* compiled from: PG */
/* renamed from: dmd  reason: default package */
/* loaded from: classes.dex */
public final class dmd extends did {
    private final StringBuilder a = new StringBuilder();

    @Override // defpackage.djf
    public final CharSequence a() {
        return this.a.toString();
    }

    @Override // defpackage.djf
    public final void c(dje djeVar) {
    }

    @Override // defpackage.djf
    public final void d() {
        this.a.setLength(0);
    }

    @Override // defpackage.djf
    public final void g() {
    }

    @Override // defpackage.djf
    public final int m(int i, boolean z) {
        return (i == 0 || i == 1) ? 1 : 0;
    }

    @Override // defpackage.djf
    public final void n(djc djcVar) {
    }

    @Override // defpackage.djf
    public final void o(djd djdVar) {
        this.a.append((String) djdVar.e);
    }
}
