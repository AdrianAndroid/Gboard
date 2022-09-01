package defpackage;

/* compiled from: PG */
/* renamed from: eyd  reason: default package */
/* loaded from: classes.dex */
public final class eyd implements jqk {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/superpacks/SanityCheckEvalSlicingStrategy");

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        jqi e = jqj.e();
        jav a2 = eyg.a(String.valueOf(jsqVar.a("sanity_check_eval_locale")));
        juc b = eyg.b(a2, jqmVar.i());
        if (b == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/superpacks/SanityCheckEvalSlicingStrategy", "matchLocales", 59, "SanityCheckEvalSlicingStrategy.java")).w("matchLocales() : Unable to find Pack for locale %s", a2);
        } else {
            e.c(jug.h(b));
        }
        return e.a();
    }
}
