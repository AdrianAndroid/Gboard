package com.google.android.libraries.inputmethod.accesspoint.impl;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AccessPointDragPopupView extends FrameLayout {
    public final int a;
    public View c;
    public View e;
    public int f;
    public int g;
    public float h;
    public float i;
    public boolean j;
    public float k;
    public float l;
    private final int m;
    private boolean o;
    public final Stack b = new Stack();
    public final Rect d = new Rect();
    private final Rect n = new Rect();

    public AccessPointDragPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = attributeSet.getAttributeResourceValue(null, "focus_animate_view", 0);
        this.m = attributeSet.getAttributeResourceValue(null, "drag_view", 0);
    }

    public final void a(float f, float f2) {
        View view;
        if (!this.o || (view = this.e) == null) {
            return;
        }
        view.setX(f - this.n.left);
        this.e.setY(f2 - this.n.top);
    }

    public final void b(float f, float f2) {
        float f3 = this.k;
        float f4 = this.l;
        float f5 = this.f + (f - f3);
        this.h = f5;
        float f6 = this.g + (f2 - f4);
        this.i = f6;
        a(f5, f6);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) findViewById(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265);
        SoftKeyView softKeyView = (SoftKeyView) findViewById(R.id.f56980_resource_name_obfuscated_res_0x7f0b02c3);
        if (imageView != null) {
            this.c = imageView;
        } else if (softKeyView != null) {
            this.c = softKeyView;
        }
        int i = this.m;
        if (i != 0) {
            this.e = findViewById(i);
            return;
        }
        View view = this.c;
        if (view == null) {
            return;
        }
        this.e = view;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getHeight() == 0 || getWidth() == 0) {
            this.o = false;
        } else if (this.o) {
        } else {
            this.o = true;
            View view = this.e;
            if (view == null || this.c == null) {
                return;
            }
            view.setTranslationX(0.0f);
            this.e.setTranslationY(0.0f);
            jdy.i(this.c, null, this.n);
            a(this.h, this.i);
        }
    }
}
