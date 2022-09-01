package com.google.android.apps.inputmethod.libs.search.gif.keyboard;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IGifKeyboardExtension;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;
import com.google.android.apps.inputmethod.libs.search.widget.VerticalScrollAnimatedImageSidebarHolderView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GifKeyboardM2 extends AbstractSearchResultKeyboard implements gzv {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardM2");
    private final cma G;
    private final boolean H;
    private ela I;
    private View J;
    private Locale K;
    public final idk b;
    public final String c;
    public final crf d;
    public CategoryViewPager e;
    public cou f;
    public boolean g;
    public cri h;
    public Runnable i;
    public hfl l;
    public boe m;
    private final String q;
    private final coc r;
    private final cot F = new edx(this, 0);
    public final dxs n = new dxs((byte[]) null);
    public llp j = llp.q();
    public final qo k = new qo();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifKeyboardM2(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        cma i = ffb.i(context, gxo.a(9));
        this.G = i;
        this.d = new crf(context);
        this.r = coc.a(context);
        this.q = context.getResources().getString(R.string.f153110_resource_name_obfuscated_res_0x7f1402c2);
        this.b = hszVar.hO();
        jav c = hqp.c();
        this.c = c == null ? "UNKNOWN" : c.n;
        this.H = ((Boolean) iho.a(context).c()).booleanValue();
    }

    public static int Q(String str, lfb lfbVar) {
        if (!TextUtils.isEmpty(str)) {
            return 3;
        }
        return (!lfbVar.e() || ((cnz) lfbVar.a()).b != mba.RECENTS) ? 2 : 5;
    }

    private final void V() {
        for (edq edqVar : this.k.values()) {
            edqVar.e();
        }
        this.k.clear();
    }

    public final lfb A() {
        return !TextUtils.isEmpty(U()) ? ldu.a : u(l());
    }

    public final String K() {
        if (!TextUtils.isEmpty(U())) {
            return "custom-search";
        }
        if (this.f == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardM2", "getCurrentCategoryOrStateNameForLogging", 830, "GifKeyboardM2.java")).t("getCurrentCategoryName() : Element controller unexpectedly null.");
            return "UNKNOWN";
        }
        int l = l();
        return l == -1 ? "UNKNOWN" : ((cnz) this.j.get(l)).a;
    }

    public final void L(VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView, ViewGroup viewGroup, int i) {
        hja b;
        edo eebVar;
        verticalScrollAnimatedImageSidebarHolderView.aF();
        String U = U();
        if (!TextUtils.isEmpty(U)) {
            cma cmaVar = this.G;
            hfg a2 = cmc.a();
            a2.f(U);
            a2.a = 5;
            b = cmaVar.b(a2.d());
            eebVar = new eeb(this);
        } else {
            lfb u = u(i);
            if (!u.e()) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardM2", "fetchCurrentGifs", 796, "GifKeyboardM2.java")).t("Gif category is missing");
                return;
            } else if (((cnz) u.a()).b == mba.RECENTS) {
                cma cmaVar2 = this.G;
                Objects.requireNonNull(cmaVar2);
                b = hjg.e(new drf(cmaVar2, 10));
                eebVar = new eec(this);
            } else {
                cma cmaVar3 = this.G;
                hfg a3 = cmc.a();
                a3.f(((cnz) u.a()).a);
                a3.e();
                a3.a = 5;
                b = cmaVar3.b(a3.d());
                eebVar = new eeb(this);
            }
        }
        qo qoVar = this.k;
        Integer valueOf = Integer.valueOf(i);
        edq edqVar = (edq) qoVar.get(valueOf);
        if (edqVar == null) {
            edqVar = new edq();
            this.k.put(valueOf, edqVar);
        }
        edqVar.d(verticalScrollAnimatedImageSidebarHolderView, viewGroup, b, eebVar);
    }

    public final void N(boolean z) {
        View view = this.J;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    public final void O() {
        N(false);
    }

    public final boolean P() {
        CategoryViewPager categoryViewPager = this.e;
        if (categoryViewPager != null) {
            return categoryViewPager.isAttachedToWindow();
        }
        return false;
    }

    public final void R(lfb lfbVar, int i) {
        mbb mbbVar;
        if (lfbVar.e()) {
            nfh t = mbb.g.t();
            mba mbaVar = ((cnz) lfbVar.a()).b;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbb mbbVar2 = (mbb) t.b;
            mbbVar2.e = mbaVar.e;
            mbbVar2.a |= 8;
            String str = ((cnz) lfbVar.a()).a;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbb mbbVar3 = (mbb) t.b;
            str.getClass();
            int i2 = mbbVar3.a | 1;
            mbbVar3.a = i2;
            mbbVar3.b = str;
            mbbVar3.c = i - 1;
            mbbVar3.a = i2 | 2;
            int indexOf = this.j.indexOf(lfbVar.a());
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbb mbbVar4 = (mbb) t.b;
            mbbVar4.a |= 4;
            mbbVar4.d = indexOf;
            mbbVar = (mbb) t.cz();
        } else {
            nfh t2 = mbb.g.t();
            mba mbaVar2 = mba.UNKNOWN;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbb mbbVar5 = (mbb) t2.b;
            mbbVar5.e = mbaVar2.e;
            int i3 = mbbVar5.a | 8;
            mbbVar5.a = i3;
            int i4 = i3 | 1;
            mbbVar5.a = i4;
            mbbVar5.b = "UNKNOWN";
            mbbVar5.c = i - 1;
            mbbVar5.a = i4 | 2;
            int l = l();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbb mbbVar6 = (mbb) t2.b;
            mbbVar6.a |= 4;
            mbbVar6.d = l;
            mbbVar = (mbb) t2.cz();
        }
        idk idkVar = this.b;
        ctd ctdVar = ctd.CATEGORY_SWITCH;
        Object[] objArr = new Object[1];
        nfh t3 = mbc.p.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbc mbcVar = (mbc) t3.b;
        mbcVar.b = 2;
        mbcVar.a |= 1;
        mbc mbcVar2 = (mbc) t3.b;
        mbcVar2.c = 1;
        int i5 = 2 | mbcVar2.a;
        mbcVar2.a = i5;
        mbbVar.getClass();
        mbcVar2.e = mbbVar;
        mbcVar2.a = i5 | 8;
        objArr[0] = t3.cz();
        idkVar.e(ctdVar, objArr);
    }

    public final void S(int i, int i2) {
        this.o = null;
        CategoryViewPager categoryViewPager = this.e;
        if (categoryViewPager != null) {
            categoryViewPager.B(i, true, i2);
        }
        cou couVar = this.f;
        if (couVar != null) {
            couVar.j(false);
        }
        if (fx().m() && this.z) {
            fx().c(q());
        }
        R(u(i), i2);
    }

    public final void T(int i) {
        emv h;
        deq eeaVar;
        if (this.f == null) {
            return;
        }
        String U = U();
        boolean isEmpty = TextUtils.isEmpty(U);
        boolean z = !isEmpty;
        if (this.e != null) {
            if (z) {
                eeaVar = new eed(this);
            } else {
                eeaVar = new eea(this, i);
            }
            this.e.k(new elb(this.u, eeaVar));
            if (!z) {
                S(i, 2);
            }
        }
        cou couVar = this.f;
        if (couVar != null) {
            int i2 = true != isEmpty ? 4 : 3;
            cpc a2 = cpd.a();
            a2.b = i2;
            couVar.g(a2.a());
        }
        cog.c();
        if (z) {
            h = cog.i(U, R.string.f152820_resource_name_obfuscated_res_0x7f1402a5);
        } else {
            h = cog.h(R.string.f152820_resource_name_obfuscated_res_0x7f1402a5, true != this.H ? R.string.f153290_resource_name_obfuscated_res_0x7f1402d5 : R.string.f163280_resource_name_obfuscated_res_0x7f14077e);
        }
        if (!z && !this.j.isEmpty()) {
            Resources resources = this.u.getResources();
            llp llpVar = this.j;
            int size = llpVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                cnz cnzVar = (cnz) llpVar.get(i3);
                if (edr.c(cnzVar) == 3) {
                    osr a3 = coq.a();
                    a3.u(col.IMAGE_RESOURCE);
                    czp a4 = com.a();
                    a4.i(edr.a(cnzVar));
                    a4.g(edr.b(cnzVar, resources));
                    a4.c = 1;
                    a3.c = a4.f();
                    a3.e = cok.b(cnzVar.a);
                    h.i(a3.t());
                } else {
                    osr a5 = coq.a();
                    a5.u(col.TEXT);
                    con a6 = coo.a();
                    a6.d(cnzVar.a);
                    a6.b(edr.b(cnzVar, resources));
                    a6.c(edr.a(cnzVar));
                    a5.b = a6.a();
                    a5.e = cok.b(cnzVar.a);
                    h.i(a5.t());
                }
            }
            h.j(cox.b(t()));
        }
        cou couVar2 = this.f;
        if (couVar2 == null) {
            return;
        }
        couVar2.k(h.h());
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        this.r.close();
        V();
        super.close();
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        String U;
        boolean z2 = this.C;
        printer.println("isActive = " + z2);
        if (z) {
            U = jbs.b(U());
        } else {
            U = U();
        }
        printer.println("getQuery = ".concat(U));
        printer.println("systemLocale = ".concat(String.valueOf(String.valueOf(this.K))));
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        super.fA(icfVar);
        if (icfVar.b != ice.BODY) {
            if (icfVar.b != ice.HEADER) {
                return;
            }
            this.f = null;
            this.m = null;
            return;
        }
        CategoryViewPager categoryViewPager = this.e;
        if (categoryViewPager != null) {
            categoryViewPager.f();
            this.e.k(null);
            this.e = null;
        }
        this.J = null;
        V();
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final String fr() {
        lfb A = A();
        return A.e() ? this.u.getString(R.string.f152830_resource_name_obfuscated_res_0x7f1402a6, ((cnz) A.a()).a) : !TextUtils.isEmpty(U()) ? this.u.getString(R.string.f152830_resource_name_obfuscated_res_0x7f1402a6, U()) : "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String fs() {
        return this.u.getResources().getString(R.string.f152840_resource_name_obfuscated_res_0x7f1402a7);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        super.fz(softKeyboardView, icfVar);
        if (icfVar.b == ice.HEADER) {
            this.f = new cou(softKeyboardView, this.F);
            if (!this.H) {
                return;
            }
            this.m = new boe(this.u, softKeyboardView, 2);
            boe.i(softKeyboardView, R.string.f152840_resource_name_obfuscated_res_0x7f1402a7);
        } else if (icfVar.b != ice.BODY) {
        } else {
            this.I = new edy(this, 0);
            CategoryViewPager categoryViewPager = (CategoryViewPager) softKeyboardView.findViewById(R.id.expression_view_pager);
            this.e = categoryViewPager;
            categoryViewPager.z(this.I);
            this.J = softKeyboardView.findViewById(R.id.f52370_resource_name_obfuscated_res_0x7f0b007d);
            this.i = new eas(this, 16);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        hiz c;
        String str = editorInfo.packageName;
        super.g(editorInfo, obj);
        hfl g = dip.g(obj, hfl.EXTERNAL);
        this.l = g;
        this.t.j("PREF_LAST_ACTIVE_TAB", IGifKeyboardExtension.class.getName());
        this.o = dip.l(obj);
        this.g = !TextUtils.isEmpty(U()) && dip.k(obj) == mba.CONTEXTUAL;
        O();
        this.h = cri.b(this.u, "recent_gifs_shared");
        hiz b = this.r.b();
        if (!((Boolean) edn.a.c()).booleanValue()) {
            c = clr.a().b().c(llp.q());
        } else {
            c = efq.l();
        }
        hiz d = hiz.M(b, c).d(new cak(this, b, c, 7), gyc.b);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new dys(this, 16));
        d.E(hjg.a(gyc.b, this, afpVar, z, e, e2, e3));
        CategoryViewPager categoryViewPager = this.e;
        if (categoryViewPager != null) {
            categoryViewPager.setEnabled(false);
            this.e.postDelayed(new eas(this, 15), ((Long) edn.b.c()).longValue());
        }
        this.K = this.u.getResources().getConfiguration().locale;
        if (g != hfl.INTERNAL) {
            String U = U();
            idk idkVar = this.b;
            ctd ctdVar = ctd.TAB_OPEN;
            Object[] objArr = new Object[1];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 2;
            mbcVar.a = 1 | mbcVar.a;
            int Q = Q(U, A());
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = Q - 1;
            int i = mbcVar2.a | 2;
            mbcVar2.a = i;
            mbcVar2.a = i | 1024;
            mbcVar2.j = U;
            int a2 = cte.a(g);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            mbcVar3.d = a2 - 1;
            mbcVar3.a |= 4;
            int f = ffb.q().f();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar4 = (mbc) t.b;
            mbcVar4.m = f - 1;
            mbcVar4.a |= 8192;
            objArr[0] = t.cz();
            idkVar.e(ctdVar, objArr);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "GifKeyboardM2";
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        if (!this.C) {
            return;
        }
        V();
        O();
        CategoryViewPager categoryViewPager = this.e;
        if (categoryViewPager != null) {
            categoryViewPager.k(null);
        }
        cou couVar = this.f;
        if (couVar != null) {
            couVar.i(cox.a);
            this.f.h();
        }
        this.j = llp.q();
        boe boeVar = this.m;
        if (boeVar != null) {
            boeVar.j();
        }
        super.h();
    }

    public final int l() {
        cou couVar = this.f;
        if (couVar == null) {
            return -1;
        }
        cox f = couVar.f();
        if (this.f.a(f) == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardM2", "getCurrentCategoryIndex", 866, "GifKeyboardM2.java")).t("getCurrentCategoryName() : No category selected.");
            return -1;
        }
        int i = f.c;
        if (i >= 0 && i < this.j.size()) {
            return i;
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardM2", "getCurrentCategoryIndex", 872, "GifKeyboardM2.java")).u("getCurrentCategoryName() : Invalid selected element index %d.", i);
        return -1;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard
    protected final int m() {
        return R.id.key_pos_non_prime_category_4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String q() {
        lfb A = A();
        return A.e() ? String.format(this.q, ((cnz) A.a()).a) : !TextUtils.isEmpty(U()) ? String.format(this.q, U()) : "";
    }

    public final int t() {
        return ((((Boolean) edl.m.c()).booleanValue() || this.j.size() <= 1 || ((cnz) this.j.get(1)).b != mba.CONTEXTUAL) && !this.h.k()) ? 0 : 1;
    }

    public final lfb u(int i) {
        return (i < 0 || i >= this.j.size()) ? ldu.a : lfb.g((cnz) this.j.get(i));
    }
}
