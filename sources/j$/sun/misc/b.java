package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class b {
    private static final b b;
    private final Unsafe a;

    static {
        Field i = i();
        i.setAccessible(true);
        try {
            b = new b((Unsafe) i.get(null));
        } catch (IllegalAccessException unused) {
            throw new AssertionError("Couldn't get the Unsafe");
        }
    }

    b(Unsafe unsafe) {
        this.a = unsafe;
    }

    public static b h() {
        return b;
    }

    private static Field i() {
        Field[] declaredFields;
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException unused) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe");
        }
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public final boolean c(Object obj, long j, int i, int i2) {
        return this.a.compareAndSwapInt(obj, j, i, i2);
    }

    public final boolean d(Object obj, long j, long j2, long j3) {
        return this.a.compareAndSwapLong(obj, j, j2, j3);
    }

    public final boolean e(Object obj, long j, Object obj2) {
        return a.a(this.a, obj, j, obj2);
    }

    public final int f(Object obj, long j) {
        int intVolatile;
        do {
            intVolatile = this.a.getIntVolatile(obj, j);
        } while (!this.a.compareAndSwapInt(obj, j, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    public final Object g(Object obj, long j) {
        return this.a.getObjectVolatile(obj, j);
    }

    public final long j(Class cls, String str) {
        try {
            return k(cls.getDeclaredField(str));
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("Cannot find field:");
        }
    }

    public final long k(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final void l(Object obj, long j, Object obj2) {
        this.a.putObjectVolatile(obj, j, obj2);
    }
}
