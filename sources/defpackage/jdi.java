package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.inputmethod.widgets.ManagedFrameLayout;

/* compiled from: PG */
/* renamed from: jdi  reason: default package */
/* loaded from: classes.dex */
public final class jdi extends FrameLayout.LayoutParams {
    public boolean a;
    public int b;

    public jdi() {
        super(-1, -1);
    }

    public jdi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray = null;
        try {
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, jdl.d, 0, 0);
                this.a = typedArray.getBoolean(0, false);
                this.b = typedArray.getResourceId(1, 0);
                if (typedArray == null) {
                    return;
                }
                typedArray.recycle();
            } catch (RuntimeException e) {
                ((ltd) ((ltd) ((ltd) ManagedFrameLayout.a.c()).i(e)).k("com/google/android/libraries/inputmethod/widgets/ManagedFrameLayout$LayoutParams", "<init>", (char) 128, "ManagedFrameLayout.java")).s();
                if (typedArray == null) {
                    return;
                }
                typedArray.recycle();
            }
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }
}
