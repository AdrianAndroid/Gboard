package com.google.android.apps.inputmethod.libs.chinese;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PositionBasedKeyEventInterpreter extends hfb {
    private static final KeyCharacterMap a = KeyCharacterMap.load(-1);

    @Override // defpackage.hfb, defpackage.hfi
    public final hfd a(KeyEvent keyEvent) {
        int a2 = hfj.a(keyEvent.getScanCode());
        if (a2 != 0) {
            return b(new iay(a2, iax.DECODE, new String(Character.toChars(a.get(a2, keyEvent.getMetaState())))), keyEvent);
        }
        return super.a(keyEvent);
    }
}
