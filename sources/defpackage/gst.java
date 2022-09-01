package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: gst  reason: default package */
/* loaded from: classes.dex */
public final class gst extends AnimatorListenerAdapter {
    private Drawable a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = (View) ((ObjectAnimator) animator).getTarget();
        if (view == null) {
            return;
        }
        ((ImageView) view.findViewById(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265)).setImageDrawable(this.a);
        View findViewById = view.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = (View) ((ObjectAnimator) animator).getTarget();
        if (view == null) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265);
        this.a = imageView.getDrawable();
        imageView.setImageDrawable(null);
        View findViewById = view.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(4);
    }
}
