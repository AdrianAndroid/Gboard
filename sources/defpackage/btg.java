package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: btg  reason: default package */
/* loaded from: classes.dex */
public final class btg extends btt {
    private static btg A;
    private static final String[] p;
    private static final String[] q;
    private static final String[] r;
    private static final llw s;
    private static final String[] t;
    private static final String[] u;
    private static final String[] v;
    private static final llw w;
    private final inm B = new btf(this, 0);
    private final inm C = new btf(this, 2);
    private final inm D = new btf(this, 3);
    public String a;
    public boolean b;
    public boolean c;
    public final cgp d;
    private static final llw o = llw.n("pinyin_standard_cantonese_pinyin", "yue_hant_t_i0_cpinyin_android_fuzzy_expansion_dictionary", "pinyin_standard_jyutping", "yue_hant_t_i0_jyutping_android_fuzzy_expansion_dictionary", "pinyin_standard_yale", "yue_hant_t_i0_yale_android_fuzzy_expansion_dictionary");
    private static final String[] x = {null, "zh_hk_contacts_dict_3_3", "zh_hk_user_dict_3_3", "zh_hk_shortcut_dict_3_3"};
    private static final String[] y = {"yue-hant_i0_new_words_dictionary_accessor", "yue-hant_i0_contacts_dictionary_accessor", "yue-hant_i0_user_dictionary_accessor", "yue-hant_i0_shortcuts_dictionary_accessor"};
    private static final String[] z = {"yue-hant-t-i0-yale-x-f0-delight", "zh-t-i0-stroke", "yue-hant-t-i0-handwriting"};

    static {
        String[] strArr = {"cpinyin_mutable_dictionary_accessor_setting_scheme", "cpinyin_mutable_dictionary_accessor_setting_scheme", "cpinyin_mutable_dictionary_accessor_setting_scheme", "shortcuts_mutable_dictionary_accessor_setting_scheme"};
        p = strArr;
        String[] strArr2 = {"jyutping_mutable_dictionary_accessor_setting_scheme", "jyutping_mutable_dictionary_accessor_setting_scheme", "jyutping_mutable_dictionary_accessor_setting_scheme", "shortcuts_mutable_dictionary_accessor_setting_scheme"};
        q = strArr2;
        String[] strArr3 = {"yale_mutable_dictionary_accessor_setting_scheme", "yale_mutable_dictionary_accessor_setting_scheme", "yale_mutable_dictionary_accessor_setting_scheme", "shortcuts_mutable_dictionary_accessor_setting_scheme"};
        r = strArr3;
        s = llw.n("pinyin_standard_cantonese_pinyin", strArr, "pinyin_standard_jyutping", strArr2, "pinyin_standard_yale", strArr3);
        String[] strArr4 = {"cpinyin_setting_scheme", "stroke_setting_scheme", "handwriting_setting_scheme"};
        t = strArr4;
        String[] strArr5 = {"jyutping_setting_scheme", "stroke_setting_scheme", "handwriting_setting_scheme"};
        u = strArr5;
        String[] strArr6 = {"yale_setting_scheme", "stroke_setting_scheme", "handwriting_setting_scheme"};
        v = strArr6;
        w = llw.n("pinyin_standard_cantonese_pinyin", strArr4, "pinyin_standard_jyutping", strArr5, "pinyin_standard_yale", strArr6);
    }

    private btg(Context context) {
        super(context);
        this.d = new cgp(context, "zh_HK");
    }

