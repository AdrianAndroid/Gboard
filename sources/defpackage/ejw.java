package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ejw  reason: default package */
/* loaded from: classes.dex */
final class ejw implements ifw {
    public gqt a;

    private static gqe c(String str) {
        gqe a = gqh.a();
        a.i(str);
        a.f(R.attr.f4450_resource_name_obfuscated_res_0x7f0400ed);
        a.g(R.string.f155110_resource_name_obfuscated_res_0x7f1403b3);
        a.d(R.string.f182100_resource_name_obfuscated_res_0x7f140f24);
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
        return "UniversalMediaAccessPointProviderModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        String string = context.getString(R.string.f154010_resource_name_obfuscated_res_0x7f140336);
        gqe c = c(string);
        c.k(-10129, context.getString(R.string.f155040_resource_name_obfuscated_res_0x7f1403ac));
        gqh a = c.a();
        gqe c2 = c(string);
        c2.k(-10060, null);
        c2.b("closeAction", true);
        c2.b("highlighted", true);
        this.a = new gqt(a, c2.a(), new ehr(context, 2));
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
