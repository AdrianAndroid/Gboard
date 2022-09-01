package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: as  reason: default package */
/* loaded from: classes.dex */
public final class as extends FrameLayout {
    private View.OnApplyWindowInsetsListener d;
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    public boolean a = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(Context context, AttributeSet attributeSet, bi biVar) {
        super(context, attributeSet);
        View view;
        oll.e(context, "context");
        oll.e(attributeSet, "attrs");
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        an d = biVar.d(id);
        if (classAttribute != null && d == null) {
            if (id <= 0) {
                String concat = string != null ? " with tag ".concat(string) : "";
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + ((Object) classAttribute) + concat);
            }
            at f = biVar.f();
            context.getClassLoader();
            an c = f.c(classAttribute);
            oll.d(c, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            c.aq();
            bq i = biVar.i();
            i.s();
            c.N = this;
            i.f(getId(), c, string, 1);
            i.e();
        }
        for (bn bnVar : biVar.a.e()) {
            an anVar = bnVar.b;
            if (anVar.E == getId() && (view = anVar.O) != null && view.getParent() == null) {
                anVar.N = this;
                bnVar.a();
            }
        }
    }

    private final void a(View view) {
        if (this.c.contains(view)) {
            this.b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        oll.e(view, "child");
        Object tag = view.getTag(R.id.f55630_resource_name_obfuscated_res_0x7f0b021f);
        if ((tag instanceof an ? (an) tag : null) == null) {
            throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        abc y;
        int childCount;
        oll.e(windowInsets, "insets");
        abc m = abc.m(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.d;
        if (onApplyWindowInsetsListener != null) {
            oll.e(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            oll.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            y = abc.m(onApplyWindowInsets);
        } else {
            y = aad.y(this, m);
        }
        if (!y.r() && (childCount = getChildCount()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                aad.w(getChildAt(i), y);
                if (i2 >= childCount) {
                    break;
                }
                i = i2;
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        oll.e(canvas, "canvas");
        if (this.a) {
            for (View view : this.b) {
                super.drawChild(canvas, view, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        oll.e(canvas, "canvas");
        oll.e(view, "child");
        if (!this.a || this.b.isEmpty() || !this.b.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        oll.e(view, "view");
        this.c.remove(view);
        if (this.b.remove(view)) {
            this.a = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        oll.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i = childCount - 1;
                View childAt = getChildAt(childCount);
                oll.d(childAt, "view");
                a(childAt);
                if (i < 0) {
                    break;
                }
                childCount = i;
            }
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        oll.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        oll.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        oll.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        if (i < i3) {
            int i4 = i;
            while (true) {
                int i5 = i4 + 1;
                View childAt = getChildAt(i4);
                oll.d(childAt, "view");
                a(childAt);
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        if (i < i3) {
            int i4 = i;
            while (true) {
                int i5 = i4 + 1;
                View childAt = getChildAt(i4);
                oll.d(childAt, "view");
                a(childAt);
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        oll.e(onApplyWindowInsetsListener, "listener");
        this.d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        oll.e(view, "view");
        if (view.getParent() == this) {
            this.c.add(view);
        }
        super.startViewTransition(view);
    }
}