    public static btg a(Context context) {
        btg btgVar;
        synchronized (btg.class) {
            if (A == null) {
                A = new btg(context);
                div.c().i(A, "zh_HK", "zh_HK");
            }
            btgVar = A;
        }
        return btgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dij
    public final void c() {
        super.c();
        this.a = this.h.y(R.string.f160460_resource_name_obfuscated_res_0x7f14064b);
        this.b = this.h.aj(R.string.f160490_resource_name_obfuscated_res_0x7f14064e);
        this.c = this.h.aj(R.string.f161380_resource_name_obfuscated_res_0x7f1406aa);
        this.h.X(this.B, R.string.f160460_resource_name_obfuscated_res_0x7f14064b);
        this.h.X(this.C, R.string.f160490_resource_name_obfuscated_res_0x7f14064e);
        this.h.X(this.D, R.string.f161380_resource_name_obfuscated_res_0x7f1406aa);
    }

    @Override // defpackage.dij
    protected final String[] d() {
        return z;
    }

    @Override // defpackage.dij
    protected final String[] e() {
        return (String[]) w.get(this.a);
    }

    @Override // defpackage.dij
    public final String g() {
        return "yue-hant-t-i0-yale-x-f0-delight";
    }

    @Override // defpackage.dij
    public final dij ge() {
        return this.d;
    }

    @Override // defpackage.dij
    protected final void h() {
        w();
        gyk.i(this.k).s(new btq(a(this.k)));
        this.d.l();
        ikj.C(this.k).s(new djq(this, new cgo(1)));
    }

    @Override // defpackage.dij
    protected final String[] i() {
        return y;
    }

    @Override // defpackage.dij
    protected final String[] j() {
        return (String[]) s.get(this.a);
    }

    @Override // defpackage.dij
    protected final String[] k() {
        return x;
    }

    public final HmmEngineInterfaceImpl l() {
        return super.K("yue-hant-t-i0-yale-x-f0-delight");
    }

    public final HmmEngineInterfaceImpl m() {
        return super.K("yue-hant-t-i0-handwriting");
    }

    public final HmmEngineInterfaceImpl n() {
        return super.K("zh-t-i0-stroke");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dij
    public final void o(int i, nfh nfhVar) {
        super.o(i, nfhVar);
        if (this.b) {
            if (i != 0) {
                if (i == 2) {
                    i = 2;
                }
            }
            mpn mpnVar = ((mpo) nfhVar.b).e;
            if (mpnVar == null) {
                mpnVar = mpn.b;
            }
            nfh nfhVar2 = (nfh) mpnVar.N(5);
            nfhVar2.cG(mpnVar);
            O(nfhVar2, "yue_hant_t_i0_und_android_system_english_dictionary", 2, 2);
            O(nfhVar2, this.d.H(3), 3, 3);
            O(nfhVar2, this.d.H(2), 4, 4);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mpo mpoVar = (mpo) nfhVar.b;
            mpn mpnVar2 = (mpn) nfhVar2.cz();
            mpnVar2.getClass();
            mpoVar.e = mpnVar2;
            mpoVar.a |= 8;
        }
        if (i == 0 && this.c) {
            String str = (String) o.get(this.a);
            nfh t2 = mpk.b.t();
            mpo mpoVar2 = (mpo) nfhVar.b;
            if ((mpoVar2.a & 4) != 0) {
                mpk mpkVar = mpoVar2.d;
                if (mpkVar == null) {
                    mpkVar = mpk.b;
                }
                t2.dr(mpkVar.a);
            }
            t2.ds(str);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mpo mpoVar3 = (mpo) nfhVar.b;
            mpk mpkVar2 = (mpk) t2.cz();
            mpkVar2.getClass();
            mpoVar3.d = mpkVar2;
            mpoVar3.a |= 4;
        }
        mpp mppVar = ((mpo) nfhVar.b).c;
        if (mppVar == null) {
            mppVar = mpp.b;
        }
        nfh nfhVar3 = (nfh) mppVar.N(5);
        nfhVar3.cG(mppVar);
        if (this.b && (i == 0 || i == 2)) {
            nfhVar3.du("yue_hant_t_i0_und_android_english_token_dictionary");
        }
        if (N(4)) {
            nfhVar3.du("shortcuts_token_dictionary");
        }
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mpo mpoVar4 = (mpo) nfhVar.b;
        mpp mppVar2 = (mpp) nfhVar3.cz();
        mppVar2.getClass();
        mpoVar4.c = mppVar2;
        mpoVar4.a |= 2;
    }
}
