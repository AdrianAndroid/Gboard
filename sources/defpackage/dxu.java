package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.hmm.DataManagerImpl;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dxu  reason: default package */
/* loaded from: classes.dex */
public final class dxu extends btt {
    private static dxu B;
    private boolean C;
    private boolean D;
    private String E;
    private final inm F = new btf(this, 16);
    private final inm G = new btf(this, 17);
    private final inm H = new btf(this, 18);
    private final inm I = new btf(this, 19);
    private final inm J = new btf(this, 20);
    private mpo K;
    public boolean c;
    public String d;
    public boolean o;
    public boolean p;
    public boolean q;
    public final cgp r;
    private static final lug s = hin.a;
    private static final String[] t = {"zh-t-i0-pinyin-x-f0-delight", "zh-t-i0-pinyin-x-l0-t9key", "zh-t-i0-handwriting", "zh-t-i0-stroke", "zh-t-i0-wubi"};
    private static final String[] u = {"pinyin_qwerty_setting_scheme", "pinyin_t9_setting_scheme", "pinyin_handwriting_setting_scheme", "stroke_setting_scheme", "wubi_setting_scheme"};
    private static final String[] v = {"system_optional_dict_3_3", "contacts_dict_3_3", "user_dict_3_3", "shortcuts_dict_3_3"};
    private static final String[] w = {"system_optional_dict_3_3", "", "", ""};
    private static final String[] x = {"pinyin_mutable_dictionary_accessor_setting_scheme", "pinyin_mutable_dictionary_accessor_setting_scheme", "pinyin_mutable_dictionary_accessor_setting_scheme", "shortcuts_mutable_dictionary_accessor_setting_scheme", "pinyin_mutable_dictionary_accessor_setting_scheme_secondary"};
    private static final String[] y = {"zh_t_i0_pinyin_new_words_dictionary_accessor", "zh_t_i0_pinyin_contacts_dictionary_accessor", "zh_t_i0_pinyin_user_dictionary_accessor", "zh_t_i0_pinyin_shortcuts_dictionary_accessor", "zh_t_i0_pinyin_user_dictionary_accessor"};
    private static final int[] z = {R.string.f161370_resource_name_obfuscated_res_0x7f1406a9, R.string.f161270_resource_name_obfuscated_res_0x7f14069f, R.string.f161350_resource_name_obfuscated_res_0x7f1406a7, R.string.f161260_resource_name_obfuscated_res_0x7f14069e, R.string.f161280_resource_name_obfuscated_res_0x7f1406a0, R.string.f161310_resource_name_obfuscated_res_0x7f1406a3, R.string.f161330_resource_name_obfuscated_res_0x7f1406a5, R.string.f161290_resource_name_obfuscated_res_0x7f1406a1, R.string.f161340_resource_name_obfuscated_res_0x7f1406a6, R.string.f161320_resource_name_obfuscated_res_0x7f1406a4, R.string.f161300_resource_name_obfuscated_res_0x7f1406a2, R.string.f161360_resource_name_obfuscated_res_0x7f1406a8};
    private static final String[] A = {"zh_t_i0_pinyin_android_z_zh_fuzzy_expansion_dictionary", "zh_t_i0_pinyin_android_c_ch_fuzzy_expansion_dictionary", "zh_t_i0_pinyin_android_s_sh_fuzzy_expansion_dictionary", "zh_t_i0_pinyin_android_an_ang_fuzzy_expansion_dictionary", "zh_t_i0_pinyin_android_en_eng_fuzzy_expansion_dictionary", "zh_t_i0_pinyin_android_in_ing_fuzzy_expansion_dictionary", "zh_t_i0_pinyin_android_l_n_fuzzy_expansion_dictionary", "zh_t_i0_pinyin_android_f_h_fuzzy_expansion_dictionary", "zh_t_i0_pinyin_android_r_l_fuzzy_expansion_dictionary", "zh_t_i0_pinyin_android_k_g_fuzzy_expansion_dictionary", "zh_t_i0_pinyin_android_ian_iang_fuzzy_expansion_dictionary", "zh_t_i0_pinyin_android_uan_uang_fuzzy_expansion_dictionary"};
    static final int[] a = {R.string.f160160_resource_name_obfuscated_res_0x7f14062d, R.string.f160180_resource_name_obfuscated_res_0x7f14062f, R.string.f160190_resource_name_obfuscated_res_0x7f140630, R.string.f160200_resource_name_obfuscated_res_0x7f140631, R.string.f160210_resource_name_obfuscated_res_0x7f140632, R.string.f160220_resource_name_obfuscated_res_0x7f140633, R.string.f160230_resource_name_obfuscated_res_0x7f140634};
    static final String[] b = {"zh_t_i0_pinyin_android_token_dictionary", "zh_t_i0_shuangpin_abc_android_token_dictionary", "zh_t_i0_shuangpin_flypy_android_token_dictionary", "zh_t_i0_shuangpin_jiajia_android_token_dictionary", "zh_t_i0_shuangpin_ms_android_token_dictionary", "zh_t_i0_shuangpin_ziguang_android_token_dictionary", "zh_t_i0_shuangpin_ziranma_android_token_dictionary"};

