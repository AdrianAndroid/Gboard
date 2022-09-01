package com.google.android.apps.inputmethod.libs.korean;

import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KoreanNaratgulDecodeProcessor extends AbstractKorean10KeyDecodeProcessor {
    private static final llw d;

    static {
        lls h = llw.h();
        c(h, "ㄱ", "ㆍ", "ㅋ", false);
        c(h, "ㅋ", "ㆍ", "ㄱ", false);
        c(h, "ㄱ", "：", "ㄲ", false);
        c(h, "ㄲ", "：", "ㄱ", false);
        c(h, "ㄴ", "ㆍ", "ㄷ", false);
        c(h, "ㄷ", "ㆍ", "ㅌ", false);
        c(h, "ㅌ", "ㆍ", "ㄴ", false);
        c(h, "ㄷ", "：", "ㄸ", false);
        c(h, "ㄸ", "：", "ㄷ", false);
        c(h, "ㅁ", "ㆍ", "ㅂ", false);
        c(h, "ㅂ", "ㆍ", "ㅍ", false);
        c(h, "ㅍ", "ㆍ", "ㅁ", false);
        c(h, "ㅂ", "：", "ㅃ", false);
        c(h, "ㅃ", "：", "ㅂ", false);
        c(h, "ㅅ", "ㆍ", "ㅈ", false);
        c(h, "ㅈ", "ㆍ", "ㅊ", false);
        c(h, "ㅊ", "ㆍ", "ㅅ", false);
        c(h, "ㅅ", "：", "ㅆ", false);
        c(h, "ㅆ", "：", "ㅅ", false);
        c(h, "ㅈ", "：", "ㅉ", false);
        c(h, "ㅉ", "：", "ㅈ", false);
        c(h, "ㅇ", "ㆍ", "ㅎ", false);
        c(h, "ㅎ", "ㆍ", "ㅇ", false);
        c(h, "ㅏ", "ㆍ", "ㅑ", false);
        c(h, "ㅑ", "ㆍ", "ㅏ", false);
        c(h, "ㅏ", "ㅏ", "ㅓ", false);
        c(h, "ㅓ", "ㆍ", "ㅕ", false);
        c(h, "ㅕ", "ㆍ", "ㅓ", false);
        c(h, "ㅓ", "ㅏ", "ㅏ", false);
        c(h, "ㅗ", "ㆍ", "ㅛ", false);
        c(h, "ㅛ", "ㆍ", "ㅗ", false);
        c(h, "ㅗ", "ㅗ", "ㅜ", false);
        c(h, "ㅜ", "ㆍ", "ㅠ", false);
        c(h, "ㅠ", "ㆍ", "ㅜ", false);
        c(h, "ㅜ", "ㅗ", "ㅗ", false);
        c(h, "ㅏ", "ㅣ", "ㅐ", false);
        c(h, "ㅑ", "ㅣ", "ㅒ", false);
        c(h, "ㅓ", "ㅣ", "ㅔ", false);
        c(h, "ㅕ", "ㅣ", "ㅖ", false);
        c(h, "ㅗ", "ㅣ", "ㅗㅣ", false);
        c(h, "ㅜ", "ㅣ", "ㅜㅣ", false);
        c(h, "ㅡ", "ㅣ", "ㅡㅣ", false);
        d = h.l();
    }

    @Override // com.google.android.apps.inputmethod.libs.korean.AbstractKorean10KeyDecodeProcessor
    protected final llw a() {
        return d;
    }

    @Override // com.google.android.apps.inputmethod.libs.korean.AbstractKorean10KeyDecodeProcessor
    protected final String b() {
        int e;
        long k;
        int f;
        long l;
        int h;
        djh djhVar = this.i;
        if (djhVar != null) {
            dik dikVar = (dik) djhVar;
            if (!dikVar.i || (e = dikVar.m.e()) == 0 || (f = dikVar.m.f((k = dikVar.m.k(e - 1)))) <= 0 || (h = dikVar.m.h((l = dikVar.m.l(k, f - 1)))) <= 0) {
                return null;
            }
            HmmEngineInterfaceImpl hmmEngineInterfaceImpl = dikVar.m;
            return hmmEngineInterfaceImpl.u(hmmEngineInterfaceImpl.m(l, h - 1));
        }
        return this.b;
    }

    @Override // com.google.android.apps.inputmethod.libs.korean.AbstractKorean10KeyDecodeProcessor
    protected final boolean i(String str, String str2, String str3) {
        if (str3 == null) {
            if (TextUtils.equals(str2, "ㆍ") || TextUtils.equals(str2, "：")) {
                return false;
            }
            if (str == null || str.length() != 1) {
                return true;
            }
            if (str2 == null || str2.length() != 1) {
                return false;
            }
            return (dmf.b(str.charAt(0)) == 2 && dmf.b(str2.charAt(0)) == 2) ? false : true;
        }
        return true;
    }
}
