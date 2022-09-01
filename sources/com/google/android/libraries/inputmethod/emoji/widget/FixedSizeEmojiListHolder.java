package com.google.android.libraries.inputmethod.emoji.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FixedSizeEmojiListHolder extends ViewGroup implements heq {
    public final int a;
    public int b;
    private final int c;
    private final int d;
    private final int e;
    private LayoutInflater f;
    private final int g;
    private int h;
    private final boolean i;
    private boolean j;

    public FixedSizeEmojiListHolder(Context context) {
        this(context, null);
    }

    private static int k(int i, int i2) {
        if (i2 > 0) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        if (i2 == -2) {
            return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public final int a() {
        return ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / this.h;
    }

    public final int b() {
        return ((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) / this.b;
    }

    @Override // defpackage.heq
    public final int c() {
        return d();
    }

    public final int d() {
        return this.b * this.h;
    }

    protected final View e() {
        return this.f.inflate(this.c, (ViewGroup) this, false);
    }

    @Override // defpackage.heq
    public final void f(hej hejVar) {
        for (int i = 0; i < getChildCount(); i++) {
            EmojiView emojiView = (EmojiView) getChildAt(i).findViewById(this.d);
            if (emojiView != null) {
                emojiView.e(hejVar);
            }
        }
    }

    @Override // defpackage.heq
    public final void g(List list) {
        int i;
        int size = list != null ? list.size() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getLayoutDirection() == 1) {
                int i3 = this.b;
                i = ((i2 / i3) * i3) + ((i3 - (i2 % i3)) - 1);
            } else {
                i = i2;
            }
            View childAt = getChildAt(i);
            if (i2 < size) {
                EmojiView emojiView = (EmojiView) childAt.findViewById(this.d);
                llp llpVar = ((hei) list.get(i2)).f;
                if (emojiView != null) {
                    emojiView.d((hei) list.get(i2));
                    emojiView.setVisibility(0);
                    if (!((hei) list.get(i2)).g) {
                        emojiView.b = (String[]) llpVar.toArray(new String[0]);
                    }
                }
                ImageView imageView = (ImageView) childAt.findViewById(this.e);
                if (imageView != null) {
                    if (!this.j || ((lrl) llpVar).c <= 1 || ((hei) list.get(i2)).g) {
                        imageView.setVisibility(4);
                    } else {
                        imageView.setVisibility(0);
                    }
                }
                childAt.setVisibility(0);
            } else {
                childAt.setVisibility(4);
            }
        }
    }

    @Override // defpackage.heq
    public final void h(boolean z) {
        this.j = z;
    }

    @Override // defpackage.heq
    public final void i(LayoutInflater layoutInflater) {
        this.f = layoutInflater;
    }

    public final void j(int i) {
        this.b = i;
        int childCount = getChildCount();
        int d = d();
        if (childCount < d) {
            for (int i2 = 0; i2 < d - childCount; i2++) {
                addView(e());
            }
        } else if (childCount > d) {
            removeViews(d, childCount - d);
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        int d = d();
        for (int i = 0; i < d; i++) {
            addView(e());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        if (childCount == 0 || this.b == 0 || this.h == 0) {
            return;
        }
        int b = b();
        int a = a();
        for (int i5 = 0; i5 < childCount; i5++) {
            boolean z2 = this.i;
            int i6 = z2 ? i5 / this.b : i5 % this.h;
            int i7 = z2 ? i5 % this.b : i5 / this.h;
            View childAt = getChildAt(i5);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int paddingLeft = (i7 * b) + ((b - measuredWidth) / 2) + getPaddingLeft();
            int paddingTop = (i6 * a) + ((a - measuredHeight) / 2) + getPaddingTop();
            childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(i, i2);
        int childCount = getChildCount();
        if (childCount == 0 || this.b == 0 || this.h == 0) {
            return;
        }
        int b = b();
        int a = a();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            childAt.measure(k(b, layoutParams.width), k(a, layoutParams.height));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public FixedSizeEmojiListHolder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FixedSizeEmojiListHolder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Throwable th;
        TypedArray typedArray;
        this.j = true;
        this.f = LayoutInflater.from(context);
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, hev.a);
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
        }
        try {
            this.i = typedArray.getBoolean(3, true);
            this.c = typedArray.getResourceId(2, R.layout.f134180_resource_name_obfuscated_res_0x7f0e0083);
            this.d = typedArray.getResourceId(1, R.id.f54310_resource_name_obfuscated_res_0x7f0b0193);
            this.e = typedArray.getResourceId(5, R.id.f130430_resource_name_obfuscated_res_0x7f0b21e5);
            int i2 = typedArray.getInt(4, 4);
            this.g = i2;
            int i3 = typedArray.getInt(0, 4);
            this.a = i3;
            if (typedArray != null) {
                typedArray.recycle();
            }
            this.h = i2;
            this.b = i3;
        } catch (Throwable th3) {
            th = th3;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }
}
