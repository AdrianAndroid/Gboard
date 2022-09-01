package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmoticonExtension;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ebe  reason: default package */
/* loaded from: classes.dex */
public final class ebe implements IEmoticonExtension, htb, gzv {
    public static final hhl a;
    private static final llp e;
    public ibz b;
    public dbr c;
    public boolean d = true;
    private hho f;
    private boolean g;
    private boolean h;

    static {
        hhl hhlVar = cvb.c;
        a = hhlVar;
        e = llp.u(cvb.d, hhlVar, cvb.i, cvb.h);
    }

    public final int c() {
        return this.h ? R.xml.f210150_resource_name_obfuscated_res_0x7f17010a : this.g ? R.xml.f210140_resource_name_obfuscated_res_0x7f170109 : R.xml.f210130_resource_name_obfuscated_res_0x7f170108;
    }

    public final void d(Context context) {
        this.g = ((Boolean) cvb.d.c()).booleanValue();
        this.h = cuz.a.i(context);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("currentKeyboardType = ".concat(String.valueOf(String.valueOf(this.b))));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "EmoticonExtension";
    }

    @Override // defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        d(context);
        this.c = new dbr(this, context, c());
        edk edkVar = new edk(this, context, 1);
        this.f = edkVar;
        hhq.o(edkVar, e);
    }

    @Override // defpackage.ifw
    public final void gn() {
        hho hhoVar = this.f;
        if (hhoVar != null) {
            hhq.q(hhoVar);
            this.f = null;
        }
        this.c = null;
    }

    @Override // defpackage.htb
    public final boolean s(ibz ibzVar) {
        return this.d;
    }

    @Override // defpackage.htb
    public final void t(Context context, hsz hszVar, iav iavVar, ibz ibzVar, String str, jls jlsVar, hta htaVar) {
        dbr dbrVar = this.c;
        if (dbrVar == null) {
            htaVar.a(ibzVar, null, null);
            return;
        }
        this.d = true;
        dbrVar.a(context, hszVar, iavVar, ibzVar, str, jlsVar, new csj(this, htaVar, 3));
    }

    @Override // defpackage.htb
    public final /* synthetic */ void u(Context context, ibz ibzVar, String str, jls jlsVar) {
    }
}
