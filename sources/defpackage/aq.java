package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: PG */
/* renamed from: aq  reason: default package */
/* loaded from: classes.dex */
final class aq extends AnimationSet implements Runnable {
    private final ViewGroup a;
    private final View b;
    private boolean c;
    private boolean d;
    private boolean e = true;

    public aq(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.a = viewGroup;
        this.b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.c = true;
            zb.b(this.a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c || !this.e) {
            this.a.endViewTransition(this.b);
            this.d = true;
            return;
        }
        this.e = false;
        this.a.post(this);
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.c = true;
            zb.b(this.a, this);
        }
        return true;
    }
}
