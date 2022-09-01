package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: eqk  reason: default package */
/* loaded from: classes.dex */
public final class eqk extends eqc {
    public final int a;
    public final int c;
    private final Rect d = new Rect();

    public eqk(Drawable drawable, int i, int i2) {
        super(drawable);
        this.a = i;
        this.c = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return new eqj(this);
    }

    @Override // defpackage.eqc, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int intrinsicHeight = super.getIntrinsicHeight();
        int i = this.c;
        return i < 0 ? intrinsicHeight : Math.min(intrinsicHeight, i);
    }

    @Override // defpackage.eqc, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int intrinsicWidth = super.getIntrinsicWidth();
        int i = this.a;
        return i < 0 ? intrinsicWidth : Math.min(intrinsicWidth, i);
    }

    @Override // defpackage.eqc, android.graphics.drawable.Drawable
    public final int getOpacity() {
        int opacity = this.b.getOpacity();
        return opacity == -1 ? (this.d.left > 0 || this.d.top > 0 || this.d.right > 0 || this.d.bottom > 0) ? -3 : -1 : opacity;
    }

    @Override // defpackage.eqc, android.graphics.drawable.Drawable
    public final Insets getOpticalInsets() {
        Insets opticalInsets = super.getOpticalInsets();
        return Insets.of(opticalInsets.left + this.d.left, opticalInsets.top + this.d.top, opticalInsets.right + this.d.right, opticalInsets.bottom + this.d.bottom);
    }

    @Override // defpackage.eqc, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding = super.getPadding(rect);
        rect.left += this.d.left;
        rect.right += this.d.right;
        rect.top += this.d.top;
        rect.bottom += this.d.bottom;
        return padding || (((this.d.left | this.d.right) | this.d.top) | this.d.bottom) != 0;
    }

    @Override // defpackage.eqc, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.d.set(0, 0, 0, 0);
        Rect rect2 = new Rect();
        this.b.getPadding(rect2);
        int width = (rect.width() - rect2.left) - rect2.right;
        int i = this.a;
        if (i >= 0 && width > i) {
            int i2 = width - i;
            this.d.left = i2 / 2;
            Rect rect3 = this.d;
            rect3.right = i2 - rect3.left;
        }
        int height = (rect.height() - rect2.top) - rect2.bottom;
        int i3 = this.c;
        if (i3 >= 0 && height > i3) {
            int i4 = height - i3;
            this.d.top = i4 / 2;
            Rect rect4 = this.d;
            rect4.bottom = i4 - rect4.top;
        }
        Rect rect5 = new Rect(rect);
        rect5.left += this.d.left;
        rect5.top += this.d.top;
        rect5.right -= this.d.right;
        rect5.bottom -= this.d.bottom;
        super.onBoundsChange(rect5);
    }
}
