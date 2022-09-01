package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kvo  reason: default package */
/* loaded from: classes.dex */
public abstract class kvo extends ProgressBar {
    public final kvp a;
    public int b;
    private final int f;
    public boolean c = false;
    public final int d = 4;
    private final Runnable g = new kvl(this, 0);
    private final Runnable h = new kvl(this, 2);
    private final ajz i = new kvm(this);
    private final ajz j = new kvn(this);
    private final boolean e = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public kvo(Context context, AttributeSet attributeSet, int i, int i2) {
        super(kzb.a(context, attributeSet, i, R.style.f207810_resource_name_obfuscated_res_0x7f150a59), attributeSet, i);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray a = kve.a(context2, attributeSet, kwo.a, i, i2, new int[0]);
        a.getInt(5, -1);
        this.f = Math.min(a.getInt(3, -1), 1000);
        a.recycle();
    }

    public abstract kvp a(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* renamed from: b */
    public final kvx getProgressDrawable() {
        return (kvx) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* renamed from: c */
    public final kwe getIndeterminateDrawable() {
        return (kwe) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (!this.e) {
            return;
        }
        ((kwb) getCurrentDrawable()).h(f(), false, z);
    }

    public final void e() {
        if (this.f > 0) {
            SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    final boolean f() {
        if (!aad.ag(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    public void g(int i) {
        if (isIndeterminate()) {
            if (getProgressDrawable() == null) {
                return;
            }
            this.b = i;
            this.c = true;
            if (!getIndeterminateDrawable().isVisible() || kws.g(getContext().getContentResolver()) == 0.0f) {
                this.i.b(getIndeterminateDrawable());
                return;
            } else {
                getIndeterminateDrawable().b.c();
                return;
            }
        }
        super.setProgress(i);
        if (getProgressDrawable() == null) {
            return;
        }
        getProgressDrawable().jumpToCurrentState();
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b.b(this.i);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().d(this.j);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().d(this.j);
        }
        if (f()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.h);
        removeCallbacks(this.g);
        ((kwb) getCurrentDrawable()).j();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().k(this.j);
            getIndeterminateDrawable().b.e();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().k(this.j);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        int b;
        int a;
        kwc kwcVar = null;
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() != null) {
                kwcVar = getIndeterminateDrawable().a;
            }
        } else if (getProgressDrawable() != null) {
            kwcVar = getProgressDrawable().a;
        }
        if (kwcVar == null) {
            return;
        }
        if (kwcVar.b() < 0) {
            b = getDefaultSize(getSuggestedMinimumWidth(), i);
        } else {
            b = kwcVar.b() + getPaddingLeft() + getPaddingRight();
        }
        if (kwcVar.a() < 0) {
            a = getDefaultSize(getSuggestedMinimumHeight(), i2);
        } else {
            a = kwcVar.a() + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(b, a);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d(i == 0);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((kwb) currentDrawable).j();
        }
        super.setIndeterminate(z);
        Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((kwb) currentDrawable2).h(f(), false, false);
        }
        if ((currentDrawable2 instanceof kwe) && f()) {
            ((kwe) currentDrawable2).b.d();
        }
        this.c = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof kwe) {
            ((kwb) drawable).j();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        g(i);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof kvx) {
            kvx kvxVar = (kvx) drawable;
            kvxVar.j();
            super.setProgressDrawable(kvxVar);
            kvxVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }
}
