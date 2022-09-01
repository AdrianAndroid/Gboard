package com.google.android.apps.inputmethod.libs.korean;

import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractKorean10KeyDecodeProcessor extends HmmKoreanDecodeProcessor {
    private static final llw d;
    private int f = 2000;
    private final llw e = a();

    static {
        lls i = llw.i(35);
        int i2 = 0;
        while (i2 < 35) {
            int i3 = i2 + 1;
            String substring = "ㄱㄲㄴㄷㄸㅁㅂㅃㅅㅆㅇㅈㅉㅊㅋㅌㅍㅎㅏㅐㅑㅒㅓㅔㅕㅖㅗㅛㅜㅠㅡㅣㄹㆍ：".substring(i2, i3);
            i.a(Integer.valueOf(substring.codePointAt(0)), new iay(-10009, iax.DECODE, substring));
            i2 = i3;
        }
        d = i.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void c(lls llsVar, String str, String str2, String str3, boolean z) {
        llsVar.a(str.concat(str2), new nsx(str3, z));
    }

    protected abstract llw a();

    protected String b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.inputmethod.libs.korean.HmmKoreanDecodeProcessor
    public final boolean d(hfd hfdVar) {
        nsx nsxVar;
        String str = (String) hfdVar.b[0].e;
        String b = b();
        long j = hfdVar.h - this.a;
        String str2 = null;
        str2 = null;
        str2 = null;
        if (b != null && (nsxVar = (nsx) this.e.get(b.concat(String.valueOf(str)))) != null && (!nsxVar.a || j <= this.f)) {
            str2 = nsxVar.b;
        }
        String str3 = str2;
        if (!i(b, str, str3)) {
            return true;
        }
        if (str2 == null) {
            return super.d(hfdVar);
        }
        if (this.i != null) {
            for (int i = 0; i < b.length(); i++) {
                this.i.A(false);
            }
        }
        int i2 = 0;
        while (i2 < str3.length()) {
            hfd d2 = hfd.d((iay) d.get(Integer.valueOf(str3.codePointAt(i2))));
            d2.h = hfdVar.h;
            v(d2);
            t(d2, i2 > 0);
            i2++;
        }
        return true;
    }

    @Override // com.google.android.apps.inputmethod.libs.korean.HmmKoreanDecodeProcessor
    protected final boolean h() {
        return false;
    }

    protected boolean i(String str, String str2, String str3) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.korean.HmmKoreanDecodeProcessor, com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void l(EditorInfo editorInfo, boolean z) {
        super.l(editorInfo, z);
        this.f = this.r.n(R.string.f161580_resource_name_obfuscated_res_0x7f1406bf, 2000);
    }
}
