package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* renamed from: esg  reason: default package */
/* loaded from: classes.dex */
public final class esg implements eqr {
    public final ColorStateList a;

    public esg(ColorStateList colorStateList) {
        this.a = colorStateList;
    }

    @Override // defpackage.eqr
    public final /* synthetic */ ColorStateList a() {
        return null;
    }

    @Override // defpackage.eqr
    public final ColorStateList b() {
        return this.a;
    }

    @Override // defpackage.eqr
    public final Drawable c(Context context) {
        return new ColorDrawable(this.a.getDefaultColor());
    }

    @Override // defpackage.eqr
    public final void d(View view) {
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            ColorStateList colorStateList = this.a;
            if (materialButton.c != colorStateList) {
                materialButton.c = colorStateList;
                materialButton.h(false);
            }
            materialButton.setTextColor(this.a);
        } else if (view instanceof CompoundButton) {
            CompoundButton compoundButton = (CompoundButton) view;
            compoundButton.setTextColor(this.a);
            compoundButton.setButtonTintList(this.a);
        } else if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setTextColor(this.a);
            up.e(textView, this.a);
        } else if (view instanceof LottieAnimationView) {
            ((LottieAnimationView) view).c.f(new aoz("**"), and.E, new amn(new opu(this), null, null, null));
        } else if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                imageView.setImageDrawable(new eqa(drawable, this.a));
            } else if (this.a.isStateful()) {
                imageView.setImageTintList(this.a);
                imageView.setImageTintMode(PorterDuff.Mode.SRC_IN);
            } else {
                imageView.setColorFilter(this.a.getDefaultColor(), PorterDuff.Mode.SRC_IN);
            }
        } else if (view instanceof jcz) {
            ((jcz) view).a(this.a.getDefaultColor());
        } else if (!(view instanceof ProgressBar)) {
        } else {
            ProgressBar progressBar = (ProgressBar) view;
            if (progressBar.isIndeterminate()) {
                progressBar.setIndeterminateTintList(this.a);
                progressBar.setIndeterminateTintMode(PorterDuff.Mode.SRC_IN);
                return;
            }
            progressBar.setProgressTintList(this.a);
            progressBar.setProgressTintMode(PorterDuff.Mode.SRC_IN);
        }
    }
}
