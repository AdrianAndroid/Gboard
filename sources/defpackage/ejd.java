package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* renamed from: ejd  reason: default package */
/* loaded from: classes.dex */
public final class ejd extends cum {
    public final his s;
    private final String u;
    private final String v;
    private final MaterialButton w;
    private final MaterialButton x;
    private final AppCompatTextView y;
    private final AppCompatTextView z;

    public ejd(View view, his hisVar) {
        super(view);
        this.w = (MaterialButton) aad.q(view, R.id.f52310_resource_name_obfuscated_res_0x7f0b006f);
        this.x = (MaterialButton) aad.q(view, R.id.f67070_resource_name_obfuscated_res_0x7f0b0836);
        this.y = (AppCompatTextView) aad.q(view, R.id.f129140_resource_name_obfuscated_res_0x7f0b2136);
        this.z = (AppCompatTextView) aad.q(view, R.id.f129070_resource_name_obfuscated_res_0x7f0b212f);
        Resources resources = view.getResources();
        this.u = resources.getString(R.string.f152130_resource_name_obfuscated_res_0x7f14025c);
        this.v = resources.getString(R.string.f152150_resource_name_obfuscated_res_0x7f14025e);
        this.s = hisVar;
    }

    @Override // defpackage.cum
    public final /* synthetic */ void F(Object obj, int i) {
        eib eibVar = (eib) obj;
        cxc f = eibVar.f();
        int a = ejj.a(this.a);
        this.y.setTextDirection(a);
        this.y.setText(f.e);
        this.z.setTextDirection(a);
        this.z.setText(f.d);
        this.w.d(R.drawable.f50000_resource_name_obfuscated_res_0x7f080322);
        this.w.setText(this.u);
        this.w.setOnClickListener(new eiz(this, eibVar, 5));
        this.x.setText(this.v);
        this.x.setOnClickListener(new eiz(this, eibVar, 6));
    }

    @Override // defpackage.cum
    public final void G() {
        this.y.setText("");
        this.z.setText("");
    }
}
