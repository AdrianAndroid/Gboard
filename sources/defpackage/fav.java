package defpackage;

import android.app.Dialog;
import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: fav  reason: default package */
/* loaded from: classes.dex */
public final class fav extends guh {
    public Dialog a;
    public final /* synthetic */ fax b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fav(fax faxVar) {
        super("IntroDialog");
        this.b = faxVar;
    }

    @Override // defpackage.guh
    protected final void a(gub gubVar) {
        Context r = gubVar.r();
        gubVar.n(false);
        gubVar.j();
        gubVar.F(R.layout.f147030_resource_name_obfuscated_res_0x7f0e060c);
        gubVar.B(R.string.f187890_resource_name_obfuscated_res_0x7f14118a, new ees(this, 7));
        gubVar.C(R.string.f187900_resource_name_obfuscated_res_0x7f14118b, new cdl(this, r, 4));
    }

    @Override // defpackage.guh
    protected final void b(Dialog dialog) {
        this.a = dialog;
    }
}
