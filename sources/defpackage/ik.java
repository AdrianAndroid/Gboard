package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ik  reason: default package */
/* loaded from: classes.dex */
public class ik extends RadioButton implements acv {
    private final id a;
    private final jh b;
    private final isu c;
    private bek d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f16260_resource_name_obfuscated_res_0x7f04064b);
        nt.a(context);
        nr.d(this, getContext());
        id idVar = new id(this);
        this.a = idVar;
        idVar.b(attributeSet, R.attr.f16260_resource_name_obfuscated_res_0x7f04064b);
        isu isuVar = new isu(this);
        this.c = isuVar;
        isuVar.c(attributeSet, R.attr.f16260_resource_name_obfuscated_res_0x7f04064b);
        jh jhVar = new jh(this);
        this.b = jhVar;
        jhVar.g(attributeSet, R.attr.f16260_resource_name_obfuscated_res_0x7f04064b);
        c().v(attributeSet, R.attr.f16260_resource_name_obfuscated_res_0x7f04064b);
    }

    private final bek c() {
        if (this.d == null) {
            this.d = new bek(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        isu isuVar = this.c;
        if (isuVar != null) {
            isuVar.b();
        }
        jh jhVar = this.b;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // defpackage.acv
    public final void eU(ColorStateList colorStateList) {
        this.b.m(colorStateList);
        this.b.e();
    }

    @Override // defpackage.acv
    public final void eV(PorterDuff.Mode mode) {
        this.b.n(mode);
        this.b.e();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c();
        aen.b();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        isu isuVar = this.c;
        if (isuVar != null) {
            isuVar.f();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        isu isuVar = this.c;
        if (isuVar != null) {
            isuVar.d(i);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(ej.a(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jh jhVar = this.b;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jh jhVar = this.b;
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

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        id idVar = this.a;
        if (idVar != null) {
            idVar.c();
        }
    }
}
