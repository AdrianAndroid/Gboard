package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* renamed from: alh  reason: default package */
/* loaded from: classes.dex */
public final class alh extends ViewGroup.LayoutParams {
    public boolean a;
    public int b;
    public float c = 0.0f;
    public boolean d;
    public int e;
    public int f;

    public alh() {
        super(-1, -1);
    }

    public alh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
        this.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
