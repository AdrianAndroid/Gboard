package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eph  reason: default package */
/* loaded from: classes.dex */
public final class eph implements epg, htb, gzv {
    public ibz a;
    private dbr b;

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("currentKeyboardType = ".concat(String.valueOf(String.valueOf(this.a))));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "TextEditingExtension";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.b = new dbr(this, context, R.xml.f210270_resource_name_obfuscated_res_0x7f170116);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.b = null;
    }

    @Override // defpackage.htb
    public final /* synthetic */ boolean s(ibz ibzVar) {
        return true;
    }

    @Override // defpackage.htb
    public final void t(Context context, hsz hszVar, iav iavVar, ibz ibzVar, String str, jls jlsVar, hta htaVar) {
        dbr dbrVar = this.b;
        if (dbrVar != null) {
            dbrVar.a(context, hszVar, iavVar, ibzVar, str, jlsVar, new csj(this, htaVar, 6));
        } else {
            htaVar.a(ibzVar, null, null);
        }
    }

    @Override // defpackage.htb
    public final /* synthetic */ void u(Context context, ibz ibzVar, String str, jls jlsVar) {
    }
}
