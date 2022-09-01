package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: ksf  reason: default package */
/* loaded from: classes.dex */
public final class ksf extends FrameLayout.LayoutParams {
    public int a;
    public float b;

    public ksf() {
        super(-1, -1);
        this.a = 0;
        this.b = 0.5f;
    }

    public ksf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ksj.d);
        this.a = obtainStyledAttributes.getInt(0, 0);
        this.b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public ksf(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
        this.b = 0.5f;
    }
}
