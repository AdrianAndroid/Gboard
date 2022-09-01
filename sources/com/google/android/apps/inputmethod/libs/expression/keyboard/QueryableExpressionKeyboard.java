package com.google.android.apps.inputmethod.libs.expression.keyboard;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class QueryableExpressionKeyboard extends BaseExpressionKeyboard implements dbp {
    public QueryableExpressionKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.BaseExpressionKeyboard, defpackage.gzv
    public final String getDumpableTag() {
        return "QueryableExpressionKeyboard";
    }

    @Override // defpackage.dbp
    public final void w(String str) {
        ctv ctvVar = (ctv) m();
        if (ctvVar != null) {
            ctvVar.d(lfd.d(str));
        }
    }
}
