package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hi  reason: default package */
/* loaded from: classes.dex */
public abstract class hi extends ViewGroup {
    protected final hh a;
    public final Context b;
    public ActionMenuView c;
    public hs d;
    public int e;
    protected aqq f;
    private boolean g;
    private boolean h;

    hi(Context context) {
        this(context, null);
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public static final int e(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static final int f(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public void c(int i) {
        throw null;
    }

    public final aqq g(int i, long j) {
        aqq aqqVar = this.f;
        if (aqqVar != null) {
            aqqVar.i();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            aqq aq = aad.aq(this);
            aq.j(1.0f);
            aq.k(j);
            hh hhVar = this.a;
            hhVar.d(aq, 0);
            aq.l(hhVar);
            return aq;
        }
        aqq aq2 = aad.aq(this);
        aq2.j(0.0f);
        aq2.k(j);
        hh hhVar2 = this.a;
        hhVar2.d(aq2, i);
        aq2.l(hhVar2);
        return aq2;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, ei.a, R.attr.f7370_resource_name_obfuscated_res_0x7f040217, 0);
        c(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        hs hsVar = this.d;
        if (hsVar != null) {
            hsVar.h = cy.b(hsVar.b);
            gm gmVar = hsVar.c;
            if (gmVar == null) {
                return;
            }
            gmVar.l(true);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.h = false;
            actionMasked = 9;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.h = true;
                }
                if (i != 10 || i == 3) {
                    this.h = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.h = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            actionMasked = 0;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.g = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            aqq aqqVar = this.f;
            if (aqqVar != null) {
                aqqVar.i();
            }
            super.setVisibility(i);
        }
    }

    public hi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public hi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new hh(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.f7340_resource_name_obfuscated_res_0x7f040214, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
