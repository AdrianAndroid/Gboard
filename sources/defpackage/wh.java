package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* renamed from: wh  reason: default package */
/* loaded from: classes2.dex */
public final class wh {
    static Drawable a(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon b(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        int i = iconCompat.b;
        String str = null;
        r3 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i) {
            case -1:
                return (Icon) iconCompat.c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.c);
                break;
            case 2:
                if (i == -1) {
                    Object obj = iconCompat.c;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = wj.d(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon package", e);
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        }
                    }
                } else if (i == 2) {
                    String str2 = iconCompat.k;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.c).split(":", -1)[0] : iconCompat.k;
                } else {
                    new StringBuilder("called getResPackage() on ").append(iconCompat);
                    throw new IllegalStateException("called getResPackage() on ".concat(iconCompat.toString()));
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.f);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.c, iconCompat.f, iconCompat.g);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.c);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = wi.b((Bitmap) iconCompat.c);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.c((Bitmap) iconCompat.c));
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = wk.a(iconCompat.b());
                    break;
                } else if (context == null) {
                    StringBuilder sb = new StringBuilder("Context is required to resolve the file uri of the icon: ");
                    Uri b = iconCompat.b();
                    sb.append(b);
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(String.valueOf(b)));
                } else {
                    Uri b2 = iconCompat.b();
                    String scheme = b2.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(b2);
                        } catch (Exception e4) {
                            new StringBuilder("Unable to load image from URI: ").append(b2);
                            Log.w("IconCompat", "Unable to load image from URI: ".concat(String.valueOf(b2)), e4);
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.c));
                        } catch (FileNotFoundException e5) {
                            new StringBuilder("Unable to load image from path: ").append(b2);
                            Log.w("IconCompat", "Unable to load image from path: ".concat(String.valueOf(b2)), e5);
                        }
                    }
                    if (openInputStream == null) {
                        StringBuilder sb2 = new StringBuilder("Cannot load adaptive icon from uri: ");
                        Uri b3 = iconCompat.b();
                        sb2.append(b3);
                        throw new IllegalStateException("Cannot load adaptive icon from uri: ".concat(String.valueOf(b3)));
                    } else if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = wi.b(BitmapFactory.decodeStream(openInputStream));
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.c(BitmapFactory.decodeStream(openInputStream)));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.i;
        if (mode != IconCompat.a) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public static Uri c(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return wj.c(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public static final ala d(Parcel parcel, ClassLoader classLoader) {
        return new ala(parcel, classLoader);
    }
}
