package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* renamed from: ejf  reason: default package */
/* loaded from: classes.dex */
public final class ejf extends cum {
    public final his s;
    private final AppCompatTextView u;
    private final AppCompatTextView v;
    private final MaterialButton w;
    private final String x;

    public ejf(View view, his hisVar) {
        super(view);
        this.u = (AppCompatTextView) aad.q(view, R.id.f66060_resource_name_obfuscated_res_0x7f0b07bc);
        this.v = (AppCompatTextView) aad.q(view, R.id.f66050_resource_name_obfuscated_res_0x7f0b07bb);
        this.w = (MaterialButton) aad.q(view, R.id.f66070_resource_name_obfuscated_res_0x7f0b07bd);
        this.x = view.getResources().getString(R.string.f167250_resource_name_obfuscated_res_0x7f140935);
        this.s = hisVar;
    }

    @Override // defpackage.cum
    public final /* synthetic */ void F(Object obj, int i) {
        eib eibVar = (eib) obj;
        cxc f = eibVar.f();
        this.u.setText(f.h);
        this.v.setText(f.d);
        this.w.setText(this.x);
        this.w.setOnClickListener(new eiz(this, eibVar, 8));
    }

    @Override // defpackage.cum
    public final void G() {
        this.u.setText("");
        this.v.setText("");
        this.w.setText("");
        this.w.setOnClickListener(null);
    }
}
