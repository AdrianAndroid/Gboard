package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* compiled from: PG */
/* renamed from: ksd  reason: default package */
/* loaded from: classes.dex */
public final class ksd extends LinearLayout.LayoutParams {
    public int a;
    public Interpolator b;
    public jma c;

    public ksd() {
        super(-1, -2);
        this.a = 1;
    }

    public ksd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ksj.b);
        this.a = obtainStyledAttributes.getInt(1, 0);
        this.c = obtainStyledAttributes.getInt(0, 0) == 1 ? new jma((byte[]) null, (byte[]) null) : null;
        if (obtainStyledAttributes.hasValue(2)) {
            this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public ksd(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public ksd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public ksd(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}
