package com.google.android.apps.inputmethod.latin.keyboard;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.japanese.keyboard.JapanesePrimeKeyboard;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinJapanesePrimeKeyboard extends JapanesePrimeKeyboard {
    public LatinJapanesePrimeKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final String fr() {
        String fs = fs();
        if (!TextUtils.isEmpty(fs)) {
            return !fx().n() ? fs : this.u.getString(R.string.f155050_resource_name_obfuscated_res_0x7f1403ad, fs);
        }
        return this.u.getString(R.string.f176170_resource_name_obfuscated_res_0x7f140cb8);
    }
}
