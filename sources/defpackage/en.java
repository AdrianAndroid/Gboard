package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: PG */
/* renamed from: en  reason: default package */
/* loaded from: classes.dex */
final class en extends ep {
    private final ObjectAnimator a;
    private final boolean b;

    public en(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        eo eoVar = new eo(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        ey.a(ofInt, true);
        ofInt.setDuration(eoVar.a);
        ofInt.setInterpolator(eoVar);
        this.b = z2;
        this.a = ofInt;
    }

    @Override // defpackage.ep
    public final void a() {
        this.a.start();
    }

    @Override // defpackage.ep
    public final void b() {
        this.a.cancel();
    }

    @Override // defpackage.ep
    public final void c() {
        this.a.reverse();
    }

    @Override // defpackage.ep
    public final boolean d() {
        return this.b;
    }
}
