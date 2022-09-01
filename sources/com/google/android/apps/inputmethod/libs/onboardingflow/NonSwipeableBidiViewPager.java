package com.google.android.apps.inputmethod.libs.onboardingflow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.BidiViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NonSwipeableBidiViewPager extends BidiViewPager {
    public NonSwipeableBidiViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return gqa.a(getContext()).g;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public NonSwipeableBidiViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClickable(false);
        setEnabled(false);
        setFocusable(false);
    }
}
