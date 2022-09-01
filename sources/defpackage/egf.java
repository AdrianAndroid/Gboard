package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IBitmojiExtension;
import com.google.android.apps.inputmethod.libs.search.widget.VariableHeightSoftKeyboardView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: egf  reason: default package */
/* loaded from: classes.dex */
public final class egf implements ctv {
    public final Context c;
    public final hsz d;
    public final cou e;
    public final egm f;
    public final idk g;
    public String h = "";
    public llp i = llp.q();
    public boe j;
    private final ctu m;
    private final cvx n;
    private final SoftKeyboardView o;
    private final VariableHeightSoftKeyboardView p;
    private final dyz q;
    private final ino r;
    private final ino s;
    private final cwc t;
    private hiz u;
    private hiz v;
    private hiz w;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/sticker/BitmojiKeyboardPeer");
    private static final hhl k = hhq.a("enable_bitmoji_contextual_category_icon", false);
    private static final hhl l = hhq.a("remove_bitmoji_contextual_category_text", false);
    public static final Class b = IBitmojiExtension.class;

    public egf(Context context, ctu ctuVar, cvx cvxVar, cwc cwcVar, hsz hszVar, SoftKeyboardView softKeyboardView, SoftKeyboardView softKeyboardView2, cou couVar, egm egmVar, dyz dyzVar, idk idkVar, ino inoVar, ino inoVar2) {
        this.c = context;
        this.m = ctuVar;
        this.n = cvxVar;
        this.t = cwcVar;
        this.d = hszVar;
        this.o = softKeyboardView;
        this.p = (VariableHeightSoftKeyboardView) softKeyboardView2;
        this.e = couVar;
        this.f = egmVar;
        this.q = dyzVar;
        this.g = idkVar;
        this.r = inoVar;
        this.s = inoVar2;
        if (((Boolean) iho.a(context).c()).booleanValue()) {
            this.j = new boe(context, softKeyboardView, 3);
            boe.i(softKeyboardView, R.string.f148320_resource_name_obfuscated_res_0x7f140091);
        }
    }

    public static cng b(Runnable runnable) {
        cnf a2 = cng.a();
        a2.c(false);
        a2.e(1);
        a2.h(R.layout.f134250_resource_name_obfuscated_res_0x7f0e008a);
        a2.g(R.drawable.f49160_resource_name_obfuscated_res_0x7f08029c);
        a2.d(R.string.f152920_resource_name_obfuscated_res_0x7f1402af);
        a2.f(R.string.f166930_resource_name_obfuscated_res_0x7f14090e);
        a2.a = runnable;
        return a2.a();
    }

    private static int l(efx efxVar) {
        if (!((Boolean) k.c()).booleanValue() || efxVar.b() != 2) {
            return 0;
        }
        return R.drawable.f51020_resource_name_obfuscated_res_0x7f08039e;
    }

    private final cov m(Context context, llp llpVar) {
        emv a2;
        coq t;
        boe boeVar = this.j;
        if (llpVar.isEmpty()) {
            return cov.a().h();
        }
        cog.c();
        if (((Boolean) efy.o.c()).booleanValue()) {
            a2 = cog.h(R.string.f152720_resource_name_obfuscated_res_0x7f14029b, boeVar != null ? R.string.f163280_resource_name_obfuscated_res_0x7f14077e : R.string.f148360_resource_name_obfuscated_res_0x7f140095);
        } else {
            a2 = cov.a();
            a2.d = cog.b(R.string.f152720_resource_name_obfuscated_res_0x7f14029b);
        }
        Resources resources = context.getResources();
        String string = resources.getString(R.string.f153220_resource_name_obfuscated_res_0x7f1402ce);
        osr a3 = coq.a();
        a3.u(col.IMAGE_RESOURCE);
        czp a4 = com.a();
        a4.i(R.drawable.f49970_resource_name_obfuscated_res_0x7f08031f);
        a4.c = 1;
        a4.g(resources.getString(R.string.f153000_resource_name_obfuscated_res_0x7f1402b7, string));
        a3.c = a4.f();
        a3.e = cok.b("RECENTS");
        a2.i(a3.t());
        for (int i = 0; i < llpVar.size(); i++) {
            efx efxVar = (efx) llpVar.get(i);
            cxc e = efxVar.e();
            if (efxVar.b() != 2 || !((Boolean) l.c()).booleanValue()) {
                osr a5 = coq.a();
                a5.u(col.TEXT);
                con a6 = coo.a();
                a6.d(e.h);
                a6.b(resources.getString(R.string.f153000_resource_name_obfuscated_res_0x7f1402b7, e.h));
                a6.c(l(efxVar));
                a5.b = a6.a();
                a5.e = cok.b(e.b);
                t = a5.t();
            } else {
                osr a7 = coq.a();
                a7.u(col.IMAGE_RESOURCE);
                czp a8 = com.a();
                a8.i(l(efxVar));
                a8.c = 1;
                a8.g(resources.getString(R.string.f153000_resource_name_obfuscated_res_0x7f1402b7, e.h));
                a7.c = a8.f();
                a7.e = cok.b(e.b);
                t = a7.t();
            }
            a2.i(t);
        }
        a2.j(cox.b(1));
        return a2.h();
    }

