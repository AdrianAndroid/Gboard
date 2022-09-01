package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* renamed from: kyq  reason: default package */
/* loaded from: classes.dex */
public final class kyq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    final /* synthetic */ LinearLayout c;
    private final /* synthetic */ int d;

    public kyq(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        this.d = i;
        this.b = baseBehavior;
        this.a = coordinatorLayout;
        this.c = appBarLayout;
    }

    public kyq(kyr kyrVar, View view, View view2, int i) {
        this.d = i;
        this.c = kyrVar;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.d == 0) {
            LinearLayout linearLayout = this.c;
            kyr kyrVar = (kyr) linearLayout;
            kyrVar.c(this.a, (View) this.b, valueAnimator.getAnimatedFraction());
            return;
        }
        Object obj = this.b;
        ksh kshVar = (ksh) obj;
        kshVar.E((CoordinatorLayout) this.a, this.c, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
