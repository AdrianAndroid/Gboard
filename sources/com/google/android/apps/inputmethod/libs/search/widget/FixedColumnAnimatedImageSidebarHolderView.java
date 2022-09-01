package com.google.android.apps.inputmethod.libs.search.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FixedColumnAnimatedImageSidebarHolderView extends ekx {
    public final int ah;

    public FixedColumnAnimatedImageSidebarHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Throwable th;
        TypedArray typedArray;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, ele.a);
            try {
                this.ah = typedArray.getInt(0, 4);
                if (typedArray == null) {
                    return;
                }
                typedArray.recycle();
            } catch (Throwable th2) {
                th = th2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = null;
        }
    }

    @Override // defpackage.ekx
    public final void aM() {
        aa(new eld(this));
    }
}
