package com.google.android.apps.inputmethod.libs.pinyin;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;
import com.google.android.apps.inputmethod.libs.stroke.ime.AbstractHmmChineseStrokeDecodeProcessor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HmmStrokeDecodeProcessor extends AbstractHmmChineseStrokeDecodeProcessor {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final dij e() {
        return dxu.l(this.o);
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    protected final djh g() {
        diy diyVar = new diy(dxu.l(this.o).K("zh-t-i0-stroke"));
        diyVar.i(dxu.l(this.o).H(3));
        diyVar.M();
        return diyVar;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final MutableDictionaryAccessorInterfaceImpl s(Context context) {
        return null;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final MutableDictionaryAccessorInterfaceImpl t(Context context) {
        return dxu.l(context).P();
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final int u() {
        return a() ? 2 : 1;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final int v() {
        return 1;
    }
}
