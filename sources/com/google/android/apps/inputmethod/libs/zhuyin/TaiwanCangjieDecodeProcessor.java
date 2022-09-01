package com.google.android.apps.inputmethod.libs.zhuyin;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.cangjie.ime.AbstractCangjieDecodeProcessor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TaiwanCangjieDecodeProcessor extends AbstractCangjieDecodeProcessor {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.cangjie.ime.AbstractCangjieDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    /* renamed from: b */
    public final btb e() {
        fgh fghVar;
        Context context = this.o;
        fgh fghVar2 = fgh.a;
        synchronized (fgh.class) {
            if (fgh.a == null) {
                fgh.a = new fgh(context);
                div.c().i(fgh.a, "zh_TW", "zh_TW");
            }
            fghVar = fgh.a;
        }
        return fghVar;
    }

    @Override // com.google.android.apps.inputmethod.libs.cangjie.ime.AbstractCangjieDecodeProcessor
    protected final djh h() {
        return new diy(fgj.l(this.o).m());
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
