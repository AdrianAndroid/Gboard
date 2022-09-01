package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: vv  reason: default package */
/* loaded from: classes2.dex */
class vv extends wc {
    private static Class a = null;
    private static Constructor b = null;
    private static Method c = null;
    private static Method d = null;
    private static boolean e = false;

    private static Object f() {
        g();
        try {
            return b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void g() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    private static final File h(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // defpackage.wc
    public Typeface a(Context context, vc vcVar, Resources resources, int i) {
        vd[] vdVarArr;
        Object f = f();
        for (vd vdVar : vcVar.a) {
            File b2 = lc.b(context);
            if (b2 != null) {
                try {
                    if (!lc.e(b2, resources, vdVar.f)) {
                        return null;
                    }
                    String path = b2.getPath();
                    int i2 = vdVar.b;
                    boolean z = vdVar.c;
                    g();
                    try {
                        if (!((Boolean) c.invoke(f, path, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue()) {
                            return null;
                        }
                        b2.delete();
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (RuntimeException unused) {
                } finally {
                    b2.delete();
                }
            }
            return null;
        }
        g();
        try {
            Object newInstance = Array.newInstance(a, 1);
            Array.set(newInstance, 0, f);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.wc
    public Typeface b(Context context, gjk[] gjkVarArr, int i) {
        if (gjkVarArr.length <= 0) {
            return null;
        }
        gjk l = l(gjkVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor((Uri) l.e, "r", null);
            if (openFileDescriptor == null) {
                return null;
            }
            File h = h(openFileDescriptor);
            if (h != null && h.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(h);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                Typeface k = super.k(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return k;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
