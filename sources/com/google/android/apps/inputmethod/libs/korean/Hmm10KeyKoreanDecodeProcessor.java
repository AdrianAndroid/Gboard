package com.google.android.apps.inputmethod.libs.korean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Hmm10KeyKoreanDecodeProcessor extends AbstractKorean10KeyDecodeProcessor {
    private static final llw d;

    static {
        lls h = llw.h();
        c(h, "ㅣ", "ㆍ", "ㅏ", false);
        c(h, "ㅏ", "ㆍ", "ㅑ", false);
        c(h, "ㅏ", "ㅣ", "ㅐ", false);
        c(h, "ㅑ", "ㆍ", "ㅏ", false);
        c(h, "ㅑ", "ㅣ", "ㅒ", false);
        c(h, "ㆍ", "ㅣ", "ㅓ", false);
        c(h, "ㅓ", "ㅣ", "ㅔ", false);
        c(h, "ㆍ", "ㆍ", "：", false);
        c(h, "：", "ㅣ", "ㅕ", false);
        c(h, "：", "ㆍ", "ㆍ", false);
        c(h, "ㅕ", "ㅣ", "ㅖ", false);
        c(h, "ㆍ", "ㅡ", "ㅗ", false);
        c(h, "：", "ㅡ", "ㅛ", false);
        c(h, "ㅡ", "ㆍ", "ㅜ", false);
        c(h, "ㅜ", "ㆍ", "ㅠ", false);
        c(h, "ㅠ", "ㅣ", "ㅜㅓ", false);
        c(h, "ㅠ", "ㆍ", "ㅜ", false);
        c(h, "ㄱ", "ㄱ", "ㅋ", true);
        c(h, "ㅋ", "ㄱ", "ㄲ", true);
        c(h, "ㄲ", "ㄱ", "ㄱ", true);
        c(h, "ㄴ", "ㄴ", "ㄹ", true);
        c(h, "ㄹ", "ㄴ", "ㄴ", true);
        c(h, "ㄷ", "ㄷ", "ㅌ", true);
        c(h, "ㅌ", "ㄷ", "ㄸ", true);
        c(h, "ㄸ", "ㄷ", "ㄷ", true);
        c(h, "ㅂ", "ㅂ", "ㅍ", true);
        c(h, "ㅍ", "ㅂ", "ㅃ", true);
        c(h, "ㅃ", "ㅂ", "ㅂ", true);
        c(h, "ㅅ", "ㅅ", "ㅎ", true);
        c(h, "ㅎ", "ㅅ", "ㅆ", true);
        c(h, "ㅆ", "ㅅ", "ㅅ", true);
        c(h, "ㅈ", "ㅈ", "ㅊ", true);
        c(h, "ㅊ", "ㅈ", "ㅉ", true);
        c(h, "ㅉ", "ㅈ", "ㅈ", true);
        c(h, "ㅇ", "ㅇ", "ㅁ", true);
        c(h, "ㅁ", "ㅇ", "ㅇ", true);
        d = h.l();
    }

    @Override // com.google.android.apps.inputmethod.libs.korean.AbstractKorean10KeyDecodeProcessor
    protected final llw a() {
        return d;
    }
}