    private static hiz o(hiz hizVar, hiz hizVar2) {
        return hiz.L(hizVar, hizVar2).d(new brs(hizVar, hizVar2, 13), mjl.a).i();
    }

    private final void p(cvv cvvVar) {
        cng b2;
        this.i = llp.q();
        this.e.k(m(this.c, llp.q()));
        egm egmVar = this.f;
        if (cvvVar == cvv.UNKNOWN || cvvVar == cvv.READY) {
            b2 = b(new ega(this, 4));
        } else {
            b2 = a(this.c, cvvVar);
        }
        egmVar.j(b2);
    }

    public final cng a(Context context, cvv cvvVar) {
        boolean z = true;
        dau.i(cvvVar != cvv.READY, "Attempting to fetch error card for READY status");
        ega egaVar = new ega(context, 1);
        ege egeVar = ege.NONE;
        int ordinal = cvvVar.ordinal();
        int i = R.string.f148400_resource_name_obfuscated_res_0x7f140099;
        switch (ordinal) {
            case 3:
                egaVar = new ega(context, 3);
                break;
            case 4:
                egaVar = new ega(context, 0);
                this.s.i("pref_key_install_bitmoji_card_impressions", this.s.I("pref_key_install_bitmoji_card_impressions") + 1);
                i = R.string.f148330_resource_name_obfuscated_res_0x7f140092;
                break;
            case 5:
                egaVar = new ega(context, 2);
                i = R.string.f148410_resource_name_obfuscated_res_0x7f14009a;
                break;
        }
        cnf a2 = cng.a();
        a2.c(false);
        a2.e(1);
        if (!cuz.a.j(context, cvb.c) || jam.r(context)) {
            z = false;
        }
        int ordinal2 = cvvVar.ordinal();
        a2.h((ordinal2 == 4 || ordinal2 == 5) ? z ? R.layout.f134260_resource_name_obfuscated_res_0x7f0e008b : R.layout.f134270_resource_name_obfuscated_res_0x7f0e008c : z ? R.layout.f134290_resource_name_obfuscated_res_0x7f0e008e : R.layout.f134300_resource_name_obfuscated_res_0x7f0e008f);
        a2.f(0);
        a2.d(i);
        a2.a = egaVar;
        return a2.a();
    }

