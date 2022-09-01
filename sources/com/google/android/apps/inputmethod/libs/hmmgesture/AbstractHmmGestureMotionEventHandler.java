package com.google.android.apps.inputmethod.libs.hmmgesture;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractHmmGestureMotionEventHandler extends AbstractGestureMotionEventHandler {
    private boolean j = true;

    public AbstractHmmGestureMotionEventHandler(Context context, igy igyVar) {
        super(context, igyVar, 250);
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f;
        if (hfdVar == null || (f = hfdVar.f()) == null || f.c != -10097) {
            super.c(hfdVar);
            return false;
        }
        this.j = ((Boolean) f.e).booleanValue();
        return true;
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    public final boolean q() {
        return this.j;
    }
}
