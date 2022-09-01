package com.google.android.apps.inputmethod.libs.framework.keyboard;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.SliderPagingIndicatorView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PageableNonPrimeKeyboard extends PageableKeyboard implements dfa {
    private dfb a;
    private SliderPagingIndicatorView b;
    private String c;
    private int d;

    public PageableNonPrimeKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    private final String x(int i) {
        if (this.d > 1) {
            try {
                return this.u.getString(R.string.f176950_resource_name_obfuscated_res_0x7f140d10, Integer.toString(i + 1));
            } catch (RuntimeException unused) {
                return "";
            }
        }
        return "";
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        if (icfVar.b == ice.BODY) {
            this.a = null;
            this.b = null;
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final boolean ft(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f != null) {
            return (!htg.b(this) && f.c == -10027) || f.c == 66;
        }
        return false;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        if (icfVar.b == ice.BODY) {
            this.a = (dfb) softKeyboardView.findViewById(R.id.f67030_resource_name_obfuscated_res_0x7f0b0830);
            this.b = (SliderPagingIndicatorView) softKeyboardView.findViewById(R.id.f67000_resource_name_obfuscated_res_0x7f0b082d);
            dfb dfbVar = this.a;
            if (dfbVar == null) {
                return;
            }
            dfbVar.b(this);
        }
    }

    @Override // defpackage.det
    public final void gs(deu deuVar, int i) {
        SliderPagingIndicatorView sliderPagingIndicatorView = this.b;
        if (sliderPagingIndicatorView != null) {
            sliderPagingIndicatorView.c(i, 0.0f);
        }
        if (fx().m()) {
            String x = x(i);
            if (!x.equals(this.c)) {
                this.c = x;
                fx().c(x);
            }
        }
        l(deuVar);
    }

    @Override // defpackage.dfa
    public final void gt(int i) {
        this.d = i;
        SliderPagingIndicatorView sliderPagingIndicatorView = this.b;
        if (sliderPagingIndicatorView != null) {
            sliderPagingIndicatorView.b(i);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PageableKeyboard
    protected final boolean m() {
        dfb dfbVar = this.a;
        if (dfbVar != null) {
            dfbVar.J();
            return true;
        }
        return false;
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PageableKeyboard
    protected final boolean o() {
        dfb dfbVar = this.a;
        if (dfbVar != null) {
            dfbVar.K();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String q() {
        this.c = x(0);
        return String.format("%s. %s", super.q(), this.c);
    }

    @Override // defpackage.dfa
    public final void u(int i, float f) {
        SliderPagingIndicatorView sliderPagingIndicatorView = this.b;
        if (sliderPagingIndicatorView != null) {
            sliderPagingIndicatorView.c(i, f);
        }
    }
}
