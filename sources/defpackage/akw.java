package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: akw  reason: default package */
/* loaded from: classes.dex */
public final class akw extends ViewGroup.LayoutParams {
    public boolean a;
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public boolean e;

    public akw() {
        super(-1, -1);
    }

    public akw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alc.b);
        this.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
