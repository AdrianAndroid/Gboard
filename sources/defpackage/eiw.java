package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eiw  reason: default package */
/* loaded from: classes.dex */
public final class eiw extends cum {
    public final his s;
    private final Context u;
    private final ImageView v;
    private final AppCompatTextView w;
    private final hjr x;
    private final int y;

    public eiw(Context context, View view, his hisVar) {
        super(view);
        this.u = context;
        ImageView imageView = (ImageView) aad.q(view, R.id.f129100_resource_name_obfuscated_res_0x7f0b2132);
        this.v = imageView;
        this.w = (AppCompatTextView) aad.q(view, R.id.f129110_resource_name_obfuscated_res_0x7f0b2133);
        this.s = hisVar;
        this.x = new hjr(imageView, false);
        this.y = efq.q(context);
    }

    @Override // defpackage.cum
    public final /* synthetic */ void F(Object obj, int i) {
        cxc b;
        ehj ehjVar = (ehj) obj;
        Resources resources = this.a.getResources();
        this.a.setOnClickListener(new bsx(this, ehjVar, 20));
        int a = ehjVar.a() - 1;
        if (a != 0) {
            if (a == 1) {
                this.x.t(R.drawable.f49990_resource_name_obfuscated_res_0x7f080321);
                this.a.setContentDescription(resources.getString(R.string.f167180_resource_name_obfuscated_res_0x7f14092e));
                this.w.setText(resources.getString(R.string.f167170_resource_name_obfuscated_res_0x7f14092d));
                return;
            } else if (a == 2) {
                this.x.t(R.drawable.f49980_resource_name_obfuscated_res_0x7f080320);
                this.a.setContentDescription(resources.getString(R.string.f152970_resource_name_obfuscated_res_0x7f1402b4));
                this.w.setText(resources.getString(R.string.f152960_resource_name_obfuscated_res_0x7f1402b3));
                return;
            } else if (a == 3) {
                this.x.t(R.drawable.f50560_resource_name_obfuscated_res_0x7f080360);
                this.a.setContentDescription(resources.getString(R.string.f167150_resource_name_obfuscated_res_0x7f14092b));
                this.w.setText(resources.getString(R.string.f167120_resource_name_obfuscated_res_0x7f140928));
                return;
            } else if (a == 4) {
                this.x.t(R.drawable.f50590_resource_name_obfuscated_res_0x7f080363);
                this.w.setText(ehjVar.c());
                this.a.setContentDescription(resources.getString(R.string.f153190_resource_name_obfuscated_res_0x7f1402ca));
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
        ((ats) ((ats) hjq.a(this.u).c().I(new ColorDrawable(this.y))).y(R.drawable.f49160_resource_name_obfuscated_res_0x7f08029c)).i(hjq.b(b.c, b.f)).s(this.x);
        this.w.setText(b.h);
    }

    @Override // defpackage.cum
    public final void G() {
        hjq.a(this.u).l(this.x);
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
