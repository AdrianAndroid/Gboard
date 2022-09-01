package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ic  reason: default package */
/* loaded from: classes.dex */
public final class ic extends CheckedTextView implements acv {
    private final jh a;
    private final isu b;
    private final hxf c;
    private bek d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f8870_resource_name_obfuscated_res_0x7f0402d6);
        nt.a(context);
        nr.d(this, getContext());
        jh jhVar = new jh(this);
        this.a = jhVar;
        jhVar.g(attributeSet, R.attr.f8870_resource_name_obfuscated_res_0x7f0402d6);
        jhVar.e();
        isu isuVar = new isu(this);
        this.b = isuVar;
        isuVar.c(attributeSet, R.attr.f8870_resource_name_obfuscated_res_0x7f0402d6);
        hxf hxfVar = new hxf(this);
        this.c = hxfVar;
        hxfVar.g(attributeSet);
        c().v(attributeSet, R.attr.f8870_resource_name_obfuscated_res_0x7f0402d6);
    }

    private final bek c() {
        if (this.d == null) {
            this.d = new bek(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
        isu isuVar = this.b;
        if (isuVar != null) {
            isuVar.b();
        }
        hxf hxfVar = this.c;
        if (hxfVar != null) {
            hxfVar.f();
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
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return up.c(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        cz.c(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ej.a(getContext(), i));
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
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(up.d(this, callback));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.h(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        hxf hxfVar = this.c;
        if (hxfVar != null) {
            if (hxfVar.a) {
                hxfVar.a = false;
                return;
            }
            hxfVar.a = true;
            hxfVar.f();
        }
    }
}
