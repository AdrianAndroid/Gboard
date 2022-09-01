package com.google.android.apps.inputmethod.libs.korean;

import android.view.inputmethod.EditorInfo;
import com.google.android.libraries.inputmethod.ime.processor.AbstractDoubleSpaceProcessor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KoreanDoubleSpaceProcessor extends AbstractDoubleSpaceProcessor {
    @Override // com.google.android.libraries.inputmethod.ime.processor.AbstractDoubleSpaceProcessor
    protected final boolean a(int i) {
        return Character.isLetterOrDigit(i) || dmf.b((char) i) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.ime.processor.AbstractDoubleSpaceProcessor
    public final boolean b(EditorInfo editorInfo) {
        return ham.at(editorInfo) && super.b(editorInfo);
    }
}
