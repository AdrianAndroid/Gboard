package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: bgj  reason: default package */
/* loaded from: classes.dex */
public final class bgj {
    public static final char[] a = "0123456789abcdef".toCharArray();
    public static final char[] b = new char[64];
    private static volatile Handler c;

    private bgj() {
    }

    public static int a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        String valueOf = String.valueOf(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String valueOf2 = String.valueOf(bitmap.getConfig());
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + valueOf + "[" + width + "x" + height + "] " + valueOf2);
    }

    public static int b(int i, int i2, Bitmap.Config config) {
        return i * i2 * c(config);
    }

    public static int c(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = bgi.a[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    public static int d(float f) {
        return e(Float.floatToIntBits(f), 17);
    }

    public static int e(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int f(Object obj, int i) {
        return e(obj == null ? 0 : obj.hashCode(), i);
    }

    public static Handler g() {
        if (c == null) {
            synchronized (bgj.class) {
                if (c == null) {
                    c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return c;
    }

    public static List h(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Queue i(int i) {
        return new ArrayDeque(i);
    }

    public static void j() {
        if (o()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    public static void k(Runnable runnable) {
        g().post(runnable);
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else if (obj instanceof azk) {
            return ((azk) obj).a();
        } else {
            return obj.equals(obj2);
        }
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean n() {
        return !o();
    }

    public static boolean o() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean p(int i, int i2) {
        return q(i) && q(i2);
    }

    private static boolean q(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }
}
