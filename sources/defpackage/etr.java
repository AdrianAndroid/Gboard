package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: etr  reason: default package */
/* loaded from: classes.dex */
public final class etr implements jqk {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/listing/ThemeIndicesSlicingStrategy");
    private final bys b;

    public etr(bys bysVar) {
        this.b = bysVar;
    }

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        juc a2 = etx.a(lfd.d(jsqVar.b("device_locale", "")), jqmVar.i());
        jqi e = jqj.e();
        if (a2 != null) {
            juf g = jug.g();
            g.f(a2);
            g.g(this.b.a() ? 1 : 0);
            g.d(2);
            e.c(g.a());
        } else {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeIndicesSlicingStrategy", "getSlices", 44, "ThemeIndicesSlicingStrategy.java")).t("ThemeSlicingStrat() : No matching manifest.");
        }
        return e.a();
    }
}
