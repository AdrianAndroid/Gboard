package com.google.android.apps.inputmethod.libs.languageselection;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NestedRecyclerView extends RecyclerView {
    public NestedRecyclerView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return dispatchTouchEvent;
    }

    public NestedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NestedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