    private dxu(Context context) {
        super(context);
        this.r = new cgp(context, "zh_CN");
    }

    private final void Q() {
        if (this.D) {
            String Q = this.h.Q("pref_key_post_process_table_file");
            if (TextUtils.isEmpty(Q)) {
                this.D = false;
                return;
            }
            File file = new File(this.k.getFilesDir(), Q);
            if (!file.exists()) {
                ((luc) ((luc) s.c()).k("com/google/android/apps/inputmethod/libs/pinyin/PinyinHmmEngineFactory", "enrollBlocklistIfNecessary", 390, "PinyinHmmEngineFactory.java")).w("post process table %s does not exists.", file.getAbsolutePath());
            }
            DataManagerImpl J = J();
            if (!J.nativeEnrollDataFile(J.a, "zh_t_i0_pinyin_android_postprocess_table", 34, file.getAbsolutePath())) {
                return;
            }
            this.D = false;
        }
    }

    private final void R() {
        if (this.C) {
            String Q = this.h.Q("pref_key_new_words_file");
            if (!F(Q, Q, 22, 0)) {
                return;
            }
            this.E = Q;
            E();
            this.C = false;
        }
    }

    private static boolean S(int i) {
        return i <= 2;
    }

    private final String[] T() {
        ArrayList A2 = lre.A();
        A2.add(this.d);
        if (this.o) {
            A2.add("zh_t_i0_pinyin_android_english_token_dictionary");
        }
        if (this.p) {
            A2.add("zh_t_i0_pinyin_android_digits_token_dictionary");
        }
        if (N(4)) {
            A2.add("shortcuts_token_dictionary");
        }
        return (String[]) A2.toArray(new String[A2.size()]);
    }

    public static dxu l(Context context) {
        dxu dxuVar;
        synchronized (dxu.class) {
            if (B == null) {
                B = new dxu(context);
                div.c().i(B, "zh_CN", "zh_CN");
            }
            dxuVar = B;
        }
        return dxuVar;
    }

    @Override // defpackage.dij
    public final void A() {
        super.A();
        this.r.A();
        R();
        Q();
    }

