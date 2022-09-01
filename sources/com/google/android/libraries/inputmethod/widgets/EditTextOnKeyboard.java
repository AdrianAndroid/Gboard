package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EditTextOnKeyboard extends AppCompatEditText implements hpu {
    private static final lug a = hin.a;
    private final Context b;
    private final EditorInfo c;
    private jcx d;
    private final jcy e;
    private int f;
    private boolean g;
    private hpt h;

    public EditTextOnKeyboard(Context context) {
        this(context, null);
    }

    private final void f() {
        jcx jcxVar = this.d;
        if (jcxVar == null) {
            this.d = new jcx(this, this.c);
        } else {
            jcxVar.setTarget(jcxVar.a.onCreateInputConnection(jcxVar.b));
        }
    }

    private final void g() {
        hpt hptVar;
        if (!isActivated() || (hptVar = this.h) == null) {
            return;
        }
        jcy jcyVar = this.e;
        hptVar.b(jcyVar.a, jcyVar.b, jcyVar.c, jcyVar.d, jcyVar.e, jcyVar.f);
    }

    private final boolean h() {
        return this.f != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean i() {
        /*
            r10 = this;
            android.text.Editable r0 = r10.mo22getText()
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L48
            java.lang.String r3 = "android.view.inputmethod.ComposingText"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L31
            int r4 = r0.length()     // Catch: java.lang.ClassNotFoundException -> L31
            java.lang.Object[] r3 = r0.getSpans(r1, r4, r3)     // Catch: java.lang.ClassNotFoundException -> L31
            if (r3 == 0) goto L2d
            int r4 = r3.length     // Catch: java.lang.ClassNotFoundException -> L31
            if (r4 <= 0) goto L2d
            r4 = r3[r1]     // Catch: java.lang.ClassNotFoundException -> L31
            int r4 = r0.getSpanStart(r4)     // Catch: java.lang.ClassNotFoundException -> L31
            r3 = r3[r1]     // Catch: java.lang.ClassNotFoundException -> L29
            int r0 = r0.getSpanEnd(r3)     // Catch: java.lang.ClassNotFoundException -> L29
            r2 = r0
            goto L2e
        L29:
            r0 = move-exception
            r9 = r0
            r0 = r4
            goto L34
        L2d:
            r4 = -1
        L2e:
            r0 = r2
            r2 = r4
            goto L49
        L31:
            r0 = move-exception
            r9 = r0
            r0 = -1
        L34:
            lug r3 = com.google.android.libraries.inputmethod.widgets.EditTextOnKeyboard.a
            ltv r3 = r3.c()
            java.lang.String r4 = "error getting composing range."
            java.lang.String r5 = "com/google/android/libraries/inputmethod/widgets/EditTextOnKeyboard"
            java.lang.String r6 = "refreshComposingRegion"
            r7 = 238(0xee, float:3.34E-43)
            java.lang.String r8 = "EditTextOnKeyboard.java"
            defpackage.f.j(r3, r4, r5, r6, r7, r8, r9)
            r2 = r0
        L48:
            r0 = -1
        L49:
            jcy r3 = r10.e
            int r4 = r3.e
            if (r4 != r2) goto L55
            int r4 = r3.f
            if (r4 == r0) goto L54
            goto L55
        L54:
            return r1
        L55:
            r3.e = r2
            r3.f = r0
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.inputmethod.widgets.EditTextOnKeyboard.i():boolean");
    }

    @Override // defpackage.hpu
    public final EditorInfo a() {
        if (this.d == null) {
            this.d = new jcx(this, this.c);
        }
        return this.c;
    }

    @Override // defpackage.hpu
    public final InputConnection b() {
        if (this.d == null) {
            this.d = new jcx(this, this.c);
        }
        return this.d;
    }

    @Override // android.widget.TextView
    public final void beginBatchEdit() {
        super.beginBatchEdit();
        this.f++;
    }

    @Override // defpackage.hpu
    public final void c(hpt hptVar) {
        this.h = hptVar;
    }

    @Override // defpackage.hpu
    public final void d() {
        this.h = null;
        jcx jcxVar = this.d;
        if (jcxVar != null && Build.VERSION.SDK_INT >= 24) {
            jcxVar.closeConnection();
        }
        this.d = null;
    }

    public final void e(String... strArr) {
        StringBuilder sb = new StringBuilder();
        String packageName = this.b.getPackageName();
        for (int i = 0; i <= 0; i++) {
            String str = strArr[i];
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(ham.h(packageName, str));
        }
        setPrivateImeOptions(sb.toString());
    }

    @Override // android.widget.TextView
    public final void endBatchEdit() {
        super.endBatchEdit();
        int i = this.f - 1;
        this.f = i;
        if (i < 0) {
            throw new IllegalStateException("endBatchEdit and beginBatchEdit should be pairs, More endBatchEdit here.");
        }
        if (!isActivated() || h()) {
            return;
        }
        if (!i() && !this.g) {
            return;
        }
        this.g = false;
        g();
    }

    @Override // android.view.View
    public final boolean hasFocus() {
        return isEnabled();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return isEnabled();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return isEnabled();
    }

    @Override // android.widget.TextView
    public final boolean isInputMethodTarget() {
        return true;
    }

    @Override // android.widget.TextView
    protected final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        jcy jcyVar = this.e;
        if (jcyVar == null) {
            return;
        }
        jcyVar.a = jcyVar.c;
        jcyVar.b = jcyVar.d;
        jcyVar.c = i;
        jcyVar.d = i2;
        i();
        if (h()) {
            this.g = true;
        }
        if (!isActivated() || h()) {
            return;
        }
        g();
    }

    @Override // android.widget.TextView
    public final void setImeOptions(int i) {
        int imeOptions = getImeOptions();
        super.setImeOptions(i);
        if (imeOptions != i) {
            f();
        }
    }

    @Override // android.widget.TextView
    public final void setInputType(int i) {
        super.setInputType(i);
        f();
    }

    @Override // android.widget.TextView
    public final void setPrivateImeOptions(String str) {
        super.setPrivateImeOptions(str);
        f();
    }

    public EditTextOnKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new jcy();
        this.b = context;
        this.f = 0;
        this.g = false;
        setCustomSelectionActionModeCallback(new jcw());
        ham.q(this);
        EditorInfo editorInfo = new EditorInfo();
        this.c = editorInfo;
        editorInfo.packageName = context.getPackageName();
        editorInfo.initialSelStart = 0;
        editorInfo.initialSelEnd = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingText("");
        }
        this.d = new jcx(this, editorInfo);
    }
}
