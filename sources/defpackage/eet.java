package defpackage;

import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eet  reason: default package */
/* loaded from: classes.dex */
public final class eet extends guh {
    final /* synthetic */ hln a;
    public final /* synthetic */ SearchKeyboard b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eet(SearchKeyboard searchKeyboard, hln hlnVar) {
        super("DeleteSearchHistory");
        this.b = searchKeyboard;
        this.a = hlnVar;
    }

    @Override // defpackage.guh
    protected final void a(gub gubVar) {
        boolean a = gul.a();
        if (a) {
            gubVar.c(R.drawable.f50590_resource_name_obfuscated_res_0x7f080363);
        }
        gubVar.D(R.string.f150270_resource_name_obfuscated_res_0x7f140189);
        gubVar.C(true != a ? R.string.f150260_resource_name_obfuscated_res_0x7f140188 : R.string.f156450_resource_name_obfuscated_res_0x7f140439, new cdl(this, this.a, 3));
        gubVar.m(true != a ? -2 : -3, true != a ? R.string.f150250_resource_name_obfuscated_res_0x7f140187 : R.string.f156040_resource_name_obfuscated_res_0x7f140410, new ees(this, 0));
        gubVar.v();
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
