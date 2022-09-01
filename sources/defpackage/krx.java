package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* renamed from: krx  reason: default package */
/* loaded from: classes.dex */
public final class krx {
    public int a = 0;
    public int b = 1;
    private final long c;
    private final long d;
    private final TimeInterpolator e;

    public krx(long j, long j2, TimeInterpolator timeInterpolator) {
        this.c = j;
        this.d = j2;
        this.e = timeInterpolator;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.e;
        return timeInterpolator != null ? timeInterpolator : krt.b;
    }

    public final void b(Animator animator) {
        animator.setStartDelay(this.c);
        animator.setDuration(this.d);
        animator.setInterpolator(a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.a);
            valueAnimator.setRepeatMode(this.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krx)) {
            return false;
        }
        krx krxVar = (krx) obj;
        if (this.c != krxVar.c || this.d != krxVar.d || this.a != krxVar.a || this.b != krxVar.b) {
            return false;
        }
        return a().getClass().equals(krxVar.a().getClass());
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.d;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + a().getClass().hashCode()) * 31) + this.a) * 31) + this.b;
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.c + " duration: " + this.d + " interpolator: " + a().getClass() + " repeatCount: " + this.a + " repeatMode: " + this.b + "}\n";
    }
}
