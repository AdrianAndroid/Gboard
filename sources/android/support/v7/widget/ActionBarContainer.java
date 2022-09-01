package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public Drawable a;
    public Drawable b;
    public Drawable c;
    public boolean d;
    public boolean e;
    private boolean f;
    private View g;
    private View h;
    private int i;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        this.f = z;
        setDescendantFocusability(true != z ? 262144 : 393216);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.a;
        if (drawable != null && drawable.isStateful()) {
            this.a.setState(getDrawableState());
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.b.setState(getDrawableState());
        }
        Drawable drawable3 = this.c;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.c.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = findViewById(R.id.f52050_resource_name_obfuscated_res_0x7f0b0048);
        this.h = findViewById(R.id.f52110_resource_name_obfuscated_res_0x7f0b0050);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.d) {
            Drawable drawable = this.c;
            if (drawable == null) {
                return;
            }
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            if (this.a != null) {
                z2 = true;
                if (this.g.getVisibility() == 0) {
                    this.a.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
                } else {
                    View view = this.h;
                    if (view == null || view.getVisibility() != 0) {
                        this.a.setBounds(0, 0, 0, 0);
                    } else {
                        this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                    }
                }
            } else {
                z2 = false;
            }
            this.e = false;
            if (!z2) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.g == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.i) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.g == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.a || this.d) {
            return (drawable == this.c && this.d) || super.verifyDrawable(drawable);
        }
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        aad.O(this, new hj(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ei.a);
        boolean z = false;
        this.a = obtainStyledAttributes.getDrawable(0);
        this.b = obtainStyledAttributes.getDrawable(2);
        this.i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.f128930_resource_name_obfuscated_res_0x7f0b2119) {
            this.d = true;
            this.c = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.d ? !(this.a != null || this.b != null) : this.c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }
}
