package com.google.android.apps.inputmethod.libs.zhuyin;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;
import com.google.android.inputmethod.latin.R;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PinyinHmmDecodeProcessor extends AbstractHmmChineseDecodeProcessor {
    protected dkk m;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void J(ibz ibzVar, boolean z) {
        InputStream c;
        boolean z2;
        super.J(ibzVar, z);
        if (ibzVar == ibz.a) {
            djm a = fgk.h(((fgg) this.m).d).a();
            if (a == null || (c = a.c("qwerty_with_english_setting_scheme")) == null) {
                z2 = false;
            } else {
                z2 = true;
                try {
                    c.close();
                } catch (IOException unused) {
                }
            }
            hfd d = hfd.d(new iay(-10097, null, Boolean.valueOf(z2)));
            d.g = 0;
            gwv gwvVar = this.u;
            if (gwvVar == null) {
                return;
            }
            hnl i = hnl.i(12, this);
            i.j = d;
            gwvVar.b(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final void L() {
        super.L();
        this.m.f();
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor, defpackage.hnj
    public final void ad(Context context, gwv gwvVar, iav iavVar) {
        super.ad(context, gwvVar, iavVar);
        this.m = new fgg(context, this, this.r);
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, defpackage.dji
    public final String ag(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            sb.append(" ");
            sb.append(charAt);
        }
        return this.o.getString(R.string.f163290_resource_name_obfuscated_res_0x7f140783, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final dij e() {
        return fgj.l(this.o);
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    protected final djh g() {
        diy diyVar = new diy(fgj.l(this.o).K("zh-hant-t-i0-pinyin"));
        diyVar.i(fgj.l(this.o).H(3));
        diyVar.i(fgj.l(this.o).d.H(3));
        return diyVar;
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final void k() {
        super.k();
        this.m.c();
        this.m.b = this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void m() {
        super.m();
        this.m.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void n() {
        super.n();
        this.m.b();
    }

    @Override // defpackage.hlu
    public final boolean o(iay iayVar) {
        return btp.a(iayVar);
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final boolean p(hfd hfdVar) {
        if (this.m.h(hfdVar)) {
            return true;
        }
        if (hfdVar.a != iah.DOWN && hfdVar.a != iah.UP) {
            iay iayVar = hfdVar.b[0];
            if (iayVar.c == 67) {
                return W();
            }
            B();
            int i = iayVar.c;
            if (i != 62) {
                if (i == 66) {
                    if (ao()) {
                        X("ENTER");
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
        return fgj.l(context).d.M(3);
    }

    @Override // com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor
    protected final MutableDictionaryAccessorInterfaceImpl t(Context context) {
        return fgj.l(context).L(fgj.b[2], fgj.a[2]);
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
