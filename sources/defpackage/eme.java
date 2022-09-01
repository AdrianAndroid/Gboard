package defpackage;

import android.app.Dialog;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* renamed from: eme  reason: default package */
/* loaded from: classes.dex */
public final class eme extends guh {
    public final /* synthetic */ emf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eme(emf emfVar) {
        super("SharingLinkReceiveDialog");
        this.a = emfVar;
    }

    @Override // defpackage.guh
    protected final void a(gub gubVar) {
        gubVar.n(false);
        gubVar.F(R.layout.f134810_resource_name_obfuscated_res_0x7f0e00c7);
        gubVar.C(R.string.f152860_resource_name_obfuscated_res_0x7f1402a9, new ees(this, 2));
        gubVar.B(R.string.f153030_resource_name_obfuscated_res_0x7f1402ba, gua.b);
    }

    @Override // defpackage.guh
    protected final void b(final Dialog dialog) {
        this.a.a.e(new gzl() { // from class: emd
            @Override // defpackage.gzl
            public final void a(List list, int i) {
                eme emeVar = eme.this;
                emeVar.a.b(dialog, list, i, true);
            }
        });
    }

    @Override // defpackage.guh
    protected final void d() {
        guh guhVar = this.a.c;
        if (guhVar != null) {
            guhVar.f();
            this.a.c = null;
        }
    }
}
