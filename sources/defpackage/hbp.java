package defpackage;

/* compiled from: PG */
/* renamed from: hbp  reason: default package */
/* loaded from: classes.dex */
final class hbp extends ku {
    final /* synthetic */ hbu c;
    final /* synthetic */ hbs d;

    public hbp(hbs hbsVar, hbu hbuVar) {
        this.d = hbsVar;
        this.c = hbuVar;
    }

    @Override // defpackage.ku
    public final int b(int i) {
        int he = this.d.g.he(i);
        if (he == hct.a || he == hcs.a || he == hde.a) {
            return this.c.b;
        }
        return 1;
    }
}
