package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* renamed from: bbe  reason: default package */
/* loaded from: classes.dex */
public final class bbe {
    public final axn f;
    public final List g;
    private final axp j;
    private final DisplayMetrics k;
    private final bbk l = bbk.a();
    public static final auz a = auz.c("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", aun.c);
    public static final auz b = auz.b("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    public static final auz c = auz.c("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);
    public static final auz d = auz.c("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);
    private static final Set h = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
    public static final bbd e = new bbc();
    private static final Queue i = bgj.i(0);

    static {
        bbb bbbVar = bbb.a;
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
    }

    public bbe(List list, DisplayMetrics displayMetrics, axp axpVar, axn axnVar) {
        this.g = list;
        ce.m(displayMetrics);
        this.k = displayMetrics;
        ce.m(axpVar);
        this.j = axpVar;
        ce.m(axnVar);
        this.f = axnVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    private static Bitmap d(bbm bbmVar, BitmapFactory.Options options, bbd bbdVar, axp axpVar) {
        String str;
        Bitmap d2;
        Lock lock;
        if (!options.inJustDecodeBounds) {
            bbdVar.b();
            bbmVar.d();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str2 = options.outMimeType;
        bbt.a.lock();
        try {
            try {
                d2 = bbmVar.b(options);
                lock = bbt.a;
            } catch (IllegalArgumentException e2) {
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    str = null;
                } else {
                    String str3 = " (" + bitmap.getAllocationByteCount() + ")";
                    str = "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()) + str3;
                }
                IOException iOException = new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str2 + ", inBitmap: " + str, e2);
                if (options.inBitmap != null) {
                    try {
                        axpVar.d(options.inBitmap);
                        options.inBitmap = null;
                        d2 = d(bbmVar, options, bbdVar, axpVar);
                        lock = bbt.a;
                    } catch (IOException unused) {
                        throw iOException;
                    }
                } else {
                    throw iOException;
                }
            }
            lock.unlock();
            return d2;
        } catch (Throwable th) {
            bbt.a.unlock();
            throw th;
        }
    }

    private static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        synchronized (bbe.class) {
            Queue queue = i;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                g(options2);
                return options2;
            }
            return options;
        }
    }

    private static void f(BitmapFactory.Options options) {
        g(options);
        Queue queue = i;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean h(int i2) {
        return i2 == 90 || i2 == 270;
    }

    private static boolean i(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] j(bbm bbmVar, BitmapFactory.Options options, bbd bbdVar, axp axpVar) {
        options.inJustDecodeBounds = true;
        d(bbmVar, options, bbdVar, axpVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0284 A[Catch: all -> 0x03d1, TryCatch #1 {all -> 0x03d1, blocks: (B:27:0x0253, B:29:0x025f, B:30:0x028c, B:38:0x02ce, B:40:0x02d4, B:43:0x02db, B:45:0x02e1, B:46:0x02e3, B:49:0x02eb, B:51:0x02f1, B:53:0x02f7, B:55:0x02fb, B:57:0x0303, B:58:0x0308, B:59:0x0306, B:60:0x030f, B:62:0x0313, B:63:0x031b, B:65:0x0328, B:68:0x03b5, B:70:0x03bb, B:71:0x033a, B:72:0x0347, B:74:0x0377, B:75:0x034b, B:76:0x034f, B:77:0x0358, B:78:0x035c, B:79:0x0365, B:80:0x036e, B:81:0x0372, B:82:0x03c0, B:87:0x0296, B:89:0x029c, B:90:0x02a6, B:92:0x0267, B:97:0x026d, B:99:0x0277, B:100:0x027c, B:102:0x0284, B:95:0x0288, B:103:0x027a), top: B:26:0x0253 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.axh a(defpackage.bbm r27, int r28, int r29, defpackage.ava r30, defpackage.bbd r31) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbe.a(bbm, int, int, ava, bbd):axh");
    }
}
