package com.google.android.apps.inputmethod.libs.search.widget;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CategoryViewPager extends del {
    public static final ltg h = ltg.j("com/google/android/apps/inputmethod/libs/search/widget/CategoryViewPager");
    public int k = 1;
    public int i = -1;
    public boolean j = true;
    private boolean l = false;

    public CategoryViewPager(Context context) {
        super(context);
    }

    public static Integer y(View view) {
        Object tag = view.getTag(R.id.f54730_resource_name_obfuscated_res_0x7f0b01c1);
        if (tag instanceof Integer) {
            return (Integer) tag;
        }
        return -1;
    }

    public final void A(ela elaVar, int i, boolean z) {
        View x = x(Integer.valueOf(i));
        if (x != null) {
            elaVar.hz(this, x, i, this.k);
        } else if (this.b == null) {
            ((ltd) ((ltd) h.c()).k("com/google/android/apps/inputmethod/libs/search/widget/CategoryViewPager", "notifyPageSelected", 83, "CategoryViewPager.java")).u("Page %d selected with null adapter", i);
        } else if (!z) {
            ((ltd) ((ltd) h.c()).k("com/google/android/apps/inputmethod/libs/search/widget/CategoryViewPager", "notifyPageSelected", 87, "CategoryViewPager.java")).u("Page %d selected without instantiated view", i);
        } else {
            post(new ov(this, i, elaVar, 6));
        }
    }

    public final void B(int i, boolean z, int i2) {
        this.k = i2;
        super.m(i, z);
    }

    public final void C(int i) {
        this.k = 2;
        super.l(i);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        this.l = true;
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        this.l = false;
        return dispatchKeyEvent;
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.widget.BidiViewPager, androidx.viewpager.widget.ViewPager
    public final void k(ald aldVar) {
        int layoutDirection;
        if (aldVar instanceof elb) {
            elb elbVar = (elb) aldVar;
            if (isLayoutDirectionResolved()) {
                layoutDirection = getLayoutDirection();
            } else {
                layoutDirection = getContext().getResources().getConfiguration().getLayoutDirection();
            }
            ((ddz) elbVar).b = layoutDirection;
        }
        super.k(aldVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.widget.BidiViewPager, androidx.viewpager.widget.ViewPager
    @Deprecated
    public final void l(int i) {
        int i2 = 1;
        if (true == this.l) {
            i2 = 4;
        }
        this.k = i2;
        super.l(i);
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.keyboard.widget.BidiViewPager, androidx.viewpager.widget.ViewPager
    @Deprecated
    public final void m(int i, boolean z) {
        int i2 = 1;
        if (true == this.l) {
            i2 = 4;
        }
        this.k = i2;
        super.m(i, z);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.j && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // defpackage.del, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.j && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.l = true;
        boolean performAccessibilityAction = super.performAccessibilityAction(i, bundle);
        this.l = false;
        return performAccessibilityAction;
    }

    public final View x(Integer num) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (num.equals(childAt.getTag(R.id.f54730_resource_name_obfuscated_res_0x7f0b01c1))) {
                return childAt;
            }
        }
        return null;
    }

    public final void z(ela elaVar) {
        super.e(new ekz(this, elaVar));
    }

    public CategoryViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
