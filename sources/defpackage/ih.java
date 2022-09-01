package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ih  reason: default package */
/* loaded from: classes.dex */
public final class ih extends MultiAutoCompleteTextView implements acv {
    private static final int[] a = {16843126};
    private final jh b;
    private final isu c;
    private final azp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f7930_resource_name_obfuscated_res_0x7f040258);
        nt.a(context);
        nr.d(this, getContext());
        gkn w = gkn.w(getContext(), attributeSet, a, R.attr.f7930_resource_name_obfuscated_res_0x7f040258, 0);
        if (w.t(0)) {
            setDropDownBackgroundDrawable(w.n(0));
        }
        w.r();
        isu isuVar = new isu(this);
        this.c = isuVar;
        isuVar.c(attributeSet, R.attr.f7930_resource_name_obfuscated_res_0x7f040258);
        jh jhVar = new jh(this);
        this.b = jhVar;
        jhVar.g(attributeSet, R.attr.f7930_resource_name_obfuscated_res_0x7f040258);
        jhVar.e();
        azp azpVar = new azp(this);
        this.d = azpVar;
        azpVar.o(attributeSet, R.attr.f7930_resource_name_obfuscated_res_0x7f040258);
        KeyListener keyListener = getKeyListener();
        if (azp.p(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener q = azp.q(keyListener);
            if (q == keyListener) {
                return;
            }
            super.setKeyListener(q);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        cz.c(onCreateInputConnection, editorInfo, this);
        return this.d.r(onCreateInputConnection);
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

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ej.a(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(azp.q(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jh jhVar = this.b;
        if (jhVar != null) {
            jhVar.h(context, i);
        }
    }
}
