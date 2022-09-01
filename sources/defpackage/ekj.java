package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ekj  reason: default package */
/* loaded from: classes.dex */
public final class ekj extends cum {
    public final his s;
    private final Context u;
    private final AppCompatTextView v;
    private final AppCompatImageView w;
    private ejv x;

    public ekj(Context context, View view, his hisVar) {
        super(view);
        this.u = context;
        this.v = (AppCompatTextView) aad.q(view, R.id.f52850_resource_name_obfuscated_res_0x7f0b00df);
        this.w = (AppCompatImageView) aad.q(view, R.id.f52830_resource_name_obfuscated_res_0x7f0b00dd);
        this.s = hisVar;
    }

    @Override // defpackage.cum
    public final /* bridge */ /* synthetic */ void F(Object obj, int i) {
        ejv ejvVar = (ejv) obj;
        this.x = ejvVar;
        this.a.setOnClickListener(new eiz(this, ejvVar, 11));
        int b = ejvVar.b() - 1;
        if (b == 0) {
            this.v.setText(jbs.p(ejvVar.a()));
            this.w.setImageDrawable(this.u.getDrawable(R.drawable.f50270_resource_name_obfuscated_res_0x7f080341));
        } else if (b != 2) {
            this.v.setCompoundDrawablesRelativeWithIntrinsicBounds(this.u.getDrawable(R.drawable.f50590_resource_name_obfuscated_res_0x7f080363), (Drawable) null, (Drawable) null, (Drawable) null);
            this.v.setText(ejvVar.c());
        } else {
            this.v.setText(jbs.p(this.u.getString(R.string.f153220_resource_name_obfuscated_res_0x7f1402ce)));
            this.w.setImageDrawable(this.u.getDrawable(R.drawable.f49980_resource_name_obfuscated_res_0x7f080320));
        }
    }

    @Override // defpackage.cum
    public final void G() {
        this.x = null;
        this.v.setText("");
        this.v.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.w.setImageDrawable(null);
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
            ejv ejvVar = this.x;
            if (ejvVar != null && ejvVar.b() - 1 == 0) {
                this.w.setImageDrawable(this.u.getDrawable(true != booleanValue ? R.drawable.f50270_resource_name_obfuscated_res_0x7f080341 : R.drawable.f46790_resource_name_obfuscated_res_0x7f08018f));
            }
            return true;
        }
        return false;
    }
}
