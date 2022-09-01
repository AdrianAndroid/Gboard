package com.google.android.apps.inputmethod.libs.search.emoticon;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmoticonKeyboardMotionEventHandler extends BasicMotionEventHandler {
    public EmoticonKeyboardMotionEventHandler(Context context, igy igyVar) {
        super(context, igyVar);
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler, defpackage.igx
    public final void h(MotionEvent motionEvent) {
        if (!this.l.g().o() || motionEvent.getDeviceId() == 0) {
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 1) {
                return;
            }
            super.h(motionEvent);
            return;
        }
        super.h(motionEvent);
    }
}
