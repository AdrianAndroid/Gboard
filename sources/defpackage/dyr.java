package defpackage;

/* compiled from: PG */
/* renamed from: dyr  reason: default package */
/* loaded from: classes.dex */
public final class dyr implements jqk {
    private final bys a;
    private final /* synthetic */ int b;

    public dyr(bys bysVar, int i) {
        this.b = i;
        this.a = bysVar;
    }

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        if (this.b == 0) {
            jqi e = jqj.e();
            for (juc jucVar : jqmVar.i()) {
                juf g = jug.g();
                g.f(jucVar);
                g.g(this.a.a() ? 1 : 0);
                g.d(2);
                e.c(g.a());
            }
            return e.a();
        }
        jqi e2 = jqj.e();
        for (juc jucVar2 : jqmVar.i()) {
            juf g2 = jug.g();
            g2.f(jucVar2);
            g2.g(this.a.a() ? 1 : 0);
            g2.d(2);
            e2.c(g2.a());
        }
        return e2.a();
    }
}
