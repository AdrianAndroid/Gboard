package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bxp  reason: default package */
/* loaded from: classes.dex */
public final class bxp implements mix {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/crank/conceptpredictor/ConceptPredictorEngineLoader");
    private final bxh b;
    private final bxs c;
    private final List d;
    private final Context e;
    private final idk g = ieh.j();
    private final mkr f = gxo.a(9);

    public bxp(bxh bxhVar, bxs bxsVar, List list, Context context) {
        this.b = bxhVar;
        this.c = bxsVar;
        this.d = list;
        this.e = context;
        bxsVar.n(bxhVar);
    }

    public static mqb c(List list) {
        nfh t = mqf.b.t();
        efq.x(t, bxn.ab, cit.A, cit.n, cit.o, cit.p);
        efq.v(t, bxn.ah, bxn.ai, bxn.al, bxn.am, bxn.an, bxn.aq, bxn.ap, bxn.aj, cit.P, cmo.y);
        boolean aj = ino.L().aj(R.string.f161060_resource_name_obfuscated_res_0x7f14068a);
        nfh t2 = mqd.f.t();
        boolean n = iqi.n(cit.F, list);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mqd mqdVar = (mqd) t2.b;
        mqdVar.a |= 1;
        mqdVar.b = n;
        t.dy("enable_expression_moment", (mqd) t2.cz());
        nfh t3 = mqd.f.t();
        boolean n2 = iqi.n(czu.a, list);
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mqd mqdVar2 = (mqd) t3.b;
        mqdVar2.a |= 1;
        mqdVar2.b = n2;
        t.dy("enable_dynamic_art", (mqd) t3.cz());
        nfh t4 = mqd.f.t();
        boolean z = aj && iqi.n(cit.a, list);
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        mqd mqdVar3 = (mqd) t4.b;
        mqdVar3.a |= 1;
        mqdVar3.b = z;
        t.dy("t2e_enabled", (mqd) t4.cz());
        nfh t5 = mqd.f.t();
        boolean z2 = aj && ((Boolean) cit.k.c()).booleanValue();
        if (t5.c) {
            t5.cD();
            t5.c = false;
        }
        mqd mqdVar4 = (mqd) t5.b;
        mqdVar4.a |= 1;
        mqdVar4.b = z2;
        t.dy("enable_handle_concept_for_expression_candidates", (mqd) t5.cz());
        nfh t6 = mqd.f.t();
        boolean aj2 = ino.L().aj(R.string.f160750_resource_name_obfuscated_res_0x7f14066b);
        if (t6.c) {
            t6.cD();
            t6.c = false;
        }
        mqd mqdVar5 = (mqd) t6.b;
        mqdVar5.a |= 1;
        mqdVar5.b = aj2;
        t.dy("emoji_preference_on", (mqd) t6.cz());
        nfh t7 = mqd.f.t();
        t7.dw(Arrays.asList(((String) bxn.ak.c()).split(",")));
        t.dy("blocked_candidate_types", (mqd) t7.cz());
        nfh t8 = mqb.d.t();
        mqc mqcVar = mqc.CONCEPT_PRED;
        if (t8.c) {
            t8.cD();
            t8.c = false;
        }
        mqb mqbVar = (mqb) t8.b;
        mqbVar.b = mqcVar.t;
        mqbVar.a |= 1;
        mqf mqfVar = (mqf) t.cz();
        if (t8.c) {
            t8.cD();
            t8.c = false;
        }
        mqb mqbVar2 = (mqb) t8.b;
        mqfVar.getClass();
        mqbVar2.c = mqfVar;
        mqbVar2.a |= 2;
        return (mqb) t8.cz();
    }

    public static Locale d(List list) {
        if (!((Boolean) bxn.d.c()).booleanValue()) {
            return null;
        }
        String str = (String) bxn.aC.c();
        Locale a2 = byn.a(list, str);
        if (a2 == null) {
            lfa R = jdg.R(bxp.class);
            R.b("keyboard locales", list);
            R.b("supported locales", str);
        }
        return a2;
    }

