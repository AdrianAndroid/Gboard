package com.google.android.apps.inputmethod.libs.korean;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KoreanKeyEventInterpreter extends hfc {
    @Override // defpackage.hfc, defpackage.hfb, defpackage.hfi
    public final hfd a(KeyEvent keyEvent) {
        int a = hfj.a(keyEvent.getScanCode());
        if (a == 0) {
            a = keyEvent.getKeyCode();
        }
        iay a2 = dmj.a(a, keyEvent.getMetaState());
        if (a2 != null) {
            return b(a2, keyEvent);
        }
        return super.a(keyEvent);
    }
}
