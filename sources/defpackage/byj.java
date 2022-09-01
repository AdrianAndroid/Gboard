package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: byj  reason: default package */
/* loaded from: classes.dex */
public final class byj implements mix {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/crank/transformerexpression/TransformerExpressionEngineLoader");
    private final bxh b;
    private final bym c;
    private final List d;
    private final Context e;
    private final idk g = ieh.j();
    private final mkr f = gxo.a(9);

    public byj(bxh bxhVar, bym bymVar, List list, Context context) {
        this.b = bxhVar;
        this.c = bymVar;
        this.d = list;
        this.e = context;
        bymVar.n(bxhVar);
    }

    public static mqb c(List list) {
        nfh t = mqf.b.t();
        efq.x(t, bxn.ab, cit.A, cit.n, cit.o, cit.p, cit.q);
        efq.v(t, bxn.ah, bxn.ai, bxn.al, bxn.am, bxn.an, bxn.aq, bxn.ap, bxn.aj, cit.P, cit.h, cmo.y);
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
        nfh t7 = mqb.d.t();
        mqc mqcVar = mqc.TRANSFORMER_EXPRESSION_PRED;
        if (t7.c) {
            t7.cD();
            t7.c = false;
        }
        mqb mqbVar = (mqb) t7.b;
        mqbVar.b = mqcVar.t;
        mqbVar.a |= 1;
        mqf mqfVar = (mqf) t.cz();
        if (t7.c) {
            t7.cD();
            t7.c = false;
        }
        mqb mqbVar2 = (mqb) t7.b;
        mqfVar.getClass();
        mqbVar2.c = mqfVar;
        mqbVar2.a |= 2;
        return (mqb) t7.cz();
    }

