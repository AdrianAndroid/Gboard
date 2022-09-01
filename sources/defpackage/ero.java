package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: ero  reason: default package */
/* loaded from: classes.dex */
final class ero extends Drawable {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/TranslucentKeytopDrawable");
    private final ern b;
    private final Rect c;
    private final Rect d = new Rect();
    private final RectF e = new RectF();
    private final Path f = new Path();

    public ero(ern ernVar) {
        Rect rect = new Rect();
        this.c = rect;
        this.b = ernVar;
        rect.set(0, 0, ernVar.d.getWidth(), ernVar.d.getHeight());
    }

    private final int a(Canvas canvas, int i, int i2, int i3, int i4) {
        int save = canvas.save();
        this.d.set(i, i2, i3, i4);
        canvas.clipRect(this.d);
        return save;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        try {
            canvas.translate(bounds.left, bounds.top);
            int width = bounds.width();
            int height = bounds.height();
            int max = Math.max(0, Math.min(height, this.b.e.getHeight() - 1));
            int max2 = Math.max(0, height - max);
            int a2 = a(canvas, 0, 0, width, max2);
            this.e.set(0.0f, 0.0f, width, max2 + 1);
            this.f.reset();
            this.f.addRoundRect(this.e, this.b.f, Path.Direction.CW);
            canvas.drawPath(this.f, this.b.b);
            canvas.restoreToCount(a2);
            int a3 = a(canvas, 0, max2, width, height);
            canvas.translate(0.0f, max2 - 1);
            int i = max + 1;
            int width2 = this.b.c.getWidth() - 1;
            int width3 = width - (this.b.e.getWidth() - 1);
            Paint paint = this.b.a;
            int a4 = a(canvas, 0, 0, width2, i);
            canvas.drawBitmap(this.b.c, 0.0f, 0.0f, paint);
            canvas.restoreToCount(a4);
            int a5 = a(canvas, width2, 0, width3, i);
            this.d.set(width2 - 1, 0, width3 + 1, i);
            canvas.drawBitmap(this.b.d, this.c, this.d, paint);
            canvas.restoreToCount(a5);
            int a6 = a(canvas, width3, 0, width, i);
            canvas.drawBitmap(this.b.e, width3 - 1, 0.0f, paint);
            canvas.restoreToCount(a6);
            canvas.restoreToCount(a3);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/core/TranslucentKeytopDrawable", "setAlpha", 177, "TranslucentKeytopDrawable.java")).t("setAlpha() is not supported.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/core/TranslucentKeytopDrawable", "setColorFilter", 182, "TranslucentKeytopDrawable.java")).t("setColorFilter() is not supported.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/core/TranslucentKeytopDrawable", "setTintList", 187, "TranslucentKeytopDrawable.java")).t("setTintList() is not supported.");
    }
}
