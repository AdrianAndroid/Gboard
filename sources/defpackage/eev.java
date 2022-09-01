package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.apps.inputmethod.libs.expression.extension.RichSymbolExtension;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eev  reason: default package */
/* loaded from: classes.dex */
public final class eev implements RichSymbolExtension, htb, gzv {
    public static final hhl a;
    private static final llp e;
    public ibz b;
    public dbr c;
    public boolean d = true;
    private hho f;

    static {
        hhl hhlVar = cvb.c;
        a = hhlVar;
        e = llp.r(hhlVar);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("currentKeyboardType = ".concat(String.valueOf(String.valueOf(this.b))));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "RichSymbolExtensionImpl";
    }

    @Override // defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        this.c = new dbr(this, context, R.xml.f210220_resource_name_obfuscated_res_0x7f170111);
        edk edkVar = new edk(this, context, 2);
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
        dbrVar.a(context, hszVar, iavVar, ibzVar, str, jlsVar, new csj(this, htaVar, 5));
    }

    @Override // defpackage.htb
    public final /* synthetic */ void u(Context context, ibz ibzVar, String str, jls jlsVar) {
    }
}
