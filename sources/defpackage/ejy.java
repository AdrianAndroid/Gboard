package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.expression.extension.IUniversalMediaExtension;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* renamed from: ejy  reason: default package */
/* loaded from: classes.dex */
public final class ejy extends dyu implements IUniversalMediaExtension, htb {
    private static final llp o = llp.s(cvb.i, cvb.h);
    protected cya l;
    public dbr m;
    public boolean n = true;
    private ekn p;
    private llp q;
    private hho r;

    private final ejw ak() {
        return (ejw) igr.d(this.c).b(ejw.class);
    }

    @Override // defpackage.dbn
    protected final String E() {
        return this.c.getString(R.string.f154010_resource_name_obfuscated_res_0x7f140336);
    }

    @Override // defpackage.dbn
    protected final void L() {
        ejw ak = ak();
        if (ak == null) {
            J();
            return;
        }
        gqt gqtVar = ak.a;
        if (gqtVar == null) {
            return;
        }
        gqtVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public final void M() {
        super.M();
        if (!((Boolean) iho.a(this.c).c()).booleanValue()) {
            ejw ak = ak();
            if (ak == null) {
                Q();
                return;
            }
            gqt gqtVar = ak.a;
            if (gqtVar == null) {
                return;
            }
            gqtVar.c();
        }
    }

    @Override // defpackage.dyu
    public final ekn Y() {
        if (this.p == null) {
            this.p = new ekn(this.c, "universal_media_recent_queries_%s", hqp.e(), 3);
        }
        return this.p;
    }

    @Override // defpackage.dyu
    protected final mko Z(String str) {
        cya cyaVar = this.l;
        if (cyaVar == null) {
            return kcu.J(new IllegalStateException("tenor autocomplete manager is null"));
        }
        hfg f = cye.f();
        f.c(str);
        return cyaVar.b(f.a());
    }

    @Override // defpackage.dyu
    protected final CharSequence aa() {
        return y().getString(R.string.f182130_resource_name_obfuscated_res_0x7f140f27);
    }

    @Override // defpackage.dyu
    protected final String ac() {
        return this.c.getString(R.string.f155040_resource_name_obfuscated_res_0x7f1403ac);
    }

    @Override // defpackage.dyu
    public final List af() {
        return ag();
    }

    @Override // defpackage.dyu
    public final List ag() {
        if (this.q == null) {
            this.q = llp.p(y().getResources().getStringArray(R.array.f1470_resource_name_obfuscated_res_0x7f03002e));
        }
        return ae(this.q);
    }

    @Override // defpackage.dyu, defpackage.dbn, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        if (!this.h) {
            return false;
        }
        iay f = hfdVar.f();
        if (f != null && f.c == -30000) {
            String str = eeq.a(f).b;
            idk idkVar = this.g;
            ctd ctdVar = ctd.SEARCH_PERFORMED;
            Object[] objArr = new Object[1];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 8;
            mbcVar.a = 1 | mbcVar.a;
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = 2;
            mbcVar2.a = 2 | mbcVar2.a;
            String d = lfd.d(str);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            mbcVar3.a |= 1024;
            mbcVar3.j = d;
            objArr[0] = t.cz();
            idkVar.e(ctdVar, objArr);
        }
        return super.c(hfdVar);
    }

    @Override // defpackage.dbn
    protected final int d() {
        return R.xml.f210290_resource_name_obfuscated_res_0x7f170118;
    }

    public final int f() {
        return cuz.a.i(this.c) ? R.xml.f210310_resource_name_obfuscated_res_0x7f17011a : R.xml.f210300_resource_name_obfuscated_res_0x7f170119;
    }

    @Override // defpackage.dbn, defpackage.gzv
    public final String getDumpableTag() {
        return "UniversalMediaExtension";
    }

    @Override // defpackage.dyu, defpackage.dbn, defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        super.gm(context, iggVar);
        this.l = cya.a();
        this.m = new dbr(this, context, f());
        edk edkVar = new edk(this, context, 4);
        this.r = edkVar;
        hhq.o(edkVar, o);
    }

    @Override // defpackage.dbn, defpackage.ifw
    public final void gn() {
        this.m = null;
        gvt.a(this.l);
        super.gn();
        hho hhoVar = this.r;
        if (hhoVar != null) {
            hhq.q(hhoVar);
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public final boolean hv() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbk
    public final CharSequence l() {
        return y().getString(R.string.f182110_resource_name_obfuscated_res_0x7f140f25);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dyu, defpackage.dbk, defpackage.dbn
    public final synchronized void r() {
        super.r();
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.htb
    public final boolean s(ibz ibzVar) {
        return this.n;
    }

    @Override // defpackage.htb
    public final /* synthetic */ void u(Context context, ibz ibzVar, String str, jls jlsVar) {
    }

    @Override // defpackage.htb
    public final void t(Context context, hsz hszVar, iav iavVar, ibz ibzVar, String str, jls jlsVar, hta htaVar) {
        dbr dbrVar = this.m;
        if (dbrVar == null) {
            htaVar.a(ibzVar, null, null);
            return;
        }
        this.n = true;
        dbrVar.a(context, hszVar, iavVar, ibzVar, str, jlsVar, htaVar);
    }

    @Override // defpackage.dbn, defpackage.hgb
    public final ids U(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return ctg.EXT_UNIVERSAL_MEDIA_DEACTIVATE;
            }
            if (i2 == 2) {
                return ctg.EXT_UNIVERSAL_MEDIA_KB_ACTIVATE;
            }
            return idf.a;
        }
        return ctg.EXT_UNIVERSAL_MEDIA_ACTIVATE;
    }
}
