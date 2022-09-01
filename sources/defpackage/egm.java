package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.Objects;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: egm  reason: default package */
/* loaded from: classes.dex */
public final class egm implements deq, ela {
    private static final ltg m = ltg.j("com/google/android/apps/inputmethod/libs/search/sticker/BitmojiPageController");
    public final ctu a;
    public final CategoryViewPager b;
    public final elb c;
    public final idk d;
    public final gqa e;
    private final cou n;
    private final cri o;
    private final oiy p;
    private final cni q;
    private final crf r;
    private final Map s = new qo();
    public final dxs l = new dxs((byte[]) null);
    public int k = 1;
    public llp f = llp.q();
    public llp g = llp.q();
    public cng h = cni.a;
    public String i = "";
    public hfl j = hfl.INTERNAL;

    public egm(Context context, SoftKeyboardView softKeyboardView, cou couVar, cri criVar, ctu ctuVar, idk idkVar, cni cniVar, crf crfVar, gqa gqaVar, oiy oiyVar) {
        this.n = couVar;
        this.o = criVar;
        this.a = ctuVar;
        this.p = oiyVar;
        this.d = idkVar;
        this.q = cniVar;
        this.r = crfVar;
        this.e = gqaVar;
        this.c = new elb(context, this);
        CategoryViewPager categoryViewPager = (CategoryViewPager) aad.q(softKeyboardView, R.id.expression_view_pager);
        this.b = categoryViewPager;
        categoryViewPager.j = ((Boolean) cvb.d.c()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BindingRecyclerView c(View view) {
        return (BindingRecyclerView) aad.q(view, R.id.f129180_resource_name_obfuscated_res_0x7f0b213a);
    }

    private final String m(int i) {
        return this.k != 3 ? "" : i == 0 ? "RECENTS" : f(i).e().b;
    }

    @Override // defpackage.deq
    public final int a() {
        int i = this.k;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0 && i2 != 1 && i2 != 3) {
                return ((lrl) this.n.c.b).c;
            }
            return 1;
        }
        throw null;
    }

    @Override // defpackage.deq
    public final void b(View view) {
        this.l.p(view);
        BindingRecyclerView c = c(view);
        c.gI();
        c.Y(0);
        cuj a = c.a();
        dg dgVar = (dg) this.s.remove(view);
        if (a != null) {
            if (dgVar != null) {
                a.hn(dgVar);
            }
            a.B();
        }
        c.aa(null);
        c.ab(null);
    }

