package defpackage;

import java.io.File;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: bxv  reason: default package */
/* loaded from: classes.dex */
public final class bxv extends byb {
    public static volatile bxv a;
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/crank/expressiveconcept/ExpressiveConceptModelManager");
    private final Locale h = hqp.e();

    public bxv(bze bzeVar, mkr mkrVar) {
        super("ExpressiveConceptModelManager", bzeVar, mkrVar);
    }

    public final bxu a(Locale locale) {
        byz k = k(locale, null);
        if (k == null) {
            return bxu.a;
        }
        File[] listFiles = k.b().listFiles();
        if (listFiles == null) {
            return bxu.a;
        }
        bxt a2 = bxu.a();
        int i = 0;
        for (File file : listFiles) {
            String path = file.getPath();
            if (path.endsWith(".tflite")) {
                a2.e(path);
            } else if (path.endsWith("emoji_mapping.pb")) {
                a2.c(path);
            } else if (path.endsWith(".blacklist")) {
                a2.b(path);
            }
        }
        jtr e = k.a().e();
        if (e != null) {
            i = e.a();
        }
        a2.h(i);
        jsq n = k.a().n();
        try {
            if (n.d().contains("expressive_concept_emoji_predictor_threshold")) {
                a2.g(Float.parseFloat((String) n.a("expressive_concept_emoji_predictor_threshold")));
            }
            if (n.d().contains("expressive_concept_emoji_predictor_scaling_factor")) {
                a2.f(Float.parseFloat((String) n.a("expressive_concept_emoji_predictor_scaling_factor")));
            }
        } catch (NumberFormatException e2) {
            ((ltd) ((ltd) ((ltd) b.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/crank/expressiveconcept/ExpressiveConceptModelManager", "getModelFiles", (char) 176, "ExpressiveConceptModelManager.java")).t("Failed to parse parameters");
        }
        if (n.d().contains("qrnn_model")) {
            a2.d(n.e("qrnn_model", true));
        }
        return a2.a();
    }

    @Override // defpackage.byb
    protected final bzu c() {
        bzt a2 = bzu.a("expressive_concepts");
        a2.e = 300;
        a2.f = 300;
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.byb
    public final hhl d() {
        return bxn.o;
    }

    @Override // defpackage.byb
    protected final hhl e() {
        return bxn.av;
    }

    @Override // defpackage.byb
    protected final hhl f() {
        return bxn.at;
    }

    @Override // defpackage.byb
    protected final hhl g() {
        return bxn.au;
    }

    @Override // defpackage.byb
    public final jqk h() {
        return new byu(this.h);
    }

    @Override // defpackage.byb
    protected final String i() {
        return "expressive_concepts";
    }

    @Override // defpackage.byb
    public final String j() {
        return "expressive_concepts";
    }
}
