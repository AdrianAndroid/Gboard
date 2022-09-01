package defpackage;

import android.app.Dialog;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: iqc  reason: default package */
/* loaded from: classes.dex */
public final class iqc extends guh {
    public final /* synthetic */ kon a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqc(kon konVar, String str, byte[] bArr) {
        super("EnjoyGboard-settings");
        this.a = konVar;
    }

    @Override // defpackage.guh
    protected final void a(gub gubVar) {
        if (gul.a()) {
            gubVar.c(R.drawable.f50660_resource_name_obfuscated_res_0x7f08036b).D(R.string.f165450_resource_name_obfuscated_res_0x7f14086a);
        } else {
            gubVar.z(R.string.f165450_resource_name_obfuscated_res_0x7f14086a);
        }
        gubVar.v();
        gubVar.C(R.string.f165470_resource_name_obfuscated_res_0x7f14086c, new ees(this, 13));
        gubVar.m(true != gul.a() ? -2 : -3, R.string.f165460_resource_name_obfuscated_res_0x7f14086b, new ees(this, 14));
    }

    @Override // defpackage.guh
    protected final void b(Dialog dialog) {
        kon.c(dialog);
    }
}
