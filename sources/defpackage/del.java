package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.BidiViewPager;

/* compiled from: PG */
/* renamed from: del  reason: default package */
/* loaded from: classes.dex */
public class del extends BidiViewPager {
    private final dfk h;

    public del(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.h.a(motionEvent);
        return onTouchEvent;
    }

    public del(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new dfk(context);
    }
}
