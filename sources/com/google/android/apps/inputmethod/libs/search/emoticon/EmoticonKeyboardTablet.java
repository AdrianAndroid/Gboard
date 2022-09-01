package com.google.android.apps.inputmethod.libs.search.emoticon;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmoticonExtension;
import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmoticonKeyboardTablet extends LifecycleKeyboard implements deq {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet");
    public static final llp b = llp.x(Integer.valueOf((int) R.string.f151080_resource_name_obfuscated_res_0x7f1401e2), Integer.valueOf((int) R.string.f150990_resource_name_obfuscated_res_0x7f1401d9), Integer.valueOf((int) R.string.f151100_resource_name_obfuscated_res_0x7f1401e4), Integer.valueOf((int) R.string.f151050_resource_name_obfuscated_res_0x7f1401df), Integer.valueOf((int) R.string.f151030_resource_name_obfuscated_res_0x7f1401dd), Integer.valueOf((int) R.string.f151020_resource_name_obfuscated_res_0x7f1401dc), Integer.valueOf((int) R.string.f150980_resource_name_obfuscated_res_0x7f1401d8), Integer.valueOf((int) R.string.f151110_resource_name_obfuscated_res_0x7f1401e5), Integer.valueOf((int) R.string.f151010_resource_name_obfuscated_res_0x7f1401db), Integer.valueOf((int) R.string.f151090_resource_name_obfuscated_res_0x7f1401e3), Integer.valueOf((int) R.string.f151120_resource_name_obfuscated_res_0x7f1401e6), Integer.valueOf((int) R.string.f151040_resource_name_obfuscated_res_0x7f1401de), Integer.valueOf((int) R.string.f151000_resource_name_obfuscated_res_0x7f1401da), Integer.valueOf((int) R.string.f151060_resource_name_obfuscated_res_0x7f1401e0), Integer.valueOf((int) R.string.f151070_resource_name_obfuscated_res_0x7f1401e1));
    private hiz G;
    public final idk d;
    public final ino e;
    public SoftKeyboardView f;
    public EmoticonRecyclerView g;
    public BindingRecyclerView h;
    private final cqa j;
    private final ebn k;
    private final dyz l;
    private final int m;
    private lle n;
    private llw o;
    private llw p;
    private ViewGroup q;
    public final gqa c = gqa.a(this.u);
    private String r = "";
    private final BreakIterator F = BreakIterator.getCharacterInstance();
    public int i = -1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmoticonKeyboardTablet(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        cqa cqaVar = cqh.a().a;
        this.n = lrk.b;
        llw llwVar = lrq.b;
        this.o = llwVar;
        this.p = llwVar;
        this.j = cqaVar;
        this.d = hszVar.hO();
        this.m = ibmVar.m;
        this.e = ino.K(context, null);
        this.l = new dyx(context);
        this.k = efq.n(context);
        Resources f = jbi.f(context, Locale.US);
        llc a2 = lle.a();
        int i = 0;
        while (true) {
            llp llpVar = b;
            if (i < ((lrl) llpVar).c) {
                a2.e(Integer.valueOf(i), f.getString(((Integer) llpVar.get(i)).intValue()));
                i++;
            } else {
                this.n = a2.l();
                return;
            }
        }
    }

    private final hiz K() {
        if (((Boolean) ebf.b.c()).booleanValue()) {
            return this.j.d().u(new ebi(this, 0), mjl.a);
        }
        if (this.E == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "getRecentEmoticons", 461, "EmoticonKeyboardTablet.java")).t("getRecentEmoticons(): recents manager is null");
            return hiz.n(llp.q());
        }
        llk e = llp.e();
        huk hukVar = this.E;
        if (hukVar != null) {
            for (hui huiVar : hukVar.i()) {
                String a2 = huiVar.a();
                if (a2 != null) {
                    e.h(a2);
                }
            }
        }
        return hiz.n(m(e.g()));
    }

    private static String L(ict ictVar) {
        iay d;
        ial b2 = ictVar.b(iah.PRESS);
        if (b2 == null || (d = b2.d()) == null) {
            return null;
        }
        Object obj = d.e;
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    private static void N(BindingRecyclerView bindingRecyclerView) {
        bindingRecyclerView.aa(null);
        bindingRecyclerView.ab(null);
    }

    private static void O(EmoticonRecyclerView emoticonRecyclerView) {
        emoticonRecyclerView.gI();
        emoticonRecyclerView.aa(null);
    }

    private final void P(EmoticonRecyclerView emoticonRecyclerView, llp llpVar) {
        if (llpVar != null) {
            emoticonRecyclerView.a(llpVar);
            emoticonRecyclerView.setVisibility(0);
            ViewGroup viewGroup = this.q;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    public final void A(EmoticonRecyclerView emoticonRecyclerView, String str) {
        if (emoticonRecyclerView == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "setEmoticons", 665, "EmoticonKeyboardTablet.java")).t("setEmoticons: Emoticon body recycler view is null.");
        } else if (H(str)) {
            hiz hizVar = this.G;
            if (hizVar != null && hizVar.C()) {
                this.G.cancel(false);
            }
            hiz hizVar2 = this.G;
            if (hizVar2 == null || !hizVar2.D()) {
                hiz K = K();
                afp afpVar = afp.STARTED;
                boolean z = jam.b;
                llk e = llp.e();
                llk e2 = llp.e();
                llk e3 = llp.e();
                e.h(new bqx(this, emoticonRecyclerView, 11));
                e2.h(ebj.a);
                K.E(hjg.a(gyc.b, this, afpVar, z, e, e2, e3));
                this.G = K;
                return;
            }
            w(emoticonRecyclerView, (llp) this.G.A(llp.q()));
        } else {
            llp llpVar = (llp) this.o.get(str);
            if (llpVar == null) {
                return;
            }
            P(emoticonRecyclerView, llpVar);
        }
    }

    public final boolean H(String str) {
        return str.equals(this.n.get(0));
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean M(int i) {
        return !this.C;
    }

    @Override // defpackage.deq
    public final int a() {
        return ((lrk) this.n).d;
    }

    @Override // defpackage.deq
    public final void b(View view) {
        O((EmoticonRecyclerView) view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.hfd r19) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardTablet.c(hfd):boolean");
    }

    @Override // defpackage.deq
    public final void d(View view, int i) {
        int a2 = a();
        if (i < 0 || i >= a2) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "fillPage", 755, "EmoticonKeyboardTablet.java")).y("can't set emoticons for index %d, out of range %d", i, a2);
            return;
        }
        SoftKeyboardView softKeyboardView = this.f;
        if (softKeyboardView == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "fillPage", 760, "EmoticonKeyboardTablet.java")).t("Emoticon softkeyview listener is null");
            return;
        }
        EmoticonRecyclerView emoticonRecyclerView = (EmoticonRecyclerView) view;
        u(emoticonRecyclerView, softKeyboardView);
        A(emoticonRecyclerView, t(i));
    }

    @Override // defpackage.deq
    public final int e() {
        return R.layout.f134220_resource_name_obfuscated_res_0x7f0e0087;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        if (icfVar.b == ice.BODY) {
            EmoticonRecyclerView emoticonRecyclerView = this.g;
            if (emoticonRecyclerView != null) {
                O(emoticonRecyclerView);
            }
            BindingRecyclerView bindingRecyclerView = this.h;
            if (bindingRecyclerView != null) {
                N(bindingRecyclerView);
            }
            this.f = null;
            this.g = null;
            this.h = null;
            this.q = null;
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final String fr() {
        hiz hizVar = this.G;
        return (hizVar == null || !hizVar.D()) ? "" : this.c.e(R.string.f152800_resource_name_obfuscated_res_0x7f1402a3, t(l((llp) this.G.A(llp.q()))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String fs() {
        return this.u.getString(R.string.f152790_resource_name_obfuscated_res_0x7f1402a2);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        if (icfVar.b == ice.BODY) {
            this.f = softKeyboardView;
            icy icyVar = (icy) icfVar.h.c.get(R.id.f67030_resource_name_obfuscated_res_0x7f0b0830);
            if (icyVar == null || icyVar.b == null) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "extractEmoticonCategories", 530, "EmoticonKeyboardTablet.java")).t("getSoftKeyDefsFromKeyMapping(): StateToKeyMapping is invalid");
            } else {
                ict[] ictVarArr = (ict[]) icyVar.b(0L);
                if (ictVarArr == null) {
                    ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "extractEmoticonCategories", 535, "EmoticonKeyboardTablet.java")).t("extractEmoticonCategories(): No key defs for emoticons");
                } else {
                    lls h = llw.h();
                    lls h2 = llw.h();
                    String str = "";
                    llk llkVar = null;
                    for (ict ictVar : ictVarArr) {
                        int i = ictVar.c;
                        if (i == R.id.f118870_resource_name_obfuscated_res_0x7f0b1d1c || i == R.id.f118880_resource_name_obfuscated_res_0x7f0b1d1d) {
                            if (llkVar != null && !TextUtils.isEmpty(str)) {
                                h.a(str, llkVar.g());
                            }
                            str = L(ictVar);
                            llkVar = llp.e();
                        } else {
                            String L = L(ictVar);
                            if (llkVar == null || TextUtils.isEmpty(L)) {
                                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "extractEmoticonCategories", 575, "EmoticonKeyboardTablet.java")).t("The definition of sub category softkeydefs is wrong");
                            } else {
                                if (((Boolean) ebq.a.c()).booleanValue()) {
                                    ico d = ict.d();
                                    d.i(ictVar);
                                    d.h = this.k.c();
                                    ictVar = d.c();
                                }
                                llkVar.h(ictVar);
                                String str2 = ictVar.t;
                                if (str2 != null) {
                                    h2.a(L, str2);
                                }
                            }
                        }
                    }
                    if (llkVar != null && !TextUtils.isEmpty(str)) {
                        h.a(str, llkVar.g());
                    }
                    this.o = h.l();
                    this.p = h2.l();
                }
            }
            ctp.a(softKeyboardView, R.string.f152790_resource_name_obfuscated_res_0x7f1402a2);
            this.g = (EmoticonRecyclerView) aad.q(softKeyboardView, R.id.f67030_resource_name_obfuscated_res_0x7f0b0830);
            this.q = (ViewGroup) softKeyboardView.findViewById(R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5);
            this.h = (BindingRecyclerView) aad.q(softKeyboardView, R.id.f52870_resource_name_obfuscated_res_0x7f0b00e1);
            return;
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "onKeyboardViewCreated", 186, "EmoticonKeyboardTablet.java")).w("onKeyboardViewCreated() : Unexpected keyboard type %s.", icfVar.b);
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        this.r = dip.l(obj);
        hfl g = dip.g(obj, hfl.EXTERNAL);
        ino.L().j("PREF_LAST_ACTIVE_TAB", IEmoticonExtension.class.getName());
        View X = X(ice.BODY);
        if (X == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "prepareAndRunCorpusChangeAnimation", 349, "EmoticonKeyboardTablet.java")).t("Can't update corpus selector; container view is null.");
        } else {
            this.l.a(X, R.id.key_pos_non_prime_category_5);
        }
        idk idkVar = this.d;
        ctd ctdVar = ctd.TAB_OPEN;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 5;
        mbcVar.a |= 1;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 1;
        mbcVar2.a |= 2;
        int a2 = cte.a(g);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mbcVar3.d = a2 - 1;
        mbcVar3.a |= 4;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
        hiz K = K();
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new dys(this, 13));
        e2.h(ebj.b);
        K.E(hjg.a(gyc.b, this, afpVar, z, e, e2, e3));
        this.G = K;
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        EmoticonRecyclerView emoticonRecyclerView = this.g;
        if (emoticonRecyclerView != null) {
            O(emoticonRecyclerView);
        }
        BindingRecyclerView bindingRecyclerView = this.h;
        if (bindingRecyclerView != null) {
            N(bindingRecyclerView);
        }
        super.h();
    }

    public final int l(llp llpVar) {
        String d = this.e.d("pref_key_emoticon_last_category_opened", "");
        if (!H(d) || !llpVar.isEmpty()) {
            Integer num = (Integer) ((lrk) this.n).e.get(d);
            if (num == null) {
                num = 1;
                this.e.j("pref_key_emoticon_last_category_opened", t(num.intValue()));
            }
            return num.intValue();
        }
        return 1;
    }

    public final llp m(llp llpVar) {
        String str;
        if (this.w == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "getSoftDefFromEmoticonStrings", 482, "EmoticonKeyboardTablet.java")).t("getRecentEmoticons(): keyboardDef is null.");
            return llp.q();
        }
        ico d = ict.d();
        iaj c = ial.c();
        llk e = llp.e();
        int size = llpVar.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) llpVar.get(i);
            c.k();
            c.b = iah.PRESS;
            c.n(-10027, iax.COMMIT, str2);
            ial b2 = c.b();
            if (b2 != null) {
                d.v();
                d.n = this.m;
                d.u(b2);
                d.f(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745, str2);
                if (((Boolean) ebq.a.c()).booleanValue()) {
                    str = this.k.c();
                } else {
                    str = (String) this.p.get(str2);
                }
                d.h = str;
                e.h(d.c());
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "getSoftDefFromEmoticonStrings", 498, "EmoticonKeyboardTablet.java")).t("getRecentEmoticons(): actionDef is null.");
                return llp.q();
            }
        }
        return e.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String q() {
        hiz hizVar = this.G;
        return (hizVar == null || !hizVar.D()) ? "" : this.c.e(R.string.f153090_resource_name_obfuscated_res_0x7f1402c0, t(l((llp) this.G.A(llp.q()))));
    }

    public final String t(int i) {
        String str = (String) this.n.get(Integer.valueOf(i));
        if (str == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "getCategoryNameFromIndex", 638, "EmoticonKeyboardTablet.java")).t("Invalid index for emoticon category.");
            return "";
        }
        return str;
    }

    public final void u(EmoticonRecyclerView emoticonRecyclerView, jdr jdrVar) {
        emoticonRecyclerView.aD(jdrVar, fx());
    }

    public final void w(EmoticonRecyclerView emoticonRecyclerView, llp llpVar) {
        ViewGroup viewGroup;
        if (!llpVar.isEmpty() || (viewGroup = this.q) == null) {
            P(emoticonRecyclerView, llpVar);
            return;
        }
        cnf a2 = cng.a();
        a2.c(true);
        a2.e(1);
        a2.g(R.drawable.f49120_resource_name_obfuscated_res_0x7f080294);
        a2.f(R.string.f151140_resource_name_obfuscated_res_0x7f1401e8);
        a2.a().b(this.u, viewGroup);
        emoticonRecyclerView.setVisibility(8);
        viewGroup.setVisibility(0);
        viewGroup.setOnTouchListener(new bph(this, 8));
    }
}
