package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: edj  reason: default package */
/* loaded from: classes.dex */
public final class edj implements ifw {
    public gqt a;

    private static gqe c(String str) {
        gqe a = gqh.a();
        a.i(str);
        a.f(R.attr.f4400_resource_name_obfuscated_res_0x7f0400e8);
        a.g(R.string.f155090_resource_name_obfuscated_res_0x7f1403b1);
        a.d(R.string.f153280_resource_name_obfuscated_res_0x7f1402d4);
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
        return "GifAccessPointProviderModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        String string = context.getString(R.string.f153890_resource_name_obfuscated_res_0x7f14032a);
        gqe c = c(string);
        c.k(-10129, context.getString(R.string.f155000_resource_name_obfuscated_res_0x7f1403a7));
        gqh a = c.a();
        gqe c2 = c(string);
        c2.k(-10060, null);
        c2.b("closeAction", true);
        c2.b("highlighted", true);
        this.a = new gqt(a, c2.a(), new ehr(context, 1));
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
