package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ekk  reason: default package */
/* loaded from: classes.dex */
public final class ekk extends cum {
    public final his s;
    private final AppCompatTextView u;

    public ekk(Context context, View view, his hisVar) {
        super(view);
        this.a.setContentDescription(context.getString(R.string.f182120_resource_name_obfuscated_res_0x7f140f26));
        AppCompatTextView appCompatTextView = (AppCompatTextView) aad.q(view, R.id.f52840_resource_name_obfuscated_res_0x7f0b00de);
        this.u = appCompatTextView;
        appCompatTextView.setHint(context.getString(R.string.f182110_resource_name_obfuscated_res_0x7f140f25));
        this.s = hisVar;
    }

    @Override // defpackage.cum
    public final /* bridge */ /* synthetic */ void F(Object obj, int i) {
        ejv ejvVar = (ejv) obj;
        this.a.setOnClickListener(new eiz(this, ejvVar, 12));
        if (ejvVar.b() - 1 != 1) {
            return;
        }
        this.u.setText(ejvVar.c());
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
