package com.google.android.apps.inputmethod.libs.cantonese;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.cangjie.ime.AbstractCangjieDecodeProcessor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CantoneseCangjieDecodeProcessor extends AbstractCangjieDecodeProcessor {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.cangjie.ime.AbstractCangjieDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    /* renamed from: b */
    public final btb e() {
        bte bteVar;
        Context context = this.o;
        bte bteVar2 = bte.a;
        synchronized (bte.class) {
            if (bte.a == null) {
                bte.a = new bte(context);
                div.c().i(bte.a, "zh_HK", "zh_HK");
            }
            bteVar = bte.a;
        }
        return bteVar;
    }

    @Override // com.google.android.apps.inputmethod.libs.cangjie.ime.AbstractCangjieDecodeProcessor
    protected final djh h() {
        return new diy(btg.a(this.o).l());
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
