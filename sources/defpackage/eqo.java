package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* compiled from: PG */
/* renamed from: eqo  reason: default package */
/* loaded from: classes.dex */
public final class eqo extends Drawable {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/ScaleBitmapDrawable");
    private eqn b;
    private boolean c = false;
    private boolean d = true;
    private final Matrix e = new Matrix();

    public eqo(eqn eqnVar) {
        this.b = eqnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 1.0f;
        }
        float f = 0.0f;
        if ((i5 & 1) != 0) {
            f = Math.max(0.0f, i3 / i);
        }
        return (i5 & 2) != 0 ? Math.max(f, i4 / i2) : f;
    }

    public static eqo b(Resources resources, Bitmap bitmap, float f, int i, int i2, boolean z, Shader.TileMode tileMode, int i3, int i4) {
        int i5;
        return new eqo(new eqn(bitmap, f, (resources.getDisplayMetrics() == null || (i5 = resources.getDisplayMetrics().densityDpi) == 0) ? 160 : i5, i, i2, z, i3, i4, tileMode));
    }

    public static eqo c(Context context, Bitmap bitmap, int i, int i2, boolean z, Shader.TileMode tileMode, float f, int i3, int i4) {
        if (bitmap.getWidth() >= 100 || bitmap.getHeight() >= 100) {
            Bitmap c = eqf.c(context, Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 2, bitmap.getHeight() / 2, true), f * 0.5f);
            if (c != null) {
                return b(context.getResources(), c, 2.0f, i, i2, z, tileMode, i3, i4);
            }
            return b(context.getResources(), bitmap, 1.0f, i, i2, z, tileMode, i3, i4);
        }
        Bitmap c2 = eqf.c(context, bitmap, f);
        return b(context.getResources(), c2 != null ? c2 : bitmap, 1.0f, i, i2, z, tileMode, i3, i4);
    }

    private static int d(int i, float f, int i2, int i3) {
        return (int) Math.ceil(((i * f) * i3) / i2);
    }

    private final void e() {
        PorterDuff.Mode mode;
        eqn eqnVar = this.b;
        ColorStateList colorStateList = eqnVar.l;
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (colorStateList != null && (mode = eqnVar.m) != null) {
            porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        this.b.c.setColorFilter(porterDuffColorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect;
        eqn eqnVar = this.b;
        Bitmap bitmap = eqnVar.a;
        if (this.d) {
            int level = eqnVar.g ? getLevel() : 10000;
            Matrix matrix = this.e;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            eqn eqnVar2 = this.b;
            float f = eqnVar2.b;
            int i = eqnVar2.e;
            int i2 = eqnVar2.f;
            int i3 = eqnVar2.h;
            int i4 = eqnVar2.i;
            Rect bounds = getBounds();
            float f2 = width;
            int i5 = (int) (f2 * f);
            float f3 = height;
            int i6 = (int) (f3 * f);
            if (i3 <= 0) {
                i3 = bounds.width();
            }
            if (i4 <= 0) {
                i4 = bounds.height();
            }
            float a2 = f * a(i5, i6, i3, i4, i2) * Math.max(0.0f, level / 10000.0f);
            Gravity.apply(i, (int) (f2 * a2), (int) (f3 * a2), bounds, new Rect());
            Matrix matrix2 = new Matrix();
            matrix2.postScale(a2, a2);
            matrix2.postTranslate(rect.left, rect.top);
            matrix.set(matrix2);
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/theme/core/ScaleBitmapDrawable", "draw", 256, "ScaleBitmapDrawable.java")).J("drawable:%s, level:%d, drawingMatrix:%s", this, Integer.valueOf(level), this.e.toShortString());
            eqn eqnVar3 = this.b;
            Shader.TileMode tileMode = eqnVar3.j;
            if (tileMode != null) {
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(this.e);
                this.b.c.setShader(bitmapShader);
            } else {
                eqnVar3.c.setShader(null);
            }
            this.d = false;
        }
        if (this.b.c.getShader() != null) {
            canvas.drawRect(getBounds(), this.b.c);
        } else {
            canvas.drawBitmap(bitmap, this.e, this.b.c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.c.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.b.c.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int height = this.b.a.getHeight();
        eqn eqnVar = this.b;
        return d(height, eqnVar.k, eqnVar.a.getDensity(), this.b.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int width = this.b.a.getWidth();
        eqn eqnVar = this.b;
        return d(width, eqnVar.k, eqnVar.a.getDensity(), this.b.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.b.l;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return super.isStateful();
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.c && super.mutate() == this) {
            this.b = new eqn(this.b);
            this.c = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.d = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        if (!this.b.g) {
            return super.onLevelChange(i);
        }
        super.onLevelChange(i);
        this.d = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        if (this.b.l == null) {
            return super.onStateChange(iArr);
        }
        this.d = true;
        e();
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (getAlpha() != i) {
            this.b.c.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.b.l = colorStateList;
        e();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.b.m = mode;
        e();
        invalidateSelf();
    }
}
