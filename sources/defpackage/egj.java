package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IBitmojiExtension;
import com.google.android.apps.inputmethod.libs.search.widget.VariableHeightSoftKeyboardView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.Collection$EL;
import j$.util.stream.Stream;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: egj  reason: default package */
/* loaded from: classes.dex */
public final class egj implements ctv {
    private static final ltg e = ltg.j("com/google/android/apps/inputmethod/libs/search/sticker/BitmojiKeyboardPeerTablet");
    public final Context a;
    public final hsz b;
    public final egp c;
    public final idk d;
    private final ctu f;
    private final cvx g;
    private final VariableHeightSoftKeyboardView h;
    private final dyz i;
    private final ino j;
    private final ino k;
    private final cwc l;
    private String m = "";
    private hiz n;
    private hiz o;
    private hiz p;

    public egj(Context context, ctu ctuVar, cvx cvxVar, cwc cwcVar, hsz hszVar, SoftKeyboardView softKeyboardView, egp egpVar, dyz dyzVar, idk idkVar, ino inoVar, ino inoVar2) {
        this.a = context;
        this.f = ctuVar;
        this.g = cvxVar;
        this.l = cwcVar;
        this.b = hszVar;
        this.h = (VariableHeightSoftKeyboardView) softKeyboardView;
        this.c = egpVar;
        this.i = dyzVar;
        this.d = idkVar;
        this.j = inoVar;
        this.k = inoVar2;
        ctp.a(softKeyboardView, R.string.f152710_resource_name_obfuscated_res_0x7f14029a);
    }

    public static cng b(Runnable runnable) {
        cnf a = cng.a();
        a.c(false);
        a.e(1);
        a.h(R.layout.f134250_resource_name_obfuscated_res_0x7f0e008a);
        a.g(R.drawable.f49160_resource_name_obfuscated_res_0x7f08029c);
        a.d(R.string.f152920_resource_name_obfuscated_res_0x7f1402af);
        a.f(R.string.f166930_resource_name_obfuscated_res_0x7f14090e);
        a.a = runnable;
        return a.a();
    }

    private static hiz k(hiz hizVar, hiz hizVar2) {
        return hiz.L(hizVar, hizVar2).d(new brs(hizVar, hizVar2, 15), mjl.a).i();
    }

