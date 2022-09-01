package com.google.android.libraries.inputmethod.preferencewidgets.list;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ListPreference extends androidx.preference.ListPreference {
    public int K;
    private final boolean L;
    private final String M;
    private final guh N;

    public ListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean a = gul.a();
        this.L = a;
        if (!a) {
            this.M = "";
            this.N = null;
            return;
        }
        String str = this.t;
        String concat = "ListPreference:".concat(String.valueOf(TextUtils.isEmpty(str) ? this.q.toString() : str));
        this.M = concat;
        this.N = new ioe(this, concat);
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.H();
        guh guhVar = this.N;
        if (guhVar != null) {
            guhVar.e();
        }
    }

    @Override // androidx.preference.Preference
    public final void E() {
        guh guhVar = this.N;
        if (guhVar != null) {
            guhVar.f();
        }
        super.T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void c() {
        if (this.L) {
            guc.a.a(this.j, this.M);
        } else {
            super.c();
        }
    }
}
