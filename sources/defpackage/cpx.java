package defpackage;

/* compiled from: PG */
/* renamed from: cpx  reason: default package */
/* loaded from: classes.dex */
final class cpx implements kro {
    @Override // defpackage.kro
    public final void a(jma jmaVar) {
        hui[] i = huk.a(guw.a(), ibz.e).i();
        llk e = llp.e();
        for (hui huiVar : i) {
            String a = huiVar.a();
            if (a != null) {
                e.h(a);
            }
        }
        llp g = e.g();
        long currentTimeMillis = (System.currentTimeMillis() - ((lrl) g).c) + 1;
        for (String str : lre.G(g)) {
            jmaVar.e("emoticon_shares", cqa.a(str, fgy.k(currentTimeMillis), currentTimeMillis));
            currentTimeMillis++;
        }
    }
}
