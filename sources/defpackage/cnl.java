package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.expressionmoment.IExpressionMomentExtension;
import com.google.android.apps.inputmethod.libs.expression.keyboard.ExpressionKeyboard;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cnl  reason: default package */
/* loaded from: classes.dex */
public final class cnl extends dbn implements IExpressionMomentExtension, csi {
    private final ibz a;
    private cjo i;
    private final dsy j = new cnk(this);

    public cnl(Context context) {
        this.a = ibz.a(context.getString(R.string.f154980_resource_name_obfuscated_res_0x7f1403a5));
    }

    @Override // defpackage.dbn
    protected final int d() {
        return R.xml.f210160_resource_name_obfuscated_res_0x7f17010b;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [hga, java.lang.Object] */
    @Override // defpackage.csi
    public final ctt f(csh cshVar) {
        boe boeVar = new boe(z());
        oiy c = npd.c(csm.d(new cnj(cshVar, 2)));
        cnj cnjVar = new cnj(cshVar, 0);
        cnj cnjVar2 = new cnj(cshVar, 1);
        crg c2 = crg.c(cnjVar, cql.c(cnjVar2), crm.c(cnjVar2), cqr.c(cnjVar));
        SoftKeyboardView softKeyboardView = ((csk) c.a()).a;
        csg csgVar = (csg) cshVar;
        Context context = csgVar.b;
        nxp.W(context);
        csd.d(context);
        idk i = ciz.i();
        nxp.W(csgVar.d);
        return new cny(softKeyboardView, i, boeVar.a, c2);
    }

    @Override // defpackage.dbn
    public final ibz g() {
        return this.a;
    }

    @Override // defpackage.dbn, defpackage.gzv
    public final String getDumpableTag() {
        return "ExpressionMomentExtensionImpl";
    }

    @Override // defpackage.dbn, defpackage.hfx
    public final void h(ibz ibzVar) {
        if (ibzVar != this.a && R()) {
            z().y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public final boolean hv() {
        return true;
    }

    @Override // defpackage.dbn
    public final void hw(hsy hsyVar) {
        cnx.c(hsyVar, this);
    }

    @Override // defpackage.csi
    public final lmz l() {
        return lmz.r(csl.a);
    }

    @Override // defpackage.dbn
    public final void m(hfl hflVar) {
        cny cnyVar;
        super.m(hflVar);
        ExpressionKeyboard expressionKeyboard = (ExpressionKeyboard) this.e;
        cjo cjoVar = this.i;
        if (cjoVar == null || expressionKeyboard == null || (cnyVar = (cny) expressionKeyboard.m()) == null) {
            return;
        }
        cuj a = cnyVar.e.a();
        Context context = cnyVar.c.getContext();
        if (a == null) {
            chd chdVar = new chd(cnyVar, 3);
            dxs dxsVar = cnyVar.r;
            lls h = llw.h();
            gmi i = cnx.i();
            i.n(R.layout.f134450_resource_name_obfuscated_res_0x7f0e009e, cli.f);
            h.a(cnx.class, i.m());
            gmi i2 = cnx.i();
            i2.n(R.layout.f134440_resource_name_obfuscated_res_0x7f0e009d, new crj(context, chdVar, dxsVar, 1, (byte[]) null, (byte[]) null));
            h.a(cjo.class, i2.m());
            a = cnx.f(h, context, null, null);
            cnyVar.e.aa(a);
            cnyVar.e.ab(new LinearLayoutManager(0));
        }
        boolean e = cjoVar.e().e();
        dau.i(e, "alternativeCandidates is absent, cannot load multiple image candidates popup");
        if (!e) {
            return;
        }
        a.B();
        a.A(new cnx());
        a.J((Collection) cjoVar.e().a());
    }

    @Override // defpackage.dbn, defpackage.hfx
    public final synchronized boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        if (map != null) {
            this.i = (cjo) map.get("query");
        }
        this.j.d(mjl.a);
        super.n(hqtVar, editorInfo, z, map, hflVar);
        return true;
    }

    @Override // defpackage.dbn, defpackage.hfx
    public final boolean p() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public final synchronized void r() {
        this.j.e();
        super.r();
    }
}
