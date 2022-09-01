package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: fgj  reason: default package */
/* loaded from: classes.dex */
public final class fgj extends btt {
    private static fgj t;
    public boolean c;
    public final cgp d;
    private final inm u = new fdo(this, 4);
    private static final lug o = hin.a;
    private static final String[] p = {"zh-hant-t-i0-und-x-i0-bopomofo", "zh-hant-t-i0-pinyin", "zh-hant-t-i0-und-x-i0-handwriting"};
    private static final String[] q = {"bopomofo_setting_scheme", "pinyin_setting_scheme", "handwriting_setting_scheme"};
    public static final String[] a = {null, "zh_tw_contacts_dict_3_3", "zh_tw_user_dict_3_3", "zh_tw_shortcut_dict_3_3"};
    private static final String[] r = {null, "zh_tw_contacts_dictionary_zhuyin_accessor", "zh_tw_user_dictionary_zhuyin_accessor", "zh_tw_shortcut_dictionary_zhuyin_accessor"};
    public static final String[] b = {null, "zh_tw_contacts_dictionary_pinyin_accessor", "zh_tw_user_dictionary_pinyin_accessor", "zh_tw_shortcut_dictionary_pinyin_accessor"};
    private static final String[] s = {null, "bopomofo_mutable_dictionary_accessor_setting_scheme", "bopomofo_mutable_dictionary_accessor_setting_scheme", "shortcuts_mutable_dictionary_accessor_setting_scheme"};

    private fgj(Context context) {
        super(context);
        this.d = new cgp(context, "zh_TW");
    }

    public static fgj l(Context context) {
        fgj fgjVar;
        synchronized (fgj.class) {
            if (t == null) {
                t = new fgj(context);
                div.c().i(t, "zh_TW", "zh_TW");
            }
            fgjVar = t;
        }
        return fgjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dij
    public final void c() {
        super.c();
        this.c = this.h.aj(R.string.f160500_resource_name_obfuscated_res_0x7f14064f);
        this.h.X(this.u, R.string.f160500_resource_name_obfuscated_res_0x7f14064f);
    }

    @Override // defpackage.dij
    protected final String[] d() {
        return p;
    }

    @Override // defpackage.dij
    protected final String[] e() {
        return q;
    }

    @Override // defpackage.dij
    public final String g() {
        return "zh-hant-t-i0-und-x-i0-bopomofo";
    }

    @Override // defpackage.dij
    public final dij ge() {
        return this.d;
    }

    @Override // defpackage.dij
    protected final void h() {
        mpo b2 = q().b("pinyin_mutable_dictionary_accessor_setting_scheme");
        if (b2 == null) {
            ((luc) ((luc) o.c()).k("com/google/android/apps/inputmethod/libs/zhuyin/ZhuyinHmmEngineFactory", "enrollMutableDictionaryAccessorSettingsForPinyin", 167, "ZhuyinHmmEngineFactory.java")).w("Failed to load setting scheme: %s", "pinyin_mutable_dictionary_accessor_setting_scheme");
        } else {
            String[] strArr = b;
            int length = strArr.length;
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (str != null) {
                    this.n.a(str, b2.q());
                }
            }
        }
        w();
        gyk.i(this.k).s(new btq(l(this.k)));
        this.d.l();
        ikj.C(this.k).s(new djq(this, new cgo(1)));
    }

    @Override // defpackage.dij
    protected final String[] i() {
        return r;
    }

    @Override // defpackage.dij
    protected final String[] j() {
        return s;
    }

    @Override // defpackage.dij
    protected final String[] k() {
        return a;
    }

    public final HmmEngineInterfaceImpl m() {
        return K("zh-hant-t-i0-und-x-i0-bopomofo");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dij
    public final void o(int i, nfh nfhVar) {
        super.o(i, nfhVar);
        if (this.c) {
            mpn mpnVar = ((mpo) nfhVar.b).e;
            if (mpnVar == null) {
                mpnVar = mpn.b;
            }
            nfh nfhVar2 = (nfh) mpnVar.N(5);
            nfhVar2.cG(mpnVar);
            O(nfhVar2, "zh_hant_t_i0_bopomofo_android_system_english_dictionary", 2, 2);
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
        mpp mppVar = ((mpo) nfhVar.b).c;
        if (mppVar == null) {
            mppVar = mpp.b;
        }
        nfh nfhVar3 = (nfh) mppVar.N(5);
        nfhVar3.cG(mppVar);
        if (this.c) {
            nfhVar3.du("zh_hant_t_i0_bopomofo_android_english_token_dictionary");
        }
        if (N(4)) {
            nfhVar3.du("shortcuts_token_dictionary");
        }
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mpo mpoVar2 = (mpo) nfhVar.b;
        mpp mppVar2 = (mpp) nfhVar3.cz();
        mppVar2.getClass();
        mpoVar2.c = mppVar2;
        mpoVar2.a |= 2;
    }
}
