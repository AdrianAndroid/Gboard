package com.google.android.libraries.avatar.creation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CameraTextureView extends TextureView {
    public CameraTextureView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    public CameraTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
