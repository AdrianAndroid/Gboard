package com.google.android.libraries.inputmethod.accesspoint.widget;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AccessPointBackgroundView extends AppCompatImageView {
    public boolean a;
    public Rect b;
    private final ValueAnimator c;
    private int d;

    public AccessPointBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        int i;
        this.a = false;
        Drawable drawable = getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        super.drawableStateChanged();
        int intrinsicWidth2 = drawable.getIntrinsicWidth();
        int intrinsicHeight2 = drawable.getIntrinsicHeight();
        if (intrinsicWidth2 > 0 && intrinsicWidth2 > (i = this.d)) {
            intrinsicHeight2 = (int) ((i / intrinsicWidth2) * intrinsicHeight2);
            intrinsicWidth2 = i;
        }
        if (intrinsicWidth == intrinsicWidth2 && intrinsicHeight == intrinsicHeight2) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (intrinsicWidth2 <= 0) {
            intrinsicWidth2 = -2;
        }
        layoutParams.width = intrinsicWidth2;
        if (intrinsicHeight2 <= 0) {
            intrinsicHeight2 = -2;
        }
        layoutParams.height = intrinsicHeight2;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        if (this.c.isStarted()) {
            this.a = true;
        } else {
            a();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (getLayoutParams().width < 0) {
            this.d = 16777215 & i;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (z) {
            if (this.c.isStarted()) {
                this.c.cancel();
            }
        } else if (isPressed()) {
            this.b = getDrawable().copyBounds();
            this.c.start();
        }
        super.setPressed(z);
    }

    public AccessPointBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f32050_resource_name_obfuscated_res_0x7f070051);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f32060_resource_name_obfuscated_res_0x7f070052);
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.f340_resource_name_obfuscated_res_0x7f020000);
        this.c = valueAnimator;
        valueAnimator.setEvaluator(new gsp(this, dimensionPixelSize / dimensionPixelSize2));
        valueAnimator.addListener(new gsq(this));
        valueAnimator.addUpdateListener(new op(this, 18));
    }
}
