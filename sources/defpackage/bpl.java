package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: bpl  reason: default package */
/* loaded from: classes.dex */
public final class bpl implements hte {
    public boolean a;
    public final ValueAnimator b;
    public View c;
    public View d;
    public View e;
    public View f;
    public bpi g;
    public View h;
    public Runnable i;
    public boolean j;
    private final int k;
    private int l;
    private int m;
    private int n;
    private final AnimatorSet o = new AnimatorSet();

    public bpl(int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        this.k = i;
        ofFloat.addUpdateListener(new op(this, 4));
        ofFloat.addListener(new bpj(this));
    }

    public final void a(float f) {
        int height = this.h.getHeight();
        if (height == 0) {
            return;
        }
        float f2 = (((this.m - this.l) + 0.0f) * f) + 0.0f;
        this.d.setTranslationY(-f2);
        this.e.setTranslationY(f2);
        float f3 = this.m / height;
        this.h.setScaleY(f3 + ((1.0f - f3) * f));
        View view = this.h;
        float f4 = this.n - this.m;
        view.setTranslationY(f4 + ((-f4) * f));
        this.h.setAlpha(f);
    }

    @Override // defpackage.hte
    public final void b() {
        this.b.cancel();
    }

    @Override // defpackage.hte
    public final boolean c(View view, View view2, String str, int i, String str2, int i2, Runnable runnable) {
        if (!d(view, view2, str, i, str2, i2) || !this.j) {
            return false;
        }
        this.j = false;
        bpi bpiVar = this.g;
        if (bpiVar == null) {
            return false;
        }
        bpiVar.f();
        View view3 = bpiVar.g;
        this.h = view3;
        if (view3 == null) {
            return false;
        }
        float f = 0.0f;
        view3.setPivotY(0.0f);
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        layoutParams.height = -2;
        this.f.setLayoutParams(layoutParams);
        if (this.a) {
            this.c = view;
            this.d = view2;
        } else {
            this.c = view2;
            this.d = view;
        }
        this.l = this.d.getHeight();
        this.m = this.c.getHeight();
        Rect rect = new Rect();
        this.c.getWindowVisibleDisplayFrame(rect);
        this.n = rect.height();
        this.c.bringToFront();
        if (true != this.a) {
            f = 1.0f;
        }
        a(f);
        this.o.play(this.b);
        if (runnable != null) {
            this.o.addListener(new bpk(runnable));
        }
        this.o.start();
        return true;
    }

    @Override // defpackage.hte
    public final boolean d(View view, View view2, String str, int i, String str2, int i2) {
        return view != null && view != view2 && i == i2 && i == this.k;
    }
}
