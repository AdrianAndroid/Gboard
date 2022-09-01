package defpackage;

import android.text.TextUtils;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: bxy  reason: default package */
/* loaded from: classes.dex */
public final class bxy implements mix {
    private final bxh a;
    private final bxz b;
    private final List c;
    private final idk d = ieh.j();

    public bxy(bxh bxhVar, bxz bxzVar, List list) {
        this.a = bxhVar;
        this.b = bxzVar;
        this.c = list;
        bxzVar.n(bxhVar);
    }

    public static mqb b() {
        mqf mqfVar = mqf.b;
        nfh t = mqb.d.t();
        mqc mqcVar = mqc.EXPRESSIVE_CONCEPT_TRIGGERING;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mqb mqbVar = (mqb) t.b;
        mqbVar.b = mqcVar.t;
        int i = mqbVar.a | 1;
        mqbVar.a = i;
        mqfVar.getClass();
        mqbVar.c = mqfVar;
        mqbVar.a = i | 2;
        return (mqb) t.cz();
    }

    private final mko c() {
        nfh t = mqa.f.t();
        mqc mqcVar = mqc.EXPRESSIVE_CONCEPT_TRIGGERING;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mqa mqaVar = (mqa) t.b;
        mqaVar.b = mqcVar.t;
        mqaVar.a |= 1;
        mko c = this.a.c((mqa) t.cz());
        this.b.p(this.a);
        return c;
    }

