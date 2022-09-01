package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eiv  reason: default package */
/* loaded from: classes.dex */
public final class eiv extends cum {
    public final his s;
    private final AppCompatTextView u;

    public eiv(Context context, View view, his hisVar) {
        super(view);
        this.a.setContentDescription(context.getString(R.string.f152720_resource_name_obfuscated_res_0x7f14029b));
        AppCompatTextView appCompatTextView = (AppCompatTextView) aad.q(view, R.id.f52840_resource_name_obfuscated_res_0x7f0b00de);
        this.u = appCompatTextView;
        appCompatTextView.setHint(context.getString(R.string.f148360_resource_name_obfuscated_res_0x7f140095));
        this.s = hisVar;
    }

    @Override // defpackage.cum
    public final /* bridge */ /* synthetic */ void F(Object obj, int i) {
        efx efxVar = (efx) obj;
        this.a.setOnClickListener(new bsx(this, efxVar, 19));
        if (efxVar.b() - 1 != 2) {
            return;
        }
        this.u.setText(efxVar.d());
    }

    @Override // defpackage.cum
    public final void G() {
        this.u.setText("");
        this.a.setOnClickListener(null);
        this.a.setSelected(false);
        this.a.setClickable(true);
    }

    @Override // defpackage.cum
    public final boolean H(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.a.setSelected(booleanValue);
            this.a.setClickable(!booleanValue);
            return true;
        }
        return false;
    }
}
