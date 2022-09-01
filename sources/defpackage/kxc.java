package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* renamed from: kxc */
/* loaded from: classes.dex */
public class kxc {
    public static kxa b(kxa kxaVar, float f) {
        return kxaVar instanceof kxg ? kxaVar : new kwz(f, kxaVar);
    }

    public static Typeface c(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0) {
            return null;
        }
        return Typeface.create(typeface, ld.c(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static int e(int i, int i2) {
        return vo.d(i, (Color.alpha(i) * i2) / 255);
    }

    public static int f(View view, int i) {
        return i(view.getContext(), kws.e(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    public static int g(Context context, int i, int i2) {
        TypedValue d = kws.d(context, i);
        return d != null ? i(context, d) : i2;
    }

    public static int h(int i, int i2, float f) {
        return vo.c(vo.d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static int i(Context context, TypedValue typedValue) {
        if (typedValue.resourceId != 0) {
            return us.a(context, typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static boolean j(int i) {
        if (i != 0) {
            double[] dArr = (double[]) vo.a.get();
            if (dArr == null) {
                dArr = new double[3];
                vo.a.set(dArr);
            }
            vo.e(Color.red(i), Color.green(i), Color.blue(i), dArr);
            return dArr[1] / 100.0d > 0.5d;
        }
        return false;
    }

    public static void k(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static /* synthetic */ void l(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception unused) {
        }
    }

    public void a(kxt kxtVar, float f, float f2) {
    }

    public static void d(Drawable drawable, int i) {
        if (i == 0) {
            wf.g(drawable, null);
        } else {
            wf.f(drawable, i);
        }
    }
}
