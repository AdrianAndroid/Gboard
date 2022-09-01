package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wc  reason: default package */
/* loaded from: classes2.dex */
public class wc {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private static long f(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    private static Object g(Object[] objArr, int i, wb wbVar) {
        int i2 = 1 != (i & 1) ? 400 : 700;
        boolean z = (i & 2) != 0;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(wbVar.a(obj2) - i2);
            int i4 = abs + abs + (wbVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i3 > i4) {
                obj = obj2;
                i3 = i4;
            }
        }
        return obj;
    }

    public Typeface a(Context context, vc vcVar, Resources resources, int i) {
        vd vdVar = (vd) g(vcVar.a, i, new wa(0));
        if (vdVar == null) {
            return null;
        }
        Typeface b = vu.b(context, resources, vdVar.f, vdVar.a, 0, i);
        long f = f(b);
        if (f != 0) {
            this.a.put(Long.valueOf(f), vcVar);
        }
        return b;
    }

    public Typeface b(Context context, gjk[] gjkVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (gjkVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream((Uri) l(gjkVarArr, i).e);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface k = k(context, inputStream);
            lc.c(inputStream);
            return k;
        } catch (IOException unused2) {
            lc.c(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            lc.c(inputStream2);
            throw th;
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File b = lc.b(context);
        if (b == null) {
            return null;
        }
        try {
            if (lc.e(b, resources, i)) {
                return Typeface.createFromFile(b.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            b.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface k(Context context, InputStream inputStream) {
        File b = lc.b(context);
        if (b == null) {
            return null;
        }
        try {
            if (lc.d(b, inputStream)) {
                return Typeface.createFromFile(b.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            b.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public gjk l(gjk[] gjkVarArr, int i) {
        return (gjk) g(gjkVarArr, i, new wa(1));
    }
}
