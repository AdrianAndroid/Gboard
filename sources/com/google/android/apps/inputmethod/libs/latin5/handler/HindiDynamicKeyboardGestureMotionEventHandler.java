package com.google.android.apps.inputmethod.libs.latin5.handler;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HindiDynamicKeyboardGestureMotionEventHandler extends LatinGestureMotionEventHandler {
    public HindiDynamicKeyboardGestureMotionEventHandler(Context context, igy igyVar) {
        super(context, igyVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.latin5.handler.LatinGestureMotionEventHandler, com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        if (hfdVar.a() == -10041) {
            long b = this.l.b() & iby.J;
            this.j.set(b == 0 || b == iby.p);
            return true;
        }
        return super.c(hfdVar);
    }
}
