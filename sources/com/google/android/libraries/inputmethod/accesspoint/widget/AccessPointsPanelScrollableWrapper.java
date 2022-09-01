package com.google.android.libraries.inputmethod.accesspoint.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AccessPointsPanelScrollableWrapper extends ScrollView {
    private final int a;
    private float b = -1.0f;
    private boolean c;

    public AccessPointsPanelScrollableWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 0) {
            this.c = false;
            this.b = motionEvent.getY();
        } else if (motionEvent.getActionMasked() != 2) {
            this.b = -1.0f;
            this.c = false;
        } else if (this.c || Math.abs(motionEvent.getY() - this.b) > this.a) {
            this.c = true;
            motionEvent.setAction(3);
        }
        return onTouchEvent;
    }
}
