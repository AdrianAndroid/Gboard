package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eje  reason: default package */
/* loaded from: classes.dex */
public final class eje extends cum {
    public final his s;
    private final Context u;
    private final ImageView v;
    private final hjr w;
    private final int x;

    public eje(Context context, View view, his hisVar) {
        super(view);
        this.u = context;
        ImageView imageView = (ImageView) aad.q(view, R.id.f129090_resource_name_obfuscated_res_0x7f0b2131);
        this.v = imageView;
        this.s = hisVar;
        this.w = new hjr(imageView, false);
        this.x = efq.q(context);
    }

    @Override // defpackage.cum
    public final /* synthetic */ void F(Object obj, int i) {
        cxc b;
        ehj ehjVar = (ehj) obj;
        Resources resources = this.a.getResources();
        this.a.setOnClickListener(new eiz(this, ehjVar, 7));
        int a = ehjVar.a() - 1;
        if (a != 0) {
            if (a == 1) {
                this.w.t(R.drawable.f49990_resource_name_obfuscated_res_0x7f080321);
                this.a.setContentDescription(resources.getString(R.string.f167180_resource_name_obfuscated_res_0x7f14092e));
                return;
            } else if (a == 2) {
                this.w.t(R.drawable.f49980_resource_name_obfuscated_res_0x7f080320);
                this.a.setContentDescription(resources.getString(R.string.f152970_resource_name_obfuscated_res_0x7f1402b4));
                return;
            } else if (a == 3) {
                this.w.t(R.drawable.f50560_resource_name_obfuscated_res_0x7f080360);
                this.a.setContentDescription(resources.getString(R.string.f167150_resource_name_obfuscated_res_0x7f14092b));
                return;
            } else if (a != 6) {
                return;
            }
        }
        if (ehjVar.a() == 1) {
            b = ehjVar.d();
        } else {
            b = ehjVar.b();
        }
        this.a.setContentDescription(b.e);
        ((ats) ((ats) hjq.a(this.u).c().I(new ColorDrawable(this.x))).y(R.drawable.f49160_resource_name_obfuscated_res_0x7f08029c)).i(hjq.b(b.c, b.f)).s(this.w);
    }

    @Override // defpackage.cum
    public final void G() {
        hjq.a(this.u).l(this.w);
        this.a.setContentDescription("");
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
