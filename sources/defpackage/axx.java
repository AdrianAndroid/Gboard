package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: PG */
/* renamed from: axx  reason: default package */
/* loaded from: classes.dex */
public class axx implements axp {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final axy b;
    private final Set c;
    private final long d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private int j;

    public axx(long j) {
        ayd aydVar = new ayd();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.e = j;
        this.b = aydVar;
        this.c = unmodifiableSet;
    }

    private static Bitmap g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private final synchronized Bitmap h(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + String.valueOf(config) + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        axy axyVar = this.b;
        if (config == null) {
            config = a;
        }
        int b = bgj.b(i, i2, config);
        ayb d = ((ayd) axyVar).f.d(b, config);
        int i3 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i4 = aya.a[config.ordinal()];
            configArr = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : ayd.e : ayd.d : ayd.c : ayd.a;
        } else {
            configArr = ayd.b;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer num = (Integer) ((ayd) axyVar).b(config2).ceilingKey(Integer.valueOf(b));
            if (num == null || num.intValue() > b * 8) {
                i3++;
            } else {
                if (num.intValue() == b) {
                    if (config2 == null) {
                        if (config != null) {
                        }
                    } else if (config2.equals(config)) {
                    }
                }
                ((ayd) axyVar).f.c(d);
                d = ((ayd) axyVar).f.d(num.intValue(), config2);
            }
        }
        bitmap = (Bitmap) ((ayd) axyVar).g.a(d);
        if (bitmap != null) {
            ((ayd) axyVar).c(Integer.valueOf(d.a), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        if (bitmap == null) {
            this.h++;
        } else {
            this.g++;
            this.f -= bgj.a(bitmap);
            bitmap.setHasAlpha(true);
            bitmap.setPremultiplied(true);
        }
        return bitmap;
    }

    private final void i() {
        j(this.e);
    }

    private final synchronized void j(long j) {
        while (this.f > j) {
            axy axyVar = this.b;
            Bitmap bitmap = (Bitmap) ((ayd) axyVar).g.b();
            if (bitmap != null) {
                ((ayd) axyVar).c(Integer.valueOf(bgj.a(bitmap)), bitmap);
            }
            if (bitmap != null) {
                this.f -= bgj.a(bitmap);
                this.j++;
                bitmap.recycle();
            } else {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    this.b.toString();
                }
                this.f = 0L;
                return;
            }
        }
    }

    @Override // defpackage.axp
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap h = h(i, i2, config);
        if (h != null) {
            h.eraseColor(0);
            return h;
        }
        return g(i, i2, config);
    }

    @Override // defpackage.axp
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap h = h(i, i2, config);
        return h == null ? g(i, i2, config) : h;
    }

    @Override // defpackage.axp
    public final void c() {
        j(0L);
    }

    @Override // defpackage.axp
    public final synchronized void e(float f) {
        this.e = Math.round(((float) this.d) * f);
        i();
    }

    @Override // defpackage.axp
    public final void f(int i) {
        if (i >= 40 || i >= 20) {
            c();
        } else if (i != 15) {
        } else {
            j(this.e / 2);
        }
    }

    @Override // defpackage.axp
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && bgj.a(bitmap) <= this.e && this.c.contains(bitmap.getConfig())) {
                int a2 = bgj.a(bitmap);
                axy axyVar = this.b;
                ayb d = ((ayd) axyVar).f.d(bgj.a(bitmap), bitmap.getConfig());
                ((ayd) axyVar).g.c(d, bitmap);
                NavigableMap b = ((ayd) axyVar).b(bitmap.getConfig());
                Integer num = (Integer) b.get(Integer.valueOf(d.a));
                b.put(Integer.valueOf(d.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                this.i++;
                this.f += a2;
                i();
                return;
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }
}
