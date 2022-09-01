package com.google.android.apps.inputmethod.libs.framework.keyboard;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class T9Keyboard extends PrimeKeyboard {
    private des a;

    public T9Keyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        super.fA(icfVar);
        if (icfVar.b == ice.BODY) {
            this.a = null;
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        super.fz(softKeyboardView, icfVar);
        if (icfVar.b == ice.BODY) {
            des desVar = (des) softKeyboardView.findViewById(R.id.f96320_resource_name_obfuscated_res_0x7f0b1416);
            this.a = desVar;
            if (desVar == null) {
                return;
            }
            desVar.n();
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.PrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void y(List list) {
        super.y(list);
        if (this.a != null) {
            if (list == null || list.isEmpty()) {
                this.a.n();
            } else {
                this.a.a(list);
            }
        }
    }
}
