package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* renamed from: eji  reason: default package */
/* loaded from: classes.dex */
public final class eji extends cum {
    private final AppCompatTextView A;
    private final dpe B;
    public final his s;
    public final Runnable u;
    private final String v;
    private final String w;
    private final MaterialButton x;
    private final MaterialButton y;
    private final AppCompatTextView z;

    public eji(View view, dpe dpeVar, his hisVar, Runnable runnable, byte[] bArr, byte[] bArr2) {
        super(view);
        this.B = dpeVar;
        this.x = (MaterialButton) aad.q(view, R.id.f52310_resource_name_obfuscated_res_0x7f0b006f);
        this.y = (MaterialButton) aad.q(view, R.id.f53460_resource_name_obfuscated_res_0x7f0b011f);
        this.z = (AppCompatTextView) aad.q(view, R.id.f129140_resource_name_obfuscated_res_0x7f0b2136);
        this.A = (AppCompatTextView) aad.q(view, R.id.f129070_resource_name_obfuscated_res_0x7f0b212f);
        this.s = hisVar;
        this.u = runnable;
        Resources resources = view.getResources();
        this.v = resources.getString(R.string.f167230_resource_name_obfuscated_res_0x7f140933);
        this.w = resources.getString(R.string.f167240_resource_name_obfuscated_res_0x7f140934);
    }

    @Override // defpackage.cum
    public final /* synthetic */ void F(Object obj, int i) {
        eib eibVar = (eib) obj;
        cxc f = eibVar.f();
        int a = ejj.a(this.a);
        this.z.setTextDirection(a);
        this.z.setText(f.e);
        this.A.setTextDirection(a);
        this.A.setText(f.d);
        I(eibVar, this.B.i(eibVar.f()));
        this.y.setOnClickListener(new edc(this, 5));
    }

    @Override // defpackage.cum
    public final void G() {
        this.z.setText("");
        this.A.setText("");
        this.y.setOnClickListener(null);
        this.x.setOnClickListener(null);
    }

    public final void I(eib eibVar, boolean z) {
        this.x.d(z ? R.drawable.f50220_resource_name_obfuscated_res_0x7f08033a : R.drawable.f50000_resource_name_obfuscated_res_0x7f080322);
        this.x.setText(z ? this.w : this.v);
        this.x.setOnClickListener(new ejh(this, eibVar, z, 0));
    }
}
