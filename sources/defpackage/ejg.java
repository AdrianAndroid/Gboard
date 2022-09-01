package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* renamed from: ejg  reason: default package */
/* loaded from: classes.dex */
public final class ejg extends cum {
    public final his s;
    private final String u;
    private final String v;
    private final MaterialButton w;
    private final AppCompatTextView x;
    private final AppCompatTextView y;
    private final dpe z;

    public ejg(View view, dpe dpeVar, his hisVar, byte[] bArr, byte[] bArr2) {
        super(view);
        this.z = dpeVar;
        this.w = (MaterialButton) aad.q(view, R.id.f52310_resource_name_obfuscated_res_0x7f0b006f);
        this.x = (AppCompatTextView) aad.q(view, R.id.f129140_resource_name_obfuscated_res_0x7f0b2136);
        this.y = (AppCompatTextView) aad.q(view, R.id.f129070_resource_name_obfuscated_res_0x7f0b212f);
        Resources resources = view.getResources();
        this.u = resources.getString(R.string.f167230_resource_name_obfuscated_res_0x7f140933);
        this.v = resources.getString(R.string.f167240_resource_name_obfuscated_res_0x7f140934);
        this.s = hisVar;
    }

    @Override // defpackage.cum
    public final /* synthetic */ void F(Object obj, int i) {
        eib eibVar = (eib) obj;
        cxc f = eibVar.f();
        int a = ejj.a(this.a);
        this.x.setTextDirection(a);
        this.x.setText(f.e);
        this.y.setTextDirection(a);
        this.y.setText(f.d);
        I(eibVar, this.z.i(f));
    }

    @Override // defpackage.cum
    public final void G() {
        this.x.setText("");
        this.y.setText("");
        this.w.setOnClickListener(null);
    }

    public final void I(eib eibVar, boolean z) {
        this.w.d(z ? R.drawable.f50220_resource_name_obfuscated_res_0x7f08033a : R.drawable.f50000_resource_name_obfuscated_res_0x7f080322);
        this.w.setText(z ? this.v : this.u);
        this.w.setOnClickListener(new ejh(this, eibVar, z, 1));
    }
}
