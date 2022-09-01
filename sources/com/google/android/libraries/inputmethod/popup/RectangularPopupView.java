package com.google.android.libraries.inputmethod.popup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RectangularPopupView extends ill {
    private final ily c;

    public RectangularPopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // defpackage.ill, defpackage.ilv
    public final iay a(float f, float f2, boolean z) {
        return this.c.k(f, f2);
    }

    @Override // defpackage.ill, defpackage.ilv
    public final iay b(SoftKeyboardView softKeyboardView, View view, float f, float f2, ial ialVar, int[] iArr, boolean z) {
        c();
        if (!ialVar.f()) {
            return null;
        }
        this.c.c(this, softKeyboardView, view, f, f2, ialVar, iArr);
        return this.c.a();
    }

    @Override // defpackage.ill, defpackage.ilv
    public final void e() {
        this.c.d();
    }

    @Override // defpackage.ill, defpackage.ilv
    public final void f(View.OnClickListener onClickListener) {
        this.c.g(onClickListener);
    }

    @Override // defpackage.ill, defpackage.ilv
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ill, defpackage.ilv
    public final boolean h() {
        return this.c.j();
    }

    public RectangularPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ily(context, attributeSet, imc.b);
    }
}
