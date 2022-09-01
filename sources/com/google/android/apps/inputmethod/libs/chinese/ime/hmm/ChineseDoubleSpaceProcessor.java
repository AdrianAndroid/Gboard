package com.google.android.apps.inputmethod.libs.chinese.ime.hmm;

import com.google.android.libraries.inputmethod.ime.processor.AbstractDoubleSpaceProcessor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ChineseDoubleSpaceProcessor extends AbstractDoubleSpaceProcessor {
    @Override // com.google.android.libraries.inputmethod.ime.processor.AbstractDoubleSpaceProcessor
    protected final boolean a(int i) {
        return Character.isLetterOrDigit(i) || jbs.i(i);
    }
}