    @Override // defpackage.mix
    public final mko a() {
        Locale a2;
        byl bylVar;
        HashSet hashSet;
        mko t;
        int v;
        List list = this.d;
        if (!((Boolean) bxn.e.c()).booleanValue()) {
            a2 = null;
        } else {
            String str = (String) bxn.aJ.c();
            a2 = byn.a(list, str);
            if (a2 == null) {
                lfa R = jdg.R(byj.class);
                R.b("keyboard locales", list);
                R.b("supported locales", str);
            }
        }
        if (a2 == null) {
            nfh t2 = mqa.f.t();
            mqc mqcVar = mqc.TRANSFORMER_EXPRESSION_PRED;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mqa mqaVar = (mqa) t2.b;
            mqaVar.b = mqcVar.t;
            mqaVar.a |= 1;
            mko c = this.b.c((mqa) t2.cz());
            this.c.p(this.b);
            return c;
        }
        byz k = this.c.k(a2, null);
        if (k == null) {
            bylVar = byl.a;
        } else {
            File[] listFiles = k.b().listFiles();
            if (listFiles == null || (r13 = listFiles.length) < 4) {
                bylVar = byl.a;
            } else {
                byk a3 = byl.a();
                for (File file : listFiles) {
                    String path = file.getPath();
                    if (path.endsWith(".tflite")) {
                        a3.l(path);
                    } else if (path.endsWith("token.csym")) {
                        a3.u(path);
                    } else if (path.endsWith(".blacklist")) {
                        a3.d(path);
                    } else if (path.endsWith(".whitelist")) {
                        a3.b(path);
                    } else if (path.endsWith("names.trietree")) {
                        a3.m(path);
                    } else if (path.endsWith("concepts.csym")) {
                        a3.f(path);
                    } else if (path.endsWith("emoji_mapping.pb")) {
                        a3.j(path);
                    } else if (path.endsWith("rules.pb")) {
                        a3.p(path);
                    } else if (path.endsWith("expression_query_set.pb")) {
                        a3.o(path);
                    } else if (path.endsWith("query_mapping.pb")) {
                        a3.n(path);
                    } else if (path.endsWith("emoji_to_entity.pb")) {
                        a3.k(path);
                    } else if (path.endsWith("concept_display_name.pb")) {
                        a3.e(path);
                    } else if (path.endsWith("stopwords.pb")) {
                        a3.s(path);
                    }
                }
                jsq n = k.a().n();
                try {
                    if (n.d().contains("transformer_expression_triggering_threshold")) {
                        a3.v(Float.parseFloat((String) n.a("transformer_expression_triggering_threshold")));
                    }
                    if (n.d().contains("concept_threshold")) {
                        a3.g(Float.parseFloat((String) n.a("concept_threshold")));
                    }
                    if (n.d().contains("bitmoji_query_threshold")) {
                        a3.c(Float.parseFloat((String) n.a("bitmoji_query_threshold")));
                    }
                    if (n.d().contains("tenor_query_threshold")) {
                        a3.t(Float.parseFloat((String) n.a("tenor_query_threshold")));
                    }
                    if (n.d().contains("dynamic_art_threshold")) {
                        a3.i(Float.parseFloat((String) n.a("dynamic_art_threshold")));
                    }
                    if (n.d().contains("semantic_emoji_threshold")) {
                        a3.r(Float.parseFloat((String) n.a("semantic_emoji_threshold")));
                    }
                    if (n.d().contains("semantic_emoji_for_search_threshold")) {
                        a3.q(Float.parseFloat((String) n.a("semantic_emoji_for_search_threshold")));
                    }
                    if (n.d().contains("contextual_emoji_kitchen_threshold")) {
                        a3.h(Float.parseFloat((String) n.a("contextual_emoji_kitchen_threshold")));
                    }
                } catch (NumberFormatException e) {
                    ((ltd) ((ltd) ((ltd) bym.a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/crank/transformerexpression/TransformerExpressionModelManager", "getModelFiles", (char) 243, "TransformerExpressionModelManager.java")).t("Failed to parse parameters");
                }
                bylVar = a3.a();
            }
        }
        byl bylVar2 = bylVar;
        if (TextUtils.isEmpty(bylVar2.b) || TextUtils.isEmpty(bylVar2.c) || TextUtils.isEmpty(bylVar2.h) || TextUtils.isEmpty(bylVar2.g) || TextUtils.isEmpty(bylVar2.j)) {
            mko l = this.c.l();
            this.g.e(ctd.TRANSFORMER_EXPRESSION_MODEL_SYNC, new Object[0]);
            return l;
        }
        if (!((Boolean) bxn.ao.c()).booleanValue()) {
            t = b(bylVar2, lrr.a);
        } else {
            try {
                FileInputStream fileInputStream = new FileInputStream(bylVar2.h);
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
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/crank/transformerexpression/TransformerExpressionEngineLoader", "allEmojisInMapping", 155, "TransformerExpressionEngineLoader.java")).t("cannot parse the emoji mapping");
                hashSet = new HashSet();
            }
            t = hiz.k(hbc.b(this.e).c(this.e, this.f, hdl.a)).u(new byi(hashSet, 0), this.f).v(new bxo(this, bylVar2, 2), this.f).e(new bxo(this, bylVar2, 3), this.f).t();
        }
        this.g.e(ctd.TRANSFORMER_EXPRESSION_MODEL_LOADED, new Object[0]);
        return t;
    }

    public final mko b(byl bylVar, Set set) {
        set.size();
        String str = bylVar.c;
        nfh t = mqa.f.t();
        mqc mqcVar = mqc.TRANSFORMER_EXPRESSION_PRED;
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
        float f = bylVar.n;
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mqd mqdVar = (mqd) t3.b;
        mqdVar.a |= 4;
        mqdVar.d = f;
        t2.dy("transformer_expression_triggering_threshold", (mqd) t3.cz());
        nfh t4 = mqd.f.t();
        float f2 = bylVar.o;
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        mqd mqdVar2 = (mqd) t4.b;
        mqdVar2.a |= 4;
        mqdVar2.d = f2;
        t2.dy("concept_threshold", (mqd) t4.cz());
        nfh t5 = mqd.f.t();
        float f3 = bylVar.p;
        if (t5.c) {
            t5.cD();
            t5.c = false;
        }
        mqd mqdVar3 = (mqd) t5.b;
        mqdVar3.a |= 4;
        mqdVar3.d = f3;
        t2.dy("bitmoji_query_threshold", (mqd) t5.cz());
        nfh t6 = mqd.f.t();
        float f4 = bylVar.q;
        if (t6.c) {
            t6.cD();
            t6.c = false;
        }
        mqd mqdVar4 = (mqd) t6.b;
        mqdVar4.a |= 4;
        mqdVar4.d = f4;
        t2.dy("tenor_query_threshold", (mqd) t6.cz());
        nfh t7 = mqd.f.t();
        float f5 = bylVar.r;
        if (t7.c) {
            t7.cD();
            t7.c = false;
        }
        mqd mqdVar5 = (mqd) t7.b;
        mqdVar5.a |= 4;
        mqdVar5.d = f5;
        t2.dy("dynamic_art_threshold", (mqd) t7.cz());
        nfh t8 = mqd.f.t();
        float f6 = bylVar.s;
        if (t8.c) {
            t8.cD();
            t8.c = false;
        }
        mqd mqdVar6 = (mqd) t8.b;
        mqdVar6.a |= 4;
        mqdVar6.d = f6;
        t2.dy("semantic_emoji_threshold", (mqd) t8.cz());
        nfh t9 = mqd.f.t();
        float f7 = bylVar.t;
        if (t9.c) {
            t9.cD();
            t9.c = false;
        }
        mqd mqdVar7 = (mqd) t9.b;
        mqdVar7.a |= 4;
        mqdVar7.d = f7;
        t2.dy("semantic_emoji_for_search_threshold", (mqd) t9.cz());
        nfh t10 = mqd.f.t();
        float f8 = bylVar.u;
        if (t10.c) {
            t10.cD();
            t10.c = false;
        }
        mqd mqdVar8 = (mqd) t10.b;
        mqdVar8.a |= 4;
        mqdVar8.d = f8;
        t2.dy("contextual_emoji_kitchen_threshold", (mqd) t10.cz());
        nfh t11 = mqd.f.t();
        t11.dx(String.valueOf(jbt.m(this.e).getFilesDir()) + File.separator + "expression_user_perference");
        t2.dy("user_perference_file", (mqd) t11.cz());
        if (!set.isEmpty()) {
            nfh t12 = mqd.f.t();
            t12.dw(set);
            t2.dy("renderable_emojis", (mqd) t12.cz());
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
        nfh t13 = mvo.d.t();
        String str2 = bylVar.c;
        if (t13.c) {
            t13.cD();
            t13.c = false;
        }
        mvo mvoVar = (mvo) t13.b;
        str2.getClass();
        mvoVar.a |= 1;
        mvoVar.b = str2;
        t.dv((mvo) t13.cz());
        nfh t14 = mvo.d.t();
        String str3 = bylVar.b;
        if (t14.c) {
            t14.cD();
            t14.c = false;
        }
        mvo mvoVar2 = (mvo) t14.b;
        str3.getClass();
        mvoVar2.a |= 1;
        mvoVar2.b = str3;
        t.dv((mvo) t14.cz());
        nfh t15 = mvo.d.t();
        String str4 = bylVar.d;
        if (t15.c) {
            t15.cD();
            t15.c = false;
        }
        mvo mvoVar3 = (mvo) t15.b;
        str4.getClass();
        mvoVar3.a |= 1;
        mvoVar3.b = str4;
        t.dv((mvo) t15.cz());
        nfh t16 = mvo.d.t();
        String str5 = bylVar.e;
        if (t16.c) {
            t16.cD();
            t16.c = false;
        }
        mvo mvoVar4 = (mvo) t16.b;
        str5.getClass();
        mvoVar4.a |= 1;
        mvoVar4.b = str5;
        t.dv((mvo) t16.cz());
        nfh t17 = mvo.d.t();
        String str6 = bylVar.f;
        if (t17.c) {
            t17.cD();
            t17.c = false;
        }
        mvo mvoVar5 = (mvo) t17.b;
        str6.getClass();
        mvoVar5.a |= 1;
        mvoVar5.b = str6;
        t.dv((mvo) t17.cz());
        nfh t18 = mvo.d.t();
        String str7 = bylVar.g;
        if (t18.c) {
            t18.cD();
            t18.c = false;
        }
        mvo mvoVar6 = (mvo) t18.b;
        str7.getClass();
        mvoVar6.a |= 1;
        mvoVar6.b = str7;
        t.dv((mvo) t18.cz());
        nfh t19 = mvo.d.t();
        String str8 = bylVar.h;
        if (t19.c) {
            t19.cD();
            t19.c = false;
        }
        mvo mvoVar7 = (mvo) t19.b;
        str8.getClass();
        mvoVar7.a |= 1;
        mvoVar7.b = str8;
        t.dv((mvo) t19.cz());
        nfh t20 = mvo.d.t();
        String str9 = bylVar.i;
        if (t20.c) {
            t20.cD();
            t20.c = false;
        }
        mvo mvoVar8 = (mvo) t20.b;
        str9.getClass();
        mvoVar8.a |= 1;
        mvoVar8.b = str9;
        t.dv((mvo) t20.cz());
        nfh t21 = mvo.d.t();
        String str10 = bylVar.j;
        if (t21.c) {
            t21.cD();
            t21.c = false;
        }
        mvo mvoVar9 = (mvo) t21.b;
        str10.getClass();
        mvoVar9.a |= 1;
        mvoVar9.b = str10;
        t.dv((mvo) t21.cz());
        nfh t22 = mvo.d.t();
        String str11 = bylVar.k;
        if (t22.c) {
            t22.cD();
            t22.c = false;
        }
        mvo mvoVar10 = (mvo) t22.b;
        str11.getClass();
        mvoVar10.a |= 1;
        mvoVar10.b = str11;
        t.dv((mvo) t22.cz());
        nfh t23 = mvo.d.t();
        String str12 = bylVar.l;
        if (t23.c) {
            t23.cD();
            t23.c = false;
        }
        mvo mvoVar11 = (mvo) t23.b;
        str12.getClass();
        mvoVar11.a |= 1;
        mvoVar11.b = str12;
        t.dv((mvo) t23.cz());
        nfh t24 = mvo.d.t();
        String str13 = bylVar.m;
        if (t24.c) {
            t24.cD();
            t24.c = false;
        }
        mvo mvoVar12 = (mvo) t24.b;
        str13.getClass();
        mvoVar12.a |= 1;
        mvoVar12.b = str13;
        t.dv((mvo) t24.cz());
        return this.b.a((mqa) t.cz());
    }
}