    public final MutableDictionaryAccessorInterfaceImpl P() {
        return L("user_dictionary_accessor_for_ime", H(3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dij
    public final void c() {
        super.c();
        this.c = this.h.aj(R.string.f161250_resource_name_obfuscated_res_0x7f14069d);
        this.o = this.h.aj(R.string.f160480_resource_name_obfuscated_res_0x7f14064d);
        this.p = this.h.aj(R.string.f160470_resource_name_obfuscated_res_0x7f14064c);
        this.d = m();
        this.q = this.h.aj(R.string.f162600_resource_name_obfuscated_res_0x7f140725);
        this.h.X(this.F, R.string.f161250_resource_name_obfuscated_res_0x7f14069d);
        this.h.Z(this.F, z);
        this.h.X(this.G, R.string.f160480_resource_name_obfuscated_res_0x7f14064d);
        this.h.X(this.H, R.string.f160470_resource_name_obfuscated_res_0x7f14064c);
        this.h.X(this.I, R.string.f162290_resource_name_obfuscated_res_0x7f140706);
        this.h.X(this.J, R.string.f162600_resource_name_obfuscated_res_0x7f140725);
    }

    @Override // defpackage.dij
    protected final String[] d() {
        return t;
    }

    @Override // defpackage.dij
    protected final String[] e() {
        return u;
    }

    @Override // defpackage.dij
    public final String g() {
        return "zh-t-i0-pinyin-x-f0-delight";
    }

    @Override // defpackage.dij
    public final dij ge() {
        return this.r;
    }

    @Override // defpackage.dij
    protected final void h() {
        this.K = q().b("pinyin_mutable_dictionary_accessor_setting_scheme");
        n();
        w();
        gyk.i(this.k).s(new btq(this));
        ikj.C(this.k).s(new djq(this, new cgo(1)));
        this.r.l();
        this.C = true;
        this.D = true;
        R();
        Q();
    }

    @Override // defpackage.dij
    protected final String[] i() {
        return y;
    }

    @Override // defpackage.dij
    protected final String[] j() {
        return x;
    }

    @Override // defpackage.dij
    protected final String[] k() {
        return !irs.d() ? w : v;
    }

    public final String m() {
        String y2 = this.h.y(R.string.f162290_resource_name_obfuscated_res_0x7f140706);
        if (!TextUtils.isEmpty(y2)) {
            int length = a.length;
            for (int i = 0; i < 7; i++) {
                if (y2.equals(this.k.getString(a[i]))) {
                    return b[i];
                }
            }
            return "zh_t_i0_pinyin_android_token_dictionary";
        }
        return "zh_t_i0_pinyin_android_token_dictionary";
    }

    public final void n() {
        mpo mpoVar = this.K;
        if (mpoVar == null) {
            return;
        }
        nfh nfhVar = (nfh) mpoVar.N(5);
        nfhVar.cG(mpoVar);
        mpp mppVar = this.K.c;
        if (mppVar == null) {
            mppVar = mpp.b;
        }
        nfh nfhVar2 = (nfh) mppVar.N(5);
        nfhVar2.cG(mppVar);
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        ((mpp) nfhVar2.b).a = nfm.G();
        nfhVar2.dt(Arrays.asList(T()));
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mpo mpoVar2 = (mpo) nfhVar.b;
        mpp mppVar2 = (mpp) nfhVar2.cz();
        mppVar2.getClass();
        mpoVar2.c = mppVar2;
        mpoVar2.a |= 2;
        this.K = (mpo) nfhVar.cz();
        this.n.a("user_dictionary_accessor_for_ime", this.K.q());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dij
    public final void o(int i, nfh nfhVar) {
        nfh t2;
        super.o(i, nfhVar);
        mpn mpnVar = ((mpo) nfhVar.b).e;
        if (mpnVar == null) {
            mpnVar = mpn.b;
        }
        nfh nfhVar2 = (nfh) mpnVar.N(5);
        nfhVar2.cG(mpnVar);
        if (this.o && S(i)) {
            O(nfhVar2, "zh_t_i0_pinyin_android_system_english_dictionary", 2, 2);
            O(nfhVar2, this.r.H(3), 3, 3);
            O(nfhVar2, this.r.H(2), 4, 4);
        }
        if (S(i) && N(4)) {
            O(nfhVar2, this.r.H(4), 4, 5);
        }
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mpo mpoVar = (mpo) nfhVar.b;
        mpn mpnVar2 = (mpn) nfhVar2.cz();
        mpnVar2.getClass();
        mpoVar.e = mpnVar2;
        mpoVar.a |= 8;
        if (this.p && i <= 2) {
            mpn mpnVar3 = ((mpo) nfhVar.b).e;
            if (mpnVar3 == null) {
                mpnVar3 = mpn.b;
            }
            nfh nfhVar3 = (nfh) mpnVar3.N(5);
            nfhVar3.cG(mpnVar3);
            O(nfhVar3, "zh_t_i0_pinyin_android_system_digits_dictionary", 2, 2);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mpo mpoVar2 = (mpo) nfhVar.b;
            mpn mpnVar4 = (mpn) nfhVar3.cz();
            mpnVar4.getClass();
            mpoVar2.e = mpnVar4;
            mpoVar2.a |= 8;
        }
        if (i < 2) {
            ArrayList arrayList = new ArrayList();
            mpo mpoVar3 = (mpo) nfhVar.b;
            if ((mpoVar3.a & 4) != 0) {
                mpk mpkVar = mpoVar3.d;
                if (mpkVar == null) {
                    mpkVar = mpk.b;
                }
                arrayList.addAll(mpkVar.a);
            }
            if (this.c) {
                int i2 = 0;
                while (true) {
                    int[] iArr = z;
                    int length = iArr.length;
                    if (i2 >= 12) {
                        break;
                    }
                    if (this.h.aj(iArr[i2])) {
                        arrayList.add(A[i2]);
                    }
                    i2++;
                }
            }
            nfh t3 = mpk.b.t();
            t3.dr(arrayList);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mpo mpoVar4 = (mpo) nfhVar.b;
            mpk mpkVar2 = (mpk) t3.cz();
            mpkVar2.getClass();
            mpoVar4.d = mpkVar2;
            mpoVar4.a |= 4;
        }
        if (i <= 2) {
            mpo mpoVar5 = (mpo) nfhVar.b;
            if ((mpoVar5.a & 2) == 0) {
                t2 = mpp.b.t();
            } else {
                mpp mppVar = mpoVar5.c;
                if (mppVar == null) {
                    mppVar = mpp.b;
                }
                t2 = (nfh) mppVar.N(5);
                t2.cG(mppVar);
            }
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            ((mpp) t2.b).a = nfm.G();
            t2.dt(Arrays.asList(T()));
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mpo mpoVar6 = (mpo) nfhVar.b;
            mpp mppVar2 = (mpp) t2.cz();
            mppVar2.getClass();
            mpoVar6.c = mppVar2;
            mpoVar6.a |= 2;
        }
        if (this.q) {
            mpn mpnVar5 = ((mpo) nfhVar.b).e;
            if (mpnVar5 == null) {
                mpnVar5 = mpn.b;
            }
            nfh nfhVar4 = (nfh) mpnVar5.N(5);
            nfhVar4.cG(mpnVar5);
            O(nfhVar4, "zh_t_i0_pinyin_android_system_emoji_dictionary", 2, 2);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mpo mpoVar7 = (mpo) nfhVar.b;
            mpn mpnVar6 = (mpn) nfhVar4.cz();
            mpnVar6.getClass();
            mpoVar7.e = mpnVar6;
            mpoVar7.a |= 8;
            nfh t4 = mpk.b.t();
            mpo mpoVar8 = (mpo) nfhVar.b;
            if ((mpoVar8.a & 32768) != 0) {
                mpk mpkVar3 = mpoVar8.i;
                if (mpkVar3 == null) {
                    mpkVar3 = mpk.b;
                }
                t4.dr(mpkVar3.a);
            }
            t4.ds("zh_t_i0_pinyin_android_system_emoji_dictionary");
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mpo mpoVar9 = (mpo) nfhVar.b;
            mpk mpkVar4 = (mpk) t4.cz();
            mpkVar4.getClass();
            mpoVar9.i = mpkVar4;
            mpoVar9.a |= 32768;
        }
        if (TextUtils.isEmpty(this.E)) {
            return;
        }
        mpn mpnVar7 = ((mpo) nfhVar.b).e;
        if (mpnVar7 == null) {
            mpnVar7 = mpn.b;
        }
        nfh nfhVar5 = (nfh) mpnVar7.N(5);
        nfhVar5.cG(mpnVar7);
        O(nfhVar5, this.E, 2, 2);
        O(nfhVar5, this.E, 2, 2);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mpo mpoVar10 = (mpo) nfhVar.b;
        mpn mpnVar8 = (mpn) nfhVar5.cz();
        mpnVar8.getClass();
        mpoVar10.e = mpnVar8;
        mpoVar10.a |= 8;
    }
}
