package com.google.android.apps.inputmethod.latin.keyboard;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinDialKeyboard extends LatinNumberKeyboard {
    public LatinDialKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    private final void l(int i) {
        if (this.z) {
            fx().s(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void gl(long j, long j2) {
        super.gl(j, j2);
        if (((j ^ j2) & 3) == 3) {
            if ((j2 & 3) == 3) {
                l(R.string.f174860_resource_name_obfuscated_res_0x7f140c34);
            } else {
                l(R.string.f159580_resource_name_obfuscated_res_0x7f1405f2);
            }
        }
    }
}
