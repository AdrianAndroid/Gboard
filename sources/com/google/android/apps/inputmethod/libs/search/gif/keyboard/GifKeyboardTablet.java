package com.google.android.apps.inputmethod.libs.search.gif.keyboard;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IGifKeyboardExtension;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;
import com.google.android.apps.inputmethod.libs.search.widget.VerticalScrollAnimatedImageSidebarHolderView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GifKeyboardTablet extends AbstractSearchResultKeyboard implements gzv {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardTablet");
    private final cma F;
    private ela G;
    private View H;
    private Locale I;
    public final idk b;
    public final String c;
    public final crf d;
    public CategoryViewPager e;
    public boolean f;
    public cri g;
    public Runnable h;
    public hfl k;
    public BindingRecyclerView l;
    private final String q;
    private final coc r;
    public final dxs n = new dxs((byte[]) null);
    public llp i = llp.q();
    public final ArrayMap j = new ArrayMap();
    public int m = -1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifKeyboardTablet(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        cma i = ffb.i(context, gxo.a(9));
        this.F = i;
        this.d = new crf(context);
        this.r = coc.a(context);
        this.q = context.getResources().getString(R.string.f153110_resource_name_obfuscated_res_0x7f1402c2);
        this.b = hszVar.hO();
        jav c = hqp.c();
        this.c = c == null ? "UNKNOWN" : c.n;
    }

    public static int P(String str, lfb lfbVar) {
        if (!TextUtils.isEmpty(str)) {
            return 3;
        }
        return (!lfbVar.e() || ((cnz) lfbVar.a()).b != mba.RECENTS) ? 2 : 5;
    }

    private final void S() {
        for (edq edqVar : this.j.values()) {
            edqVar.e();
        }
        this.j.clear();
    }

    public final String A() {
        if (TextUtils.isEmpty(U())) {
            int i = this.m;
            return i == -1 ? "UNKNOWN" : ((cnz) this.i.get(i)).a;
        }
        return "custom-search";
    }

    public final void K(VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView, ViewGroup viewGroup, int i) {
        hja b;
        edo eeiVar;
        verticalScrollAnimatedImageSidebarHolderView.aF();
        String U = U();
        if (!TextUtils.isEmpty(U)) {
            cma cmaVar = this.F;
            hfg a2 = cmc.a();
            a2.f(U);
            a2.a = 5;
            b = cmaVar.b(a2.d());
            eeiVar = new eei(this);
        } else {
            lfb t = t(i);
            if (!t.e()) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardTablet", "fetchCurrentGifs", 788, "GifKeyboardTablet.java")).t("Gif category is missing");
                return;
            } else if (((cnz) t.a()).b == mba.RECENTS) {
                cma cmaVar2 = this.F;
                Objects.requireNonNull(cmaVar2);
                b = hjg.e(new drf(cmaVar2, 11));
                eeiVar = new eej(this);
            } else {
                cma cmaVar3 = this.F;
                hfg a3 = cmc.a();
                a3.f(((cnz) t.a()).a);
                a3.e();
                a3.a = 5;
                b = cmaVar3.b(a3.d());
                eeiVar = new eei(this);
            }
        }
        ArrayMap arrayMap = this.j;
        Integer valueOf = Integer.valueOf(i);
        edq edqVar = (edq) arrayMap.get(valueOf);
        if (edqVar == null) {
            edqVar = new edq();
            this.j.put(valueOf, edqVar);
        }
        edqVar.d(verticalScrollAnimatedImageSidebarHolderView, viewGroup, b, eeiVar);
    }

    public final void L(boolean z) {
        View view = this.H;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    public final void N() {
        L(false);
    }

    public final boolean O() {
        CategoryViewPager categoryViewPager = this.e;
        if (categoryViewPager != null) {
            return categoryViewPager.isAttachedToWindow();
        }
        return false;
    }

    public final void Q(lfb lfbVar, int i) {
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
            int indexOf = this.i.indexOf(lfbVar.a());
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
            int i5 = i4 | 2;
            mbbVar5.a = i5;
            int i6 = this.m;
            mbbVar5.a = i5 | 4;
            mbbVar5.d = i6;
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
        int i7 = 2 | mbcVar2.a;
        mbcVar2.a = i7;
        mbbVar.getClass();
        mbcVar2.e = mbbVar;
        mbcVar2.a = i7 | 8;
        objArr[0] = t3.cz();
        idkVar.e(ctdVar, objArr);
    }

    public final void R(int i, int i2) {
        emv h;
        deq eehVar;
        String U = U();
        boolean z = !TextUtils.isEmpty(U);
        cuj cujVar = null;
        if (this.e != null) {
            if (z) {
                eehVar = new eek(this);
            } else {
                eehVar = new eeh(this, i);
            }
            this.e.k(new elb(this.u, eehVar));
            if (!z) {
                this.o = null;
                CategoryViewPager categoryViewPager = this.e;
                if (categoryViewPager != null) {
                    categoryViewPager.B(i, true, i2);
                }
                if (fx().m() && this.z) {
                    fx().c(q());
                }
                Q(t(i), i2);
            }
        }
        cog.c();
        if (z) {
            h = cog.i(U, R.string.f152820_resource_name_obfuscated_res_0x7f1402a5);
        } else {
            h = cog.h(R.string.f152820_resource_name_obfuscated_res_0x7f1402a5, R.string.f153290_resource_name_obfuscated_res_0x7f1402d5);
        }
        if (!z && !this.i.isEmpty()) {
            Resources resources = this.u.getResources();
            llp llpVar = this.i;
            int size = llpVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                cnz cnzVar = (cnz) llpVar.get(i3);
                if (edr.c(cnzVar) == 3) {
                    osr a2 = coq.a();
                    a2.u(col.IMAGE_RESOURCE);
                    czp a3 = com.a();
                    a3.i(edr.a(cnzVar));
                    a3.g(edr.b(cnzVar, resources));
                    a3.c = 1;
                    a2.c = a3.f();
                    a2.e = cok.b(cnzVar.a);
                    h.i(a2.t());
                } else {
                    osr a4 = coq.a();
                    a4.u(col.TEXT);
                    con a5 = coo.a();
                    a5.d(cnzVar.a);
                    a5.b(edr.b(cnzVar, resources));
                    a5.c(edr.a(cnzVar));
                    a4.b = a5.a();
                    a4.e = cok.b(cnzVar.a);
                    h.i(a4.t());
                }
            }
            h.j(cox.b(l()));
        }
        llk e = llp.e();
        e.h(new edu(z ? U() : ""));
        llp llpVar2 = this.i;
        int size2 = llpVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            cnz cnzVar2 = (cnz) llpVar2.get(i4);
            if (cnzVar2.a.equals("recents")) {
                e.h(edt.a);
            } else {
                cnzVar2.getClass();
                e.h(new eds(cnzVar2));
            }
        }
        BindingRecyclerView bindingRecyclerView = this.l;
        if (bindingRecyclerView != null) {
            cujVar = bindingRecyclerView.a();
        }
        if (cujVar != null) {
            cujVar.L(e.g());
            if (z) {
                return;
            }
            int i5 = i + 1;
            this.m = i5;
            cujVar.D(i5, true);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        this.r.close();
        S();
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
        printer.println("systemLocale = ".concat(String.valueOf(String.valueOf(this.I))));
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        super.fA(icfVar);
        if (icfVar.b == ice.BODY) {
            CategoryViewPager categoryViewPager = this.e;
            if (categoryViewPager != null) {
                categoryViewPager.f();
                this.e.k(null);
                this.e = null;
            }
            BindingRecyclerView bindingRecyclerView = this.l;
            if (bindingRecyclerView != null) {
                bindingRecyclerView.aa(null);
                this.l.ab(null);
                this.l = null;
            }
            this.H = null;
            S();
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final String fr() {
        lfb u = u();
        return u.e() ? this.u.getString(R.string.f152830_resource_name_obfuscated_res_0x7f1402a6, ((cnz) u.a()).a) : !TextUtils.isEmpty(U()) ? this.u.getString(R.string.f152830_resource_name_obfuscated_res_0x7f1402a6, U()) : "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String fs() {
        return this.u.getResources().getString(R.string.f152840_resource_name_obfuscated_res_0x7f1402a7);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        super.fz(softKeyboardView, icfVar);
        if (icfVar.b != ice.HEADER && icfVar.b == ice.BODY) {
            ctp.a(softKeyboardView, R.string.f152840_resource_name_obfuscated_res_0x7f1402a7);
            this.G = new edy(this, 2);
            CategoryViewPager categoryViewPager = (CategoryViewPager) softKeyboardView.findViewById(R.id.expression_view_pager);
            this.e = categoryViewPager;
            categoryViewPager.z(this.G);
            this.H = softKeyboardView.findViewById(R.id.f52370_resource_name_obfuscated_res_0x7f0b007d);
            this.h = new eas(this, 18);
            this.l = (BindingRecyclerView) softKeyboardView.findViewById(R.id.f52870_resource_name_obfuscated_res_0x7f0b00e1);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        hiz c;
        String str = editorInfo.packageName;
        super.g(editorInfo, obj);
        hfl g = dip.g(obj, hfl.EXTERNAL);
        this.k = g;
        this.t.j("PREF_LAST_ACTIVE_TAB", IGifKeyboardExtension.class.getName());
        BindingRecyclerView bindingRecyclerView = this.l;
        if (bindingRecyclerView != null) {
            bindingRecyclerView.ab(new GridLayoutManager(1, 1));
            BindingRecyclerView bindingRecyclerView2 = this.l;
            Context context = this.u;
            lls h = llw.h();
            Context context2 = this.u;
            dzk dzkVar = new dzk(this, 8);
            cjq cjqVar = new cjq(context2, dzkVar, 11);
            cjq cjqVar2 = new cjq(context2, dzkVar, 12);
            gmi i = cnx.i();
            i.c = dzr.t;
            i.n(R.layout.f133600_resource_name_obfuscated_res_0x7f0e0038, cjqVar2);
            i.n(R.layout.f133650_resource_name_obfuscated_res_0x7f0e003d, cjqVar);
            i.n(R.layout.f133640_resource_name_obfuscated_res_0x7f0e003c, cjqVar2);
            h.a(edw.class, i.m());
            bindingRecyclerView2.aa(cnx.f(h, context, null, null));
        }
        this.o = dip.l(obj);
        this.f = !TextUtils.isEmpty(U()) && dip.k(obj) == mba.CONTEXTUAL;
        N();
        this.g = cri.b(this.u, "recent_gifs_shared");
        hiz b = this.r.b();
        if (!((Boolean) edn.a.c()).booleanValue()) {
            c = clr.a().b().c(llp.q());
        } else {
            c = efq.l();
        }
        hiz d = hiz.M(b, c).d(new cak(this, b, c, 8), gyc.b);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new dys(this, 17));
        d.E(hjg.a(gyc.b, this, afpVar, z, e, e2, e3));
        CategoryViewPager categoryViewPager = this.e;
        if (categoryViewPager != null) {
            categoryViewPager.setEnabled(false);
            this.e.postDelayed(new eas(this, 17), ((Long) edn.b.c()).longValue());
        }
        this.I = this.u.getResources().getConfiguration().locale;
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
            int P = P(U, u());
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = P - 1;
            int i2 = mbcVar2.a | 2;
            mbcVar2.a = i2;
            mbcVar2.a = i2 | 1024;
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
        return "GifKeyboardTablet";
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        if (!this.C) {
            return;
        }
        S();
        N();
        BindingRecyclerView bindingRecyclerView = this.l;
        if (bindingRecyclerView != null) {
            bindingRecyclerView.aa(null);
            this.l.ab(null);
        }
        CategoryViewPager categoryViewPager = this.e;
        if (categoryViewPager != null) {
            categoryViewPager.k(null);
        }
        this.i = llp.q();
        super.h();
    }

    public final int l() {
        return ((((Boolean) edl.m.c()).booleanValue() || this.i.size() <= 1 || ((cnz) this.i.get(1)).b != mba.CONTEXTUAL) && !this.g.k()) ? 0 : 1;
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard
    protected final int m() {
        return R.id.key_pos_non_prime_category_4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String q() {
        lfb u = u();
        return u.e() ? String.format(this.q, ((cnz) u.a()).a) : !TextUtils.isEmpty(U()) ? String.format(this.q, U()) : "";
    }

    public final lfb t(int i) {
        return (i < 0 || i >= this.i.size()) ? ldu.a : lfb.g((cnz) this.i.get(i));
    }

    public final lfb u() {
        return !TextUtils.isEmpty(U()) ? ldu.a : t(this.m);
    }
}
