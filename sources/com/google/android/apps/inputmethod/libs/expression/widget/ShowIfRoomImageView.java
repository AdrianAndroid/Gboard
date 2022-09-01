package com.google.android.apps.inputmethod.libs.expression.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ShowIfRoomImageView extends AppCompatImageView {
    public ShowIfRoomImageView(Context context) {
        super(context);
        a();
    }

    private final void a() {
        getViewTreeObserver().addOnGlobalLayoutListener(new he(this, 4));
    }

    public ShowIfRoomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ShowIfRoomImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
