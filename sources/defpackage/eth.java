package defpackage;

/* compiled from: PG */
/* renamed from: eth  reason: default package */
/* loaded from: classes.dex */
final class eth implements jqk {
    private final boolean a;

    public eth(boolean z) {
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
            g.d(2);
            g.g(this.a ? 1 : 0);
            e.c(g.a());
        }
        return e.a();
    }
}
