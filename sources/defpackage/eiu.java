package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eiu  reason: default package */
/* loaded from: classes.dex */
public final class eiu extends cum {
    public final his s;
    private final Context u;
    private final ImageView v;
    private final AppCompatTextView w;
    private final hjr x;
    private efx y;

    public eiu(Context context, View view, his hisVar) {
        super(view);
        this.u = context;
        ImageView imageView = (ImageView) aad.q(view, R.id.f52830_resource_name_obfuscated_res_0x7f0b00dd);
        this.v = imageView;
        this.w = (AppCompatTextView) aad.q(view, R.id.f52850_resource_name_obfuscated_res_0x7f0b00df);
        this.s = hisVar;
        this.x = new hjr(imageView, false);
    }

    @Override // defpackage.cum
    public final /* synthetic */ void F(Object obj, int i) {
        efx efxVar = (efx) obj;
        this.y = efxVar;
        Resources resources = this.a.getResources();
        this.a.setOnClickListener(new bsx(this, efxVar, 18));
        int b = efxVar.b() - 1;
        if (b == 0 || b == 1) {
            cxc e = efxVar.e();
            this.a.setContentDescription(e.e);
            this.w.setText(jbs.p(e.h));
            this.x.t(R.drawable.f50270_resource_name_obfuscated_res_0x7f080341);
        } else if (b != 3) {
        } else {
            this.x.t(R.drawable.f49980_resource_name_obfuscated_res_0x7f080320);
            this.a.setContentDescription(resources.getString(R.string.f152970_resource_name_obfuscated_res_0x7f1402b4));
            this.w.setText(resources.getString(R.string.f152960_resource_name_obfuscated_res_0x7f1402b3));
        }
    }

    @Override // defpackage.cum
    public final void G() {
        this.y = null;
        hjq.a(this.u).l(this.x);
        this.a.setContentDescription("");
        this.a.setOnClickListener(null);
        this.a.setSelected(false);
        this.a.setClickable(true);
        this.w.setText((CharSequence) null);
    }

    @Override // defpackage.cum
    public final boolean H(Object obj) {
        int b;
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.a.setSelected(booleanValue);
            this.a.setClickable(!booleanValue);
            efx efxVar = this.y;
            if (efxVar != null && (efxVar.b() - 1 == 0 || b == 1)) {
                this.x.t(true != booleanValue ? R.drawable.f50270_resource_name_obfuscated_res_0x7f080341 : R.drawable.f46790_resource_name_obfuscated_res_0x7f08018f);
            }
            return true;
        }
        return false;
    }
}
