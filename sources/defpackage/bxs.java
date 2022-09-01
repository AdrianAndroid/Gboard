package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: bxs  reason: default package */
/* loaded from: classes.dex */
public final class bxs extends byb {
    private static volatile bxs b;
    private static final ltg h = ltg.j("com/google/android/apps/inputmethod/libs/crank/conceptpredictor/ConceptPredictorModelManager");
    public llp a = llp.r(hqp.e());

    public bxs(bze bzeVar, mkr mkrVar) {
        super("ConceptPredictorModelManager", bzeVar, mkrVar);
    }

    public static bxs b(Context context) {
        bxs bxsVar = b;
        if (bxsVar == null) {
            synchronized (bxs.class) {
                bxsVar = b;
                if (bxsVar == null) {
                    bxsVar = new bxs(bzd.a(context), gxo.a(10));
                    b = bxsVar;
                }
            }
        }
        return bxsVar;
    }

    public final bxr a(Locale locale) {
        byz k = k(locale, null);
        if (k == null) {
            return bxr.a;
        }
        File[] listFiles = k.b().listFiles();
        if (listFiles == null || (r7 = listFiles.length) < 4) {
            return bxr.a;
        }
        bxq a = bxr.a();
        for (File file : listFiles) {
            String path = file.getPath();
            if (path.endsWith(".tflite")) {
                a.k(path);
            } else if (path.endsWith("token.csym")) {
                a.r(path);
            } else if (path.endsWith("emoji_mapping.pb")) {
                a.g(path);
            } else if (path.endsWith("rules.pb")) {
                a.p(path);
            } else if (path.endsWith("concepts.csym")) {
                a.e(path);
            } else if (path.endsWith("expression_query_set.pb")) {
                a.o(path);
            } else if (path.endsWith("query_mapping.pb")) {
                a.l(path);
            } else if (path.endsWith(".blacklist")) {
                a.c(path);
            } else if (path.endsWith("emoji_to_entity.pb")) {
                a.h(path);
            } else if (path.endsWith("concept_display_name.pb")) {
                a.d(path);
            }
        }
        jsq n = k.a().n();
        try {
            if (n.d().contains("predictor_unk_threshold")) {
                a.s(Float.parseFloat((String) n.a("predictor_unk_threshold")));
            }
            if (n.d().contains("query_prediction_score_threshold")) {
                a.b(Float.parseFloat((String) n.a("query_prediction_score_threshold")));
                a.i(true);
            }
            if (n.d().contains("tenor_query_threshold")) {
                a.q(Float.parseFloat((String) n.a("tenor_query_threshold")));
                a.j(true);
            }
            if (n.d().contains("query_prediction_slope")) {
                a.n(Float.parseFloat((String) n.a("query_prediction_slope")));
            }
            if (n.d().contains("query_prediction_intercept")) {
                a.m(Float.parseFloat((String) n.a("query_prediction_intercept")));
            }
            if (n.d().contains("contextual_emoji_kitchen_threshold")) {
                a.f(Float.parseFloat((String) n.a("contextual_emoji_kitchen_threshold")));
            }
        } catch (NumberFormatException e) {
            ((ltd) ((ltd) ((ltd) h.d()).i(e)).k("com/google/android/apps/inputmethod/libs/crank/conceptpredictor/ConceptPredictorModelManager", "getModelFiles", (char) 217, "ConceptPredictorModelManager.java")).t("Failed to parse parameters");
        }
        return a.a();
    }

    @Override // defpackage.byb
    protected final bzu c() {
        bzt a = bzu.a("transformer_concept");
        a.e = 300;
        a.f = 300;
        return a.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.byb
    public final hhl d() {
        return bxn.d;
    }

    @Override // defpackage.byb
    protected final hhl e() {
        return bxn.aB;
    }

    @Override // defpackage.byb
    protected final hhl f() {
        return bxn.az;
    }

    @Override // defpackage.byb
    protected final hhl g() {
        return bxn.aA;
    }

    @Override // defpackage.byb
    public final jqk h() {
        return new byc(this.a);
    }

    @Override // defpackage.byb
    protected final String i() {
        return "transformer_concept";
    }

    @Override // defpackage.byb
    public final String j() {
        return "transformer_concept";
    }
}
