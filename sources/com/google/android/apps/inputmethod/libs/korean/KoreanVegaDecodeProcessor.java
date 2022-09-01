package com.google.android.apps.inputmethod.libs.korean;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KoreanVegaDecodeProcessor extends AbstractKorean10KeyDecodeProcessor {
    private static final llw d;

    static {
        lls h = llw.h();
        c(h, "ㄱ", "ㄱ", "ㅋ", false);
        c(h, "ㅋ", "ㄱ", "ㄲ", false);
        c(h, "ㄲ", "ㄱ", "ㄱ", false);
        c(h, "ㄷ", "ㄷ", "ㅌ", false);
        c(h, "ㅌ", "ㄷ", "ㄸ", false);
        c(h, "ㄸ", "ㄷ", "ㄷ", false);
        c(h, "ㅁ", "ㅁ", "ㅅ", false);
        c(h, "ㅅ", "ㅁ", "ㅆ", false);
        c(h, "ㅆ", "ㅁ", "ㅁ", false);
        c(h, "ㅈ", "ㅈ", "ㅉ", false);
        c(h, "ㅉ", "ㅈ", "ㅊ", false);
        c(h, "ㅊ", "ㅈ", "ㅈ", false);
        c(h, "ㅣ", "ㅣ", "ㅡ", false);
        c(h, "ㅡ", "ㅣ", "ㅡㅣ", false);
        c(h, "ㅡㅣ", "ㅣ", "ㅣ", false);
        c(h, "ㄴ", "ㄴ", "ㄹ", false);
        c(h, "ㄹ", "ㄴ", "ㄴ", false);
        c(h, "ㅂ", "ㅂ", "ㅍ", false);
        c(h, "ㅍ", "ㅂ", "ㅃ", false);
        c(h, "ㅃ", "ㅂ", "ㅂ", false);
        c(h, "ㅇ", "ㅇ", "ㅎ", false);
        c(h, "ㅎ", "ㅇ", "ㅇ", false);
        c(h, "ㅏ", "ㅏ", "ㅑ", false);
        c(h, "ㅑ", "ㅏ", "ㅏ", false);
        c(h, "ㅓ", "ㅓ", "ㅕ", false);
        c(h, "ㅕ", "ㅓ", "ㅓ", false);
        c(h, "ㅗ", "ㅗ", "ㅛ", false);
        c(h, "ㅛ", "ㅗ", "ㅗ", false);
        c(h, "ㅜ", "ㅜ", "ㅠ", false);
        c(h, "ㅠ", "ㅜ", "ㅜ", false);
        c(h, "ㅏ", "ㅣ", "ㅐ", false);
        c(h, "ㅑ", "ㅣ", "ㅒ", false);
        c(h, "ㅓ", "ㅣ", "ㅔ", false);
        c(h, "ㅕ", "ㅣ", "ㅖ", false);
        d = h.l();
    }

    @Override // com.google.android.apps.inputmethod.libs.korean.AbstractKorean10KeyDecodeProcessor
    protected final llw a() {
        return d;
    }

    @Override // com.google.android.apps.inputmethod.libs.korean.AbstractKorean10KeyDecodeProcessor
    protected final String b() {
        djh djhVar = this.i;
        return (!TextUtils.equals("ㅣ", this.b) || djhVar == null || !djhVar.e().endsWith("ㅡㅣ")) ? this.b : "ㅡㅣ";
    }
}
