package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: esq  reason: default package */
/* loaded from: classes.dex */
public final class esq {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/property/ScaleBitmapDrawableCreator");
    private final eri b;
    private final String c;
    private final int d;
    private final int e;
    private final Shader.TileMode f;
    private final int g;
    private final float h;
    private final int i;
    private final int j;
    private Bitmap k;

    public esq(eri eriVar, String str, int i, int i2, Shader.TileMode tileMode, int i3, float f, int i4, int i5) {
        this.g = i3;
        this.h = f;
        if (i4 < 0) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/property/ScaleBitmapDrawableCreator", "<init>", 78, "ScaleBitmapDrawableCreator.java")).u("width should be >= 0, but is: %d", i4);
            i4 = 0;
        }
        if (i5 < 0) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/property/ScaleBitmapDrawableCreator", "<init>", 82, "ScaleBitmapDrawableCreator.java")).u("height should be >= 0, but is: %d", i5);
            i5 = 0;
        }
        this.b = eriVar;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = tileMode;
        this.i = i4;
        this.j = i5;
        this.k = null;
    }

    public static esq b(Resources resources, eri eriVar, euu euuVar, euu euuVar2, euu euuVar3, euu euuVar4, euu euuVar5, euu euuVar6, euu euuVar7, euu euuVar8, SparseArray sparseArray) {
        int c;
        euu euuVar9;
        int d;
        euu euuVar10;
        int b;
        euu euuVar11;
        euu euuVar12;
        int i;
        int round;
        eut i2 = era.i(sparseArray, euuVar);
        Shader.TileMode tileMode = null;
        if (i2 == null || i2.c.isEmpty()) {
            return null;
        }
        eut i3 = era.i(sparseArray, euuVar2);
        if (i3 == null) {
            euuVar9 = euuVar3;
            c = 0;
        } else {
            c = era.c(i3);
            euuVar9 = euuVar3;
        }
        eut i4 = era.i(sparseArray, euuVar9);
        if (i4 == null) {
            euuVar10 = euuVar4;
            d = 0;
        } else {
            d = era.d(i4);
            euuVar10 = euuVar4;
        }
        eut i5 = era.i(sparseArray, euuVar10);
        if (i5 != null) {
            tileMode = era.g(i5);
        }
        Shader.TileMode tileMode2 = tileMode;
        eut i6 = era.i(sparseArray, euuVar5);
        if (i6 == null) {
            euuVar11 = euuVar6;
            b = 0;
        } else {
            b = era.b(i6);
            euuVar11 = euuVar6;
        }
        eut i7 = era.i(sparseArray, euuVar11);
        float f = i7 == null ? 0.0f : (float) i7.i;
        double d2 = resources.getDisplayMetrics().density;
        eut i8 = era.i(sparseArray, euuVar7);
        if (i8 == null) {
            euuVar12 = euuVar8;
            i = 0;
        } else {
            double d3 = i8.i;
            Double.isNaN(d2);
            int round2 = (int) Math.round(d3 * d2);
            euuVar12 = euuVar8;
            i = round2;
        }
        eut i9 = era.i(sparseArray, euuVar12);
        if (i9 == null) {
            round = 0;
        } else {
            double d4 = i9.i;
            Double.isNaN(d2);
            round = (int) Math.round(d4 * d2);
        }
        return new esq(eriVar, i2.c, c, d, tileMode2, b, f, i, round);
    }

    public final Drawable a(Context context, boolean z) {
        Drawable drawable;
        try {
            Bitmap bitmap = this.k;
            if (bitmap == null) {
                if (this.c.startsWith("assets://")) {
                    try {
                        this.k = BitmapFactory.decodeStream(context.getAssets().open(this.c.substring(9)));
                    } catch (IOException e) {
                        ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/theme/core/property/ScaleBitmapDrawableCreator", "getBitmap", 192, "ScaleBitmapDrawableCreator.java")).w("Error loading bitmap %s", this.c);
                        this.k = null;
                    }
                } else {
                    this.k = this.b.a(this.c, this.i, this.j);
                }
                bitmap = this.k;
            }
            if (bitmap == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/property/ScaleBitmapDrawableCreator", "createInternal", 156, "ScaleBitmapDrawableCreator.java")).w("Illegal background image property: no image for %s", this.c);
                drawable = null;
            } else {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                    int i = this.d;
                    int i2 = this.e;
                    Shader.TileMode tileMode = this.f;
                    int i3 = this.g;
                    float f = this.h;
                    int i4 = this.i;
                    int i5 = this.j;
                    Resources resources = context.getResources();
                    if (f == 0.0f) {
                        drawable = eqo.b(resources, bitmap, 1.0f, i, i2, z, tileMode, i4, i5);
                    } else if (tileMode != null && i3 == 2) {
                        drawable = new LayerDrawable(new Drawable[]{eqo.c(context, bitmap, i, i2, z, tileMode, f, i4, i5), eqo.b(resources, bitmap, 1.0f, i, i2, z, null, i4, i5)});
                    } else if (i3 == 1) {
                        drawable = eqo.c(context, bitmap, i, i2, z, tileMode, f, i4, i5);
                    } else {
                        drawable = eqo.b(resources, bitmap, 1.0f, i, i2, z, tileMode, i4, i5);
                    }
                    drawable.setLevel(10000);
                }
                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/core/property/ScaleBitmapDrawableCreator", "createInternal", 160, "ScaleBitmapDrawableCreator.java")).J("Invalid bitmap size. imageRef:%s, width:%d, height:%d", this.c, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
                drawable = null;
            }
            if (drawable == null) {
                return null;
            }
            return drawable;
        } catch (OutOfMemoryError e2) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/theme/core/property/ScaleBitmapDrawableCreator", "create", (char) 144, "ScaleBitmapDrawableCreator.java")).t("OOM while getting background image");
            return null;
        }
    }
}
