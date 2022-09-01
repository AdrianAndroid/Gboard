package com.google.android.apps.inputmethod.libs.expression.keyboard;

import android.content.Context;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EditableExpressionKeyboard extends BaseExpressionKeyboard implements dbo {
    public EditableExpressionKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.BaseExpressionKeyboard, defpackage.gzv
    public final String getDumpableTag() {
        return "EditableExpressionKeyboard";
    }

    @Override // defpackage.dbo
    public final hpu t(EditorInfo editorInfo) {
        cts ctsVar = (cts) m();
        if (ctsVar != null) {
            return ctsVar.a();
        }
        return null;
    }

    @Override // defpackage.dbo
    public final void u(CharSequence charSequence) {
        cts ctsVar = (cts) m();
        if (ctsVar != null) {
            ctsVar.b();
        }
    }

    @Override // defpackage.dbo
    public final /* synthetic */ void v(CharSequence charSequence) {
    }

    @Override // defpackage.dbp
    public final void w(String str) {
        cts ctsVar = (cts) m();
        if (ctsVar != null) {
            ctsVar.d(lfd.d(str));
        }
    }
}
