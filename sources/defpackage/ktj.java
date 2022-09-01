package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* compiled from: PG */
/* renamed from: ktj  reason: default package */
/* loaded from: classes.dex */
final class ktj extends InsetDrawable {
    public ktj(Drawable drawable, int i, int i2, int i3, int i4) {
        super(drawable, i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return false;
    }
}
