package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: erq  reason: default package */
/* loaded from: classes.dex */
public final class erq {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/TranslucentKeytopDrawableFactory");
    public static final Map a = new HashMap();

    public static Drawable a(int i, int i2, float f, float f2, float f3, float f4, int i3) {
        erp erpVar = new erp(i, i2, new float[]{f, f2, f4, f3}, i3);
        Map map = a;
        Drawable.ConstantState constantState = (Drawable.ConstantState) map.get(erpVar);
        if (constantState == null) {
            int alpha = Color.alpha(i);
            Paint paint = new Paint();
            paint.setAlpha(alpha);
            Paint paint2 = new Paint(1);
            paint2.setColor(i);
            float[] fArr = {f, f, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f};
            int max = Math.max(1, (int) Math.ceil(Math.max(f3, f4))) + 1;
            int i4 = max + max + 1;
            int i5 = max + i3;
            int alpha2 = alpha == 0 ? 0 : (int) ((Color.alpha(i2) * 255.0f) / alpha);
            if (alpha2 > 255) {
                ((ltd) ((ltd) b.c()).k("com/google/android/apps/inputmethod/libs/theme/core/TranslucentKeytopDrawableFactory", "createConstantState", 124, "TranslucentKeytopDrawableFactory.java")).t("Shadow alpha cannot be bigger than keytop alpha.");
                alpha2 = 255;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, i4, i5), new float[]{0.0f, 0.0f, 0.0f, 0.0f, f4, f4, f3, f3}, Path.Direction.CW);
            Paint paint3 = new Paint(1);
            paint3.setColor(b(i2, alpha2));
            canvas.drawPath(path, paint3);
            paint3.setColor(b(i, 255));
            path.offset(0.0f, -i3);
            canvas.drawPath(path, paint3);
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, max, i5);
            Bitmap createBitmap3 = Bitmap.createBitmap(createBitmap, max, 0, 1, i5);
            Bitmap createBitmap4 = Bitmap.createBitmap(createBitmap, i4 - max, 0, max, i5);
            if (createBitmap2.getHeight() != createBitmap3.getHeight() || createBitmap2.getHeight() != createBitmap4.getHeight()) {
                ((ltd) ((ltd) ero.a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/TranslucentKeytopDrawable", "createConstantState", 94, "TranslucentKeytopDrawable.java")).J("Incorrect bitmap heights. left:%d, center:%d, right:%d", Integer.valueOf(createBitmap2.getHeight()), Integer.valueOf(createBitmap3.getHeight()), Integer.valueOf(createBitmap4.getHeight()));
            }
            ern ernVar = new ern(paint, paint2, createBitmap2, createBitmap3, createBitmap4, fArr);
            map.put(erpVar, ernVar);
            return ernVar.newDrawable();
        }
        return constantState.newDrawable();
    }

    private static int b(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }
}
