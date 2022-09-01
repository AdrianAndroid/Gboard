package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: om  reason: default package */
/* loaded from: classes2.dex */
public final class om implements Interpolator {
    private final /* synthetic */ int a;

    public om(int i) {
        this.a = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            } else if (i == 2) {
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            } else if (i != 3) {
                float f4 = f - 1.0f;
                return i != 4 ? (f4 * f4 * f4 * f4 * f4) + 1.0f : (f4 * f4 * f4 * f4 * f4) + 1.0f;
            } else {
                float f5 = f - 1.0f;
                return (f5 * f5 * f5 * f5 * f5) + 1.0f;
            }
        }
        return f * f * f * f * f;
    }
}