    @Override // defpackage.mix
    public final mko a() {
        HashSet hashSet;
        mko t;
        int v;
        Locale d = d(this.d);
        if (d == null) {
            nfh t2 = mqa.f.t();
            mqc mqcVar = mqc.CONCEPT_PRED;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mqa mqaVar = (mqa) t2.b;
            mqaVar.b = mqcVar.t;
            mqaVar.a = 1 | mqaVar.a;
            mko c = this.b.c((mqa) t2.cz());
            this.c.p(this.b);
            return c;
        }
        bxr a2 = this.c.a(d);
        if (a2.b()) {
            if (((Boolean) bxn.ao.c()).booleanValue()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(a2.d);
                    nfb b = nfb.b();
                    hashSet = new HashSet();
                    for (mwl mwlVar : ((mwm) nfm.x(mwm.b, fileInputStream, b)).a) {
                        for (mwn mwnVar : mwlVar.a) {
                            if ((mwnVar.a & 2) != 0 && (v = jco.v(mwnVar.b)) != 0 && v == 3) {
                                hashSet.add(mwnVar.c);
                            }
                        }
                    }
                    fileInputStream.close();
                } catch (IOException unused) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/crank/conceptpredictor/ConceptPredictorEngineLoader", "allEmojisInMapping", 151, "ConceptPredictorEngineLoader.java")).t("cannot parse the emoji mapping");
                    hashSet = new HashSet();
                }
                t = hiz.k(hbc.b(this.e).c(this.e, this.f, hdl.a)).u(new byi(hashSet, 1), this.f).v(new bxo(this, a2, 1), this.f).e(new bxo(this, a2, 0), this.f).t();
            } else {
                t = b(a2, lrr.a);
            }
            this.g.e(ctd.CONCEPT_PREDICTION_MODEL_LOADED, new Object[0]);
            return t;
        }
        mko l = this.c.l();
        this.g.e(ctd.CONCEPT_PREDICTION_MODEL_SYNC, new Object[0]);
        return l;
    }

    public final mko b(bxr bxrVar, Set set) {
        set.size();
        String str = bxrVar.c;
        nfh t = mqa.f.t();
        mqc mqcVar = mqc.CONCEPT_PRED;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mqa mqaVar = (mqa) t.b;
        mqaVar.b = mqcVar.t;
        mqaVar.a |= 1;
        nfh t2 = mqf.b.t();
        efq.x(t2, bxn.ac, bxn.ad, bxn.ae, bxn.af);
        nfh t3 = mqd.f.t();
        float f = bxrVar.l;
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mqd mqdVar = (mqd) t3.b;
        mqdVar.a |= 4;
        mqdVar.d = f;
        t2.dy("predictor_unk_threshold", (mqd) t3.cz());
        nfh t4 = mqd.f.t();
        float f2 = bxrVar.q;
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        mqd mqdVar2 = (mqd) t4.b;
        mqdVar2.a |= 4;
        mqdVar2.d = f2;
        t2.dy("query_prediction_slope", (mqd) t4.cz());
        nfh t5 = mqd.f.t();
        float f3 = bxrVar.r;
        if (t5.c) {
            t5.cD();
            t5.c = false;
        }
        mqd mqdVar3 = (mqd) t5.b;
        mqdVar3.a |= 4;
        mqdVar3.d = f3;
        t2.dy("query_prediction_intercept", (mqd) t5.cz());
        float floatValue = bxrVar.n ? bxrVar.m : ((Double) bxn.ag.c()).floatValue();
        nfh t6 = mqd.f.t();
        if (t6.c) {
            t6.cD();
            t6.c = false;
        }
        mqd mqdVar4 = (mqd) t6.b;
        mqdVar4.a |= 4;
        mqdVar4.d = floatValue;
        t2.dy("query_prediction_score_threshold", (mqd) t6.cz());
        if (bxrVar.p) {
            floatValue = bxrVar.o;
        }
        nfh t7 = mqd.f.t();
        if (t7.c) {
            t7.cD();
            t7.c = false;
        }
        mqd mqdVar5 = (mqd) t7.b;
        mqdVar5.a |= 4;
        mqdVar5.d = floatValue;
        t2.dy("tenor_query_threshold", (mqd) t7.cz());
        nfh t8 = mqd.f.t();
        float f4 = bxrVar.s;
        if (t8.c) {
            t8.cD();
            t8.c = false;
        }
        mqd mqdVar6 = (mqd) t8.b;
        mqdVar6.a |= 4;
        mqdVar6.d = f4;
        t2.dy("contextual_emoji_kitchen_threshold", (mqd) t8.cz());
        nfh t9 = mqd.f.t();
        t9.dx(String.valueOf(jbt.m(this.e).getFilesDir()) + File.separator + "expression_user_perference");
        t2.dy("user_perference_file", (mqd) t9.cz());
        if (!set.isEmpty()) {
            nfh t10 = mqd.f.t();
            t10.dw(set);
            t2.dy("renderable_emojis", (mqd) t10.cz());
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
        mqb c = c(this.d);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mqa mqaVar3 = (mqa) t.b;
        c.getClass();
        mqaVar3.e = c;
        mqaVar3.a |= 4;
        nfh t11 = mvo.d.t();
        String str2 = bxrVar.c;
        if (t11.c) {
            t11.cD();
            t11.c = false;
        }
        mvo mvoVar = (mvo) t11.b;
        str2.getClass();
        mvoVar.a |= 1;
        mvoVar.b = str2;
        t.dv((mvo) t11.cz());
        nfh t12 = mvo.d.t();
        String str3 = bxrVar.b;
        if (t12.c) {
            t12.cD();
            t12.c = false;
        }
        mvo mvoVar2 = (mvo) t12.b;
        str3.getClass();
        mvoVar2.a |= 1;
        mvoVar2.b = str3;
        t.dv((mvo) t12.cz());
        nfh t13 = mvo.d.t();
        String str4 = bxrVar.f;
        if (t13.c) {
            t13.cD();
            t13.c = false;
        }
        mvo mvoVar3 = (mvo) t13.b;
        str4.getClass();
        mvoVar3.a |= 1;
        mvoVar3.b = str4;
        t.dv((mvo) t13.cz());
        nfh t14 = mvo.d.t();
        String str5 = bxrVar.d;
        if (t14.c) {
            t14.cD();
            t14.c = false;
        }
        mvo mvoVar4 = (mvo) t14.b;
        str5.getClass();
        mvoVar4.a |= 1;
        mvoVar4.b = str5;
        t.dv((mvo) t14.cz());
        nfh t15 = mvo.d.t();
        String str6 = bxrVar.e;
        if (t15.c) {
            t15.cD();
            t15.c = false;
        }
        mvo mvoVar5 = (mvo) t15.b;
        str6.getClass();
        mvoVar5.a |= 1;
        mvoVar5.b = str6;
        t.dv((mvo) t15.cz());
        nfh t16 = mvo.d.t();
        String str7 = bxrVar.h;
        if (t16.c) {
            t16.cD();
            t16.c = false;
        }
        mvo mvoVar6 = (mvo) t16.b;
        str7.getClass();
        mvoVar6.a |= 1;
        mvoVar6.b = str7;
        t.dv((mvo) t16.cz());
        nfh t17 = mvo.d.t();
        String str8 = bxrVar.j;
        if (t17.c) {
            t17.cD();
            t17.c = false;
        }
        mvo mvoVar7 = (mvo) t17.b;
        str8.getClass();
        mvoVar7.a |= 1;
        mvoVar7.b = str8;
        t.dv((mvo) t17.cz());
        nfh t18 = mvo.d.t();
        String str9 = bxrVar.i;
        if (t18.c) {
            t18.cD();
            t18.c = false;
        }
        mvo mvoVar8 = (mvo) t18.b;
        str9.getClass();
        mvoVar8.a |= 1;
        mvoVar8.b = str9;
        t.dv((mvo) t18.cz());
        nfh t19 = mvo.d.t();
        String str10 = bxrVar.k;
        if (t19.c) {
            t19.cD();
            t19.c = false;
        }
        mvo mvoVar9 = (mvo) t19.b;
        str10.getClass();
        mvoVar9.a |= 1;
        mvoVar9.b = str10;
        t.dv((mvo) t19.cz());
        return this.b.a((mqa) t.cz());
    }
}
