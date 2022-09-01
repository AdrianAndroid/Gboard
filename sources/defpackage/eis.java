package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.Objects;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: eis  reason: default package */
/* loaded from: classes.dex */
public final class eis implements deq, ela {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/sticker/TabletPagerController");
    private final cri A;
    private final oiy B;
    private final cxm C;
    private final crf D;
    private final gqa E;
    private final int F;
    private final int G;
    private final ot J;
    private final his K;
    public final Context b;
    public final CategoryViewPager c;
    public final View d;
    public final elb e;
    public final ctu f;
    public final cws g;
    public final idk i;
    public final hsz j;
    public final ehg k;
    public final BindingRecyclerView v;
    public final dpe x;
    private final ino z;
    private final Map H = new qo();
    public eir l = eir.NONE;
    public cng m = cni.a;
    public cxe n = cxe.a;
    public llp o = llp.q();
    public int p = -1;
    public int q = -1;
    public String r = "";
    public hfl s = hfl.INTERNAL;
    public final AtomicBoolean t = new AtomicBoolean(false);
    public boolean u = false;
    private int I = -1;
    public final dxs y = new dxs((byte[]) null);
    public Runnable w = ejj.a;
    private final deq L = this;
    public final cuo h = cuo.f(cww.class);

    public eis(Context context, SoftKeyboardView softKeyboardView, ino inoVar, cri criVar, ctu ctuVar, dpe dpeVar, cxm cxmVar, cws cwsVar, crf crfVar, hsz hszVar, idk idkVar, gqa gqaVar, oiy oiyVar, int i, int i2, ehg ehgVar, byte[] bArr, byte[] bArr2) {
        eim eimVar = new eim(this, 0);
        this.K = eimVar;
        this.b = context;
        this.z = inoVar;
        this.A = criVar;
        this.f = ctuVar;
        this.B = oiyVar;
        this.F = i;
        this.G = i2;
        this.i = idkVar;
        this.x = dpeVar;
        this.C = cxmVar;
        this.g = cwsVar;
        this.D = crfVar;
        this.E = gqaVar;
        this.j = hszVar;
        this.k = ehgVar;
        CategoryViewPager categoryViewPager = (CategoryViewPager) aad.q(softKeyboardView, R.id.expression_view_pager);
        this.c = categoryViewPager;
        this.d = aad.q(softKeyboardView, R.id.f54670_resource_name_obfuscated_res_0x7f0b01ba);
        categoryViewPager.j = ((Boolean) cvb.d.c()).booleanValue();
        this.e = new elb(context, this);
        this.v = (BindingRecyclerView) aad.q(softKeyboardView, R.id.f52870_resource_name_obfuscated_res_0x7f0b00e1);
        this.J = new ot(new eiq(eimVar));
    }

    public static BindingRecyclerView h(View view) {
        return (BindingRecyclerView) aad.q(view, R.id.f129180_resource_name_obfuscated_res_0x7f0b213a);
    }

    @Deprecated
    private static String w(cxc cxcVar) {
        return "featured/".concat(String.valueOf(cxcVar.b));
    }

    private static String x(cxc cxcVar) {
        return !TextUtils.isEmpty(cxcVar.e) ? cxcVar.e : cxcVar.h;
    }

    private final void y(int i, String str, int i2, int i3, mba mbaVar) {
        idk idkVar = this.i;
        ctd ctdVar = ctd.CATEGORY_SWITCH;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 3;
        int i4 = mbcVar.a | 1;
        mbcVar.a = i4;
        mbcVar.c = i - 1;
        mbcVar.a = i4 | 2;
        nfh t2 = mbb.g.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbb mbbVar = (mbb) t2.b;
        mbbVar.e = mbaVar.e;
        int i5 = mbbVar.a | 8;
        mbbVar.a = i5;
        str.getClass();
        int i6 = i5 | 1;
        mbbVar.a = i6;
        mbbVar.b = str;
        int i7 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        mbbVar.c = i7;
        int i8 = i6 | 2;
        mbbVar.a = i8;
        mbbVar.a = i8 | 4;
        mbbVar.d = i2;
        mbb mbbVar2 = (mbb) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar2 = (mbc) t.b;
        mbbVar2.getClass();
        mbcVar2.e = mbbVar2;
        mbcVar2.a |= 8;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
    }

