package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dej  reason: default package */
/* loaded from: classes.dex */
public final class dej {
    public final View a;
    private final dei b;
    private final AppCompatTextView c;
    private View d;
    private CharSequence e;
    private final imn f;

    public dej(Context context, imn imnVar) {
        this.f = imnVar;
        View b = imnVar.b(context, R.layout.f133830_resource_name_obfuscated_res_0x7f0e0051);
        this.a = b;
        this.c = (AppCompatTextView) b.findViewById(R.id.f53500_resource_name_obfuscated_res_0x7f0b0124);
        dei deiVar = new dei(this, context);
        this.b = deiVar;
        deiVar.setEnabled(false);
        deiVar.setClickable(false);
    }

    public final void a() {
        b();
        this.f.c(this.b, null, true);
    }

    public final void b() {
        this.b.setVisibility(4);
        this.e = null;
    }

    public final void c(View view) {
        if (view != this.d) {
            a();
            this.d = view;
        }
    }

    public final void d(CharSequence charSequence) {
        View view;
        if (TextUtils.isEmpty(charSequence)) {
            b();
        } else if (charSequence.equals(this.e)) {
        } else {
            this.e = charSequence;
            this.c.setText(charSequence);
            int i = 0;
            this.a.measure(0, 0);
            View view2 = this.a;
            view2.layout(0, 0, view2.getMeasuredWidth(), this.a.getMeasuredHeight());
            this.a.invalidate();
            this.b.setVisibility(0);
            if (this.b.getLayoutParams() == null || this.b.getLayoutParams().height != this.a.getMeasuredHeight() || ((view = this.d) != null && view.getMeasuredWidth() != this.b.getLayoutParams().width)) {
                View view3 = this.d;
                if (view3 != null) {
                    i = view3.getMeasuredWidth();
                }
                if (i == 0) {
                    i = this.a.getMeasuredWidth();
                }
                this.b.setLayoutParams(new FrameLayout.LayoutParams(i, this.a.getMeasuredHeight()));
                aad.U(this.b, 2);
            } else {
                this.b.invalidate();
            }
            this.f.e(this.b, this.d, 1564, 0, 0, null);
        }
    }
}
