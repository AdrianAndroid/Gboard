package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.expression.header.StartElementScrollBehavior;

/* compiled from: PG */
/* renamed from: cpi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cpi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public cpi(aji ajiVar, ajh ajhVar, int i) {
        this.c = i;
        this.a = ajiVar;
        this.b = ajhVar;
    }

    public /* synthetic */ cpi(StartElementScrollBehavior startElementScrollBehavior, ViewGroup.LayoutParams layoutParams, int i) {
        this.c = i;
        this.a = startElementScrollBehavior;
        this.b = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.c == 0) {
            Object obj = this.a;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.b;
            layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            View view = ((StartElementScrollBehavior) obj).g;
            if (view == null) {
                return;
            }
            view.setLayoutParams(layoutParams);
            return;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        aji.c(floatValue, (ajh) this.b);
        ((aji) this.a).a(floatValue, (ajh) this.b, false);
        ((aji) this.a).invalidateSelf();
    }
}
