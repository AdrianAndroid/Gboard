package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: eqn  reason: default package */
/* loaded from: classes.dex */
final class eqn extends Drawable.ConstantState {
    final Bitmap a;
    final float b;
    final Paint c;
    final int d;
    final int e;
    final int f;
    final boolean g;
    final int h;
    final int i;
    final Shader.TileMode j;
    final float k;
    ColorStateList l;
    PorterDuff.Mode m;

    public eqn(Bitmap bitmap, float f, int i, int i2, int i3, boolean z, int i4, int i5, Shader.TileMode tileMode) {
        this.m = PorterDuff.Mode.SRC_IN;
        this.a = bitmap;
        this.b = f;
        this.c = new Paint(6);
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = z;
        this.h = i4;
        this.i = i5;
        this.j = tileMode;
        if (i4 == 0 && i5 == 0) {
            this.k = f;
        } else {
            this.k = f * eqo.a((int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f), i4, i5, i3);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        ColorStateList colorStateList = this.l;
        if (colorStateList != null) {
            return colorStateList.getChangingConfigurations();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new eqo(this);
    }

    public eqn(eqn eqnVar) {
        this.m = PorterDuff.Mode.SRC_IN;
        this.a = eqnVar.a;
        this.b = eqnVar.b;
        this.c = new Paint(eqnVar.c);
        this.l = eqnVar.l;
        this.m = eqnVar.m;
        this.d = eqnVar.d;
        this.e = eqnVar.e;
        this.f = eqnVar.f;
        this.g = eqnVar.g;
        this.h = eqnVar.h;
        this.i = eqnVar.i;
        this.j = eqnVar.j;
        this.k = eqnVar.k;
    }
}
