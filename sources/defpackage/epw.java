package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* compiled from: PG */
/* renamed from: epw  reason: default package */
/* loaded from: classes.dex */
public final class epw {
    private static final ltg j = ltg.j("com/google/android/apps/inputmethod/libs/theme/builder/UserImageThemeBuilder");
    public final Rect a;
    public final Rect b;
    public Bitmap c;
    public final int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public String i;
    private final lym k;
    private final int l;
    private final int m;

    public epw(lym lymVar) {
        int i;
        try {
            InputStream c = lymVar.c();
            i = eqf.b(c, 0, 0);
            if (c != null) {
                c.close();
            }
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) eqf.a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/theme/core/ImageUtil", "loadPreferredSamplingSizeFromDesiredSize", (char) 145, "ImageUtil.java")).t("Failed to open ByteSource");
            i = 1;
        }
        this.e = 0.4f;
        this.i = "";
        this.k = lymVar;
        this.d = i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = i;
        try {
            InputStream c2 = lymVar.c();
            BitmapFactory.decodeStream(c2, null, options);
            if (c2 != null) {
                c2.close();
            }
        } catch (IOException e2) {
            ((ltd) ((ltd) ((ltd) eqf.a.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/theme/core/ImageUtil", "decodeByteSource", (char) 238, "ImageUtil.java")).t("Failed to open ByteSource");
        }
        int i2 = options.outWidth;
        this.l = i2;
        int i3 = options.outHeight;
        this.m = i3;
        this.a = new Rect(0, 0, i2, i3);
        this.b = new Rect(0, 0, i2, i3);
        this.f = 0.0f;
        this.g = i2 / 2.0f;
        this.h = i3 / 2.0f;
    }

    public static float a(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    public static float c(Map map, String str, float f) {
        eut eutVar = (eut) map.get(str);
        return eutVar != null ? (float) eutVar.i : f;
    }

    public static void f(Rect rect, int i, int i2) {
        if (rect.left < 0) {
            ((ltd) ((ltd) j.c()).k("com/google/android/apps/inputmethod/libs/theme/builder/UserImageThemeBuilder", "checkRect", 269, "UserImageThemeBuilder.java")).u("rect.left should be >= 0, but is: %d", rect.left);
            rect.left = 0;
        }
        if (rect.top < 0) {
            ((ltd) ((ltd) j.c()).k("com/google/android/apps/inputmethod/libs/theme/builder/UserImageThemeBuilder", "checkRect", 273, "UserImageThemeBuilder.java")).u("rect.top should be >= 0, but is: %d", rect.top);
            rect.top = 0;
        }
        if (rect.right > i) {
            ((ltd) ((ltd) j.c()).k("com/google/android/apps/inputmethod/libs/theme/builder/UserImageThemeBuilder", "checkRect", 277, "UserImageThemeBuilder.java")).y("rect.right should be <= %d, but is: %d", i, rect.right);
            rect.right = i;
        }
        if (rect.bottom > i2) {
            ((ltd) ((ltd) j.c()).k("com/google/android/apps/inputmethod/libs/theme/builder/UserImageThemeBuilder", "checkRect", 281, "UserImageThemeBuilder.java")).y("rect.bottom should be <= %d, but is: %d", i2, rect.bottom);
            rect.bottom = i2;
        }
    }

    private static float k(float f) {
        return 1.0f - l(f);
    }

    private static float l(float f) {
        if (f < 0.0f) {
            ((ltd) ((ltd) j.c()).k("com/google/android/apps/inputmethod/libs/theme/builder/UserImageThemeBuilder", "validateTransparency", 449, "UserImageThemeBuilder.java")).w("transparency should be >= 0, but is: %f", Float.valueOf(f));
            return 0.0f;
        } else if (f <= 1.0f) {
            return f;
        } else {
            ((ltd) ((ltd) j.c()).k("com/google/android/apps/inputmethod/libs/theme/builder/UserImageThemeBuilder", "validateTransparency", 452, "UserImageThemeBuilder.java")).w("transparency should be <= 1, but is: %f", Float.valueOf(f));
            return 1.0f;
        }
    }

    private static void m(nfh nfhVar, String str, String str2, String str3, String str4, String str5) {
        nfhVar.cN(era.n(euu.BACKGROUND_IMAGE_REF, str2, str));
        nfh t = eut.j.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        eut eutVar = (eut) t.b;
        eutVar.a |= 2;
        eutVar.c = "bottom";
        nfhVar.cN(era.m(euu.BACKGROUND_IMAGE_GRAVITY, (eut) t.cz(), str));
        nfh t2 = eut.j.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        eut eutVar2 = (eut) t2.b;
        eutVar2.a |= 2;
        eutVar2.c = "fill_horizontal|fill_vertical";
        nfhVar.cN(era.m(euu.BACKGROUND_IMAGE_SCALE_MODE, (eut) t2.cz(), str));
        nfhVar.cN(era.n(euu.BACKGROUND_IMAGE_TILE_MODE, str3, str));
        if (str4 != null) {
            nfhVar.cN(era.o(euu.BACKGROUND_IMAGE_WIDTH, str4, str));
        } else {
            nfhVar.cN(era.l(euu.BACKGROUND_IMAGE_WIDTH, 0.0d, str));
        }
        if (str5 != null) {
            nfhVar.cN(era.o(euu.BACKGROUND_IMAGE_HEIGHT, str5, str));
        } else {
            nfhVar.cN(era.l(euu.BACKGROUND_IMAGE_HEIGHT, 0.0d, str));
        }
    }

    public final float b() {
        return this.e * 0.7f;
    }

    public final Bitmap d() {
        Bitmap bitmap = this.c;
        return bitmap == null ? e() : bitmap;
    }

    public final Bitmap e() {
        Bitmap bitmap;
        lym lymVar = this.k;
        int i = this.d;
        try {
            InputStream c = lymVar.c();
            bitmap = eqf.d(c, i);
            if (c != null) {
                c.close();
            }
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) eqf.a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/theme/core/ImageUtil", "loadBitmapWithSampling", (char) 217, "ImageUtil.java")).t("Failed to open ByteSource");
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        throw new lgj("Failed to load bitmap from ByteSource.");
    }

    public final void g(float f, float f2) {
        this.g = f;
        this.h = f2;
    }

    public final void h(Rect rect, Rect rect2) {
        this.c = null;
        this.a.set(rect);
        f(this.a, this.l, this.m);
        this.b.set(rect2);
        f(this.b, this.l, this.m);
    }

    public final void i(float f) {
        this.e = l(f);
    }

    public final boolean j(File file) {
        euw euwVar = euw.c;
        HashMap hashMap = new HashMap();
        try {
            epx.a("original_cropping", this.k.d(), hashMap);
            Bitmap d = d();
            Rect rect = this.a;
            epx.a("background", eqf.f(Bitmap.createBitmap(d, rect.left, rect.top, rect.width(), rect.height())), hashMap);
            float f = 1.0f;
            float min = Math.min(1.0f, 384.0f / this.b.width());
            Bitmap d2 = d();
            Rect rect2 = this.b;
            int round = Math.round(rect2.width() * min);
            int round2 = Math.round(min * this.b.height());
            Matrix matrix = new Matrix();
            matrix.setScale(round / rect2.width(), round2 / rect2.height());
            epx.a("thumbnail", eqf.f(Bitmap.createBitmap(d2, rect2.left, rect2.top, rect2.width(), rect2.height(), matrix, false)), hashMap);
            nfh t = euw.c.t();
            m(t, ".keyboard-background", "background", "mirror", "background_image_width", "background_image_height");
            m(t, ".keyboard-background.for-preview", "thumbnail", "none", null, null);
            t.cN(era.l(euu.BACKGROUND_ALPHA, k(this.e), ".keyboard-body-area"));
            t.cN(era.l(euu.BACKGROUND_ALPHA, k(b()), ".keyboard-header-area", ".candidates-area"));
            euu euuVar = euu.BACKGROUND_ALPHA;
            float f2 = 1.0f - this.e;
            float b = 1.0f - b();
            if (f2 != 1.0f) {
                if (b < f2) {
                    ((ltd) ((ltd) j.c()).k("com/google/android/apps/inputmethod/libs/theme/builder/UserImageThemeBuilder", "getOverlayLayerTransparencyForMoreCandidates", 318, "UserImageThemeBuilder.java")).x("headerAlpha should be >= %f, but is: %f", f2, b);
                    b = f2;
                }
                f = 1.0f - a((b - f2) / (1.0f - f2));
            }
            t.cN(era.l(euuVar, k(f), ".candidates-area.expanded"));
            t.cN(era.m(euu.BACKGROUND_COLOR, era.j(0), ".divider.horizontal.bottom.for-keyboard-header-area"));
            t.cO(era.q("__overlay_transparency", era.k(this.e)));
            float f3 = this.d;
            t.cO(era.q("__cropping_scale", era.k(this.f / f3)));
            t.cO(era.q("__cropping_rect_center_x", era.k(this.g * f3)));
            t.cO(era.q("__cropping_rect_center_y", era.k(this.h * f3)));
            euw euwVar2 = (euw) t.cz();
            String str = this.i;
            try {
                try {
                    ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                    zipOutputStream.putNextEntry(new ZipEntry("metadata.binarypb"));
                    nfh t2 = eve.k.t();
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    eve eveVar = (eve) t2.b;
                    int i = eveVar.a | 1;
                    eveVar.a = i;
                    eveVar.b = 3;
                    str.getClass();
                    eveVar.a = i | 2;
                    eveVar.e = str;
                    eveVar.b();
                    eveVar.c.add("style_sheet.binarypb");
                    ((eve) t2.cz()).p(zipOutputStream);
                    zipOutputStream.putNextEntry(new ZipEntry("style_sheet.binarypb"));
                    euwVar2.p(zipOutputStream);
                    for (Map.Entry entry : hashMap.entrySet()) {
                        byte[] bArr = (byte[]) entry.getValue();
                        ZipEntry zipEntry = new ZipEntry((String) entry.getKey());
                        zipEntry.setSize(bArr.length);
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr);
                        zipEntry.setCrc(crc32.getValue());
                        zipEntry.setMethod(0);
                        zipOutputStream.putNextEntry(zipEntry);
                        zipOutputStream.write(bArr);
                    }
                    zipOutputStream.close();
                    return true;
                } catch (IOException e) {
                    ((ltd) ((ltd) ((ltd) epx.a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/theme/builder/ZipThemePackageFileBuilder", "save", (char) 136, "ZipThemePackageFileBuilder.java")).t("Error while saving Zip theme package");
                    return false;
                }
            } catch (IOException e2) {
                ((ltd) ((ltd) ((ltd) epx.a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/theme/builder/ZipThemePackageFileBuilder", "save", 104, "ZipThemePackageFileBuilder.java")).w("Error while opening file: %s", file);
                return false;
            }
        } catch (IOException e3) {
            ((ltd) ((ltd) ((ltd) j.d()).i(e3)).k("com/google/android/apps/inputmethod/libs/theme/builder/UserImageThemeBuilder", "save", (char) 362, "UserImageThemeBuilder.java")).t("Failed to save user theme");
            return false;
        }
    }
}
