package defpackage;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Space;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: iqd  reason: default package */
/* loaded from: classes.dex */
public final class iqd extends guh {
    public final /* synthetic */ kon a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqd(kon konVar, String str, byte[] bArr) {
        super("RateGboard-settings");
        this.a = konVar;
    }

    @Override // defpackage.guh
    protected final void a(gub gubVar) {
        if (gul.a()) {
            gubVar.c(R.drawable.f50660_resource_name_obfuscated_res_0x7f08036b).D(R.string.f165480_resource_name_obfuscated_res_0x7f14086d);
        } else {
            gubVar.z(R.string.f165480_resource_name_obfuscated_res_0x7f14086d);
        }
        gubVar.v();
        gubVar.C(R.string.f165490_resource_name_obfuscated_res_0x7f14086e, new ees(this, 15));
    }

    @Override // defpackage.guh
    protected final void b(Dialog dialog) {
        Button c;
        kon.c(dialog);
        if (!gul.a() || (c = guw.c(dialog, -1)) == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) c.getParent();
        linearLayout.setGravity(1);
        if (linearLayout.getChildCount() <= 1) {
            return;
        }
        View childAt = linearLayout.getChildAt(1);
        if (!(childAt instanceof Space)) {
            return;
        }
        childAt.setVisibility(8);
    }

    @Override // defpackage.guh
    protected final void d() {
    }
}
