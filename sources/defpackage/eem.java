package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eem  reason: default package */
/* loaded from: classes.dex */
public final class eem extends cum {
    public final his s;
    private final AppCompatTextView u;

    public eem(Context context, View view, his hisVar) {
        super(view);
        this.a.setContentDescription(context.getString(R.string.f153290_resource_name_obfuscated_res_0x7f1402d5));
        AppCompatTextView appCompatTextView = (AppCompatTextView) aad.q(view, R.id.f52840_resource_name_obfuscated_res_0x7f0b00de);
        this.u = appCompatTextView;
        appCompatTextView.setHint(context.getString(R.string.f153290_resource_name_obfuscated_res_0x7f1402d5));
        this.s = hisVar;
    }

    @Override // defpackage.cum
    public final /* bridge */ /* synthetic */ void F(Object obj, int i) {
        edw edwVar = (edw) obj;
        this.a.setOnClickListener(new bsx(this, edwVar, 17));
        if (edwVar.b() - 1 != 2) {
            return;
        }
        this.u.setText(edwVar.c());
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
