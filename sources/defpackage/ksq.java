package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* renamed from: ksq  reason: default package */
/* loaded from: classes.dex */
public final class ksq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ksq(CollapsingToolbarLayout collapsingToolbarLayout, int i) {
        this.b = i;
        this.a = collapsingToolbarLayout;
    }

    public ksq(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = i;
        this.a = bottomSheetBehavior;
    }

    public ksq(kye kyeVar, int i) {
        this.b = i;
        this.a = kyeVar;
    }

    public ksq(kyv kyvVar, int i) {
        this.b = i;
        this.a = kyvVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            kxe kxeVar = ((BottomSheetBehavior) this.a).c;
            if (kxeVar == null) {
                return;
            }
            kxeVar.m(floatValue);
        } else if (i == 1) {
            ((CollapsingToolbarLayout) this.a).d(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (i == 2) {
            ((kye) this.a).e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else if (i == 3) {
            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ((kye) this.a).e.setScaleX(floatValue2);
            ((kye) this.a).e.setScaleY(floatValue2);
        } else if (i == 4) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            String str = kye.b;
            ((kye) this.a).e.setTranslationY(intValue);
        } else if (i == 5) {
            int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            String str2 = kye.b;
            ((kye) this.a).e.setTranslationY(intValue2);
        } else {
            ((kyv) this.a).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }
}
