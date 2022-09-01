package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kyr  reason: default package */
/* loaded from: classes.dex */
public final class kyr extends LinearLayout {
    ValueAnimator a;
    final /* synthetic */ kyv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyr(kyv kyvVar, Context context) {
        super(context);
        this.b = kyvVar;
        setWillNotDraw(false);
    }

    public final void a() {
        View childAt = getChildAt(this.b.a());
        kyv kyvVar = this.b;
        Drawable drawable = kyvVar.i;
        RectF f = laq.f(kyvVar, childAt);
        drawable.setBounds((int) f.left, drawable.getBounds().top, (int) f.right, drawable.getBounds().bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        Rect bounds = this.b.i.getBounds();
        this.b.i.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        if (view != null && view.getWidth() > 0) {
            kyv kyvVar = this.b;
            kyvVar.w.a(kyvVar, view, view2, f, kyvVar.i);
        } else {
            Drawable drawable = this.b.i;
            drawable.setBounds(-1, drawable.getBounds().top, -1, this.b.i.getBounds().bottom);
        }
        aad.G(this);
    }

    public final void d(boolean z, int i, int i2) {
        View childAt = getChildAt(this.b.a());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a();
            return;
        }
        kyq kyqVar = new kyq(this, childAt, childAt2, 0);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.a = valueAnimator;
            valueAnimator.setInterpolator(krt.b);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(kyqVar);
            valueAnimator.start();
            return;
        }
        this.a.removeAllUpdateListeners();
        this.a.addUpdateListener(kyqVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        int height2 = this.b.i.getBounds().height();
        if (height2 < 0) {
            height2 = this.b.i.getIntrinsicHeight();
        }
        int i = this.b.p;
        if (i == 0) {
            height = getHeight() - height2;
            height2 = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                height2 = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - height2) / 2;
            height2 = (getHeight() + height2) / 2;
        }
        if (this.b.i.getBounds().width() > 0) {
            Rect bounds = this.b.i.getBounds();
            this.b.i.setBounds(bounds.left, height, bounds.right, height2);
            this.b.i.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            a();
        } else {
            d(false, this.b.a(), -1);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        kyv kyvVar = this.b;
        if (kyvVar.n != 1 && kyvVar.q != 2) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                i3 = Math.max(i3, childAt.getMeasuredWidth());
            }
        }
        if (i3 <= 0) {
            return;
        }
        int a = (int) kvj.a(getContext(), 16);
        if (i3 * childCount <= getMeasuredWidth() - (a + a)) {
            boolean z = false;
            for (int i5 = 0; i5 < childCount; i5++) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                    layoutParams.width = i3;
                    layoutParams.weight = 0.0f;
                    z = true;
                }
            }
            if (!z) {
                return;
            }
        } else {
            kyv kyvVar2 = this.b;
            kyvVar2.n = 0;
            kyvVar2.k(false);
        }
        super.onMeasure(i, i2);
    }
}
