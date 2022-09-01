package com.google.android.apps.inputmethod.latin.hmm;

import com.google.android.apps.inputmethod.libs.zhuyin.PinyinHmmDecodeProcessor;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinTaiwanPinyinDecodeProcessor extends PinyinHmmDecodeProcessor {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    public final boolean a() {
        ino inoVar = this.r;
        return inoVar != null && inoVar.aj(R.string.f160970_resource_name_obfuscated_res_0x7f140681);
    }
}
