package com.google.android.libraries.inputmethod.popup;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BasicPopupView extends ill {
    private iay c;
    private AppCompatTextView d;
    private ImageView e;
    private boolean f = true;
    private boolean g = true;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private View k;

    public BasicPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.ill, defpackage.ilv
    public final iay a(float f, float f2, boolean z) {
        return this.c;
    }

    @Override // defpackage.ill, defpackage.ilv
    public iay b(SoftKeyboardView softKeyboardView, View view, float f, float f2, ial ialVar, int[] iArr, boolean z) {
        c();
        if (ialVar == null || !ialVar.f()) {
            return null;
        }
        this.c = ialVar.d[0];
        int b = ialVar.b(0);
        String e = ialVar.e(0);
        this.j = ialVar.c == iah.LONG_PRESS;
        int i = 8;
        if (b != 0) {
            AppCompatTextView appCompatTextView = this.d;
            if (appCompatTextView != null && !this.f) {
                appCompatTextView.setVisibility(8);
                this.f = true;
            }
            boolean z2 = this.j;
            if (this.e != null) {
                if (z2 != this.i) {
                    setPressed(z2);
                    this.i = z2;
                }
                this.e.setImageDrawable(hjg.n(getContext()).b(b));
                if (this.g) {
                    this.e.setVisibility(0);
                    this.g = false;
                }
            }
        } else if (e != null) {
            ImageView imageView = this.e;
            if (imageView != null && !this.g) {
                imageView.setImageDrawable(null);
                this.e.setVisibility(8);
                this.g = true;
            }
            CharSequence a = this.a.a(e, this.c.d);
            boolean z3 = this.j;
            if (this.d != null) {
                if (z3 != this.h) {
                    setPressed(z3);
                    this.h = z3;
                }
                this.d.setText(a);
                if (this.f) {
                    this.d.setVisibility(0);
                    this.f = false;
                }
            }
        }
        View view2 = this.k;
        if (view2 != null) {
            if (true == z) {
                i = 0;
            }
            view2.setVisibility(i);
        }
        iArr[2] = 19;
        iArr[0] = 0;
        iArr[1] = 0;
        return this.c;
    }

    @Override // defpackage.ill, defpackage.ilv
    public final boolean g() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ill, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.d = (AppCompatTextView) findViewById(R.id.f67320_resource_name_obfuscated_res_0x7f0b0850);
        this.e = (ImageView) findViewById(R.id.f67310_resource_name_obfuscated_res_0x7f0b084f);
        this.k = findViewById(R.id.f67280_resource_name_obfuscated_res_0x7f0b084c);
    }

    public BasicPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