    private final void l(llp llpVar) {
        efx i;
        egp egpVar = this.c;
        String str = this.m;
        if (!TextUtils.isEmpty(str)) {
            i = efq.i(str);
        } else {
            i = efq.i("");
        }
        llp llpVar2 = (llp) Stream.CC.concat(Stream.CC.concat(Stream.CC.of(i), Stream.CC.of(efc.a)), Collection$EL.stream(llpVar)).collect(ljr.a);
        egpVar.p = 3;
        egpVar.g = llpVar2;
        cxc e2 = egpVar.f(2).e();
        egpVar.h = llp.q();
        egpVar.i = cni.a;
        egpVar.n.G(llpVar2);
        if (TextUtils.isEmpty(egpVar.j) && egpVar.l == -1) {
            egpVar.l = 2;
            egpVar.n.D(2, true);
        }
        egpVar.c.d();
        egpVar.b.B(2, false, 2);
        egpVar.k(e2.b, 2, 2, egpVar.g(2));
        egpVar.e.g(R.string.f153130_resource_name_obfuscated_res_0x7f1402c4, !TextUtils.isEmpty(e2.e) ? e2.e : e2.h);
        int size = llpVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (((efx) llpVar.get(i3)).b() == 2) {
                i2++;
            }
        }
        this.d.e(ctd.BITMOJI_CONTEXTUAL_PACKS_SHOWN, Integer.valueOf(i2));
        if (i2 > 0) {
            idk idkVar = this.d;
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
            mbtVar.b = i2;
            mbt mbtVar2 = (mbt) t2.b;
            mbtVar2.c = 12;
            mbtVar2.a |= 2;
            t.dM(t2);
            objArr[0] = t.cz();
            idkVar.e(ctdVar, objArr);
        }
        idk idkVar2 = this.d;
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
        mbcVar4.a = 2 | mbcVar4.a;
        objArr2[0] = t3.cz();
        idkVar2.e(ctdVar2, objArr2);
    }

    private final void m(cvv cvvVar) {
        cng b;
        egp egpVar = this.c;
        if (cvvVar == cvv.UNKNOWN || cvvVar == cvv.READY) {
            b = b(new ega(this, 5));
        } else {
            b = a(this.a, cvvVar);
        }
        egpVar.j(b);
    }

    public final cng a(Context context, cvv cvvVar) {
        boolean z = true;
        dau.i(cvvVar != cvv.READY, "Attempting to fetch error card for READY status");
        ega egaVar = new ega(context, 6);
        egi egiVar = egi.NONE;
        int ordinal = cvvVar.ordinal();
        int i = R.string.f148400_resource_name_obfuscated_res_0x7f140099;
        switch (ordinal) {
            case 3:
                egaVar = new ega(context, 9);
                break;
            case 4:
                egaVar = new ega(context, 7);
                this.k.i("pref_key_install_bitmoji_card_impressions", this.k.I("pref_key_install_bitmoji_card_impressions") + 1);
                i = R.string.f148330_resource_name_obfuscated_res_0x7f140092;
                break;
            case 5:
                egaVar = new ega(context, 8);
                i = R.string.f148410_resource_name_obfuscated_res_0x7f14009a;
                break;
        }
        cnf a = cng.a();
        a.c(false);
        a.e(1);
        if (!cuz.a.j(context, cvb.c) || jam.r(context)) {
            z = false;
        }
        int ordinal2 = cvvVar.ordinal();
        a.h((ordinal2 == 4 || ordinal2 == 5) ? z ? R.layout.f134260_resource_name_obfuscated_res_0x7f0e008b : R.layout.f134270_resource_name_obfuscated_res_0x7f0e008c : z ? R.layout.f134290_resource_name_obfuscated_res_0x7f0e008e : R.layout.f134300_resource_name_obfuscated_res_0x7f0e008f);
        a.f(0);
        a.d(i);
        a.a = egaVar;
        return a.a();
    }

    @Override // defpackage.ctt, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null || f.c != -10004) {
            return false;
        }
        this.b.z(cnx.d(this.a, f, dip.j(this.m, hfl.EXTERNAL)));
        return true;
    }

    @Override // defpackage.ctt, java.lang.AutoCloseable
    public final void close() {
        hji.h(this.o);
        this.o = null;
        hji.h(this.p);
        this.p = null;
        hji.h(this.n);
        this.n = null;
    }

    @Override // defpackage.ctv
    public final void d(String str) {
        this.m = str;
        this.c.j = str;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    public final void e(String str) {
        hji.h(this.n);
        this.c.i();
        cvx cvxVar = this.g;
        hiz b = cvxVar.b();
        hiz i = hjg.b(cvxVar.e(str)).i();
        hiz d = hiz.L(b, i).d(new brs(b, i, 16), mjl.a);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e2 = llp.e();
        llk e3 = llp.e();
        llk e4 = llp.e();
        ctu ctuVar = this.f;
        e2.h(new bqx(this, str, 16));
        e3.h(new bqx(this, str, 17));
        d.E(hjg.a(gyc.b, ctuVar, afpVar, z, e2, e3, e4));
        this.n = d;
    }

    public final void f(AtomicReference atomicReference, hiz hizVar, hiz hizVar2, hiz hizVar3) {
        egi egiVar;
        boolean isDone = hizVar.isDone();
        cvv cvvVar = (cvv) hizVar.A(cvv.UNKNOWN);
        if (!isDone || cvvVar == cvv.READY || (egiVar = (egi) atomicReference.getAndSet(egi.ERROR)) == egi.ERROR) {
            boolean isDone2 = hizVar2.isDone();
            boolean isDone3 = hizVar3.isDone();
            if (!isDone2 && !isDone3) {
                return;
            }
            llp llpVar = (llp) hizVar2.A(llp.q());
            llp llpVar2 = (llp) hizVar3.A(llp.q());
            egi egiVar2 = egi.NONE;
            if (((egi) atomicReference.get()).ordinal() != 0) {
                return;
            }
            if (!llpVar.isEmpty()) {
                atomicReference.set(egi.FRESH_PACKS);
                l(llpVar);
                return;
            } else if (!llpVar2.isEmpty()) {
                atomicReference.set(egi.CACHED_PACKS);
                l(llpVar2);
                return;
            } else if (!isDone2 || !isDone3 || !isDone) {
                return;
            } else {
                atomicReference.set(egi.ERROR);
                m(cvvVar);
                ((ltd) ((ltd) e.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/BitmojiKeyboardPeerTablet", "updateBrowsingState", 338, "BitmojiKeyboardPeerTablet.java")).t("Browse NONE -> ERROR with ready status");
                return;
            }
        }
        m(cvvVar);
        ((ltd) ((ltd) e.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/BitmojiKeyboardPeerTablet", "updateBrowsingState", 309, "BitmojiKeyboardPeerTablet.java")).G("Browse %s -> ERROR with status %s", egiVar, cvvVar);
    }

    public final void g() {
        hji.h(this.o);
        hji.h(this.p);
        this.c.i();
        Locale e2 = hqp.e();
        hiz b = this.g.b();
        hiz c = this.g.c(e2);
        hiz d = this.g.d(e2);
        hiz a = this.l.a();
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e3 = llp.e();
        llk e4 = llp.e();
        llk e5 = llp.e();
        ctu ctuVar = this.f;
        e3.h(new ehz(this, 1));
        a.E(hjg.a(mjl.a, ctuVar, afpVar, z, e3, e4, e5));
        hiz k = k(c, a);
        hiz k2 = k(d, a);
        AtomicReference atomicReference = new AtomicReference(egi.NONE);
        afp afpVar2 = afp.STARTED;
        boolean z2 = jam.b;
        llk e6 = llp.e();
        llk e7 = llp.e();
        llk e8 = llp.e();
        ctu ctuVar2 = this.f;
        e6.h(new egb(this, atomicReference, b, k, k2, 2));
        e7.h(new egb(this, atomicReference, b, k, k2, 3));
        hix a2 = hjg.a(gyc.b, ctuVar2, afpVar2, z2, e6, e7, e8);
        hiz t = b.t();
        t.E(a2);
        this.p = t;
        hiz t2 = k.t();
        t2.E(a2);
        hiz t3 = k2.t();
        t3.E(a2);
        this.o = hiz.L(t2, t3).f();
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ctt
    public final void h(EditorInfo editorInfo, Object obj) {
        this.i.a(this.h, R.id.key_pos_non_prime_category_2);
        this.j.j("PREF_LAST_ACTIVE_TAB", IBitmojiExtension.class.getName());
        String l = dip.l(obj);
        d(l);
        hfl g = dip.g(obj, hfl.EXTERNAL);
        egp egpVar = this.c;
        egpVar.k = g;
        egpVar.b.z(egpVar);
        egpVar.b.k(egpVar.c);
        egpVar.m.ab(egpVar.o);
        egpVar.m.aa(egpVar.n);
        if (TextUtils.isEmpty(l)) {
            g();
        } else {
            g();
            e(l);
        }
        if (g != hfl.INTERNAL) {
            idk idkVar = this.d;
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
            int i = true != TextUtils.isEmpty(l) ? 3 : 2;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = i - 1;
            mbcVar2.a |= 2;
            int a = cte.a(g);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            mbcVar3.d = a - 1;
            int i2 = mbcVar3.a | 4;
            mbcVar3.a = i2;
            l.getClass();
            mbcVar3.a = i2 | 1024;
            mbcVar3.j = l;
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
        hji.h(this.n);
        this.n = null;
        egp egpVar = this.c;
        egpVar.b.f();
        egpVar.b.k(null);
        int i = egpVar.l;
        if (i != -1) {
            egpVar.n.D(i, false);
        }
        egpVar.l = -1;
        egpVar.m.ab(null);
        egpVar.m.aa(null);
        this.h.clearAnimation();
        this.h.h();
    }

    public final void j(int i) {
        idk idkVar = this.d;
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
        if (this.f.fq()) {
            return;
        }
        hji.h(this.o);
        this.o = null;
        hji.h(this.p);
        this.p = null;
        hji.h(this.n);
        this.n = null;
    }
}
