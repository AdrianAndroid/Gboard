package com.google.android.apps.inputmethod.libs.pinyin;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HmmPinyinT9DecodeProcessor extends AbstractHmmPinyinDecodeProcessor {
    public static final hme n;

    static {
        hme hmeVar = new hme();
        n = hmeVar;
        hmeVar.a(new String[]{"@"});
        hmeVar.a(btl.a);
        hmeVar.a(new String[]{"."});
        hmeVar.a(btl.b);
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor, defpackage.hnj
    public final boolean ar(hfd hfdVar) {
        return super.ar(hfdVar) || hfdVar.b[0].c == -10021;
    }

    @Override // com.google.android.apps.inputmethod.libs.pinyin.AbstractHmmPinyinDecodeProcessor
    protected final dkk b(Context context, hlu hluVar, ino inoVar) {
        return new dxt(context, hluVar, inoVar, new dxs("zh_pinyin_9key_with_english", "zh_pinyin_9key_without_english"));
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    protected final djh g() {
        diy diyVar = new diy(dxu.l(this.o).K("zh-t-i0-pinyin-x-l0-t9key"));
        diyVar.i(dxu.l(this.o).H(3));
        diyVar.i(dxu.l(this.o).r.H(3));
        return diyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.pinyin.AbstractHmmPinyinDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final boolean p(hfd hfdVar) {
        iay iayVar = hfdVar.b[0];
        if (iayVar.c == -10021) {
            I(hfdVar);
            an(n.iterator());
            return true;
        }
        if (btp.b(iayVar)) {
            String str = (String) iayVar.e;
            if ("0".equals(str)) {
                if (!h()) {
                    ah(" ");
                }
                return true;
            } else if ("1".equals(str)) {
                return true;
            } else {
                int a = djr.a(iayVar);
                if (a >= 2 && a <= 9) {
                    hfd b = hfd.b();
                    int a2 = djr.a(iayVar);
                    float[] fArr = null;
                    iay[] iayVarArr = (a2 < 2 || a2 > 9) ? null : djr.a[a2 - 2];
                    int a3 = djr.a(iayVar);
                    if (a3 >= 2 && a3 <= 9) {
                        fArr = djr.b[a3 - 2];
                    }
                    b.b = hfd.i(iayVarArr);
                    b.f = hfd.h(fArr);
                    b.g();
                    b.g = hfdVar.g;
                    b.h = hfdVar.h;
                    b.i = hfdVar.i;
                    return super.p(b);
                }
            }
        }
        return super.p(hfdVar);
    }
}
