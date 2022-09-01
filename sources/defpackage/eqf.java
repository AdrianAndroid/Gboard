package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: eqf  reason: default package */
/* loaded from: classes.dex */
public final class eqf {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/ImageUtil");

    public static int a(int i, int i2, int i3, int i4) {
        int i5;
        if (i3 == 0) {
            i3 = 512;
        }
        if (i4 == 0) {
            i4 = 512;
        }
        double d = i;
        double d2 = i3;
        Double.isNaN(d);
        Double.isNaN(d2);
        int floor = (int) Math.floor(d / d2);
        double d3 = i2;
        double d4 = i4;
        Double.isNaN(d3);
        Double.isNaN(d4);
        int min = Math.min(floor, (int) Math.floor(d3 / d4));
        double max = Math.max(i, i2);
        Double.isNaN(max);
        int ceil = (int) Math.ceil(max / 2048.0d);
        if (ceil < 0) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/core/ImageUtil", "roundUpToNearestPowerOf2", 191, "ImageUtil.java")).u("value should be >= 0, but is: %d", ceil);
            ceil = 0;
        }
        if (ceil == 0) {
            i5 = 1;
        } else {
            int highestOneBit = Integer.highestOneBit(ceil);
            i5 = highestOneBit != ceil ? highestOneBit + highestOneBit : highestOneBit;
        }
        return Math.max(i5, min);
    }

    public static int b(InputStream inputStream, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth < 0 || options.outHeight < 0) {
            options = null;
        }
        if (options == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/theme/core/ImageUtil", "loadPreferredSamplingSizeFromDesiredSize", 125, "ImageUtil.java")).t("Failed to decode bitmap bounds.");
            return 1;
        }
        return a(options.outWidth, options.outHeight, i, i2);
    }

    public static Bitmap c(Context context, Bitmap bitmap, float f) {
        Throwable th;
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Allocation allocation;
        Allocation allocation2;
        if (f > 0.0f) {
            try {
                try {
                    RenderScript renderScript = (RenderScript) jbg.a.i(context);
                    allocation = Allocation.createFromBitmap(renderScript, bitmap);
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
                        allocation2 = Allocation.createFromBitmap(renderScript, createBitmap);
                        try {
                            scriptIntrinsicBlur = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
                            try {
                                scriptIntrinsicBlur.setRadius(Math.min(25.0f, f));
                                scriptIntrinsicBlur.setInput(allocation);
                                scriptIntrinsicBlur.forEach(allocation2);
                                allocation2.copyTo(createBitmap);
                                if (scriptIntrinsicBlur != null) {
                                    scriptIntrinsicBlur.destroy();
                                }
                                if (allocation2 != null) {
                                    allocation2.destroy();
                                }
                                if (allocation != null) {
                                    allocation.destroy();
                                }
                                return createBitmap;
                            } catch (Throwable th2) {
                                th = th2;
                                if (scriptIntrinsicBlur != null) {
                                    scriptIntrinsicBlur.destroy();
                                }
                                if (allocation2 != null) {
                                    allocation2.destroy();
                                }
                                if (allocation != null) {
                                    allocation.destroy();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            scriptIntrinsicBlur = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        scriptIntrinsicBlur = null;
                        allocation2 = null;
                    }
                } catch (RSRuntimeException e) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/theme/core/ImageUtil", "blurBitmap", (char) 306, "ImageUtil.java")).t("RenderScript internal error.");
                    return null;
                }
            } catch (Throwable th5) {
                th = th5;
                scriptIntrinsicBlur = null;
                allocation = null;
                allocation2 = null;
            }
        } else {
            return bitmap;
        }
    }

    public static Bitmap d(InputStream inputStream, int i) {
        if (i <= 0) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/core/ImageUtil", "loadBitmapWithSampling", 204, "ImageUtil.java")).u("samplingSize should be >= 1, but is: %d", i);
            i = 1;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static void e(Bitmap bitmap, lyl lylVar) {
        BufferedOutputStream bufferedOutputStream;
        OutputStream a2 = lylVar.a();
        if (a2 instanceof BufferedOutputStream) {
            bufferedOutputStream = (BufferedOutputStream) a2;
        } else {
            bufferedOutputStream = new BufferedOutputStream(a2);
        }
        try {
            bitmap.compress(bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 90, bufferedOutputStream);
            bufferedOutputStream.close();
        } catch (Throwable th) {
            try {
                bufferedOutputStream.close();
            } catch (Throwable th2) {
                erg.d(th, th2);
            }
            throw th;
        }
    }

    public static byte[] f(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e(bitmap, new eqe(byteArrayOutputStream));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new lgj(e);
        }
    }
}
