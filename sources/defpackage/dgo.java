package defpackage;

import android.view.animation.Animation;
import android.widget.ProgressBar;

/* compiled from: PG */
/* renamed from: dgo  reason: default package */
/* loaded from: classes.dex */
public final class dgo implements Animation.AnimationListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dgo(ProgressBar progressBar, int i) {
        this.b = i;
        this.a = progressBar;
    }

    public dgo(dgp dgpVar, int i) {
        this.b = i;
        this.a = dgpVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.b == 0) {
            ((dgp) this.a).a = false;
            return;
        }
        ((ProgressBar) this.a).setAlpha(0.0f);
        ((ProgressBar) this.a).setVisibility(4);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
