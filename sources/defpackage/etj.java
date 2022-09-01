package defpackage;

import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: etj  reason: default package */
/* loaded from: classes.dex */
public final class etj extends guh {
    public final /* synthetic */ etl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etj(etl etlVar) {
        super("DeleteTheme");
        this.a = etlVar;
    }

    @Override // defpackage.guh
    protected final void a(gub gubVar) {
        int i;
        if (gul.a()) {
            gub c = gubVar.c(R.drawable.f50480_resource_name_obfuscated_res_0x7f080358);
            c.D(R.string.f176250_resource_name_obfuscated_res_0x7f140cc0);
            c.B(R.string.f156040_resource_name_obfuscated_res_0x7f140410, gub.c);
            i = R.string.f156450_resource_name_obfuscated_res_0x7f140439;
        } else {
            gubVar.z(R.string.f176250_resource_name_obfuscated_res_0x7f140cc0);
            gubVar.t(R.string.f155880_resource_name_obfuscated_res_0x7f140400, gub.c);
            i = R.string.f156060_resource_name_obfuscated_res_0x7f140412;
        }
        gubVar.C(i, new ees(this, 5));
        gubVar.v();
        gubVar.n(false);
    }
}
