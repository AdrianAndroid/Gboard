package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ie  reason: default package */
/* loaded from: classes.dex */
public final class ie implements mu {
    public final int[] a = {R.drawable.f44400_resource_name_obfuscated_res_0x7f08006c, R.drawable.f44380_resource_name_obfuscated_res_0x7f08006a, R.drawable.f43650_resource_name_obfuscated_res_0x7f080020};
    public final int[] b = {R.drawable.f43890_resource_name_obfuscated_res_0x7f080038, R.drawable.f44230_resource_name_obfuscated_res_0x7f08005b, R.drawable.f43950_resource_name_obfuscated_res_0x7f08003f, R.drawable.f43910_resource_name_obfuscated_res_0x7f08003a, R.drawable.f43920_resource_name_obfuscated_res_0x7f08003b, R.drawable.f43940_resource_name_obfuscated_res_0x7f08003e, R.drawable.f43930_resource_name_obfuscated_res_0x7f08003d};
    public final int[] c = {R.drawable.f44370_resource_name_obfuscated_res_0x7f080069, R.drawable.f44390_resource_name_obfuscated_res_0x7f08006b, R.drawable.f43820_resource_name_obfuscated_res_0x7f080031, R.drawable.f44330_resource_name_obfuscated_res_0x7f080065, R.drawable.f44340_resource_name_obfuscated_res_0x7f080066, R.drawable.f44350_resource_name_obfuscated_res_0x7f080067, R.drawable.f44360_resource_name_obfuscated_res_0x7f080068};
    public final int[] d = {R.drawable.f44130_resource_name_obfuscated_res_0x7f080051, R.drawable.f43800_resource_name_obfuscated_res_0x7f08002f, R.drawable.f44120_resource_name_obfuscated_res_0x7f080050};
    public final int[] e = {R.drawable.f44310_resource_name_obfuscated_res_0x7f080063, R.drawable.f44410_resource_name_obfuscated_res_0x7f08006d};
    public final int[] f = {R.drawable.f43680_resource_name_obfuscated_res_0x7f080023, R.drawable.f43740_resource_name_obfuscated_res_0x7f080029, R.drawable.f43690_resource_name_obfuscated_res_0x7f080024, R.drawable.f43750_resource_name_obfuscated_res_0x7f08002a};

    public static final boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final ColorStateList b(Context context, int i) {
        int b = nr.b(context, R.attr.f9410_resource_name_obfuscated_res_0x7f040318);
        return new ColorStateList(new int[][]{nr.a, nr.c, nr.b, nr.e}, new int[]{nr.a(context, R.attr.f9380_resource_name_obfuscated_res_0x7f040315), vo.c(b, i), vo.c(b, i), i});
    }

    public static final LayerDrawable c(mv mvVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c = mvVar.c(context, R.drawable.f44270_resource_name_obfuscated_res_0x7f08005f);
        Drawable c2 = mvVar.c(context, R.drawable.f44280_resource_name_obfuscated_res_0x7f080060);
        if (!(c instanceof BitmapDrawable) || c.getIntrinsicWidth() != dimensionPixelSize || c.getIntrinsicHeight() != dimensionPixelSize) {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        } else {
            bitmapDrawable = (BitmapDrawable) c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if (!(c2 instanceof BitmapDrawable) || c2.getIntrinsicWidth() != dimensionPixelSize || c2.getIntrinsicHeight() != dimensionPixelSize) {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        } else {
            bitmapDrawable3 = (BitmapDrawable) c2;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static final void d(Drawable drawable, int i, PorterDuff.Mode mode) {
        Rect rect = ke.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0000if.a;
        }
        mutate.setColorFilter(C0000if.b(i, mode));
    }
}
