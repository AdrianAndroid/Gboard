package defpackage;

import android.content.Context;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IGifKeyboardExtension;
import com.google.android.inputmethod.latin.R;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: edl  reason: default package */
/* loaded from: classes.dex */
public final class edl extends dyu implements IGifKeyboardExtension, htb {
    public dbr o;
    protected cya q;
    public boolean r;
    private ekn v;
    private hho y;
    public static final hhl l = hhq.f("limit_gif_search_query_suggestion", 2);
    public static final hhl m = hhq.a("enable_prioritize_recent_gifs", false);
    private static final llp s = llp.s(cvb.i, cvb.h);
    public static final ltg n = ltg.j("com/google/android/apps/inputmethod/libs/search/gif/GifExtensionImpl");
    private static final hhl t = hhq.a("enable_contextual_gif_search_query_suggestion", false);
    private static final hhl u = hhq.a("enable_contextual_gif_query_provider_for_query_suggestion", false);
    private llp w = null;
    private hiz x = hiz.n(llp.q());
    public boolean p = true;

    private final edj ak() {
        return (edj) igr.d(this.c).b(edj.class);
    }

    private final llp al() {
        if (this.w == null) {
            this.w = llp.p(y().getResources().getStringArray(R.array.f1470_resource_name_obfuscated_res_0x7f03002e));
        }
        return this.w;
    }

    private final void am() {
        hiz b;
        if (!((Boolean) t.c()).booleanValue()) {
            this.x.cancel(true);
            this.x = hiz.n(llp.q());
        } else if (this.x.C()) {
        } else {
            if (((Boolean) u.c()).booleanValue()) {
                b = efq.l();
            } else {
                b = clr.a().b();
            }
            this.x = b.u(dzr.s, mjl.a);
        }
    }

    @Override // defpackage.dbn
    protected final ids D() {
        return ctg.GIF_EXTENSION_SHOWN_TIME;
    }

    @Override // defpackage.dbn
    protected final String E() {
        return this.c.getString(R.string.f153890_resource_name_obfuscated_res_0x7f14032a);
    }

    @Override // defpackage.dbn
    protected final void L() {
        edj ak = ak();
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
            edj ak = ak();
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
        if (this.v == null) {
            this.v = new ekn(this.c, "gif_recent_queries_%s", hqp.e(), 3);
        }
        return this.v;
    }

    @Override // defpackage.dyu
    protected final mko Z(String str) {
        cya cyaVar = this.q;
        if (cyaVar == null) {
            return kcu.J(new IllegalStateException("tenor autocomplete manager is null"));
        }
        hfg f = cye.f();
        f.c(str);
        return cyaVar.b(f.a());
    }

    @Override // defpackage.dyu
    public final String ac() {
        return this.c.getString(R.string.f155000_resource_name_obfuscated_res_0x7f1403a7);
    }

    @Override // defpackage.dyu
    public final List af() {
        return ae(al());
    }

    @Override // defpackage.dyu
    public final List ag() {
        return ffb.j((List) this.x.A(llp.q()), ae(al()));
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
            nfh t2 = mbc.p.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbc mbcVar = (mbc) t2.b;
            mbcVar.b = 2;
            mbcVar.a = 1 | mbcVar.a;
            mbc mbcVar2 = (mbc) t2.b;
            mbcVar2.c = 2;
            int i = mbcVar2.a | 2;
            mbcVar2.a = i;
            str.getClass();
            mbcVar2.a = i | 1024;
            mbcVar2.j = str;
            objArr[0] = t2.cz();
            idkVar.e(ctdVar, objArr);
        }
        return super.c(hfdVar);
    }

    @Override // defpackage.dbn
    protected final int d() {
        return this.r ? R.xml.f210190_resource_name_obfuscated_res_0x7f17010e : R.xml.f210180_resource_name_obfuscated_res_0x7f17010d;
    }

    @Override // defpackage.dyu, defpackage.dbn, defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        super.dump(printer, z);
        printer.println("defaultCandidates = ".concat(String.valueOf(String.valueOf(this.w))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int f() {
        return this.r ? R.xml.f210210_resource_name_obfuscated_res_0x7f170110 : R.xml.f210200_resource_name_obfuscated_res_0x7f17010f;
    }

    @Override // defpackage.dbn, defpackage.gzv
    public final String getDumpableTag() {
        return "GifExtensionImpl";
    }

    @Override // defpackage.dyu, defpackage.dbn, defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        super.gm(context, iggVar);
        this.q = cya.a();
        this.r = cuz.a.i(context);
        this.o = new dbr(this, context, f());
        edk edkVar = new edk(this, context, 0);
        this.y = edkVar;
        hhq.o(edkVar, s);
        am();
    }

    @Override // defpackage.dbn, defpackage.ifw
    public final void gn() {
        hho hhoVar = this.y;
        if (hhoVar != null) {
            hhq.q(hhoVar);
        }
        this.x.cancel(true);
        this.y = null;
        gvt.a(this.q);
        super.gn();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public final boolean hv() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbk
    public final CharSequence l() {
        return y().getString(R.string.f153290_resource_name_obfuscated_res_0x7f1402d5);
    }

    @Override // defpackage.dyu, defpackage.dbk, defpackage.dbn, defpackage.hfx
    public final synchronized boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        am();
        super.n(hqtVar, editorInfo, z, map, hflVar);
        return true;
    }

    @Override // defpackage.dyu, defpackage.dbk, defpackage.dbn
    protected final synchronized void r() {
        super.r();
        this.v = null;
        this.w = null;
    }

    @Override // defpackage.htb
    public final boolean s(ibz ibzVar) {
        return this.p;
    }

    @Override // defpackage.htb
    public final /* synthetic */ void u(Context context, ibz ibzVar, String str, jls jlsVar) {
    }

    @Override // defpackage.htb
    public final void t(Context context, hsz hszVar, iav iavVar, ibz ibzVar, String str, jls jlsVar, hta htaVar) {
        dbr dbrVar = this.o;
        if (dbrVar == null) {
            htaVar.a(ibzVar, null, null);
            return;
        }
        this.p = true;
        dbrVar.a(context, hszVar, iavVar, ibzVar, str, jlsVar, new csj(this, htaVar, 4));
    }

    @Override // defpackage.dbn, defpackage.hgb
    public final ids U(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return ctg.EXT_GIF_DEACTIVATE;
            }
            if (i2 == 2) {
                return ctg.EXT_GIF_KB_ACTIVATE;
            }
            return idf.a;
        }
        return ctg.EXT_GIF_ACTIVATE;
    }
}
