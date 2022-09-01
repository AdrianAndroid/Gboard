package com.google.android.apps.inputmethod.latin.keyboard;

import android.content.Context;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinNumberKeyboard extends Keyboard {
    private boolean a;

    public LatinNumberKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        Object obj;
        iay f = hfdVar.f();
        if (f == null) {
            return false;
        }
        if (f.c != -10127 || (obj = f.e) == null || !(obj instanceof ice) || !obj.equals(ice.HEADER)) {
            return super.c(hfdVar);
        }
        this.a = true;
        gk(ice.HEADER);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean fB(ice iceVar) {
        if (iceVar != ice.HEADER || !this.a) {
            return am(iceVar);
        }
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        this.a = false;
        super.h();
    }
}
