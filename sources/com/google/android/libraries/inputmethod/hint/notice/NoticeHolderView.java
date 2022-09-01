package com.google.android.libraries.inputmethod.hint.notice;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NoticeHolderView extends LinearLayout implements jdb {
    public jdr a;
    public gqc b;
    public float c = 1.0f;

    public NoticeHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        this.a = jdrVar;
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        this.b = gqcVar;
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        this.c = f * f2;
    }
}
