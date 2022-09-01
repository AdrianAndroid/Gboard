package com.google.android.apps.inputmethod.libs.search.keyboard;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.apps.inputmethod.libs.search.widget.VariableHeightSoftKeyboardView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractSearchResultKeyboard extends LifecycleKeyboard implements dbp {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/keyboard/AbstractSearchResultKeyboard");
    private hzr b = icu.l(new ebj(2));
    private SoftKeyboardView c;
    private VariableHeightSoftKeyboardView d;
    public String o;
    protected dyz p;

    public AbstractSearchResultKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    protected dyz H() {
        return new dyx(this.u);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean M(int i) {
        return !this.C;
    }

    public final String U() {
        String str = this.o;
        return str == null ? "" : str;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null || f.c != -10004) {
            return super.c(hfdVar);
        }
        this.v.z(cnx.d(this.u, f, dip.j(lfd.d(this.o), hfl.EXTERNAL)));
        return true;
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public void close() {
        super.close();
        hzr hzrVar = this.b;
        if (hzrVar != null) {
            hzrVar.e();
            this.b = null;
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fA(icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            this.c = null;
        } else if (icfVar.b != ice.BODY) {
        } else {
            this.d = null;
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            this.c = softKeyboardView;
        } else if (icfVar.b != ice.BODY || !(softKeyboardView instanceof VariableHeightSoftKeyboardView)) {
        } else {
            this.d = (VariableHeightSoftKeyboardView) softKeyboardView;
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void g(EditorInfo editorInfo, Object obj) {
        VariableHeightSoftKeyboardView variableHeightSoftKeyboardView;
        SoftKeyboardView softKeyboardView;
        super.g(editorInfo, obj);
        View X = X(ice.BODY);
        if (X == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/search/keyboard/AbstractSearchResultKeyboard", "prepareAndRunCorpusChangeAnimation", 173, "AbstractSearchResultKeyboard.java")).t("Container view is null, cannot run corpus selector animation.");
        } else {
            if (this.p == null) {
                this.p = H();
            }
            this.p.a(X, m());
        }
        if (!dip.m(obj) || (variableHeightSoftKeyboardView = this.d) == null || (softKeyboardView = this.c) == null) {
            return;
        }
        variableHeightSoftKeyboardView.b(softKeyboardView);
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void h() {
        super.h();
        VariableHeightSoftKeyboardView variableHeightSoftKeyboardView = this.d;
        if (variableHeightSoftKeyboardView != null) {
            variableHeightSoftKeyboardView.clearAnimation();
            this.d.h();
        }
        this.o = null;
    }

    protected abstract int m();

    @Override // defpackage.dbp
    public final void w(String str) {
        this.o = str;
    }
}
