package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: mii  reason: default package */
/* loaded from: classes.dex */
final class mii extends mhv {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new mih());
        }
        try {
            c = unsafe.objectFieldOffset(mik.class.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(mik.class.getDeclaredField("listeners"));
            d = unsafe.objectFieldOffset(mik.class.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(mij.class.getDeclaredField("thread"));
            f = unsafe.objectFieldOffset(mij.class.getDeclaredField("next"));
            a = unsafe;
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        } catch (RuntimeException e4) {
            throw e4;
        }
    }

    @Override // defpackage.mhv
    public final mhz a(mik mikVar, mhz mhzVar) {
        mhz mhzVar2;
        do {
            mhzVar2 = mikVar.listeners;
            if (mhzVar == mhzVar2) {
                return mhzVar2;
            }
        } while (!e(mikVar, mhzVar2, mhzVar));
        return mhzVar2;
    }

    @Override // defpackage.mhv
    public final mij b(mik mikVar, mij mijVar) {
        mij mijVar2;
        do {
            mijVar2 = mikVar.waiters;
            if (mijVar == mijVar2) {
                return mijVar2;
            }
        } while (!g(mikVar, mijVar2, mijVar));
        return mijVar2;
    }

    @Override // defpackage.mhv
    public final void c(mij mijVar, mij mijVar2) {
        a.putObject(mijVar, f, mijVar2);
    }

    @Override // defpackage.mhv
    public final void d(mij mijVar, Thread thread) {
        a.putObject(mijVar, e, thread);
    }

    @Override // defpackage.mhv
    public final boolean e(mik mikVar, mhz mhzVar, mhz mhzVar2) {
        return mig.a(a, mikVar, b, mhzVar, mhzVar2);
    }

    @Override // defpackage.mhv
    public final boolean f(mik mikVar, Object obj, Object obj2) {
        return mig.a(a, mikVar, d, obj, obj2);
    }

    @Override // defpackage.mhv
    public final boolean g(mik mikVar, mij mijVar, mij mijVar2) {
        return mig.a(a, mikVar, c, mijVar, mijVar2);
    }
}
