package com.google.android.apps.inputmethod.libs.search.richsymbol;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.RichSymbolExtension;
import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RichSymbolKeyboard extends LifecycleKeyboard implements deq {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard");
    public static final llp b;
    public final idk c;
    public final ino d;
    public CategoryViewPager e;
    public cou f;
    public boe g;
    private llw h;
    private final dyz i;
    private final int j;
    private llw k;
    private SoftKeyboardView l;
    private ViewGroup m;
    private final cot n = new edx(this, 2);
    private String o = "";

    static {
        llk e = llp.e();
        e.h(lct.b("RECENTS", R.string.f159050_resource_name_obfuscated_res_0x7f14059c, R.drawable.f49970_resource_name_obfuscated_res_0x7f08031f, 1));
        e.h(lct.a("GENERAL", R.string.f174890_resource_name_obfuscated_res_0x7f140c37, R.drawable.f49110_resource_name_obfuscated_res_0x7f080293));
        e.h(lct.a("BRACKETS", R.string.f174880_resource_name_obfuscated_res_0x7f140c36, R.drawable.f49100_resource_name_obfuscated_res_0x7f080292));
        e.h(lct.b("ARROWS", R.string.f174840_resource_name_obfuscated_res_0x7f140c32, R.drawable.f48790_resource_name_obfuscated_res_0x7f08026c, 2));
        e.h(lct.a("MATHEMATICS", R.string.f174900_resource_name_obfuscated_res_0x7f140c38, R.drawable.f48810_resource_name_obfuscated_res_0x7f08026e));
        e.h(lct.b("NUMBERS", R.string.f174910_resource_name_obfuscated_res_0x7f140c39, R.drawable.f48820_resource_name_obfuscated_res_0x7f08026f, 2));
        e.h(lct.a("SHAPES", R.string.f174920_resource_name_obfuscated_res_0x7f140c3a, R.drawable.f48840_resource_name_obfuscated_res_0x7f080271));
        e.h(lct.a("FULL_WIDTH", R.string.f174850_resource_name_obfuscated_res_0x7f140c33, R.drawable.f48700_resource_name_obfuscated_res_0x7f080263));
        b = e.g();
    }

    public RichSymbolKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        llw llwVar = lrq.b;
        this.h = llwVar;
        this.k = llwVar;
        this.c = hszVar.hO();
        this.j = ibmVar.m;
        this.d = ino.K(context, null);
        this.i = new dyx(context);
    }

    private static String A(ict ictVar) {
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

    private static final void H(CategoryViewPager categoryViewPager) {
        categoryViewPager.f();
        categoryViewPager.k(null);
    }

    public static int l(String str) {
        return lre.K(b.listIterator(), new cjm(str, 18));
    }

    private final int t() {
        int l = l(this.d.d("pref_key_rich_symbol_last_category_opened", ""));
        if (l != -1) {
            return l == 0 ? !u().isEmpty() ? 0 : 1 : l;
        }
        return 1;
    }

    private final llp u() {
        if (this.w == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "getRecentRichSymbols", 432, "RichSymbolKeyboard.java")).t("getRecentRichSymbols(): keyboardDef is null.");
            return llp.q();
        }
        huk hukVar = this.E;
        if (hukVar == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "getRecentRichSymbols", 436, "RichSymbolKeyboard.java")).t("getRecentRichSymbols(): recents manager is null");
            return llp.q();
        }
        hui[] i = hukVar.i();
        ico d = ict.d();
        iaj c = ial.c();
        llk e = llp.e();
        for (hui huiVar : i) {
            String a2 = huiVar.a();
            c.k();
            c.b = iah.PRESS;
            c.n(-10027, iax.COMMIT, a2);
            ial b2 = c.b();
            if (b2 != null) {
                d.v();
                d.n = this.j;
                d.u(b2);
                d.f(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745, a2);
                d.h = (String) this.k.get(a2);
                e.h(d.c());
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "getRecentRichSymbols", 452, "RichSymbolKeyboard.java")).t("getRecentRichSymbols(): actionDef is null.");
                return llp.q();
            }
        }
        return e.g();
    }

    @Override // defpackage.deq
    public final int a() {
        return ((lrl) b).c;
    }

    @Override // defpackage.deq
    public final void b(View view) {
        RichSymbolRecyclerView richSymbolRecyclerView = (RichSymbolRecyclerView) view;
        richSymbolRecyclerView.gI();
        richSymbolRecyclerView.aa(null);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        int i;
        iay f = hfdVar.f();
        if (f != null && f.c == -10027) {
            ict ictVar = hfdVar.c;
            Object obj = f.e;
            if (obj instanceof String) {
                String str = (String) obj;
                cou couVar = this.f;
                String str2 = "UNKNOWN";
                if (couVar != null) {
                    cox f2 = couVar.f();
                    i = f2.c;
                    coq a2 = this.f.a(f2);
                    if (a2 != null) {
                        str2 = a2.e.b;
                    }
                } else {
                    i = -1;
                }
                idk hO = this.v.hO();
                ctd ctdVar = ctd.EMOJI_OR_TEXT_SHARE;
                Object[] objArr = new Object[2];
                objArr[0] = str;
                nfh t = mbc.p.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar = (mbc) t.b;
                mbcVar.b = 6;
                mbcVar.a |= 1;
                mbc mbcVar2 = (mbc) t.b;
                mbcVar2.c = 1;
                mbcVar2.a = 2 | mbcVar2.a;
                nfh t2 = mbb.g.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbb mbbVar = (mbb) t2.b;
                int i2 = mbbVar.a | 1;
                mbbVar.a = i2;
                mbbVar.b = str2;
                mbbVar.a = i2 | 4;
                mbbVar.d = i;
                mbb mbbVar2 = (mbb) t2.cz();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar3 = (mbc) t.b;
                mbbVar2.getClass();
                mbcVar3.e = mbbVar2;
                mbcVar3.a |= 8;
                nfh t3 = mdl.h.t();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                mdl mdlVar = (mdl) t3.b;
                mdlVar.b = 3;
                mdlVar.a |= 1;
                mdl mdlVar2 = (mdl) t3.cz();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar4 = (mbc) t.b;
                mdlVar2.getClass();
                mbcVar4.k = mdlVar2;
                mbcVar4.a |= 2048;
                objArr[1] = t.cz();
                hO.e(ctdVar, objArr);
            }
            if (ictVar != null && !TextUtils.isEmpty(ictVar.t)) {
                fx().g(ictVar.t);
            }
        } else if (f != null && f.c == -10004) {
            this.v.z(cnx.d(this.u, f, dip.j(this.o, hfl.EXTERNAL)));
            return true;
        }
        return super.c(hfdVar);
    }

    @Override // defpackage.deq
    public final void d(View view, int i) {
        int a2 = a();
        if (i < 0 || i >= a2) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "fillPage", 652, "RichSymbolKeyboard.java")).y("can't set richSymbols for index %d, out of range %d", i, a2);
            return;
        }
        SoftKeyboardView softKeyboardView = this.l;
        if (softKeyboardView == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "fillPage", 658, "RichSymbolKeyboard.java")).t("RichSymbol softkeyview listener is null");
            return;
        }
        RichSymbolRecyclerView richSymbolRecyclerView = (RichSymbolRecyclerView) view;
        gqc fx = fx();
        Context context = richSymbolRecyclerView.getContext();
        Context context2 = richSymbolRecyclerView.getContext();
        TypedValue typedValue = new TypedValue();
        context2.getResources().getValue(true != cuz.a.j(context2, eev.a) ? R.dimen.f41570_resource_name_obfuscated_res_0x7f070623 : R.dimen.f42640_resource_name_obfuscated_res_0x7f0706e7, typedValue, true);
        richSymbolRecyclerView.aa(new eez(context, softKeyboardView, fx, typedValue.getFloat(), richSymbolRecyclerView.T));
        richSymbolRecyclerView.az(new eex(this));
        m(richSymbolRecyclerView, i);
    }

    @Override // defpackage.deq
    public final int e() {
        return R.layout.f144800_resource_name_obfuscated_res_0x7f0e0507;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        if (icfVar.b != ice.BODY) {
            if (icfVar.b != ice.HEADER) {
                return;
            }
            this.f = null;
            this.g = null;
            return;
        }
        CategoryViewPager categoryViewPager = this.e;
        if (categoryViewPager != null) {
            H(categoryViewPager);
        }
        this.l = null;
        this.e = null;
        this.m = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String fs() {
        return this.u.getString(R.string.f152990_resource_name_obfuscated_res_0x7f1402b6);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            this.f = new cou(softKeyboardView, this.n);
            if (!((Boolean) iho.a(this.u).c()).booleanValue()) {
                return;
            }
            boe boeVar = new boe(this.u, softKeyboardView, 1);
            this.g = boeVar;
            boeVar.k();
            boe.i(softKeyboardView, R.string.f152990_resource_name_obfuscated_res_0x7f1402b6);
        } else if (icfVar.b == ice.BODY) {
            this.l = softKeyboardView;
            icy icyVar = (icy) icfVar.h.c.get(R.id.f67030_resource_name_obfuscated_res_0x7f0b0830);
            if (icyVar == null || icyVar.b == null) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "extractRichSymbolCategories", 480, "RichSymbolKeyboard.java")).t("getSoftKeyDefsFromKeyMapping(): StateToKeyMapping is invalid");
            } else {
                ict[] ictVarArr = (ict[]) icyVar.b(0L);
                if (ictVarArr == null) {
                    ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "extractRichSymbolCategories", 485, "RichSymbolKeyboard.java")).t("extractRichSymbolCategories(): No key defs for emoticons");
                } else {
                    lls h = llw.h();
                    HashSet hashSet = new HashSet();
                    lls h2 = llw.h();
                    String str = "";
                    llk llkVar = null;
                    for (ict ictVar : ictVarArr) {
                        int i = ictVar.c;
                        if (i == R.id.f118870_resource_name_obfuscated_res_0x7f0b1d1c || i == R.id.f118880_resource_name_obfuscated_res_0x7f0b1d1d) {
                            if (llkVar != null && !TextUtils.isEmpty(str)) {
                                h.a(str, llkVar.g());
                            }
                            str = A(ictVar);
                            llkVar = llp.e();
                        } else {
                            String A = A(ictVar);
                            if (llkVar == null || TextUtils.isEmpty(A)) {
                                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "extractRichSymbolCategories", 515, "RichSymbolKeyboard.java")).t("The definition of sub category softkeydefs is wrong");
                            } else {
                                llkVar.h(ictVar);
                                if (ictVar.t != null && hashSet.add(A)) {
                                    h2.a(A, ictVar.t);
                                }
                            }
                        }
                    }
                    if (llkVar != null && !TextUtils.isEmpty(str)) {
                        h.a(str, llkVar.g());
                    }
                    this.h = h.l();
                    this.k = h2.l();
                }
            }
            this.e = (CategoryViewPager) aad.q(softKeyboardView, R.id.expression_view_pager);
            this.m = (ViewGroup) softKeyboardView.findViewById(R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5);
        } else {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "onKeyboardViewCreated", 201, "RichSymbolKeyboard.java")).w("onKeyboardViewCreated() : Unexpected keyboard type %s.", icfVar.b);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        this.o = dip.l(obj);
        hfl g = dip.g(obj, hfl.EXTERNAL);
        ino.M(this.u).j("PREF_LAST_ACTIVE_TAB", RichSymbolExtension.class.getName());
        View X = X(ice.BODY);
        if (X == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "prepareAndRunCorpusChangeAnimation", 345, "RichSymbolKeyboard.java")).t("Can't update corpus selector; container view is null.");
        } else {
            this.i.a(X, R.id.key_pos_non_prime_category_6);
        }
        idk idkVar = this.c;
        ctd ctdVar = ctd.TAB_OPEN;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 6;
        mbcVar.a |= 1;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 1;
        int i = 2;
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
        int t2 = t();
        cou couVar = this.f;
        if (couVar != null) {
            cpc a3 = cpd.a();
            if (this.g != null) {
                i = 3;
            }
            a3.b = i;
            couVar.g(a3.a());
            emv a4 = cov.a();
            llp llpVar = b;
            int i2 = ((lrl) llpVar).c;
            for (int i3 = 0; i3 < i2; i3++) {
                lct lctVar = (lct) llpVar.get(i3);
                osr a5 = coq.a();
                a5.u(col.IMAGE_RESOURCE);
                czp a6 = com.a();
                a6.i(lctVar.c);
                a6.g(this.u.getString(lctVar.b));
                a6.c = lctVar.a;
                a5.c = a6.f();
                a5.e = cok.b((String) lctVar.d);
                a4.i(a5.t());
            }
            a4.j(cox.b(t2));
            couVar.k(a4.h());
        } else {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "onActivate", 336, "RichSymbolKeyboard.java")).t("Couldn't display header elements because controller was null.");
        }
        CategoryViewPager categoryViewPager = this.e;
        if (categoryViewPager != null) {
            categoryViewPager.k(new eey(this.u, this));
            categoryViewPager.z(new edy(this, 3));
            categoryViewPager.C(t2);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        cou couVar = this.f;
        if (couVar != null) {
            couVar.h();
        }
        CategoryViewPager categoryViewPager = this.e;
        if (categoryViewPager != null) {
            H(categoryViewPager);
        }
        boe boeVar = this.g;
        if (boeVar != null) {
            boeVar.j();
        }
        super.h();
    }

    public final void m(RichSymbolRecyclerView richSymbolRecyclerView, int i) {
        llp llpVar;
        ViewGroup viewGroup;
        if (richSymbolRecyclerView == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "setRichSymbols", 606, "RichSymbolKeyboard.java")).t("setRichSymbols: RichSymbol body recycler view is null.");
            return;
        }
        Object obj = ((lct) b.get(i)).d;
        if (i == 0) {
            llpVar = u();
            if (llpVar.isEmpty() && (viewGroup = this.m) != null) {
                cnf a2 = cng.a();
                a2.c(false);
                a2.e(1);
                a2.g(R.drawable.f49120_resource_name_obfuscated_res_0x7f080294);
                a2.f(R.string.f163010_resource_name_obfuscated_res_0x7f140759);
                a2.a().b(this.u, viewGroup);
                richSymbolRecyclerView.setVisibility(8);
                viewGroup.setVisibility(0);
                return;
            }
        } else {
            llpVar = (llp) this.h.get(obj);
        }
        if (llpVar != null) {
            ls lsVar = richSymbolRecyclerView.l;
            eez eezVar = lsVar instanceof eez ? (eez) lsVar : null;
            if (eezVar != null) {
                eezVar.d = llpVar;
                eezVar.fc();
                richSymbolRecyclerView.Y(0);
            } else {
                ((ltd) RichSymbolRecyclerView.S.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolRecyclerView", "setRichSymbols", 71, "RichSymbolRecyclerView.java")).t("RichSymbol adapter is null.");
            }
            richSymbolRecyclerView.setVisibility(0);
            ViewGroup viewGroup2 = this.m;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.setVisibility(8);
            return;
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "setRichSymbols", 638, "RichSymbolKeyboard.java")).w("setRichSymbols(): Cannot set richSymbols list to null for category %s.", obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String q() {
        Resources resources = this.u.getResources();
        return String.format(resources.getString(R.string.f153120_resource_name_obfuscated_res_0x7f1402c3), resources.getString(((lct) b.get(t())).b));
    }
}
