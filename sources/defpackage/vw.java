package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import j$.wrapper.java.io.FileInputStreamWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: PG */
/* renamed from: vw  reason: default package */
/* loaded from: classes2.dex */
final class vw extends wc {
    public static final Method a;
    private static final Class b;
    private static final Constructor c;
    private static final Method d;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        a = method2;
        d = method;
    }

    private static Typeface f(Object obj) {
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Object g() {
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) a.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.wc
    public final Typeface a(Context context, vc vcVar, Resources resources, int i) {
        vd[] vdVarArr;
        MappedByteBuffer mappedByteBuffer;
        Object g = g();
        if (g == null) {
            return null;
        }
        for (vd vdVar : vcVar.a) {
            int i2 = vdVar.f;
            File b2 = lc.b(context);
            if (b2 != null) {
                try {
                    if (lc.e(b2, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(b2);
                            try {
                                FileChannel channel = FileInputStreamWrapper.getChannel(fileInputStream);
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } finally {
                                break;
                            }
                        } catch (IOException unused) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !h(g, mappedByteBuffer, vdVar.e, vdVar.b, vdVar.c)) {
                            return null;
                        }
                    }
                } finally {
                    b2.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return f(g);
    }

    @Override // defpackage.wc
    public final Typeface b(Context context, gjk[] gjkVarArr, int i) {
        Object g = g();
        if (g == null) {
            return null;
        }
        qv qvVar = new qv();
        for (gjk gjkVar : gjkVarArr) {
            Object obj = gjkVar.e;
            ByteBuffer byteBuffer = (ByteBuffer) qvVar.get(obj);
            if (byteBuffer == null) {
                byteBuffer = lc.f(context, (Uri) obj);
                qvVar.put(obj, byteBuffer);
            }
            if (byteBuffer == null || !h(g, byteBuffer, gjkVar.a, gjkVar.b, gjkVar.c)) {
                return null;
            }
        }
        Typeface f = f(g);
        if (f != null) {
            return Typeface.create(f, i);
        }
        return null;
    }
}
