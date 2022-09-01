package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: ajy  reason: default package */
/* loaded from: classes.dex */
final class ajy extends Animatable2.AnimationCallback {
    final /* synthetic */ ajz a;

    public ajy(ajz ajzVar) {
        this.a = ajzVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.a.b(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.a.c(drawable);
    }
}
