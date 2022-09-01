package com.google.android.libraries.inputmethod.keyboardmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MultiTouchDelegateView extends View {
    public final ArrayList a = new ArrayList();

    public MultiTouchDelegateView(Context context) {
        super(context);
    }

    public final void a() {
        this.a.clear();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((TouchDelegate) arrayList.get(i)).onTouchEvent(motionEvent)) {
                return true;
            }
            i = i2;
        }
        return true;
    }

    public MultiTouchDelegateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultiTouchDelegateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
