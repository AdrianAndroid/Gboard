package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: eqa  reason: default package */
/* loaded from: classes.dex */
public final class eqa extends eqc {
    public final ColorStateList a;
    private int c = 0;

    public eqa(Drawable drawable, ColorStateList colorStateList) {
        super(drawable);
        this.a = colorStateList;
        mutate();
        a(colorStateList.getDefaultColor());
    }

    private final void a(int i) {
        this.c = i;
        Drawable drawable = this.b;
        drawable.setColorFilter((-16777216) | i, PorterDuff.Mode.SRC_ATOP);
        drawable.setAlpha(Color.alpha(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return new epz(this);
    }

    @Override // defpackage.eqc, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.eqc, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.a.isStateful() || super.isStateful();
    }

    @Override // defpackage.eqc, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.a;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.c == colorForState) {
            z = false;
        } else {
            a(colorForState);
            z = true;
        }
        boolean z2 = z | onStateChange;
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }
}
