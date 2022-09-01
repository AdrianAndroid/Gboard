package com.google.android.apps.inputmethod.libs.chinese.ime.hmm;

import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.ime.processor.AbstractAutoSpaceProcessor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ChineseAutoSpaceProcessor extends AbstractAutoSpaceProcessor {
    private static boolean j(int i) {
        return i < 127 && Character.isLetter(i);
    }

    protected boolean a(ino inoVar) {
        return inoVar.aj(R.string.f160670_resource_name_obfuscated_res_0x7f140663);
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.AbstractAutoSpaceProcessor
    protected final boolean b(int i) {
        return j(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.ime.processor.AbstractAutoSpaceProcessor
    public final boolean c(EditorInfo editorInfo, ino inoVar) {
        return super.c(editorInfo, inoVar) && a(inoVar);
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.AbstractAutoSpaceProcessor
    protected final boolean d(int i) {
        return j(i);
    }
}