    @Override // defpackage.deq
    public final void d(View view, int i) {
        llp llpVar;
        BindingRecyclerView c = c(view);
        Context context = view.getContext();
        ego egoVar = new ego(this, i, 1);
        lls h = llw.h();
        h.a(cng.class, this.q);
        h.a(cqp.class, ejj.e(new dzk(this, 9), this.l, egoVar));
        h.a(cww.class, ejj.f(new dzk(this, 10), this.l, egoVar));
        ehc ehcVar = null;
        cuj f = cnx.f(h, context, null, null);
        c.aa(f);
        c.ab(((egv) this.p).a());
        c.az(new cos(this.n));
        int i2 = this.k;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0 || i3 == 1) {
            f.A(this.h);
        } else if (i3 != 2) {
            if (i3 == 3 && (llpVar = this.g) != null) {
                f.J(llpVar);
                ehcVar = ehc.j(f, cww.class);
            }
        } else if (i == 0) {
            f.G(h());
        } else {
            f.J(f(i).e().g);
            ehcVar = ehc.j(f, cww.class);
        }
        if (ehcVar != null) {
            f.hm(ehcVar);
            this.s.put(view, ehcVar);
        }
        this.l.n(view, new eic(f));
    }

    @Override // defpackage.deq
    public final int e() {
        return R.layout.f146580_resource_name_obfuscated_res_0x7f0e05d0;
    }

    public final efx f(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Recents does not have a sticker pack");
        }
        return (efx) this.f.get(i - 1);
    }

    public final mba g(int i) {
        if (this.k != 3) {
            return mba.UNKNOWN;
        }
        if (i == 0) {
            return mba.RECENTS;
        }
        if (f(i).b() - 1 == 1) {
            return mba.CONTEXTUAL;
        }
        return mba.UNKNOWN;
    }

    public final List h() {
        List e = this.o.e();
        if (e.isEmpty()) {
            cnf a = cng.a();
            a.c(false);
            a.e(1);
            a.g(R.drawable.f49120_resource_name_obfuscated_res_0x7f080294);
            a.f(R.string.f167200_resource_name_obfuscated_res_0x7f140930);
            return lre.D(a.a());
        }
        return e;
    }

    @Override // defpackage.ela
    public final void hz(CategoryViewPager categoryViewPager, View view, int i, int i2) {
        ((ltd) ((ltd) m.b()).k("com/google/android/apps/inputmethod/libs/search/sticker/BitmojiPageController", "onPageChanged", 208, "BitmojiPageController.java")).u("onPageChanged(): %d", i);
        c(view).Y(0);
        this.n.i(cox.b(i));
        this.n.j(false);
        if (this.k != 3 || i2 == 2) {
            return;
        }
        k(m(i), i, i2, g(i));
    }

    public final void i() {
        this.k = 1;
        this.f = llp.q();
        this.g = llp.q();
        this.h = cni.a;
        this.c.d();
    }

    public final void j(cng cngVar) {
        this.k = 2;
        this.f = llp.q();
        this.g = llp.q();
        this.h = cngVar;
        this.c.d();
        if (cngVar.a == 1) {
            int i = cngVar.b;
            if (i == R.string.f148410_resource_name_obfuscated_res_0x7f14009a) {
                this.d.e(ctd.BITMOJI_UPDATE_ERROR_SHOWN, new Object[0]);
            } else if (i == R.string.f148400_resource_name_obfuscated_res_0x7f140099) {
                this.d.e(ctd.BITMOJI_SET_UP_ERROR_SHOWN, new Object[0]);
            } else if (i != R.string.f148330_resource_name_obfuscated_res_0x7f140092) {
                if (i != R.string.f152920_resource_name_obfuscated_res_0x7f1402af) {
                    return;
                }
                idk idkVar = this.d;
                ctd ctdVar = ctd.ERROR;
                Object[] objArr = new Object[1];
                nfh t = mbc.p.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar = (mbc) t.b;
                mbcVar.b = 4;
                mbcVar.a |= 1;
                mbc mbcVar2 = (mbc) t.b;
                mbcVar2.g = 1;
                mbcVar2.a |= 64;
                objArr[0] = t.cz();
                idkVar.e(ctdVar, objArr);
            } else {
                idk idkVar2 = this.d;
                ctd ctdVar2 = ctd.IMPRESSION;
                Object[] objArr2 = new Object[1];
                nfh t2 = mbc.p.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbc mbcVar3 = (mbc) t2.b;
                mbcVar3.b = 4;
                mbcVar3.a = 1 | mbcVar3.a;
                nfh t3 = mbt.e.t();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                mbt mbtVar = (mbt) t3.b;
                mbtVar.c = 6;
                mbtVar.a = 2 | mbtVar.a;
                t2.dM(t3);
                objArr2[0] = t2.cz();
                idkVar2.e(ctdVar2, objArr2);
            }
        }
    }

    public final void k(String str, int i, int i2, mba mbaVar) {
        idk idkVar = this.d;
        ctd ctdVar = ctd.CATEGORY_SWITCH;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 4;
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
        str.getClass();
        int i3 = 1 | mbbVar.a;
        mbbVar.a = i3;
        mbbVar.b = str;
        int i4 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        mbbVar.c = i4;
        int i5 = i3 | 2;
        mbbVar.a = i5;
        int i6 = i5 | 4;
        mbbVar.a = i6;
        mbbVar.d = i;
        mbbVar.e = mbaVar.e;
        mbbVar.a = i6 | 8;
        mbb mbbVar2 = (mbb) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mbbVar2.getClass();
        mbcVar3.e = mbbVar2;
        mbcVar3.a |= 8;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
    }

    public final void l(cqp cqpVar, int i) {
        int a = this.b.a();
        String m2 = m(a);
        mba g = g(a);
        String str = this.i;
        hfl hflVar = this.j;
        this.l.q(cqpVar);
        crf crfVar = this.r;
        cqz a2 = cra.a();
        a2.b(cqpVar);
        a2.c(i);
        a2.a = this.a.l();
        a2.d(this.o);
        ctu ctuVar = this.a;
        Objects.requireNonNull(ctuVar);
        a2.f(new drf(ctuVar, 13));
        hiz a3 = crfVar.a(a2.a());
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new egn(this, cqpVar, a, str, m2, g, hflVar, 1));
        a3.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
    }
}
