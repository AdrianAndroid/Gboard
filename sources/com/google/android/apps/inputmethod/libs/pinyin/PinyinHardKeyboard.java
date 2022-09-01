package com.google.android.apps.inputmethod.libs.pinyin;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.framework.keyboard.PrimeKeyboard;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PinyinHardKeyboard extends PrimeKeyboard {
    public PinyinHardKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        if (icu.e(this.B)) {
            iay f = hfdVar.f();
            if (f == null) {
                return false;
            }
            int i = f.c;
            int i2 = i == 69 ? 21 : i == 70 ? 22 : 0;
            if (i2 != 0) {
                hfdVar.b[0] = new iay(i2, f.d, f.e);
            }
            boolean c = super.c(hfdVar);
            if (i2 != 0) {
                hfdVar.b[0] = f;
            }
            return c;
        }
        return super.c(hfdVar);
    }
}