    @Override // defpackage.ctt, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null || f.c != -10004) {
            return false;
        }
        this.d.z(cnx.d(this.c, f, dip.j(this.h, hfl.EXTERNAL)));
        return true;
    }

    @Override // defpackage.ctt, java.lang.AutoCloseable
    public final void close() {
        hji.h(this.v);
        this.v = null;
        hji.h(this.w);
        this.w = null;
        hji.h(this.u);
        this.u = null;
        this.i = llp.q();
        this.j = null;
    }

    @Override // defpackage.ctv
    public final void d(String str) {
        this.h = str;
        this.f.i = str;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    public final void e(String str) {
        hji.h(this.u);
        this.f.i();
        cvx cvxVar = this.n;
        hiz b2 = cvxVar.b();
        hiz i = hjg.b(cvxVar.e(str)).i();
        hiz d = hiz.L(b2, i).d(new brs(b2, i, 14), mjl.a);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        ctu ctuVar = this.m;
        e.h(new bqx(this, str, 14));
        e2.h(new bqx(this, str, 15));
        d.E(hjg.a(gyc.b, ctuVar, afpVar, z, e, e2, e3));
        this.u = d;
    }

    public final void f(llp llpVar) {
        this.i = llpVar;
        this.e.k(m(this.c, llpVar));
        egm egmVar = this.f;
        egmVar.k = 3;
        egmVar.f = llpVar;
        cxc e = egmVar.f(1).e();
        egmVar.g = llp.q();
        egmVar.h = cni.a;
        egmVar.c.d();
        egmVar.b.B(1, false, 2);
        egmVar.k(e.b, 1, 2, egmVar.g(1));
        egmVar.e.g(R.string.f153130_resource_name_obfuscated_res_0x7f1402c4, !TextUtils.isEmpty(e.e) ? e.e : e.h);
        int size = llpVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((efx) llpVar.get(i2)).b() == 2) {
                i++;
            }
        }
        this.g.e(ctd.BITMOJI_CONTEXTUAL_PACKS_SHOWN, Integer.valueOf(i));
        if (i > 0) {
            idk idkVar = this.g;
            ctd ctdVar = ctd.IMPRESSION;
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
            nfh t2 = mbt.e.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbt mbtVar = (mbt) t2.b;
            mbtVar.a |= 1;
            mbtVar.b = i;
            mbt mbtVar2 = (mbt) t2.b;
            mbtVar2.c = 12;
            mbtVar2.a |= 2;
            t.dM(t2);
            objArr[0] = t.cz();
            idkVar.e(ctdVar, objArr);
        }
        idk idkVar2 = this.g;
        ctd ctdVar2 = ctd.IMPRESSION;
        Object[] objArr2 = new Object[1];
        nfh t3 = mbc.p.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbc mbcVar3 = (mbc) t3.b;
        mbcVar3.b = 4;
        mbcVar3.a |= 1;
        mbc mbcVar4 = (mbc) t3.b;
        mbcVar4.c = 1;
        mbcVar4.a |= 2;
        objArr2[0] = t3.cz();
        idkVar2.e(ctdVar2, objArr2);
    }

    public final void g(AtomicReference atomicReference, hiz hizVar, hiz hizVar2, hiz hizVar3) {
        ege egeVar;
        boolean isDone = hizVar.isDone();
        cvv cvvVar = (cvv) hizVar.A(cvv.UNKNOWN);
        if (!isDone || cvvVar == cvv.READY || (egeVar = (ege) atomicReference.getAndSet(ege.ERROR)) == ege.ERROR) {
            boolean isDone2 = hizVar2.isDone();
            boolean isDone3 = hizVar3.isDone();
            if (!isDone2 && !isDone3) {
                return;
            }
            llp llpVar = (llp) hizVar2.A(llp.q());
            llp llpVar2 = (llp) hizVar3.A(llp.q());
            ege egeVar2 = ege.NONE;
            if (((ege) atomicReference.get()).ordinal() != 0) {
                return;
            }
            if (!llpVar.isEmpty()) {
                atomicReference.set(ege.FRESH_PACKS);
                f(llpVar);
                return;
            } else if (!llpVar2.isEmpty()) {
                atomicReference.set(ege.CACHED_PACKS);
                f(llpVar2);
                return;
            } else if (!isDone2 || !isDone3 || !isDone) {
                return;
            } else {
                atomicReference.set(ege.ERROR);
                p(cvvVar);
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/BitmojiKeyboardPeer", "updateBrowsingState", 391, "BitmojiKeyboardPeer.java")).t("Browse NONE -> ERROR with ready status");
                return;
            }
        }
        p(cvvVar);
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/BitmojiKeyboardPeer", "updateBrowsingState", 362, "BitmojiKeyboardPeer.java")).G("Browse %s -> ERROR with status %s", egeVar, cvvVar);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ctt
    public final void h(EditorInfo editorInfo, Object obj) {
        this.q.a(this.p, R.id.key_pos_non_prime_category_2);
        this.r.j("PREF_LAST_ACTIVE_TAB", b.getName());
        if (dip.m(obj)) {
            this.p.b(this.o);
        }
        String l2 = dip.l(obj);
        d(l2);
        hfl g = dip.g(obj, hfl.EXTERNAL);
        egm egmVar = this.f;
        egmVar.j = g;
        egmVar.b.z(egmVar);
        egmVar.b.k(egmVar.c);
        int i = 3;
        if (TextUtils.isEmpty(l2)) {
            cou couVar = this.e;
            cpc a2 = cpd.a();
            a2.b = 3;
            couVar.g(a2.a());
            j();
        } else {
            cou couVar2 = this.e;
            cpc a3 = cpd.a();
            a3.b = 4;
            couVar2.g(a3.a());
            cou couVar3 = this.e;
            cog.c();
            couVar3.k(cog.i(l2, R.string.f152720_resource_name_obfuscated_res_0x7f14029b).h());
            e(l2);
        }
        this.e.a = new edx(this, 3);
        if (g != hfl.INTERNAL) {
            idk idkVar = this.g;
            ctd ctdVar = ctd.TAB_OPEN;
            Object[] objArr = new Object[1];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 4;
            mbcVar.a |= 1;
            if (true == TextUtils.isEmpty(l2)) {
                i = 2;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = i - 1;
            mbcVar2.a |= 2;
            int a4 = cte.a(g);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            mbcVar3.d = a4 - 1;
            int i2 = mbcVar3.a | 4;
            mbcVar3.a = i2;
            l2.getClass();
            mbcVar3.a = i2 | 1024;
            mbcVar3.j = l2;
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

    @Override // defpackage.ctt
    public final void i() {
        hji.h(this.u);
        this.u = null;
        cou couVar = this.e;
        couVar.a = null;
        couVar.h();
        egm egmVar = this.f;
        egmVar.b.f();
        egmVar.b.k(null);
        this.p.clearAnimation();
        this.p.h();
        boe boeVar = this.j;
        if (boeVar != null) {
            boeVar.j();
        }
    }

    public final void j() {
        hji.h(this.v);
        hji.h(this.w);
        this.e.k(m(this.c, llp.q()));
        this.f.i();
        Locale e = hqp.e();
        hiz b2 = this.n.b();
        hiz c = this.n.c(e);
        hiz d = this.n.d(e);
        hiz a2 = this.t.a();
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e2 = llp.e();
        llk e3 = llp.e();
        llk e4 = llp.e();
        ctu ctuVar = this.m;
        e2.h(new dys(this, 20));
        a2.E(hjg.a(mjl.a, ctuVar, afpVar, z, e2, e3, e4));
        hiz o = o(c, a2);
        hiz o2 = o(d, a2);
        AtomicReference atomicReference = new AtomicReference(ege.NONE);
        afp afpVar2 = afp.STARTED;
        boolean z2 = jam.b;
        llk e5 = llp.e();
        llk e6 = llp.e();
        llk e7 = llp.e();
        ctu ctuVar2 = this.m;
        e5.h(new egb(this, atomicReference, b2, o, o2, 1));
        e6.h(new egb(this, atomicReference, b2, o, o2, 0));
        hix a3 = hjg.a(gyc.b, ctuVar2, afpVar2, z2, e5, e6, e7);
        hiz t = b2.t();
        t.E(a3);
        this.w = t;
        hiz t2 = o.t();
        t2.E(a3);
        hiz t3 = o2.t();
        t3.E(a3);
        this.v = hiz.L(t2, t3).f();
    }

    public final void k(int i) {
        idk idkVar = this.g;
        ctd ctdVar = ctd.CLICK;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 4;
        int i2 = mbcVar.a | 1;
        mbcVar.a = i2;
        mbcVar.c = i - 1;
        mbcVar.a = i2 | 2;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.g = 1;
        mbcVar2.a |= 64;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
    }

    @Override // defpackage.ctt
    public final void n() {
        if (this.m.fq()) {
            return;
        }
        hji.h(this.v);
        this.v = null;
        hji.h(this.w);
        this.w = null;
        hji.h(this.u);
        this.u = null;
        this.i = llp.q();
    }
}
