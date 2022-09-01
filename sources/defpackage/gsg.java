package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* renamed from: gsg  reason: default package */
/* loaded from: classes.dex */
public final class gsg implements ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ gsh b;
    private final int[] d = new int[2];
    public final int[] a = new int[2];

    public gsg(gsh gshVar) {
        this.b = gshVar;
    }

    public final void a(int i, int i2, int i3, int i4) {
        int[] iArr = this.d;
        iArr[0] = i;
        iArr[1] = i2;
        int[] iArr2 = this.a;
        iArr2[0] = i3;
        iArr2[1] = i4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int[] iArr = this.d;
        int i = iArr[0];
        int[] iArr2 = this.a;
        int i2 = iArr2[0];
        int i3 = iArr[1];
        this.b.c(2, i + ((i2 - i) * animatedFraction), i3 + ((iArr2[1] - i3) * animatedFraction));
    }
}
