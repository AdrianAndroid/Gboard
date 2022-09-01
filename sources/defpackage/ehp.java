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

/* compiled from: PG */
/* renamed from: ehp  reason: default package */
/* loaded from: classes.dex */
public final class ehp implements deq, ela {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/sticker/PagerController");
    private final crf A;
    private final gqa B;
    private final int C;
    private final int D;
    public final Context b;
    public final CategoryViewPager c;
    public final View d;
    public final elb e;
    public final ctu f;
    public final ehi g;
    public final cws h;
    public final idk j;
    public final hsz k;
    public final ehg l;
    public final dpe u;
    private final ino w;
    private final cri x;
    private final oiy y;
    private final cxm z;
    private final Map E = new qo();
    public eho m = eho.NONE;
    public cng n = cni.a;
    public cxe o = cxe.a;
    public llp p = llp.q();
    public int q = -1;
    public String r = "";
    public hfl s = hfl.INTERNAL;
    public boolean t = false;
    private int F = -1;
    public final dxs v = new dxs((byte[]) null);
    public final cuo i = cuo.f(cww.class);

    public ehp(Context context, SoftKeyboardView softKeyboardView, ino inoVar, cri criVar, ctu ctuVar, ehi ehiVar, dpe dpeVar, cxm cxmVar, cws cwsVar, crf crfVar, hsz hszVar, idk idkVar, gqa gqaVar, oiy oiyVar, int i, int i2, ehg ehgVar, byte[] bArr, byte[] bArr2) {
        this.b = context;
        this.w = inoVar;
        this.x = criVar;
        this.f = ctuVar;
        this.g = ehiVar;
        this.y = oiyVar;
        this.C = i;
        this.D = i2;
        this.j = idkVar;
        this.u = dpeVar;
        this.z = cxmVar;
        this.h = cwsVar;
        this.A = crfVar;
        this.k = hszVar;
        this.B = gqaVar;
        this.l = ehgVar;
        CategoryViewPager categoryViewPager = (CategoryViewPager) aad.q(softKeyboardView, R.id.expression_view_pager);
        this.c = categoryViewPager;
        this.d = aad.q(softKeyboardView, R.id.f54670_resource_name_obfuscated_res_0x7f0b01ba);
        categoryViewPager.j = ((Boolean) cvb.d.c()).booleanValue();
        this.e = new elb(context, this);
    }

    public static BindingRecyclerView c(View view) {
        return (BindingRecyclerView) aad.q(view, R.id.f129180_resource_name_obfuscated_res_0x7f0b213a);
    }

    @Deprecated
    private static String r(cxc cxcVar) {
        return "featured/".concat(String.valueOf(cxcVar.b));
    }

    private static String s(cxc cxcVar) {
        return !TextUtils.isEmpty(cxcVar.e) ? cxcVar.e : cxcVar.h;
    }

