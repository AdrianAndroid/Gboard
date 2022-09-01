package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: PG */
/* renamed from: jp  reason: default package */
/* loaded from: classes.dex */
public final class jp extends ToggleButton implements acv {
    private final jh a;
    private final isu b;
    private bek c;

    public jp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        nr.d(this, getContext());
        isu isuVar = new isu(this);
        this.b = isuVar;
        isuVar.c(attributeSet, 16842827);
        jh jhVar = new jh(this);
        this.a = jhVar;
        jhVar.g(attributeSet, 16842827);
        c().v(attributeSet, 16842827);
    }

    private final bek c() {
        if (this.c == null) {
            this.c = new bek(this);
        }
        return this.c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        isu isuVar = this.b;
        if (isuVar != null) {
            isuVar.b();
        }
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // defpackage.acv
    public final void eU(ColorStateList colorStateList) {
        this.a.m(colorStateList);
        this.a.e();
    }

    @Override // defpackage.acv
    public final void eV(PorterDuff.Mode mode) {
        this.a.n(mode);
        this.a.e();
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c();
        aen.b();
    }

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        isu isuVar = this.b;
        if (isuVar != null) {
            isuVar.f();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        isu isuVar = this.b;
        if (isuVar != null) {
            isuVar.d(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        c();
        aen.b();
        super.setFilters(inputFilterArr);
    }
}
