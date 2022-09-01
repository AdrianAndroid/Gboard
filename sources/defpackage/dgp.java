package defpackage;

import android.graphics.Bitmap;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingOverlayView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dgp  reason: default package */
/* loaded from: classes.dex */
public final class dgp extends dgm {
    public dgp(int i) {
        super(i, 0.0f);
    }

    @Override // defpackage.dgm
    public final void l(gpq gpqVar, HandwritingOverlayView handwritingOverlayView) {
        this.a = true;
        gpf gpfVar = new gpf(gpqVar);
        int max = Math.max(0, ((int) gpfVar.b()) - 10);
        int max2 = Math.max(0, ((int) gpfVar.d()) - 10);
        float c = gpfVar.c() - gpfVar.b();
        if (c < Float.MIN_NORMAL) {
            c = 1.0f;
        }
        int min = Math.min(((int) c) + 20, handwritingOverlayView.getWidth());
        float a = gpfVar.a() - gpfVar.d();
        if (a < Float.MIN_NORMAL) {
            a = 1.0f;
        }
        int min2 = Math.min(((int) a) + 20, handwritingOverlayView.getHeight());
        Bitmap bitmap = handwritingOverlayView.c;
        handwritingOverlayView.g(Bitmap.createBitmap(bitmap, max, max2, Math.min(bitmap.getWidth() - max, min), Math.min(handwritingOverlayView.c.getHeight() - max2, min2)));
        ImageView imageView = handwritingOverlayView.a;
        if (imageView != null) {
            imageView.setTranslationX(max);
            handwritingOverlayView.a.setTranslationY(max2);
        }
        ImageView imageView2 = handwritingOverlayView.a;
        if (imageView2 == null) {
            this.a = false;
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.setDuration(handwritingOverlayView.f);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.setAnimationListener(new dgo(this, 0));
        imageView2.startAnimation(animationSet);
    }
}
