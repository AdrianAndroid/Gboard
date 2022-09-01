package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ehs  reason: default package */
/* loaded from: classes.dex */
public final class ehs implements ifw {
    public gqt a;

    private static gqe c(String str) {
        gqe a = gqh.a();
        a.i(str);
        a.f(R.attr.f4440_resource_name_obfuscated_res_0x7f0400ec);
        a.g(R.string.f155100_resource_name_obfuscated_res_0x7f1403b2);
        a.d(R.string.f167110_resource_name_obfuscated_res_0x7f140927);
        return a;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        gqt gqtVar = this.a;
        if (gqtVar != null) {
            gqtVar.dump(printer, z);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "StickerAccessPointProviderModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        String string = context.getString(R.string.f153970_resource_name_obfuscated_res_0x7f140332);
        gqe c = c(string);
        c.k(-10129, context.getString(R.string.f155020_resource_name_obfuscated_res_0x7f1403a9));
        gqh a = c.a();
        gqe c2 = c(string);
        c2.k(-10060, null);
        c2.b("closeAction", true);
        c2.b("highlighted", true);
        this.a = new gqt(a, c2.a(), new ehr(context, 0));
    }

    @Override // defpackage.ifw
    public final void gn() {
        gqt gqtVar = this.a;
        if (gqtVar != null) {
            gqtVar.a();
            this.a = null;
        }
    }
}
