package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AccessibilityFullScreenPopupView extends View {
    private SoftKeyboardView a;
    private final Matrix b = new Matrix();

    public AccessibilityFullScreenPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(SoftKeyboardView softKeyboardView) {
        this.a = softKeyboardView;
        b();
    }

    public final void b() {
        if (this.a == null || !aad.ag(this) || !aad.ag(this.a)) {
            return;
        }
        jdy.c(this.b, this, this.a);
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 9) {
            this.a.m = false;
        } else {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.transform(this.b);
            if (motionEvent.getAction() == 10) {
                this.a.m = true;
            }
            this.a.i(obtain);
            obtain.recycle();
        }
        return true;
    }

    public AccessibilityFullScreenPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
