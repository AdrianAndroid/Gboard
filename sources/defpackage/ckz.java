package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ckz  reason: default package */
/* loaded from: classes.dex */
public final class ckz implements jqk {
    public final Context e;
    private static final ltg g = ltg.j("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheSlicingStrategy");
    static final byte[] a = {1};
    public final iqi b = iqi.a(cit.a);
    public final iqi c = iqi.a(dzn.c);
    public final iqi d = iqi.a(cit.F);
    private final llw h = llw.o("emoji2expr", new boh(this, 4), "text2expr", new boh(this, 5), "contextual_ek", new boh(this, 6), "animated_emoji", new boh(this, 7));

    public ckz(Context context) {
        this.e = context;
    }

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        jqi e = jqj.e();
        for (juc jucVar : jqmVar.i()) {
            String b = jucVar.n().b("label", null);
            if (b == null) {
                ((ltd) ((ltd) g.d()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheSlicingStrategy", "getSlices", 68, "ContentCacheSlicingStrategy.java")).t("Pack has no label");
            } else {
                lgb lgbVar = (lgb) this.h.get(b);
                if (lgbVar == null) {
                    ((ltd) ((ltd) g.d()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheSlicingStrategy", "getSlices", 73, "ContentCacheSlicingStrategy.java")).w("Received pack with unrecognized label %s", b);
                } else if (((Boolean) lgbVar.a()).booleanValue()) {
                    e.c(jug.h(jucVar));
                }
            }
        }
        e.e = a;
        return e.a();
    }
}
