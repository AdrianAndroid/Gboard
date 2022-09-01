package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SlidePageCancelableViewPager extends ViewPager {
    public boolean h = true;

    public SlidePageCancelableViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.h && super.onInterceptHoverEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.h && super.onTouchEvent(motionEvent);
    }

    public SlidePageCancelableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
