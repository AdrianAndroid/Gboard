package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.util.LongSparseArray;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* renamed from: cf  reason: default package */
/* loaded from: classes.dex */
public final class cf {
    public static Boolean a;
    public static Exception b;
    private static Field c;
    private static boolean d;
    private static Class e;
    private static boolean f;
    private static Field g;
    private static boolean h;
    private static Field i;
    private static boolean j;

    public static Bundle a(Bundle bundle) {
        bundle.setClassLoader(cf.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void b(Resources resources) {
        if (!d) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            d = true;
        }
        Field field = c;
        Object obj = null;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (obj == null) {
            return;
        }
        o(obj);
    }

    public static void c(Resources resources) {
        Object obj;
        if (!j) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            j = true;
        }
        Field field = i;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                obj = null;
            }
            if (obj == null) {
                return;
            }
            if (!d) {
                try {
                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                    c = declaredField2;
                    declaredField2.setAccessible(true);
                } catch (NoSuchFieldException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                }
                d = true;
            }
            Field field2 = c;
            if (field2 != null) {
                try {
                    obj2 = field2.get(obj);
                } catch (IllegalAccessException e5) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                }
            }
            if (obj2 == null) {
                return;
            }
            o(obj2);
        }
    }

    public static boolean d(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean e(int i2, int i3) {
        return i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && i2 <= 512 && i3 <= 384;
    }

    public static boolean f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static int g(List list, InputStream inputStream, axn axnVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new bbp(inputStream, axnVar);
        }
        inputStream.mark(5242880);
        return h(list, new aut(inputStream, axnVar, 0));
    }

    public static int h(List list, auu auuVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int a2 = auuVar.a((auq) list.get(i2));
            if (a2 != -1) {
                return a2;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType i(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        return k(list, new aur(byteBuffer, 0));
    }

    public static ImageHeaderParser$ImageType j(List list, InputStream inputStream, axn axnVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new bbp(inputStream, axnVar);
        }
        inputStream.mark(5242880);
        return k(list, new aur(inputStream, 1));
    }

    public static ImageHeaderParser$ImageType k(List list, auv auvVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser$ImageType a2 = auvVar.a((auq) list.get(i2));
            if (a2 != ImageHeaderParser$ImageType.UNKNOWN) {
                return a2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static int l(int i2) {
        if (i2 != 1) {
            return i2 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static boolean m(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static final String n(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }

    private static void o(Object obj) {
        LongSparseArray longSparseArray;
        if (!f) {
            try {
                e = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f = true;
        }
        Class cls = e;
        if (cls == null) {
            return;
        }
        if (!h) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            h = true;
        }
        Field field = g;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return;
        }
        dz.a(longSparseArray);
    }
}
