package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.text.TextUtils;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.apps.inputmethod.libs.search.widget.VariableHeightSoftKeyboardView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: eij  reason: default package */
/* loaded from: classes.dex */
public final class eij implements ctv {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/sticker/StickerTabletKeyboardPeer");
    private static final String j = IStickerExtension.class.getName();
    public final Context b;
    public final hsz c;
    public final cws d;
    public final cxm e;
    public final eis f;
    public final ehg g;
    public final dpe i;
    private final ctu k;
    private final VariableHeightSoftKeyboardView l;
    private final dyz m;
    private final ino n;
    private final cwx o;
    private final idk p;
    private mko r;
    private mko s;
    private final ifz t;
    private String q = "";
    public dba h = dba.a;

    public eij(Context context, ctu ctuVar, SoftKeyboardView softKeyboardView, dyz dyzVar, ino inoVar, hsz hszVar, cwx cwxVar, ifz ifzVar, cws cwsVar, dpe dpeVar, cxm cxmVar, eis eisVar, idk idkVar, ehg ehgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = context;
        this.k = ctuVar;
        this.l = (VariableHeightSoftKeyboardView) softKeyboardView;
        this.m = dyzVar;
        this.n = inoVar;
        this.c = hszVar;
        this.o = cwxVar;
        this.d = cwsVar;
        this.i = dpeVar;
        this.e = cxmVar;
        this.f = eisVar;
        this.t = ifzVar;
        this.p = idkVar;
        this.g = ehgVar;
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

    public final void b(String str) {
        hji.h(this.s);
        this.f.p();
        hiz i = hiz.k(this.o.k(1)).i();
        hiz b = this.t.b();
        hiz b2 = this.d.b(i.o(), this.i);
        hiz d = hiz.M(i, b, b2).d(new eid(this, i, b, b2, 2), gyc.b);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        ctu ctuVar = this.k;
        e.h(new bqx(this, str, 20));
        e2.h(new eii(this, str, 1));
        d.E(hjg.a(gyc.b, ctuVar, afpVar, z, e, e2, e3));
        this.s = d;
    }

    @Override // defpackage.ctt, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null || f.c != -10004) {
            return false;
        }
        this.c.z(cnx.d(this.b, f, dip.j(this.q, hfl.EXTERNAL)));
        return true;
    }

    @Override // defpackage.ctt, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ctv
    public final void d(String str) {
        this.q = str;
        this.f.r = str;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    public final void e(String str) {
        hji.h(this.r);
        this.f.p();
        hja e = this.o.e(str);
        hiz i = hjg.b(e).i();
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e2 = llp.e();
        llk e3 = llp.e();
        llk e4 = llp.e();
        ctu ctuVar = this.k;
        e2.h(new eii(this, e, 0));
        e3.h(new eii(this, str, 2));
        i.E(hjg.a(gyc.b, ctuVar, afpVar, z, e2, e3, e4));
        this.r = i;
        b(str);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ctt
    public final void h(EditorInfo editorInfo, Object obj) {
        this.h = dip.e(obj);
        this.m.a(this.l, R.id.key_pos_non_prime_category_3);
        this.n.j("PREF_LAST_ACTIVE_TAB", j);
        String l = dip.l(obj);
        d(l);
        hfl g = dip.g(obj, hfl.EXTERNAL);
        eis eisVar = this.f;
        eisVar.s = g;
        eisVar.w = new ega(eisVar, 14);
        eisVar.v.ab(new GridLayoutManager(1, 1));
        BindingRecyclerView bindingRecyclerView = eisVar.v;
        Context context = eisVar.b;
        lls h = llw.h();
        Context context2 = eisVar.b;
        eim eimVar = new eim(eisVar, 1);
        cjq cjqVar = new cjq(context2, eimVar, 15);
        cjq cjqVar2 = new cjq(context2, eimVar, 16);
        gmi i = cnx.i();
        i.c = ehk.l;
        i.n(R.layout.f133630_resource_name_obfuscated_res_0x7f0e003b, cjqVar2);
        i.n(R.layout.f133620_resource_name_obfuscated_res_0x7f0e003a, cjqVar2);
        i.n(R.layout.f133650_resource_name_obfuscated_res_0x7f0e003d, cjqVar);
        i.n(R.layout.f133610_resource_name_obfuscated_res_0x7f0e0039, cjqVar2);
        h.a(ehj.class, i.m());
        bindingRecyclerView.aa(cnx.f(h, context, null, null));
        eisVar.c.k(eisVar.e);
        eisVar.c.z(eisVar);
        if (TextUtils.isEmpty(l)) {
            eis eisVar2 = this.f;
            cuj a2 = eisVar2.v.a();
            if (a2 != null) {
                a2.B();
            }
            eisVar2.p = -1;
            b(null);
        } else {
            eis eisVar3 = this.f;
            cuj a3 = eisVar3.v.a();
            if (a3 != null) {
                a3.B();
            }
            eisVar3.p = -1;
            e(l);
        }
        if (g != hfl.INTERNAL) {
            idk idkVar = this.p;
            ctd ctdVar = ctd.TAB_OPEN;
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
            if (true == TextUtils.isEmpty(l)) {
                i2 = 2;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = i2 - 1;
            mbcVar2.a |= 2;
            int a4 = cte.a(g);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            mbcVar3.d = a4 - 1;
            int i3 = mbcVar3.a | 4;
            mbcVar3.a = i3;
            l.getClass();
            mbcVar3.a = i3 | 1024;
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
        ctp.a(this.l, R.string.f153170_resource_name_obfuscated_res_0x7f1402c8);
    }

    @Override // defpackage.ctt
    public final void i() {
        this.h = dba.a;
        eis eisVar = this.f;
        eisVar.n(eir.NONE);
        eisVar.c.k(null);
        eisVar.c.f();
        eisVar.v.aa(null);
        eisVar.v.ab(null);
        eisVar.m = cni.a;
        eisVar.n = cxe.a;
        eisVar.o = llp.q();
        eisVar.h.a = null;
        eisVar.q = -1;
        eisVar.m();
        eisVar.w = ejj.a;
        this.l.clearAnimation();
        this.l.h();
        hji.h(this.r);
        this.r = null;
        hji.h(this.s);
        this.s = null;
    }

    @Override // defpackage.ctt
    public final /* synthetic */ void n() {
    }
}