    @Override // defpackage.mix
    public final mko a() {
        bxx a;
        if (!((Boolean) bxn.c.c()).booleanValue()) {
            return c();
        }
        if (bxp.d(this.c) == null) {
            return c();
        }
        String str = (String) bxn.ar.c();
        Locale a2 = byn.a(this.c, str);
        if (a2 == null) {
            lfa S = jdg.S(this);
            S.b("lm locales", this.c);
            S.b("supported locales", str);
            return c();
        }
        byz k = this.b.k(a2, null);
        if (k == null) {
            a = bxx.a;
        } else {
            File[] listFiles = k.b().listFiles();
            if (listFiles == null) {
                a = bxx.a;
            } else {
                bxw a3 = bxx.a();
                for (File file : listFiles) {
                    String path = file.getPath();
                    if (path.endsWith(".tflite")) {
                        a3.h(path);
                    } else if (path.endsWith("token.csym")) {
                        a3.k(path);
                    } else if (path.endsWith(".blacklist")) {
                        a3.c(path);
                    } else if (path.endsWith(".whitelist")) {
                        a3.b(path);
                    } else if (path.endsWith("names.trietree")) {
                        a3.j(path);
                    }
                }
                jsq n = k.a().n();
                try {
                    if (n.d().contains("concept_prediction_triggering_threshold")) {
                        a3.l(Float.parseFloat((String) n.a("concept_prediction_triggering_threshold")));
                        a3.f(true);
                    }
                    if (n.d().contains("concept_prediction_neutral_triggering_weight")) {
                        a3.i(Float.parseFloat((String) n.a("concept_prediction_neutral_triggering_weight")));
                        a3.e(true);
                    }
                    if (n.d().contains("concept_prediction_incomplete_sentence_score_weight")) {
                        a3.g(Float.parseFloat((String) n.a("concept_prediction_incomplete_sentence_score_weight")));
                        a3.d(true);
                    }
                } catch (NumberFormatException e) {
                    ((ltd) ((ltd) ((ltd) bxz.a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/crank/expressiveconcepttriggering/ExpressiveConceptTriggeringModelManager", "getModelFiles", (char) 184, "ExpressiveConceptTriggeringModelManager.java")).t("Failed to parse parameters");
                }
                a = a3.a();
            }
        }
        if (TextUtils.isEmpty(a.b) || TextUtils.isEmpty(a.c)) {
            mko l = this.b.l();
            this.d.e(ctd.TRIGGERING_MODEL_SYNC, new Object[0]);
            return l;
        }
        String str2 = a.c;
        nfh t = mqa.f.t();
        mqc mqcVar = mqc.EXPRESSIVE_CONCEPT_TRIGGERING;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mqa mqaVar = (mqa) t.b;
        mqaVar.b = mqcVar.t;
        mqaVar.a |= 1;
        nfh t2 = mqf.b.t();
        efq.x(t2, bxn.as);
        if (a.h) {
            nfh t3 = mqd.f.t();
            float f = a.g;
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mqd mqdVar = (mqd) t3.b;
            mqdVar.a |= 4;
            mqdVar.d = f;
            t2.dy("concept_prediction_triggering_threshold", (mqd) t3.cz());
        } else {
            efq.w(t2, bxn.s);
        }
        if (a.j) {
            nfh t4 = mqd.f.t();
            float f2 = a.i;
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mqd mqdVar2 = (mqd) t4.b;
            mqdVar2.a |= 4;
            mqdVar2.d = f2;
            t2.dy("concept_prediction_neutral_triggering_weight", (mqd) t4.cz());
        } else {
            efq.w(t2, bxn.r);
        }
        if (a.l) {
            nfh t5 = mqd.f.t();
            float f3 = a.k;
            if (t5.c) {
                t5.cD();
                t5.c = false;
            }
            mqd mqdVar3 = (mqd) t5.b;
            mqdVar3.a |= 4;
            mqdVar3.d = f3;
            t2.dy("concept_prediction_incomplete_sentence_score_weight", (mqd) t5.cz());
        } else {
            efq.w(t2, bxn.q);
        }
        mqf mqfVar = (mqf) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mqa mqaVar2 = (mqa) t.b;
        mqfVar.getClass();
        mqaVar2.d = mqfVar;
        mqaVar2.a |= 2;
        mqb b = b();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mqa mqaVar3 = (mqa) t.b;
        b.getClass();
        mqaVar3.e = b;
        mqaVar3.a |= 4;
        nfh t6 = mvo.d.t();
        String str3 = a.c;
        if (t6.c) {
            t6.cD();
            t6.c = false;
        }
        mvo mvoVar = (mvo) t6.b;
        str3.getClass();
        mvoVar.a |= 1;
        mvoVar.b = str3;
        t.dv((mvo) t6.cz());
        nfh t7 = mvo.d.t();
        String str4 = a.b;
        if (t7.c) {
            t7.cD();
            t7.c = false;
        }
        mvo mvoVar2 = (mvo) t7.b;
        str4.getClass();
        mvoVar2.a |= 1;
        mvoVar2.b = str4;
        t.dv((mvo) t7.cz());
        nfh t8 = mvo.d.t();
        String str5 = a.d;
        if (t8.c) {
            t8.cD();
            t8.c = false;
        }
        mvo mvoVar3 = (mvo) t8.b;
        str5.getClass();
        mvoVar3.a |= 1;
        mvoVar3.b = str5;
        t.dv((mvo) t8.cz());
        nfh t9 = mvo.d.t();
        String str6 = a.e;
        if (t9.c) {
            t9.cD();
            t9.c = false;
        }
        mvo mvoVar4 = (mvo) t9.b;
        str6.getClass();
        mvoVar4.a |= 1;
        mvoVar4.b = str6;
        t.dv((mvo) t9.cz());
        nfh t10 = mvo.d.t();
        String str7 = a.f;
        if (t10.c) {
            t10.cD();
            t10.c = false;
        }
        mvo mvoVar5 = (mvo) t10.b;
        str7.getClass();
        mvoVar5.a |= 1;
        mvoVar5.b = str7;
        t.dv((mvo) t10.cz());
        mko a4 = this.a.a((mqa) t.cz());
        this.d.e(ctd.TRIGGERING_MODEL_LOADED, new Object[0]);
        return a4;
    }
}
