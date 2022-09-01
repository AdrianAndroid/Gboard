package com.google.android.apps.inputmethod.libs.chinese;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.framework.keyboard.T9Keyboard;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class T9KeyboardWithNumberMode extends T9Keyboard {
    public T9KeyboardWithNumberMode(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PrimeKeyboard
    protected final int l(long j, long j2) {
        return ((j2 ^ j) & 2) == 2 ? icu.h(j2) ? R.string.f150340_resource_name_obfuscated_res_0x7f140193 : R.string.f150330_resource_name_obfuscated_res_0x7f140192 : icu.c(j, j2);
    }
}