    @Override // defpackage.deq
    public final int a() {
        egt egtVar = egt.REGULAR_STICKER_PACK;
        eir eirVar = eir.NONE;
        int ordinal = this.l.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                return c();
            }
            if (ordinal == 4) {
                return this.u ? this.I : c();
            } else if (ordinal == 5) {
                return this.n.d.size();
            } else {
                return 1;
            }
        }
        return 0;
    }

    @Override // defpackage.deq
    public final void b(View view) {
        this.y.p(view);
        BindingRecyclerView h = h(view);
        h.gI();
        h.setVerticalScrollBarEnabled(true);
        cuj a2 = h.a();
        dg dgVar = (dg) this.H.remove(view);
        if (a2 != null) {
            if (dgVar != null) {
                a2.hn(dgVar);
            }
            a2.B();
        }
        h.aa(null);
        h.ab(null);
    }

    public final int c() {
        cuj a2 = this.v.a();
        if (a2 != null) {
            return Math.max(0, a2.ha() - 2);
        }
        return 0;
    }

    @Override // defpackage.deq
    public final void d(View view, int i) {
        cuj f;
        BindingRecyclerView h = h(view);
        ehc ehcVar = null;
        if (this.l == eir.REORDER) {
            Context context = this.b;
            lls h2 = llw.h();
            h2.a(cxc.class, ejj.b(this.J));
            f = cnx.f(h2, context, this.J, null);
        } else {
            ego egoVar = new ego(this, i, 3);
            Context context2 = this.b;
            lls h3 = llw.h();
            h3.a(cng.class, new cni());
            h3.a(cqp.class, ejj.e(new eim(this, 2), this.y, egoVar));
            h3.a(cww.class, ejj.f(new eim(this, 3), this.y, egoVar));
            if (this.l == eir.BROWSE_PACKS) {
                h3.a(egu.class, ejj.c(this.b, this.x, new eim(this, 4), new eim(this, 5)));
            } else {
                h3.a(eib.class, ejj.d(this.x, new his() { // from class: eio
                    @Override // defpackage.his
                    public final void a(Object obj, Object obj2) {
                        String string;
                        cth cthVar;
                        eis eisVar = eis.this;
                        eib eibVar = (eib) obj;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        cxc f2 = eibVar.f();
                        egt egtVar = egt.REGULAR_STICKER_PACK;
                        eir eirVar = eir.NONE;
                        int b = eibVar.b() - 1;
                        if (b == 0) {
                            ((ltd) ((ltd) eis.a.c()).k("com/google/android/apps/inputmethod/libs/search/sticker/TabletPagerController", "onClickStickerPackBannerItem", 1032, "TabletPagerController.java")).t("Add pack banner is not supported in tablet");
                        } else if (b == 1) {
                            if (eisVar.n.f.e() && f2.b.equals(eisVar.n.f.a())) {
                                eisVar.i.e(ctf.FEATURED_PACK_INTERACTION, cth.UNFAVORITED_FROM_CATEGORY);
                            }
                            eisVar.x.h(f2, false);
                            eisVar.l(f2.b, false);
                            cxe cxeVar = eisVar.n;
                            llp llpVar = cxeVar.b;
                            if (cxeVar.f.e() && f2.b.equals(eisVar.n.f.a())) {
                                eisVar.k.d(f2.b, false);
                            }
                            cxd e = eisVar.n.e();
                            e.h(llpVar, eisVar.x);
                            eisVar.n = e.a();
                            if (eisVar.l != eir.MY_PACKS) {
                                throw new IllegalStateException("remove pack clicked from outside my packs");
                            }
                            int g = eisVar.g();
                            cuj a2 = eisVar.v.a();
                            if (a2 != null) {
                                a2.D(g, true);
                            }
                            eisVar.v.ae(g);
                            if (eisVar.c() <= 2) {
                                eisVar.n(eir.BROWSE_PACKS);
                                eisVar.c.B(ehi.g(1), true, 2);
                                ehj i2 = eisVar.i(1);
                                if (i2 == null) {
                                    return;
                                }
                                eisVar.t(i2, 1, 2);
                                return;
                            }
                            eisVar.e.d();
                            eisVar.c.B(ehi.g(g), false, 2);
                            ehj i3 = eisVar.i(g);
                            if (i3 == null) {
                                return;
                            }
                            eisVar.t(i3, g, 2);
                        } else {
                            int i4 = 3;
                            if (b != 3) {
                                if (booleanValue) {
                                    string = eisVar.b.getString(R.string.f152140_resource_name_obfuscated_res_0x7f14025d);
                                } else {
                                    string = eisVar.b.getString(R.string.f152160_resource_name_obfuscated_res_0x7f14025f);
                                }
                                hky a3 = hlf.a();
                                a3.m = 1;
                                a3.b = new eil(eisVar, string, 0);
                                a3.p("FEATURE_PACK_ACTION_TOOLTIP_ID");
                                a3.c = eisVar.d;
                                a3.s(R.layout.f134610_resource_name_obfuscated_res_0x7f0e00ae);
                                a3.g(string);
                                a3.d = new dwp(eisVar, 5);
                                a3.t(true);
                                a3.q();
                                a3.m(3500L);
                                hkq.b(a3.a());
                                eisVar.k(f2, booleanValue);
                                idk idkVar = eisVar.i;
                                ctf ctfVar = ctf.FEATURED_PACK_INTERACTION;
                                Object[] objArr = new Object[1];
                                if (booleanValue) {
                                    cthVar = cth.ADDED_FROM_CATEGORY;
                                } else {
                                    cthVar = cth.DISMISSED_FROM_CATEGORY;
                                }
                                objArr[0] = cthVar;
                                idkVar.e(ctfVar, objArr);
                                return;
                            }
                            eisVar.x.h(f2, booleanValue);
                            eisVar.l(f2.b, booleanValue);
                            idk idkVar2 = eisVar.i;
                            ctd ctdVar = ctd.FAVORITING;
                            Object[] objArr2 = new Object[1];
                            nfh t = mbc.p.t();
                            if (t.c) {
                                t.cD();
                                t.c = false;
                            }
                            mbc mbcVar = (mbc) t.b;
                            mbcVar.b = 3;
                            mbcVar.a |= 1;
                            mbc mbcVar2 = (mbc) t.b;
                            mbcVar2.c = 5;
                            mbcVar2.a |= 2;
                            nfh t2 = mbe.d.t();
                            if (true == booleanValue) {
                                i4 = 2;
                            }
                            if (t2.c) {
                                t2.cD();
                                t2.c = false;
                            }
                            mbe mbeVar = (mbe) t2.b;
                            mbeVar.c = i4 - 1;
                            int i5 = 2 | mbeVar.a;
                            mbeVar.a = i5;
                            String str = f2.b;
                            str.getClass();
                            mbeVar.a = i5 | 1;
                            mbeVar.b = str;
                            mbe mbeVar2 = (mbe) t2.cz();
                            if (t.c) {
                                t.cD();
                                t.c = false;
                            }
                            mbc mbcVar3 = (mbc) t.b;
                            mbeVar2.getClass();
                            mbcVar3.i = mbeVar2;
                            mbcVar3.a |= 512;
                            objArr2[0] = t.cz();
                            idkVar2.e(ctdVar, objArr2);
                        }
                    }
                }, this.w));
            }
            f = cnx.f(h3, context2, null, null);
        }
        h.aa(f);
        GridLayoutManager a2 = ((egv) this.B).a();
        a2.v(this.l == eir.BROWSE_PACKS ? this.G : this.F);
        h.ab(a2);
        if (this.l != eir.BROWSE_PACKS || i <= 0) {
            egt egtVar = egt.REGULAR_STICKER_PACK;
            int i2 = 0;
            switch (this.l.ordinal()) {
                case 1:
                case 2:
                    f.N(this.m);
                    break;
                case 3:
                    ehj i3 = i(ehi.h(i));
                    if (i3 != null) {
                        int a3 = i3.a() - 1;
                        if (a3 == 0) {
                            cxc d = i3.d();
                            f.J(d.g);
                            f.A(eju.i(d));
                            ehcVar = ehc.j(f, cww.class);
                            break;
                        } else if (a3 == 2) {
                            f.G(j());
                            break;
                        } else if (a3 == 6) {
                            cxc b = i3.b();
                            f.A(eju.h(b));
                            f.J(b.g);
                            ehcVar = ehc.j(f, cww.class);
                            break;
                        }
                    }
                    break;
                case 4:
                    cxe b2 = this.n.b();
                    this.n = b2;
                    cxe c = b2.c(this.g);
                    this.n = c;
                    if (c.j.e()) {
                        f.J(lre.H((List) this.n.j.a(), ehk.f));
                    }
                    f.J(lre.H(this.n.c, ehk.g));
                    if (this.n.j.e()) {
                        f.M(fhr.x(this.n.d, new ein(lmz.p((Collection) this.n.j.a()), 0), ehk.h));
                    } else {
                        f.J(lre.H(this.n.d, ehk.i));
                    }
                    ehcVar = ehc.j(f, cww.class);
                    if (this.q != -1 && f.ha() != 0) {
                        i2 = this.q >= f.ha() ? f.ha() - 1 : this.q;
                    }
                    h.post(new dob(h, i2, 3));
                    this.q = -1;
                    break;
                case 5:
                    cxc cxcVar = (cxc) this.n.d.get(i);
                    cxcVar.getClass();
                    f.A(new efs(cxcVar));
                    f.J(cxcVar.g);
                    ehcVar = ehc.j(f, cww.class);
                    break;
                case 6:
                    f.L(this.o);
                    h.az(this.h);
                    h.setVerticalScrollBarEnabled(false);
                    ehcVar = ehc.k(f, cww.class, new dvc(this, h, 20));
                    break;
                case 7:
                    f.L(this.n.e);
                    break;
            }
            if (ehcVar != null) {
                f.hm(ehcVar);
                this.H.put(view, ehcVar);
            }
            this.y.n(view, new eic(f));
        }
    }

    @Override // defpackage.deq
    public final int e() {
        return R.layout.f146580_resource_name_obfuscated_res_0x7f0e05d0;
    }

    public final int f() {
        cuj a2 = this.v.a();
        if (a2 != null) {
            return a2.ha() - 1;
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/TabletPagerController", "getSettingsPosition", 1147, "TabletPagerController.java")).t("Get setting position, but binding adapter is null");
        return -1;
    }

    public final int g() {
        int i;
        cuj a2 = this.v.a();
        if (a2 == null || a2.H() || (i = this.p) < 3 || i >= f()) {
            throw new IllegalStateException("current pack is not removable");
        }
        int i2 = this.p;
        this.p = -1;
        a2.F(i2);
        if (i2 == f()) {
            i2--;
        }
        this.p = i2;
        return i2;
    }

    @Override // defpackage.ela
    public final void hz(CategoryViewPager categoryViewPager, View view, int i, int i2) {
        ehj i3;
        if (this.l == eir.BROWSE_PACKS && i > 0) {
            m();
            n(eir.MY_PACKS);
        }
        if (this.l == eir.MY_PACKS && i == 0) {
            n(eir.BROWSE_PACKS);
        }
        if (this.l != eir.BROWSE_PACKS) {
            h(view).Y(0);
        }
        eir eirVar = this.l;
        if (eirVar == eir.MY_PACKS || eirVar == eir.BROWSE_PACKS) {
            int h = ehi.h(i);
            if (i2 == 3 || i2 == 2 || (i3 = i(h)) == null) {
                return;
            }
            t(i3, h, i2);
        } else if (eirVar != eir.PACK_DETAILS || i2 == 3) {
        } else {
            u(i, i2);
        }
    }

    public final ehj i(int i) {
        cuj a2 = this.v.a();
        if (a2 != null) {
            return (ehj) a2.z(ehj.class, i);
        }
        return null;
    }

    public final List j() {
        List e = this.A.e();
        if (e.isEmpty()) {
            cnf a2 = cng.a();
            a2.c(false);
            a2.e(1);
            a2.g(R.drawable.f49120_resource_name_obfuscated_res_0x7f080294);
            a2.f(R.string.f167200_resource_name_obfuscated_res_0x7f140930);
            return lre.D(a2.a());
        }
        return e;
    }

    public final void k(cxc cxcVar, boolean z) {
        cuj a2;
        this.k.d(cxcVar.b, z);
        cxd e = this.n.e();
        e.e(false);
        this.n = e.a();
        this.x.h(cxcVar, z);
        l(cxcVar.b, z);
        int i = 3;
        if (z) {
            View x = this.c.x(Integer.valueOf(ehi.g(3)));
            if (x != null && (a2 = h(x).a()) != null) {
                a2.F(0);
                a2.A(eju.i(cxcVar));
            }
            this.n = this.n.f(this.x);
            s();
        } else {
            this.C.b(cxcVar.b).v(new coa(this, 19), mjl.a);
            int i2 = this.p;
            g();
            this.e.d();
            this.c.B(ehi.g(i2), false, 2);
            ehj i3 = i(i2);
            if (i3 != null) {
                t(i3, i2, 2);
            }
        }
        idk idkVar = this.i;
        ctd ctdVar = ctd.FAVORITING;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 3;
        mbcVar.a |= 1;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 6;
        mbcVar2.a |= 2;
        nfh t2 = mbe.d.t();
        if (true == z) {
            i = 2;
        }
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbe mbeVar = (mbe) t2.b;
        mbeVar.c = i - 1;
        int i4 = mbeVar.a | 2;
        mbeVar.a = i4;
        String str = cxcVar.b;
        str.getClass();
        mbeVar.a = i4 | 1;
        mbeVar.b = str;
        mbe mbeVar2 = (mbe) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mbeVar2.getClass();
        mbcVar3.i = mbeVar2;
        mbcVar3.a |= 512;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
    }

    public final void l(String str, boolean z) {
        this.C.a(str, z).v(new coa(this, 18), mjl.a);
    }

    public final void m() {
        if (this.u) {
            this.u = false;
            this.I = -1;
        }
    }

    public final void n(eir eirVar) {
        if (this.l == eirVar) {
            return;
        }
        this.l = eirVar;
        if (eirVar == eir.BROWSE_PACKS) {
            this.I = c();
        }
        this.e.d();
    }

    public final void o(cng cngVar) {
        this.m = cngVar;
        this.n = cxe.a;
        this.o = llp.q();
        this.h.a = null;
        n(eir.ERROR_CARD);
    }

    public final void p() {
        this.m = cni.a;
        this.n = cxe.a;
        this.o = llp.q();
        this.h.a = null;
        n(eir.LOADING);
    }

    public final void q(cxe cxeVar, int i) {
        r(cxeVar, i, false, true);
    }

    public final void r(cxe cxeVar, int i, boolean z, boolean z2) {
        this.m = cni.a;
        this.n = cxeVar;
        this.o = llp.q();
        this.h.a = null;
        if (i == -1) {
            if (!this.n.j.e() || !this.k.f()) {
                boolean e = this.n.g.e();
                if (!e || !((Boolean) ehy.q.c()).booleanValue()) {
                    boolean z3 = !this.A.k();
                    if (!z3 || !((Boolean) ehy.p.c()).booleanValue()) {
                        if (!this.n.e.isEmpty()) {
                            String d = this.z.d("pref_key_last_sticker_pack_key", "");
                            if (!"BROWSE".equals(d)) {
                                if (!z3 || !"RECENTS".equals(d)) {
                                    if (!TextUtils.isEmpty(d)) {
                                        for (int i2 = 0; i2 < this.n.e.size(); i2++) {
                                            if (((cxc) this.n.e.get(i2)).b.equals(d)) {
                                                i = (e ? 1 : 0) + i2 + 3;
                                                break;
                                            }
                                        }
                                        this.z.w("pref_key_last_sticker_pack_key");
                                    }
                                }
                            }
                        }
                    }
                    i = 2;
                }
                i = 3;
            } else {
                this.k.b();
            }
            i = 1;
        }
        this.p = i;
        if (z2) {
            s();
        }
        cuj a2 = this.v.a();
        if (a2 != null) {
            a2.D(i, true);
            this.v.ae(i);
        }
        ehj i3 = i(i);
        if (i3 != null) {
            egt egtVar = egt.REGULAR_STICKER_PACK;
            eir eirVar = eir.NONE;
            int a3 = i3.a() - 1;
            if (a3 == 0) {
                this.E.g(R.string.f153130_resource_name_obfuscated_res_0x7f1402c4, x(i3.d()));
            } else if (a3 == 1) {
                this.E.n(R.string.f153130_resource_name_obfuscated_res_0x7f1402c4, R.string.f167180_resource_name_obfuscated_res_0x7f14092e);
            } else if (a3 == 2) {
                this.E.n(R.string.f153130_resource_name_obfuscated_res_0x7f1402c4, R.string.f153220_resource_name_obfuscated_res_0x7f1402ce);
            } else if (a3 == 6) {
                this.E.g(R.string.f153100_resource_name_obfuscated_res_0x7f1402c1, x(i3.b()));
            }
        }
        if (i == 1) {
            n(eir.BROWSE_PACKS);
        } else {
            n(eir.MY_PACKS);
        }
        this.c.B(ehi.g(i), z, 2);
        if (a2 != null) {
            t((ehj) a2.z(ehj.class, i), i, 2);
        }
    }

    public final void s() {
        llk llkVar = new llk();
        llkVar.h(efq.b(""));
        llkVar.h(efj.a);
        llkVar.h(efl.a);
        if (this.n.g.e()) {
            llkVar.h(efq.a((cxc) this.n.g.a()));
        }
        llkVar.j(lre.ab(this.n.e, ehk.j));
        llkVar.h(efn.a);
        cuj a2 = this.v.a();
        if (a2 != null) {
            a2.L(llkVar.g());
        }
    }

    public final void t(ehj ehjVar, int i, int i2) {
        String str;
        mba mbaVar;
        int i3;
        mba mbaVar2 = mba.UNKNOWN;
        egt egtVar = egt.REGULAR_STICKER_PACK;
        eir eirVar = eir.NONE;
        int a2 = ehjVar.a() - 1;
        if (a2 == 0) {
            str = ehjVar.d().b;
            mbaVar = mbaVar2;
            i3 = 6;
        } else if (a2 == 1) {
            if (this.n.j.e()) {
                idk idkVar = this.i;
                ctd ctdVar = ctd.IMPRESSION;
                Object[] objArr = new Object[1];
                nfh t = mbc.p.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar = (mbc) t.b;
                mbcVar.b = 3;
                int i4 = mbcVar.a | 1;
                mbcVar.a = i4;
                mbcVar.c = 1;
                mbcVar.a = i4 | 2;
                nfh t2 = mbt.e.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbt mbtVar = (mbt) t2.b;
                mbtVar.c = 5;
                mbtVar.a |= 2;
                t.dM(t2);
                int i5 = this.n.k;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar2 = (mbc) t.b;
                int i6 = i5 - 1;
                if (i5 == 0) {
                    throw null;
                }
                mbcVar2.l = i6;
                mbcVar2.a |= 4096;
                objArr[0] = t.cz();
                idkVar.e(ctdVar, objArr);
                this.i.e(ctf.FEATURED_PACK_INTERACTION, cth.BROWSE_IMPRESSION);
            }
            mbaVar = mbaVar2;
            str = "BROWSE";
            i3 = 2;
        } else if (a2 == 2) {
            str = "RECENTS";
            mbaVar = mba.RECENTS;
            i3 = 5;
        } else if (a2 == 3 || a2 == 4) {
            str = "";
            mbaVar = mbaVar2;
            i3 = 1;
        } else if (a2 != 6) {
            throw new IllegalStateException("No stickerPromo headeritem should be created in sticker revamp peer keyboard.");
        } else {
            String w = w(ehjVar.b());
            this.i.e(ctf.FEATURED_PACK_INTERACTION, cth.CATEGORY_IMPRESSION);
            str = w;
            mbaVar = mbaVar2;
            i3 = 7;
        }
        if (!TextUtils.isEmpty(str)) {
            this.z.j("pref_key_last_sticker_pack_key", str);
            y(i3, str, ehi.g(i), i2, mbaVar);
        }
    }

    public final void u(int i, int i2) {
        y(6, ((cxc) this.n.d.get(i)).b, i, i2, mba.UNKNOWN);
    }

    public final void v(cqp cqpVar, int i) {
        egt egtVar = egt.REGULAR_STICKER_PACK;
        eir eirVar = eir.NONE;
        int ordinal = this.l.ordinal();
        int i2 = 7;
        String str = "UNKNOWN";
        if (ordinal == 3) {
            ehj i3 = i(this.p);
            if (i3 != null) {
                int a2 = i3.a() - 1;
                if (a2 == 0) {
                    str = i3.d().b;
                    i2 = 2;
                } else if (a2 == 2) {
                    str = "RECENTS";
                    i2 = 5;
                } else if (a2 == 6) {
                    str = w(i3.b());
                }
            }
            i2 = 1;
        } else if (ordinal == 5) {
            str = ((cxc) this.n.d.get(this.c.a())).b;
            i2 = 6;
        } else if (ordinal == 6) {
            str = "MANUAL_SEARCH";
            i2 = 3;
        } else if (ordinal != 7) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/sticker/TabletPagerController", "getCategoryIdAndTabState", 1311, "TabletPagerController.java")).w("Unexpected view state in logShare: %s", this.l);
            i2 = 1;
        } else {
            str = "REORDER";
            i2 = 8;
        }
        eip eipVar = new eip(str, i2);
        String str2 = this.r;
        hfl hflVar = this.s;
        this.y.q(cqpVar);
        crf crfVar = this.D;
        cqz a3 = cra.a();
        a3.b(cqpVar);
        a3.c(i);
        a3.a = this.f.l();
        a3.d(this.A);
        ctu ctuVar = this.f;
        Objects.requireNonNull(ctuVar);
        a3.f(new drf(ctuVar, 16));
        hiz a4 = crfVar.a(a3.a());
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new egb(this, cqpVar, eipVar, str2, hflVar, 5));
        a4.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
    }
}
