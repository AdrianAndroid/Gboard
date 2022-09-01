package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: ck  reason: default package */
/* loaded from: classes.dex */
public class ck extends ViewGroup.MarginLayoutParams {
    public int a;

    public ck() {
        super(-2, -2);
        this.a = 8388627;
    }

    public ck(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ei.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public ck(ck ckVar) {
        super((ViewGroup.MarginLayoutParams) ckVar);
        this.a = 0;
        this.a = ckVar.a;
    }

    public ck(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
