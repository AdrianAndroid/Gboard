package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: PG */
/* renamed from: eo  reason: default package */
/* loaded from: classes.dex */
final class eo implements TimeInterpolator {
    public int a;
    private int[] b;
    private int c;

    public eo(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.c = numberOfFrames;
        int[] iArr = this.b;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.b = new int[numberOfFrames];
        }
        int[] iArr2 = this.b;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.a = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = (int) ((f * this.a) + 0.5f);
        int i2 = this.c;
        int[] iArr = this.b;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        return (i3 / i2) + (i3 < i2 ? i / this.a : 0.0f);
    }
}
