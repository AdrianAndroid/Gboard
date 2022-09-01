package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: on  reason: default package */
/* loaded from: classes2.dex */
public abstract class on {
    private static final Interpolator a = new om(0);
    private static final Interpolator b = new om(2);
    private int c = -1;

    public static int b(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (i4 ^ (-1));
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 + i4;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static int e(int i, int i2) {
        return i2 << (i * 8);
    }

    public static int f(int i, int i2) {
        int e = e(0, i2 | i);
        return e(2, i) | e(1, i2) | e;
    }

    public final int a(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (i4 ^ (-1));
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(RecyclerView recyclerView, mo moVar) {
        return a(d(recyclerView, moVar), aad.f(recyclerView));
    }

    public abstract int d(RecyclerView recyclerView, mo moVar);

    public void g(RecyclerView recyclerView, mo moVar) {
        View view = moVar.a;
        Object tag = view.getTag(R.id.f56910_resource_name_obfuscated_res_0x7f0b02ba);
        if (tag instanceof Float) {
            aad.S(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.f56910_resource_name_obfuscated_res_0x7f0b02ba, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void h(Canvas canvas, RecyclerView recyclerView, mo moVar, float f, float f2, int i, boolean z) {
        View view = moVar.a;
        if (z && view.getTag(R.id.f56910_resource_name_obfuscated_res_0x7f0b02ba) == null) {
            Float valueOf = Float.valueOf(aad.a(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float a2 = aad.a(childAt);
                    if (a2 > f3) {
                        f3 = a2;
                    }
                }
            }
            aad.S(view, f3 + 1.0f);
            view.setTag(R.id.f56910_resource_name_obfuscated_res_0x7f0b02ba, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public void i(mo moVar, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j(RecyclerView recyclerView, mo moVar) {
        return (c(recyclerView, moVar) & 16711680) != 0;
    }

    public boolean k() {
        throw null;
    }

    public boolean l() {
        return true;
    }

    public abstract boolean m(RecyclerView recyclerView, mo moVar, mo moVar2);

    public final int n(RecyclerView recyclerView, int i, int i2, long j) {
        int i3 = this.c;
        if (i3 == -1) {
            i3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.f36870_resource_name_obfuscated_res_0x7f070306);
            this.c = i3;
        }
        float abs = Math.abs(i2) / i;
        float f = 1.0f;
        int signum = (int) (((int) Math.signum(i2)) * i3 * b.getInterpolation(Math.min(1.0f, abs)));
        if (j <= 2000) {
            f = ((float) j) / 2000.0f;
        }
        int interpolation = (int) (signum * a.getInterpolation(f));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    public abstract void o(mo moVar);
}
