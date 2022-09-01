package com.google.android.apps.inputmethod.libs.cantonese;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CantoneseHmmDecodeProcessor extends AbstractHmmChineseDecodeProcessor {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final dij e() {
        return btg.a(this.o);
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    protected final djh g() {
        diy diyVar = new diy(btg.a(this.o).l());
        diyVar.i(btg.a(this.o).H(3));
        diyVar.i(btg.a(this.o).d.H(3));
        return diyVar;
    }

    @Override // defpackage.hlu
    public final boolean o(iay iayVar) {
        return btp.a(iayVar);
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final boolean p(hfd hfdVar) {
        if (hfdVar.a != iah.DOWN && hfdVar.a != iah.UP) {
            iay iayVar = hfdVar.b[0];
            if (iayVar.c == 67) {
                return W();
            }
            B();
            int i = iayVar.c;
            if (i != 62) {
                if (i == 66) {
                    if (Z()) {
                        return true;
                    }
                    as(null, 1, true);
                    return false;
                } else if (ab(iayVar) || Q(iayVar)) {
                    return true;
                } else {
                    if (btp.a(iayVar)) {
                        return R(hfdVar);
                    }
                    return P(iayVar);
                }
            } else if (X("SPACE")) {
                return true;
            } else {
                as(null, 1, true);
            }
        }
        return false;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final MutableDictionaryAccessorInterfaceImpl s(Context context) {
        return btg.a(context).d.M(3);
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final MutableDictionaryAccessorInterfaceImpl t(Context context) {
        return btg.a(context).M(3);
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final int u() {
        return a() ? 1 : 3;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final int v() {
        return 3;
    }
}
