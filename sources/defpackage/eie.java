package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Printer;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension;
import com.google.android.apps.inputmethod.libs.search.widget.VariableHeightSoftKeyboardView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: eie  reason: default package */
/* loaded from: classes.dex */
public final class eie implements ctv {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/sticker/StickerRevampKeyboardPeer");
    public static final Runnable b = bsd.c;
    private static final String k = IStickerExtension.class.getName();
    public final Context c;
    public final hsz d;
    public final cws e;
    public final cxm f;
    public final ehp g;
    public final ehg h;
    public final dpe j;
    private final ctu l;
    private final SoftKeyboardView m;
    private final VariableHeightSoftKeyboardView n;
    private final ehi o;
    private final dyz p;
    private final ino q;
    private final cwx r;
    private final idk s;
    private mko u;
    private mko v;
    private final ifz w;
    private String t = "";
    public dba i = dba.a;

    public eie(Context context, ctu ctuVar, SoftKeyboardView softKeyboardView, SoftKeyboardView softKeyboardView2, dyz dyzVar, ino inoVar, hsz hszVar, cwx cwxVar, ifz ifzVar, cws cwsVar, dpe dpeVar, cxm cxmVar, ehi ehiVar, ehp ehpVar, idk idkVar, ehg ehgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = context;
        this.l = ctuVar;
        this.m = softKeyboardView;
        this.n = (VariableHeightSoftKeyboardView) softKeyboardView2;
        this.o = ehiVar;
        this.p = dyzVar;
        this.q = inoVar;
        this.d = hszVar;
        this.r = cwxVar;
        this.e = cwsVar;
        this.j = dpeVar;
        this.f = cxmVar;
        this.g = ehpVar;
        this.w = ifzVar;
        this.s = idkVar;
        this.h = ehgVar;
    }

    public static cng a(Runnable runnable) {
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

    public final void b() {
        hji.h(this.v);
        this.g.l();
        hiz i = hiz.k(this.r.k(1)).i();
        hiz b2 = this.w.b();
        hiz b3 = this.e.b(i.o(), this.j);
        hiz d = hiz.M(i, b2, b3).d(new eid(this, i, b2, b3, 0), gyc.b);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        ctu ctuVar = this.l;
        e.h(new ehz(this, 2));
        e2.h(new ehz(this, 3));
        d.E(hjg.a(gyc.b, ctuVar, afpVar, z, e, e2, e3));
        this.v = d;
    }

    @Override // defpackage.ctt, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null || f.c != -10004) {
            return false;
        }
        this.d.z(cnx.d(this.c, f, dip.j(this.t, hfl.EXTERNAL)));
        return true;
    }

    @Override // defpackage.ctt, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ctv
    public final void d(String str) {
        this.t = str;
        this.g.r = str;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    public final void e(String str) {
        hji.h(this.u);
        this.g.l();
        hja e = this.r.e(str);
        hiz i = hjg.b(e).i();
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e2 = llp.e();
        llk e3 = llp.e();
        llk e4 = llp.e();
        ctu ctuVar = this.l;
        e2.h(new bqx(this, e, 18));
        e3.h(new bqx(this, str, 19));
        i.E(hjg.a(gyc.b, ctuVar, afpVar, z, e2, e3, e4));
        this.u = i;
    }

    public final void f(String str) {
        if (TextUtils.isEmpty(str)) {
            ehi ehiVar = this.o;
            ehiVar.n(0);
            if (!ehiVar.e.b.equals(ehi.b)) {
                ehiVar.e.g(ehi.b);
                ehiVar.e.k(ehiVar.i());
            }
            ehiVar.g.B();
            ehiVar.k = -1;
            Runnable runnable = b;
            ehiVar.i = runnable;
            ehiVar.j = runnable;
            b();
            return;
        }
        ehi ehiVar2 = this.o;
        ega egaVar = new ega(this, 12);
        ehiVar2.n(1);
        ehiVar2.e.g(ehi.c);
        cou couVar = ehiVar2.e;
        cog.c();
        couVar.k(cog.i(str, ehiVar2.d()).h());
        View view = ehiVar2.h;
        if (view != null) {
            view.setOnClickListener(bwk.f);
        }
        ehiVar2.g.B();
        ehiVar2.k = -1;
        ehiVar2.i = b;
        ehiVar2.j = egaVar;
        e(str);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ctt
    public final void h(EditorInfo editorInfo, Object obj) {
        this.i = dip.e(obj);
        this.p.a(this.n, R.id.key_pos_non_prime_category_3);
        this.q.j("PREF_LAST_ACTIVE_TAB", k);
        if (dip.m(obj)) {
            this.n.b(this.m);
        }
        String l = dip.l(obj);
        d(l);
        hfl g = dip.g(obj, hfl.EXTERNAL);
        ehi ehiVar = this.o;
        ehiVar.e.a = new edx(ehiVar, 4);
        ehiVar.f.aa(ehiVar.g);
        ehiVar.e.j(false);
        ehp ehpVar = this.g;
        ehpVar.s = g;
        ehpVar.c.k(ehpVar.e);
        ehpVar.c.z(ehpVar);
        ehpVar.g.l.add(new dzk(ehpVar, 19));
        f(l);
        if (g != hfl.INTERNAL) {
            idk idkVar = this.s;
            ctd ctdVar = ctd.TAB_OPEN;
            Object[] objArr = new Object[1];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            int i = 3;
            mbcVar.b = 3;
            mbcVar.a |= 1;
            if (true == TextUtils.isEmpty(l)) {
                i = 2;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = i - 1;
            mbcVar2.a |= 2;
            int a2 = cte.a(g);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            mbcVar3.d = a2 - 1;
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
        this.i = dba.a;
        ehi ehiVar = this.o;
        ehiVar.e.j(false);
        ehiVar.f.aa(null);
        ehiVar.g.B();
        ehiVar.e.h();
        ehiVar.e.a = null;
        Runnable runnable = b;
        ehiVar.i = runnable;
        ehiVar.j = runnable;
        ehiVar.k = -1;
        boe boeVar = ehiVar.m;
        if (boeVar != null) {
            boeVar.j();
        }
        ehp ehpVar = this.g;
        ehpVar.j(eho.NONE);
        ehpVar.c.k(null);
        ehpVar.c.f();
        ehpVar.g.l.clear();
        ehpVar.n = cni.a;
        ehpVar.o = cxe.a;
        ehpVar.p = llp.q();
        ehpVar.i.a = null;
        ehpVar.q = -1;
        ehpVar.i();
        this.n.clearAnimation();
        this.n.h();
        hji.h(this.u);
        this.u = null;
        hji.h(this.v);
        this.v = null;
    }

    @Override // defpackage.ctt
    public final /* synthetic */ void n() {
    }
}
