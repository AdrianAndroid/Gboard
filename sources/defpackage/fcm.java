package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;

/* compiled from: PG */
/* renamed from: fcm  reason: default package */
/* loaded from: classes.dex */
final class fcm implements ValueAnimator.AnimatorUpdateListener {
    private final AppCompatTextView a;
    private final String b;
    private final Drawable c;

    public fcm(View view, String str, Drawable drawable) {
        this.a = (AppCompatTextView) view;
        this.b = str;
        this.c = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        String str = this.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.substring(0, Math.min(str.length(), Math.max(0, ((Integer) valueAnimator.getAnimatedValue()).intValue() - 2))));
        spannableStringBuilder.append((CharSequence) " ");
        if (this.c == null) {
            return;
        }
        int lineHeight = this.a.getLineHeight();
        Drawable drawable = this.c;
        double intrinsicWidth = drawable.getIntrinsicWidth() * lineHeight;
        double intrinsicHeight = this.c.getIntrinsicHeight();
        Double.isNaN(intrinsicWidth);
        Double.isNaN(intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth / intrinsicHeight), lineHeight);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ImageSpan(this.c), length - 1, length, 33);
        this.a.setText(spannableStringBuilder);
        this.a.requestLayout();
    }
}
