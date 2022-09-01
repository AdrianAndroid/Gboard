package com.google.android.libraries.inputmethod.accesspoint.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExpandAccessPointsHintView extends FrameLayout {
    public gsd a;

    public ExpandAccessPointsHintView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        gsd gsdVar = this.a;
        if (gsdVar == null || !gsdVar.a(motionEvent)) {
            return true;
        }
        super.dispatchHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gsd gsdVar = this.a;
        if (gsdVar == null || !gsdVar.a(motionEvent)) {
            return true;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public ExpandAccessPointsHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
