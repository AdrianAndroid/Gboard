package com.google.android.apps.inputmethod.latin.keyboard;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinKeyboardWithNumberMode extends LatinPrimeKeyboard {
    public LatinKeyboardWithNumberMode(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard
    protected final int l(long j, long j2) {
        return ((j2 ^ j) & 2) == 2 ? icu.h(j2) ? R.string.f150340_resource_name_obfuscated_res_0x7f140193 : R.string.f150330_resource_name_obfuscated_res_0x7f140192 : icu.c(j, j2);
    }
}
