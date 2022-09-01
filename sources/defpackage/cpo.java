package defpackage;

/* compiled from: PG */
/* renamed from: cpo  reason: default package */
/* loaded from: classes.dex */
final class cpo implements kro {
    private final boolean a;

    public cpo(boolean z) {
        this.a = z;
    }

    @Override // defpackage.kro
    public final void a(jma jmaVar) {
        if (!this.a || !ino.L().aj(ieh.d)) {
            huk a = huk.a(guw.a(), ibz.d);
            hbd h = hbd.h(guw.a());
            llk e = llp.e();
            for (hui huiVar : a.i()) {
                String a2 = huiVar.a();
                if (a2 != null && (a2.codePointCount(0, a2.length()) <= 1 || a2.indexOf(8419) != -1 || leb.a.c(a2) == -1)) {
                    e.h(a2);
                }
            }
            llp g = e.g();
            long currentTimeMillis = (System.currentTimeMillis() - ((lrl) g).c) + 1;
            for (String str : lre.G(g)) {
                jmaVar.e("emoji_shares", cpu.a(str, h.g().b(str), fgy.k(currentTimeMillis), currentTimeMillis, 1L));
                currentTimeMillis++;
            }
        }
    }
}
