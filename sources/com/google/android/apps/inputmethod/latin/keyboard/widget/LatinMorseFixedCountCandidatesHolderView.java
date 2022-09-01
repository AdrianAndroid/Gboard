package com.google.android.apps.inputmethod.latin.keyboard.widget;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinMorseFixedCountCandidatesHolderView extends LatinFixedCountCandidatesHolderView {
    public LatinMorseFixedCountCandidatesHolderView(Context context) {
        super(context);
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.widget.LatinFixedCountCandidatesHolderView
    protected final int a(iay iayVar) {
        Object obj = iayVar.e;
        if (obj == null) {
            return 0;
        }
        return ((Integer) obj).intValue() - 1;
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.widget.LatinFixedCountCandidatesHolderView
    protected final deb d(Context context, bqi bqiVar) {
        return new bqk(context, bqiVar);
    }

    public LatinMorseFixedCountCandidatesHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
