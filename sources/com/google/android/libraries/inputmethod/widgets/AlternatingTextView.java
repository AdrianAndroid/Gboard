package com.google.android.libraries.inputmethod.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AlternatingTextView extends AutoSizeTextView {
    public int a;
    public Animator c;
    public Animator e;
    public AnimatorSet f;
    private TextView.BufferType t;
    private String[] u;
    public final jdx b = new jdx();
    private final Runnable v = new ihi(this, 17);
    public final AnimatorListenerAdapter g = new jcl(this);
    public final AnimatorListenerAdapter h = new jcm(this);

    public AlternatingTextView(Context context) {
        super(context);
    }

    public final void c() {
        String[] strArr;
        int length;
        removeCallbacks(this.v);
        if (!isShown() || (strArr = this.u) == null || (length = strArr.length) <= 1) {
            return;
        }
        int i = (this.a + 1) % length;
        this.a = i;
        postDelayed(this.v, i == 0 ? 5000L : 3000L);
    }

    public final void d() {
        this.a = 0;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f.cancel();
            this.b.b(this);
        }
        e();
        c();
    }

    public final void e() {
        String str;
        TextView.BufferType bufferType = this.t;
        if (bufferType != null) {
            String[] strArr = this.u;
            if (strArr != null) {
                int length = strArr.length;
                int i = this.a;
                if (length > i) {
                    str = strArr[i];
                    super.setText(str, bufferType);
                }
            }
            str = "";
            super.setText(str, bufferType);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d();
    }

    @Override // defpackage.jcp, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.t = bufferType;
        this.u = charSequence != null ? charSequence.toString().split("\n") : null;
        d();
    }

    public AlternatingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
