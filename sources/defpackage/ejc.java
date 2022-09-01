package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ejc  reason: default package */
/* loaded from: classes.dex */
public final class ejc extends cum implements View.OnTouchListener {
    final ImageView s;
    final AppCompatTextView u;
    final AppCompatTextView v;
    final ImageButton w;
    final hjr x;
    final Context y;
    final ot z;

    public ejc(View view, ot otVar) {
        super(view);
        ImageView imageView = (ImageView) aad.q(view, R.id.f129090_resource_name_obfuscated_res_0x7f0b2131);
        this.s = imageView;
        this.u = (AppCompatTextView) aad.q(view, R.id.f129120_resource_name_obfuscated_res_0x7f0b2134);
        this.v = (AppCompatTextView) aad.q(view, R.id.f129070_resource_name_obfuscated_res_0x7f0b212f);
        this.w = (ImageButton) aad.q(view, R.id.f67790_resource_name_obfuscated_res_0x7f0b088f);
        this.x = new hjr(imageView, false);
        this.z = otVar;
        this.y = view.getContext();
    }

    @Override // defpackage.cum
    public final /* synthetic */ void F(Object obj, int i) {
        cxc cxcVar = (cxc) obj;
        int a = ejj.a(this.a);
        this.u.setTextDirection(a);
        this.u.setText(cxcVar.h);
        this.v.setTextDirection(a);
        this.v.setText(cxcVar.d);
        this.a.setContentDescription(cxcVar.e);
        hjq.a(this.y).c().i(hjq.b(cxcVar.c, cxcVar.f)).s(this.x);
        this.w.setOnTouchListener(this);
    }

    @Override // defpackage.cum
    public final void G() {
        this.u.setText("");
        this.v.setText("");
        this.a.setContentDescription("");
        hjq.a(this.y).l(this.x);
        this.w.setOnTouchListener(null);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.z.p(this);
            return true;
        }
        return false;
    }
}
