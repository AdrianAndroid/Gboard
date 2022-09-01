package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TransformationTextView extends AppCompatTextView {
    public static final lug r = hin.a;
    protected boolean s = false;

    public TransformationTextView(Context context) {
        super(context);
        c();
    }

    private final void c() {
        jdw jdwVar = jdw.a;
        if (getTransformationMethod() != null && getTransformationMethod() != jdwVar.c) {
            ((luc) r.a(hip.a).k("com/google/android/libraries/inputmethod/widgets/TransformationTextView$TransformationHelper", "registerTextView", 142, "TransformationTextView.java")).w("Non-empty TransformationMethod (%s) is detected", getTransformationMethod());
        }
        this.s = true;
        setTransformationMethod(jdwVar.c);
        this.s = false;
        jdwVar.b.add(this);
    }

    public TransformationTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public TransformationTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }
}
