package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eja  reason: default package */
/* loaded from: classes.dex */
public final class eja extends cum {
    public final his s;
    private final AppCompatTextView u;
    private final AppCompatTextView v;
    private final ImageView w;
    private final Button x;
    private cxf y;

    public eja(View view, his hisVar) {
        super(view);
        this.s = hisVar;
        this.u = (AppCompatTextView) aad.q(view, R.id.f67670_resource_name_obfuscated_res_0x7f0b0883);
        this.v = (AppCompatTextView) aad.q(view, R.id.f67660_resource_name_obfuscated_res_0x7f0b0882);
        this.w = (ImageView) aad.q(view, R.id.f67650_resource_name_obfuscated_res_0x7f0b0881);
        this.x = (Button) aad.q(view, R.id.f67640_resource_name_obfuscated_res_0x7f0b0880);
    }

    @Override // defpackage.cum
    public final /* bridge */ /* synthetic */ void F(Object obj, int i) {
        egu eguVar = (egu) obj;
        this.y = eguVar.d();
        Resources resources = this.a.getResources();
        int a = ejj.a(this.a);
        this.u.setTextDirection(a);
        this.v.setTextDirection(a);
        if (this.y != null) {
            this.u.setText(resources.getString(R.string.f148320_resource_name_obfuscated_res_0x7f140091));
            this.v.setText(resources.getString(R.string.f148350_resource_name_obfuscated_res_0x7f140094));
            this.w.setImageResource(R.drawable.f46250_resource_name_obfuscated_res_0x7f080132);
            this.a.setContentDescription(resources.getString(R.string.f148320_resource_name_obfuscated_res_0x7f140091));
        }
        this.x.setText(resources.getString(R.string.f167190_resource_name_obfuscated_res_0x7f14092f));
        eiz eizVar = new eiz(this, eguVar, 0);
        this.a.setOnClickListener(eizVar);
        this.x.setOnClickListener(eizVar);
    }

    @Override // defpackage.cum
    public final void G() {
        this.x.setOnClickListener(null);
        this.a.setOnClickListener(null);
        this.a.setContentDescription("");
        this.u.setText("");
        this.v.setText("");
        this.w.setImageDrawable(null);
        this.y = null;
    }

    @Override // defpackage.cum
    public final void L() {
        if (this.y == null) {
            return;
        }
        ieh.j().e(ctd.BITMOJI_PROMO_SHOWN, new Object[0]);
    }
}
