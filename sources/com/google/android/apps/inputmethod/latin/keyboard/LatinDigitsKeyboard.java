package com.google.android.apps.inputmethod.latin.keyboard;

import android.content.Context;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinDigitsKeyboard extends Keyboard {
    public LatinDigitsKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null || f.c != -10127 || !ice.HEADER.equals(f.e) || !((Boolean) dcu.k.c()).booleanValue() || !ham.ap(this.u, this.D)) {
            return super.c(hfdVar);
        }
        this.v.P(this.s, ice.HEADER, hth.SHOW_MANDATORY);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean fB(ice iceVar) {
        if (iceVar == ice.HEADER) {
            return this.v.V(ibz.a, iceVar) && am(iceVar);
        }
        return am(iceVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final hth gj(ice iceVar) {
        if (iceVar != ice.HEADER || !fB(iceVar)) {
            return super.gj(iceVar);
        }
        return hth.SHOW_OPTIONAL;
    }
}
