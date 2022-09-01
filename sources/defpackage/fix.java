package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.Wiggle;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* renamed from: fix  reason: default package */
/* loaded from: classes.dex */
public final class fix implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public fix(Wiggle wiggle, ValueAnimator valueAnimator, int i) {
        this.c = i;
        this.a = wiggle;
        this.b = valueAnimator;
    }

    public fix(AppBarLayout appBarLayout, kxe kxeVar, int i) {
        this.c = i;
        this.b = appBarLayout;
        this.a = kxeVar;
    }

    public fix(fja fjaVar, ValueAnimator valueAnimator, int i) {
        this.c = i;
        this.a = fjaVar;
        this.b = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.c;
        if (i == 0) {
            oll.e(valueAnimator, "it");
            Object obj = this.a;
            Object animatedValue = ((ValueAnimator) this.b).getAnimatedValue();
            oll.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            ((fja) obj).f = ((Float) animatedValue).floatValue();
        } else if (i == 1) {
            oll.e(valueAnimator, "it");
            Object obj2 = this.a;
            Object animatedValue2 = ((ValueAnimator) this.b).getAnimatedValue();
            oll.c(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            ((Wiggle) obj2).b(((Float) animatedValue2).floatValue());
        } else if (i == 2) {
            oll.e(valueAnimator, "it");
            Object obj3 = this.a;
            Object animatedValue3 = ((ValueAnimator) this.b).getAnimatedValue();
            oll.c(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
            ((fja) obj3).g = ((Float) animatedValue3).floatValue();
        } else {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ((kxe) this.a).k(floatValue);
            Drawable drawable = ((AppBarLayout) this.b).g;
            if (drawable instanceof kxe) {
                ((kxe) drawable).k(floatValue);
            }
            for (kse kseVar : ((AppBarLayout) this.b).f) {
                int i2 = ((kxe) this.a).f;
                kseVar.a();
            }
        }
    }
}
