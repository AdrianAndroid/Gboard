package com.google.android.apps.inputmethod.libs.search.emoticon;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmoticonExtension;
import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmoticonKeyboardM2 extends LifecycleKeyboard implements deq {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2");
    public static final llp b = llp.x(Integer.valueOf((int) R.string.f151080_resource_name_obfuscated_res_0x7f1401e2), Integer.valueOf((int) R.string.f150990_resource_name_obfuscated_res_0x7f1401d9), Integer.valueOf((int) R.string.f151100_resource_name_obfuscated_res_0x7f1401e4), Integer.valueOf((int) R.string.f151050_resource_name_obfuscated_res_0x7f1401df), Integer.valueOf((int) R.string.f151030_resource_name_obfuscated_res_0x7f1401dd), Integer.valueOf((int) R.string.f151020_resource_name_obfuscated_res_0x7f1401dc), Integer.valueOf((int) R.string.f150980_resource_name_obfuscated_res_0x7f1401d8), Integer.valueOf((int) R.string.f151110_resource_name_obfuscated_res_0x7f1401e5), Integer.valueOf((int) R.string.f151010_resource_name_obfuscated_res_0x7f1401db), Integer.valueOf((int) R.string.f151090_resource_name_obfuscated_res_0x7f1401e3), Integer.valueOf((int) R.string.f151120_resource_name_obfuscated_res_0x7f1401e6), Integer.valueOf((int) R.string.f151040_resource_name_obfuscated_res_0x7f1401de), Integer.valueOf((int) R.string.f151000_resource_name_obfuscated_res_0x7f1401da), Integer.valueOf((int) R.string.f151060_resource_name_obfuscated_res_0x7f1401e0), Integer.valueOf((int) R.string.f151070_resource_name_obfuscated_res_0x7f1401e1));
    private llw F;
    private ViewGroup G;
    private hiz J;
    public final gqa d;
    public SoftKeyboardView e;
    public EmoticonRecyclerView f;
    public CategoryViewPager g;
    public cou h;
    public boe i;
    private final cqa j;
    private final ebn k;
    private final dyz l;
    private final int m;
    private final idk n;
    private final ino o;
    private lle q;
    private llw r;
    public final boolean c = ((Boolean) cvb.d.c()).booleanValue();
    private final cot p = new edx(this, 1);
    private String H = "";
    private final BreakIterator I = BreakIterator.getCharacterInstance();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmoticonKeyboardM2(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        cqa cqaVar = cqh.a().a;
        this.q = lrk.b;
        llw llwVar = lrq.b;
        this.r = llwVar;
        this.F = llwVar;
        this.j = cqaVar;
        this.n = hszVar.hO();
        this.m = ibmVar.m;
        this.o = ino.K(context, null);
        this.l = new dyx(context);
        this.d = gqa.a(context);
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
                this.q = a2.l();
                return;
            }
        }
    }

    private final hiz L() {
        if (((Boolean) ebf.b.c()).booleanValue()) {
            return this.j.d().u(new ebi(this, 1), mjl.a);
        }
        if (this.E == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "getRecentEmoticons", 521, "EmoticonKeyboardM2.java")).t("getRecentEmoticons(): recents manager is null");
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
        return hiz.n(t(e.g()));
    }

    private static String N(ict ictVar) {
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

    private static void O(EmoticonRecyclerView emoticonRecyclerView) {
        emoticonRecyclerView.gI();
        emoticonRecyclerView.aa(null);
    }

    private final void P(EmoticonRecyclerView emoticonRecyclerView, llp llpVar, String str) {
        if (llpVar != null) {
            emoticonRecyclerView.a(llpVar);
            emoticonRecyclerView.setVisibility(0);
            ViewGroup viewGroup = this.G;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "renderCategory", 865, "EmoticonKeyboardM2.java")).w("setEmoticons(): Cannot set emoticons list to null for category %s.", str);
    }

    private final boolean Q(String str) {
        return str.equals(this.q.get(0));
    }

    private static final void R(CategoryViewPager categoryViewPager) {
        categoryViewPager.f();
        categoryViewPager.k(null);
    }

    public final void A(EmoticonRecyclerView emoticonRecyclerView, llp llpVar, String str) {
        ViewGroup viewGroup;
        if (!llpVar.isEmpty() || this.c || (viewGroup = this.G) == null) {
            P(emoticonRecyclerView, llpVar, str);
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
        viewGroup.setOnTouchListener(new bph(this, 7));
    }

    public final void H(EmoticonRecyclerView emoticonRecyclerView, String str) {
        if (emoticonRecyclerView == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "setEmoticons", 787, "EmoticonKeyboardM2.java")).t("setEmoticons: Emoticon body recycler view is null.");
        } else if (Q(str)) {
            hiz hizVar = this.J;
            if (hizVar != null && hizVar.C()) {
                this.J.cancel(true);
            }
            hiz hizVar2 = this.J;
            if (hizVar2 == null || !hizVar2.D()) {
                hiz L = L();
                afp afpVar = afp.STARTED;
                boolean z = jam.b;
                llk e = llp.e();
                llk e2 = llp.e();
                llk e3 = llp.e();
                e.h(new dzw(this, emoticonRecyclerView, str, 2));
                e2.h(bxl.s);
                L.E(hjg.a(gyc.b, this, afpVar, z, e, e2, e3));
                this.J = L;
                return;
            }
            A(emoticonRecyclerView, (llp) this.J.A(llp.q()), str);
        } else {
            llp llpVar = (llp) this.r.get(str);
            if (llpVar == null) {
                return;
            }
            P(emoticonRecyclerView, llpVar, str);
        }
    }

    public final void K(int i, int i2) {
        String u = u(i);
        this.o.j("pref_key_emoticon_last_category_opened", u);
        idk idkVar = this.n;
        ctd ctdVar = ctd.CATEGORY_SWITCH;
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
        nfh t2 = mbb.g.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbb mbbVar = (mbb) t2.b;
        int i3 = 1 | mbbVar.a;
        mbbVar.a = i3;
        mbbVar.b = u;
        int i4 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        mbbVar.c = i4;
        int i5 = i3 | 2;
        mbbVar.a = i5;
        mbbVar.a = i5 | 4;
        mbbVar.d = i;
        mba mbaVar = Q(u) ? mba.RECENTS : mba.UNKNOWN;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbb mbbVar2 = (mbb) t2.b;
        mbbVar2.e = mbaVar.e;
        mbbVar2.a |= 8;
        mbb mbbVar3 = (mbb) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mbbVar3.getClass();
        mbcVar3.e = mbbVar3;
        mbcVar3.a |= 8;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean M(int i) {
        return !this.C;
    }

    @Override // defpackage.deq
    public final int a() {
        return ((lrk) this.q).d;
    }

    @Override // defpackage.deq
    public final void b(View view) {
        O((EmoticonRecyclerView) view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5);
        if (this.c || viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0144  */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.hfd r19) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardM2.c(hfd):boolean");
    }

    @Override // defpackage.deq
    public final void d(View view, int i) {
        int a2 = a();
        if (i < 0 || i >= a2) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "fillPage", 883, "EmoticonKeyboardM2.java")).y("can't set emoticons for index %d, out of range %d", i, a2);
            return;
        }
        SoftKeyboardView softKeyboardView = this.e;
        if (softKeyboardView == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "fillPage", 888, "EmoticonKeyboardM2.java")).t("Emoticon softkeyview listener is null");
            return;
        }
        EmoticonRecyclerView emoticonRecyclerView = (EmoticonRecyclerView) view;
        w(emoticonRecyclerView, softKeyboardView);
        H(emoticonRecyclerView, u(i));
    }

    @Override // defpackage.deq
    public final int e() {
        return R.layout.f134220_resource_name_obfuscated_res_0x7f0e0087;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        if (icfVar.b != ice.BODY) {
            if (icfVar.b != ice.HEADER) {
                return;
            }
            this.h = null;
            this.i = null;
            return;
        }
        CategoryViewPager categoryViewPager = this.g;
        if (categoryViewPager != null) {
            R(categoryViewPager);
        }
        EmoticonRecyclerView emoticonRecyclerView = this.f;
        if (emoticonRecyclerView != null) {
            O(emoticonRecyclerView);
        }
        this.e = null;
        this.g = null;
        this.f = null;
        this.G = null;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final String fr() {
        hiz hizVar = this.J;
        return (hizVar == null || !hizVar.D()) ? "" : this.d.e(R.string.f152800_resource_name_obfuscated_res_0x7f1402a3, u(l((llp) this.J.A(llp.q()))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String fs() {
        return this.u.getString(R.string.f152790_resource_name_obfuscated_res_0x7f1402a2);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            this.h = new cou(softKeyboardView, this.p);
            if (!((Boolean) iho.a(this.u).c()).booleanValue()) {
                return;
            }
            boe boeVar = new boe(this.u, softKeyboardView, 1);
            this.i = boeVar;
            boeVar.k();
            boe.i(softKeyboardView, R.string.f152790_resource_name_obfuscated_res_0x7f1402a2);
        } else if (icfVar.b == ice.BODY) {
            this.e = softKeyboardView;
            icy icyVar = (icy) icfVar.h.c.get(R.id.f67030_resource_name_obfuscated_res_0x7f0b0830);
            if (icyVar == null || icyVar.b == null) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "extractEmoticonCategories", 590, "EmoticonKeyboardM2.java")).t("getSoftKeyDefsFromKeyMapping(): StateToKeyMapping is invalid");
            } else {
                ict[] ictVarArr = (ict[]) icyVar.b(0L);
                if (ictVarArr == null) {
                    ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "extractEmoticonCategories", 595, "EmoticonKeyboardM2.java")).t("extractEmoticonCategories(): No key defs for emoticons");
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
                            str = N(ictVar);
                            llkVar = llp.e();
                        } else {
                            String N = N(ictVar);
                            if (llkVar == null || TextUtils.isEmpty(N)) {
                                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "extractEmoticonCategories", 635, "EmoticonKeyboardM2.java")).t("The definition of sub category softkeydefs is wrong");
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
                                    h2.a(N, str2);
                                }
                            }
                        }
                    }
                    if (llkVar != null && !TextUtils.isEmpty(str)) {
                        h.a(str, llkVar.g());
                    }
                    this.r = h.l();
                    this.F = h2.l();
                }
            }
            if (this.c) {
                this.g = (CategoryViewPager) aad.q(softKeyboardView, R.id.expression_view_pager);
                return;
            }
            this.f = (EmoticonRecyclerView) aad.q(softKeyboardView, R.id.f67030_resource_name_obfuscated_res_0x7f0b0830);
            this.G = (ViewGroup) softKeyboardView.findViewById(R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5);
        } else {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "onKeyboardViewCreated", 217, "EmoticonKeyboardM2.java")).w("onKeyboardViewCreated() : Unexpected keyboard type %s.", icfVar.b);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        this.H = dip.l(obj);
        hfl g = dip.g(obj, hfl.EXTERNAL);
        ino.M(this.u).j("PREF_LAST_ACTIVE_TAB", IEmoticonExtension.class.getName());
        View X = X(ice.BODY);
        if (X == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "prepareAndRunCorpusChangeAnimation", 391, "EmoticonKeyboardM2.java")).t("Can't update corpus selector; container view is null.");
        } else {
            this.l.a(X, R.id.key_pos_non_prime_category_5);
        }
        idk idkVar = this.n;
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
        hiz L = L();
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new dys(this, 12));
        e2.h(bxl.t);
        L.E(hjg.a(gyc.b, this, afpVar, z, e, e2, e3));
        this.J = L;
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        cou couVar = this.h;
        if (couVar != null) {
            couVar.h();
        }
        CategoryViewPager categoryViewPager = this.g;
        if (categoryViewPager != null) {
            R(categoryViewPager);
        } else {
            EmoticonRecyclerView emoticonRecyclerView = this.f;
            if (emoticonRecyclerView != null) {
                O(emoticonRecyclerView);
            }
        }
        boe boeVar = this.i;
        if (boeVar != null) {
            boeVar.j();
        }
        super.h();
    }

    public final int l(llp llpVar) {
        String d = this.o.d("pref_key_emoticon_last_category_opened", "");
        if (!Q(d) || !llpVar.isEmpty()) {
            return m(d);
        }
        return 1;
    }

    public final int m(String str) {
        Integer num = (Integer) ((lrk) this.q).e.get(str);
        if (num == null) {
            num = 1;
            this.o.j("pref_key_emoticon_last_category_opened", u(num.intValue()));
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String q() {
        hiz hizVar = this.J;
        return (hizVar == null || !hizVar.D()) ? "" : this.d.e(R.string.f153090_resource_name_obfuscated_res_0x7f1402c0, u(l((llp) this.J.A(llp.q()))));
    }

    public final llp t(llp llpVar) {
        String str;
        if (this.w == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "getSoftDefFromEmoticonStrings", 542, "EmoticonKeyboardM2.java")).t("getRecentEmoticons(): keyboardDef is null.");
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
                    str = (String) this.F.get(str2);
                }
                d.h = str;
                e.h(d.c());
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "getSoftDefFromEmoticonStrings", 558, "EmoticonKeyboardM2.java")).t("getRecentEmoticons(): actionDef is null.");
                return llp.q();
            }
        }
        return e.g();
    }

    public final String u(int i) {
        String str = (String) this.q.get(Integer.valueOf(i));
        if (str == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "getCategoryNameFromIndex", 726, "EmoticonKeyboardM2.java")).t("Invalid index for emoticon category.");
            return "";
        }
        return str;
    }

    public final void w(EmoticonRecyclerView emoticonRecyclerView, jdr jdrVar) {
        emoticonRecyclerView.aD(jdrVar, fx());
        emoticonRecyclerView.az(new ebg(this));
    }
}
