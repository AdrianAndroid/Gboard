package com.google.android.apps.inputmethod.libs.cantonese;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;
import com.google.android.apps.inputmethod.libs.stroke.ime.AbstractHmmChineseStrokeDecodeProcessor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HmmStrokeDecodeProcessor extends AbstractHmmChineseStrokeDecodeProcessor {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final dij e() {
        return btg.a(this.o);
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    protected final djh g() {
        diy diyVar = new diy(btg.a(this.o).n());
        diyVar.i(btg.a(this.o).H(3));
        diyVar.M();
        return diyVar;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final MutableDictionaryAccessorInterfaceImpl s(Context context) {
        return null;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final MutableDictionaryAccessorInterfaceImpl t(Context context) {
        return btg.a(context).M(3);
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final int u() {
        return a() ? 1 : 2;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final int v() {
        return 2;
    }
}
