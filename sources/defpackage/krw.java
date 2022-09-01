package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: krw  reason: default package */
/* loaded from: classes.dex */
public final class krw {
    private final qv a = new qv();
    private final qv b = new qv();

    public static krw a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        krw krwVar = null;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId);
                if (loadAnimator instanceof AnimatorSet) {
                    krwVar = c(((AnimatorSet) loadAnimator).getChildAnimations());
                } else if (loadAnimator != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(loadAnimator);
                    krwVar = c(arrayList);
                }
            } catch (Exception e) {
                Log.w("MotionSpec", "Can't load animation resource ID #0x".concat(String.valueOf(Integer.toHexString(resourceId))), e);
            }
        }
        return krwVar;
    }

    private static krw c(List list) {
        krw krwVar = new krw();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                krwVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = krt.b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = krt.c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = krt.d;
                }
                krx krxVar = new krx(startDelay, duration, interpolator);
                krxVar.a = objectAnimator.getRepeatCount();
                krxVar.b = objectAnimator.getRepeatMode();
                krwVar.a.put(propertyName, krxVar);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(String.valueOf(animator))));
            }
        }
        return krwVar;
    }

    public final krx b(String str) {
        if (this.a.get(str) == null) {
            throw new IllegalArgumentException();
        }
        return (krx) this.a.get(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof krw) {
            return this.a.equals(((krw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
