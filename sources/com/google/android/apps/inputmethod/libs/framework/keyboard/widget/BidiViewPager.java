package com.google.android.apps.inputmethod.libs.framework.keyboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BidiViewPager extends ViewPager {
    private ddz h;

    public BidiViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final int a() {
        return v(this.c);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void e(alj aljVar) {
        super.e(new ddy(this, aljVar));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void k(ald aldVar) {
        if (!(aldVar instanceof ddz)) {
            super.k(aldVar);
            this.h = null;
            return;
        }
        ddz ddzVar = (ddz) aldVar;
        this.h = ddzVar;
        super.k(ddzVar);
        this.h.b = isLayoutDirectionResolved() ? getLayoutDirection() : getResources().getConfiguration().getLayoutDirection();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void l(int i) {
        super.l(v(i));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void m(int i, boolean z) {
        super.m(v(i), z);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (w()) {
            this.h.b = i;
        }
    }

    public final int v(int i) {
        return w() ? this.h.l(i) : i;
    }

    public final boolean w() {
        return this.h != null;
    }

    public BidiViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
