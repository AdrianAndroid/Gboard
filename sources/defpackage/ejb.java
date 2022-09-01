package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ejb  reason: default package */
/* loaded from: classes.dex */
final class ejb extends cum {
    private final ImageView A;
    private final MaterialButton B;
    private final ImageView C;
    private final llp D;
    private final dpe E;
    public final his s;
    public final his u;
    private final Context v;
    private final AppCompatTextView w;
    private final ImageView x;
    private final ImageView y;
    private final ImageView z;

    public ejb(Context context, View view, dpe dpeVar, his hisVar, his hisVar2, byte[] bArr, byte[] bArr2) {
        super(view);
        this.v = context;
        this.E = dpeVar;
        this.w = (AppCompatTextView) aad.q(view, R.id.f66910_resource_name_obfuscated_res_0x7f0b0824);
        ImageView imageView = (ImageView) aad.q(view, R.id.f129150_resource_name_obfuscated_res_0x7f0b2137);
        this.x = imageView;
        ImageView imageView2 = (ImageView) aad.q(view, R.id.f129160_resource_name_obfuscated_res_0x7f0b2138);
        this.y = imageView2;
        ImageView imageView3 = (ImageView) aad.q(view, R.id.f129170_resource_name_obfuscated_res_0x7f0b2139);
        this.z = imageView3;
        ImageView imageView4 = (ImageView) aad.q(view, R.id.f129130_resource_name_obfuscated_res_0x7f0b2135);
        this.A = imageView4;
        this.B = (MaterialButton) aad.q(view, R.id.f129080_resource_name_obfuscated_res_0x7f0b2130);
        this.C = (ImageView) aad.q(view, R.id.f55310_resource_name_obfuscated_res_0x7f0b01fc);
        this.D = llp.u(new hjr(imageView4, false), new hjr(imageView, false), new hjr(imageView2, false), new hjr(imageView3, false));
        this.s = hisVar;
        this.u = hisVar2;
    }

    @Override // defpackage.cum
    public final /* synthetic */ void F(Object obj, int i) {
        egu eguVar = (egu) obj;
        cxc e = eguVar.e();
        this.w.setTextDirection(ejj.a(this.a));
        this.w.setText(e.h);
        I(eguVar);
        this.a.setContentDescription(e.e);
        this.a.setOnClickListener(new eiz(this, eguVar, 4));
        ArrayList D = lre.D(e);
        D.addAll(e.g);
        int min = Math.min(D.size(), ((lrl) this.D).c);
        for (int i2 = 0; i2 < min; i2++) {
            hjq.a(this.v).c().i(hjq.b(((cxa) D.get(i2)).d(), e.f)).s((hjr) this.D.get(i2));
        }
        if (eguVar.b() == egt.FEATURED_STICKER_PACK) {
            this.C.setImageDrawable(this.v.getDrawable(R.drawable.f49140_resource_name_obfuscated_res_0x7f080299));
            this.C.setVisibility(0);
        }
    }

    @Override // defpackage.cum
    public final void G() {
        this.w.setText("");
        this.a.setContentDescription("");
        this.a.setOnClickListener(null);
        this.B.c(null);
        this.B.setText("");
        this.B.setOnClickListener(null);
        this.C.setImageDrawable(null);
        this.C.setVisibility(8);
        llp llpVar = this.D;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            hjq.a(this.v).l((hjr) llpVar.get(i2));
        }
    }

    public final void I(egu eguVar) {
        Resources resources = this.a.getResources();
        if (this.E.i(eguVar.e())) {
            this.B.setSelected(true);
            this.B.setText((CharSequence) null);
            this.B.setContentDescription(resources.getString(R.string.f167250_resource_name_obfuscated_res_0x7f140935));
            this.B.c(this.v.getDrawable(R.drawable.f50220_resource_name_obfuscated_res_0x7f08033a));
            this.B.setOnClickListener(new eiz(this, eguVar, 2));
            return;
        }
        this.B.setSelected(false);
        this.B.c(null);
        this.B.setContentDescription(null);
        this.B.setText(resources.getString(R.string.f167190_resource_name_obfuscated_res_0x7f14092f));
        this.B.setOnClickListener(new eiz(this, eguVar, 3));
    }
}
