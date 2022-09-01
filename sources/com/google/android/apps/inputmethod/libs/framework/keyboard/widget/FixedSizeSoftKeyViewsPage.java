package com.google.android.apps.inputmethod.libs.framework.keyboard.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FixedSizeSoftKeyViewsPage extends ddu {
    private final int c;
    private final LayoutInflater d;

    public FixedSizeSoftKeyViewsPage(Context context) {
        this(context, null);
    }

    @Override // defpackage.ddu
    protected final SoftKeyView e() {
        int i = this.c;
        return i != 0 ? (SoftKeyView) this.d.inflate(i, (ViewGroup) this, false) : new SoftKeyView(getContext());
    }

    public FixedSizeSoftKeyViewsPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FixedSizeSoftKeyViewsPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, dby.b);
            try {
                this.c = typedArray.getResourceId(0, 0);
                if (typedArray != null) {
                    typedArray.recycle();
                }
                this.d = LayoutInflater.from(context);
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
        }
    }
}