    private final void t(int i, String str, int i2, int i3, mba mbaVar) {
        idk idkVar = this.j;
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
        eho ehoVar = eho.NONE;
        int ordinal = this.m.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                return this.g.e();
            }
            if (ordinal == 4) {
                return this.t ? this.F : this.g.e();
            } else if (ordinal == 5) {
                return this.o.d.size();
            } else {
                return 1;
            }
        }
        return 0;
    }

    @Override // defpackage.deq
    public final void b(View view) {
        this.v.p(view);
        BindingRecyclerView c = c(view);
        c.gI();
        c.setVerticalScrollBarEnabled(true);
        cuj a2 = c.a();
        dg dgVar = (dg) this.E.remove(view);
        if (a2 != null) {
            if (dgVar != null) {
                a2.hn(dgVar);
            }
            a2.B();
        }
        c.aa(null);
        c.ab(null);
    }

    @Override // defpackage.deq
    public final void d(View view, int i) {
        BindingRecyclerView c = c(view);
        ego egoVar = new ego(this, i, 2);
        Context context = this.b;
        lls h = llw.h();
        h.a(cng.class, new cni());
        h.a(cqp.class, ejj.e(new dzk(this, 15), this.v, egoVar));
        h.a(cww.class, ejj.f(new dzk(this, 16), this.v, egoVar));
        if (this.m == eho.BROWSE_PACKS) {
            h.a(egu.class, ejj.c(this.b, this.u, new dzk(this, 17), new dzk(this, 18)));
        } else {
            h.a(eib.class, ejj.d(this.u, new his() { // from class: ehl
                @Override // defpackage.his
                public final void a(Object obj, Object obj2) {
                    String string;
                    cth cthVar;
                    ehp ehpVar = ehp.this;
                    eib eibVar = (eib) obj;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    cxc f = eibVar.f();
                    egt egtVar = egt.REGULAR_STICKER_PACK;
                    eho ehoVar = eho.NONE;
                    int b = eibVar.b() - 1;
                    if (b == 0) {
                        ehpVar.u.h(f, booleanValue);
                        ehpVar.h(f.b, booleanValue);
                        idk idkVar = ehpVar.j;
                        ctd ctdVar = ctd.FAVORITING;
                        Object[] objArr = new Object[1];
                        nfh t = mbc.p.t();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mbc mbcVar = (mbc) t.b;
                        int i2 = 3;
                        mbcVar.b = 3;
                        mbcVar.a |= 1;
                        mbc mbcVar2 = (mbc) t.b;
                        mbcVar2.c = 5;
                        mbcVar2.a |= 2;
                        nfh t2 = mbe.d.t();
                        if (true == booleanValue) {
                            i2 = 2;
                        }
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        mbe mbeVar = (mbe) t2.b;
                        mbeVar.c = i2 - 1;
                        int i3 = 2 | mbeVar.a;
                        mbeVar.a = i3;
                        String str = f.b;
                        str.getClass();
                        mbeVar.a = i3 | 1;
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
                    } else if (b == 1) {
                        if (ehpVar.o.f.e() && f.b.equals(ehpVar.o.f.a())) {
                            ehpVar.j.e(ctf.FEATURED_PACK_INTERACTION, cth.UNFAVORITED_FROM_CATEGORY);
                        }
                        ehpVar.u.h(f, false);
                        ehpVar.h(f.b, false);
                        cxe cxeVar = ehpVar.o;
                        llp llpVar = cxeVar.b;
                        if (cxeVar.f.e() && f.b.equals(ehpVar.o.f.a())) {
                            ehpVar.l.d(f.b, false);
                        }
                        cxd e = ehpVar.o.e();
                        e.h(llpVar, ehpVar.u);
                        ehpVar.o = e.a();
                        if (ehpVar.m != eho.MY_PACKS) {
                            throw new IllegalStateException("remove pack clicked from outside my packs");
                        }
                        int f2 = ehpVar.g.f();
                        if (ehpVar.g.e() <= 2) {
                            ehpVar.j(eho.BROWSE_PACKS);
                            ehpVar.c.B(ehi.g(1), true, 2);
                            ehpVar.o(ehpVar.g.j(1), 1, 2);
                            return;
                        }
                        ehpVar.e.d();
                        ehpVar.c.B(ehi.g(f2), false, 2);
                        ehpVar.o(ehpVar.g.j(f2), f2, 2);
                    } else if (b != 2) {
                    } else {
                        if (booleanValue) {
                            string = ehpVar.b.getString(R.string.f152140_resource_name_obfuscated_res_0x7f14025d);
                        } else {
                            string = ehpVar.b.getString(R.string.f152160_resource_name_obfuscated_res_0x7f14025f);
                        }
                        hky a2 = hlf.a();
                        a2.m = 1;
                        a2.b = new eil(ehpVar, string, 1);
                        a2.p("FEATURE_PACK_ACTION_TOOLTIP_ID");
                        a2.c = ehpVar.d;
                        a2.s(R.layout.f134610_resource_name_obfuscated_res_0x7f0e00ae);
                        a2.g(string);
                        a2.d = new dwp(ehpVar, 4);
                        a2.t(true);
                        a2.q();
                        a2.m(3500L);
                        hkq.b(a2.a());
                        ehpVar.g(f, booleanValue);
                        idk idkVar2 = ehpVar.j;
                        ctf ctfVar = ctf.FEATURED_PACK_INTERACTION;
                        Object[] objArr2 = new Object[1];
                        if (booleanValue) {
                            cthVar = cth.ADDED_FROM_CATEGORY;
                        } else {
                            cthVar = cth.DISMISSED_FROM_CATEGORY;
                        }
                        objArr2[0] = cthVar;
                        idkVar2.e(ctfVar, objArr2);
                    }
                }
            }, ejj.a));
        }
        ehc ehcVar = null;
        cuj f = cnx.f(h, context, null, null);
        c.aa(f);
        GridLayoutManager a2 = ((egv) this.y).a();
        a2.v(this.m == eho.BROWSE_PACKS ? this.D : this.C);
        c.ab(a2);
        if (this.m != eho.BROWSE_PACKS || i <= 0) {
            c.az(new ehm(this));
            egt egtVar = egt.REGULAR_STICKER_PACK;
            int i2 = 0;
            switch (this.m.ordinal()) {
                case 1:
                case 2:
                    f.N(this.n);
                    break;
                case 3:
                    ehj j = this.g.j(ehi.h(i));
                    int a3 = j.a() - 1;
                    if (a3 == 0) {
                        cxc d = j.d();
                        f.J(d.g);
                        f.A(eju.i(d));
                        ehcVar = ehc.j(f, cww.class);
                        break;
                    } else if (a3 == 2) {
                        f.G(f());
                        break;
                    } else if (a3 == 6) {
                        cxc b = j.b();
                        f.A(eju.h(b));
                        f.J(b.g);
                        ehcVar = ehc.j(f, cww.class);
                        break;
                    }
                    break;
                case 4:
                    cxe b2 = this.o.b();
                    this.o = b2;
                    cxe c2 = b2.c(this.h);
                    this.o = c2;
                    if (c2.j.e()) {
                        f.J(lre.H((List) this.o.j.a(), ehk.a));
                    }
                    f.J(lre.H(this.o.c, ehk.c));
                    if (this.o.j.e()) {
                        f.M(fhr.x(this.o.d, new cjm(lmz.p((Collection) this.o.j.a()), 19), ehk.d));
                    } else {
                        f.J(lre.H(this.o.d, ehk.e));
                    }
                    ehcVar = ehc.j(f, cww.class);
                    if (this.q != -1 && f.ha() != 0) {
                        i2 = this.q >= f.ha() ? f.ha() - 1 : this.q;
                    }
                    c.post(new dob(c, i2, 2));
                    this.q = -1;
                    break;
                case 5:
                    cxc cxcVar = (cxc) this.o.d.get(i);
                    cxcVar.getClass();
                    f.A(new efr(cxcVar));
                    f.J(cxcVar.g);
                    ehcVar = ehc.j(f, cww.class);
                    break;
                case 6:
                    f.L(this.p);
                    c.az(this.i);
                    c.setVerticalScrollBarEnabled(false);
                    ehcVar = ehc.k(f, cww.class, new dvc(this, c, 16));
                    break;
            }
            if (ehcVar != null) {
                f.hm(ehcVar);
                this.E.put(view, ehcVar);
            }
            this.v.n(view, new eic(f));
        }
    }

    @Override // defpackage.deq
    public final int e() {
        return R.layout.f146580_resource_name_obfuscated_res_0x7f0e05d0;
    }

    public final List f() {
        List e = this.x.e();
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

    public final void g(cxc cxcVar, boolean z) {
        cuj a2;
        this.l.d(cxcVar.b, z);
        cxd e = this.o.e();
        e.e(false);
        this.o = e.a();
        this.u.h(cxcVar, z);
        h(cxcVar.b, z);
        int i = 3;
        if (z) {
            View x = this.c.x(Integer.valueOf(ehi.g(3)));
            if (x != null && (a2 = c(x).a()) != null) {
                a2.F(0);
                a2.A(eju.i(cxcVar));
            }
            cxe f = this.o.f(this.u);
            this.o = f;
            this.g.m(f, 3);
        } else {
            this.z.b(cxcVar.b).v(new coa(this, 17), mjl.a);
            int f2 = this.g.f();
            this.e.d();
            this.c.B(ehi.g(f2), false, 2);
            o(this.g.j(f2), f2, 2);
        }
        idk idkVar = this.j;
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
        int i2 = mbeVar.a | 2;
        mbeVar.a = i2;
        String str = cxcVar.b;
        str.getClass();
        mbeVar.a = i2 | 1;
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

    public final void h(String str, boolean z) {
        this.z.a(str, z).v(new coa(this, 16), mjl.a);
    }

    @Override // defpackage.ela
    public final void hz(CategoryViewPager categoryViewPager, View view, int i, int i2) {
        if (this.m == eho.BROWSE_PACKS && i > 0) {
            i();
            j(eho.MY_PACKS);
        }
        if (this.m == eho.MY_PACKS && i == 0) {
            j(eho.BROWSE_PACKS);
        }
        if (this.m != eho.BROWSE_PACKS) {
            c(view).Y(0);
            this.g.e.j(false);
        }
        eho ehoVar = this.m;
        if (ehoVar == eho.MY_PACKS || ehoVar == eho.BROWSE_PACKS) {
            int h = ehi.h(i);
            this.g.l(h);
            this.g.o(h);
            if (i2 == 3 || i2 == 2) {
                return;
            }
            o(this.g.j(h), h, i2);
        } else if (ehoVar != eho.PACK_DETAILS || i2 == 3) {
        } else {
            p(i, i2);
        }
    }

    public final void i() {
        if (this.t) {
            this.t = false;
            this.F = -1;
        }
    }

    public final void j(eho ehoVar) {
        if (this.m == ehoVar) {
            return;
        }
        this.m = ehoVar;
        if (ehoVar == eho.BROWSE_PACKS) {
            this.F = this.g.e();
        }
        this.e.d();
    }

    public final void k(cng cngVar) {
        this.n = cngVar;
        this.o = cxe.a;
        this.p = llp.q();
        this.i.a = null;
        j(eho.ERROR_CARD);
    }

    public final void l() {
        this.n = cni.a;
        this.o = cxe.a;
        this.p = llp.q();
        this.i.a = null;
        j(eho.LOADING);
    }

    public final void m(cxe cxeVar, int i) {
        n(cxeVar, i, false);
    }

    public final void n(cxe cxeVar, int i, boolean z) {
        this.n = cni.a;
        this.o = cxeVar;
        this.p = llp.q();
        this.i.a = null;
        if (i == -1) {
            if (!this.o.j.e() || !this.l.f()) {
                boolean e = this.o.g.e();
                if (!e || !((Boolean) ehy.q.c()).booleanValue()) {
                    boolean z2 = !this.x.k();
                    if (!z2 || !((Boolean) ehy.p.c()).booleanValue()) {
                        if (!this.o.e.isEmpty()) {
                            String d = this.w.d("pref_key_last_sticker_pack_key", "");
                            if (!"BROWSE".equals(d)) {
                                if (!z2 || !"RECENTS".equals(d)) {
                                    if (!TextUtils.isEmpty(d)) {
                                        for (int i2 = 0; i2 < this.o.e.size(); i2++) {
                                            if (((cxc) this.o.e.get(i2)).b.equals(d)) {
                                                i = (e ? 1 : 0) + i2 + 3;
                                                break;
                                            }
                                        }
                                        this.w.w("pref_key_last_sticker_pack_key");
                                    }
                                }
                            }
                        }
                    }
                    i = 2;
                }
                i = 3;
            } else {
                this.l.b();
            }
            i = 1;
        }
        this.g.m(cxeVar, i);
        ehj j = this.g.j(i);
        egt egtVar = egt.REGULAR_STICKER_PACK;
        eho ehoVar = eho.NONE;
        int a2 = j.a() - 1;
        if (a2 == 0) {
            this.B.g(R.string.f153130_resource_name_obfuscated_res_0x7f1402c4, s(j.d()));
        } else if (a2 == 1) {
            this.B.n(R.string.f153130_resource_name_obfuscated_res_0x7f1402c4, R.string.f167180_resource_name_obfuscated_res_0x7f14092e);
        } else if (a2 == 2) {
            this.B.n(R.string.f153130_resource_name_obfuscated_res_0x7f1402c4, R.string.f153220_resource_name_obfuscated_res_0x7f1402ce);
        } else if (a2 == 6) {
            this.B.g(R.string.f153100_resource_name_obfuscated_res_0x7f1402c1, s(j.b()));
        }
        if (i == 1) {
            j(eho.BROWSE_PACKS);
        } else {
            j(eho.MY_PACKS);
        }
        this.c.B(ehi.g(i), z, 2);
        this.g.o(i);
        o(this.g.j(i), i, 2);
    }

    public final void o(ehj ehjVar, int i, int i2) {
        String str;
        mba mbaVar;
        int i3;
        mba mbaVar2 = mba.UNKNOWN;
        egt egtVar = egt.REGULAR_STICKER_PACK;
        eho ehoVar = eho.NONE;
        int a2 = ehjVar.a() - 1;
        if (a2 == 0) {
            str = ehjVar.d().b;
            mbaVar = mbaVar2;
            i3 = 6;
        } else if (a2 == 1) {
            if (this.o.j.e()) {
                idk idkVar = this.j;
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
                int i5 = this.o.k;
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
                this.j.e(ctf.FEATURED_PACK_INTERACTION, cth.BROWSE_IMPRESSION);
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
            String r = r(ehjVar.b());
            this.j.e(ctf.FEATURED_PACK_INTERACTION, cth.CATEGORY_IMPRESSION);
            str = r;
            mbaVar = mbaVar2;
            i3 = 7;
        }
        if (!TextUtils.isEmpty(str)) {
            this.w.j("pref_key_last_sticker_pack_key", str);
            t(i3, str, ehi.g(i), i2, mbaVar);
        }
    }

    public final void p(int i, int i2) {
        t(6, ((cxc) this.o.d.get(i)).b, i, i2, mba.UNKNOWN);
    }

    public final void q(cqp cqpVar, int i) {
        egt egtVar = egt.REGULAR_STICKER_PACK;
        eho ehoVar = eho.NONE;
        int ordinal = this.m.ordinal();
        int i2 = 1;
        String str = "UNKNOWN";
        if (ordinal == 3) {
            ehi ehiVar = this.g;
            ehj j = ehiVar.j(ehiVar.k);
            int a2 = j.a() - 1;
            if (a2 == 0) {
                str = j.d().b;
                i2 = 2;
            } else if (a2 == 2) {
                str = "RECENTS";
                i2 = 5;
            } else if (a2 == 6) {
                str = r(j.b());
                i2 = 7;
            }
        } else if (ordinal == 5) {
            str = ((cxc) this.o.d.get(this.c.a())).b;
            i2 = 6;
        } else if (ordinal != 6) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/sticker/PagerController", "getCategoryIdAndTabState", 1138, "PagerController.java")).w("Unexpected view state in logShare: %s", this.m);
        } else {
            str = "MANUAL_SEARCH";
            i2 = 3;
        }
        ehn ehnVar = new ehn(str, i2);
        String str2 = this.r;
        hfl hflVar = this.s;
        this.v.q(cqpVar);
        crf crfVar = this.A;
        cqz a3 = cra.a();
        a3.b(cqpVar);
        a3.c(i);
        a3.a = this.f.l();
        a3.d(this.x);
        ctu ctuVar = this.f;
        Objects.requireNonNull(ctuVar);
        a3.f(new drf(ctuVar, 15));
        hiz a4 = crfVar.a(a3.a());
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new egb(this, cqpVar, ehnVar, str2, hflVar, 4));
        a4.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
    }
}
