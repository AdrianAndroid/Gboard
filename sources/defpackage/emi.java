package defpackage;

import android.app.Dialog;
import android.support.v7.widget.RecyclerView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: emi  reason: default package */
/* loaded from: classes.dex */
public final class emi extends guh {
    public Dialog a;
    public final /* synthetic */ emj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emi(emj emjVar) {
        super("SharingLinkSendDialog");
        this.b = emjVar;
    }

    @Override // defpackage.guh
    protected final void a(gub gubVar) {
        gubVar.n(false);
        gubVar.F(R.layout.f145100_resource_name_obfuscated_res_0x7f0e0528);
        gubVar.C(R.string.f153050_resource_name_obfuscated_res_0x7f1402bc, new ees(this, 3));
        gubVar.B(R.string.f153030_resource_name_obfuscated_res_0x7f1402ba, new ees(this, 4));
    }

    @Override // defpackage.guh
    protected final void b(Dialog dialog) {
        this.a = dialog;
        els.g((RecyclerView) dialog.findViewById(R.id.f55840_resource_name_obfuscated_res_0x7f0b0236), this.b.b);
    }

    @Override // defpackage.guh
    protected final void d() {
        guh guhVar = this.b.c;
        if (guhVar != null) {
            guhVar.f();
            this.b.c = null;
        }
    }
}
