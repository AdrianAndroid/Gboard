package defpackage;

/* compiled from: PG */
/* renamed from: drn  reason: default package */
/* loaded from: classes.dex */
public final class drn implements jqk {
    final /* synthetic */ boolean a;

    public drn(boolean z) {
        this.a = z;
    }

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        jqi e = jqj.e();
        for (juc jucVar : jqmVar.i()) {
            juf g = jug.g();
            g.f(jucVar);
            g.g(drp.c(this.a));
            g.c(drp.a(this.a));
            g.d(drp.b(this.a));
            e.c(g.a());
        }
        return e.a();
    }

    public final String toString() {
        return "MozcSlicingStrategy";
    }
}
