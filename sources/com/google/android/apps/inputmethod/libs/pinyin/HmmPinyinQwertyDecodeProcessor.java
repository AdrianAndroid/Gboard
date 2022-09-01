package com.google.android.apps.inputmethod.libs.pinyin;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HmmPinyinQwertyDecodeProcessor extends AbstractHmmPinyinDecodeProcessor {
    private boolean n;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    public final boolean S(iay iayVar, float f, List list, List list2, boolean z) {
        iay iayVar2;
        super.S(iayVar, f, list, list2, z);
        if (this.n && !z && list.size() == 1 && (iayVar2 = (iay) dxq.a.get(Integer.valueOf(iayVar.c))) != null) {
            list.add(iayVar2);
            list2.add(Float.valueOf(f - 0.5f));
        }
        return true;
    }

    @Override // com.google.android.apps.inputmethod.libs.pinyin.AbstractHmmPinyinDecodeProcessor
    protected final dkk b(Context context, hlu hluVar, ino inoVar) {
        return new dxt(context, hluVar, inoVar, new dxs("zh_pinyin_qwerty_with_english", "zh_pinyin_qwerty_without_english"));
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    protected final djh g() {
        diy diyVar = new diy(dxu.l(this.o).K("zh-t-i0-pinyin-x-f0-delight"));
        diyVar.i(dxu.l(this.o).H(3));
        diyVar.i(dxu.l(this.o).r.H(3));
        return diyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void l(EditorInfo editorInfo, boolean z) {
        super.l(editorInfo, z);
        boolean z2 = false;
        if (!this.r.aj(R.string.f160920_resource_name_obfuscated_res_0x7f14067c) && this.r.aj(R.string.f160470_resource_name_obfuscated_res_0x7f14064c)) {
            z2 = true;
        }
        this.n = z2;
    }
}
