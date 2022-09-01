package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* renamed from: amf  reason: default package */
/* loaded from: classes.dex */
public final class amf extends RecyclerView {
    final /* synthetic */ ViewPager2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amf(ViewPager2 viewPager2, Context context) {
        super(context);
        this.S = viewPager2;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return this.S.m.r() ? this.S.m.c() : "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setFromIndex(this.S.c);
        accessibilityEvent.setToIndex(this.S.c);
        this.S.m.k(accessibilityEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.S.j && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.S.j && super.onTouchEvent(motionEvent);
    }
}
