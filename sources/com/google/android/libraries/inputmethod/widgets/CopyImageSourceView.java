package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CopyImageSourceView extends View {
    public jyw a;

    public CopyImageSourceView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        jyw jywVar = this.a;
        if (jywVar != null) {
            Object obj = jywVar.a;
            Object obj2 = jywVar.b;
            CopyImageView copyImageView = (CopyImageView) obj;
            copyImageView.f.setEmpty();
            Canvas canvas2 = (Canvas) obj2;
            int saveCount = canvas2.getSaveCount();
            if (saveCount > 1) {
                canvas2.restoreToCount(1);
            }
            canvas2.clipRect(copyImageView.f);
            for (int i = 0; i < saveCount; i++) {
                canvas2.save();
            }
            this.a = null;
        }
    }

    public CopyImageSourceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CopyImageSourceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CopyImageSourceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
