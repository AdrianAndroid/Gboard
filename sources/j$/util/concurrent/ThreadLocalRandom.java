package j$.util.concurrent;

import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class ThreadLocalRandom extends Random {
    private static final ThreadLocal d = new ThreadLocal();
    private static final AtomicInteger e = new AtomicInteger();
    private static final ThreadLocal f = new v();
    private static final AtomicLong g = new AtomicLong(e(System.currentTimeMillis()) ^ e(System.nanoTime()));
    long a;
    int b;
    boolean c = true;

    static {
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
        if (((Boolean) AccessController.doPrivileged(new w())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = seed[0] & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (seed[i] & 255);
            }
            g.set(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((ThreadLocalRandom) f.get()).b = i4;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b() {
        return ((ThreadLocalRandom) f.get()).b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c() {
        int addAndGet = e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long e2 = e(g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        threadLocalRandom.a = e2;
        threadLocalRandom.b = addAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        if (threadLocalRandom.b == 0) {
            c();
        }
        return threadLocalRandom;
    }

    private static int d(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long e(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    final long f() {
        long j = this.a - 7046029254386353131L;
        this.a = j;
        return j;
    }

    @Override // java.util.Random
    protected final int next(int i) {
        return nextInt() >>> (32 - i);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return d(f()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        double e2 = e(f()) >>> 11;
        Double.isNaN(e2);
        return e2 * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (d(f()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = d;
        Double d2 = (Double) threadLocal.get();
        if (d2 != null) {
            threadLocal.set(null);
            return d2.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d3 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d3 < 1.0d && d3 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d3) * (-2.0d)) / d3);
                threadLocal.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final int nextInt() {
        return d(f());
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        if (i > 0) {
            int d2 = d(f());
            int i2 = i - 1;
            if ((i & i2) == 0) {
                return d2 & i2;
            }
            while (true) {
                int i3 = d2 >>> 1;
                int i4 = i3 + i2;
                int i5 = i3 % i;
                if (i4 - i5 >= 0) {
                    return i5;
                }
                d2 = d(f());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    public int nextInt(int i, int i2) {
        int i3;
        if (i < i2) {
            int d2 = d(f());
            if (i < i2) {
                int i4 = i2 - i;
                int i5 = i4 - 1;
                if ((i4 & i5) == 0) {
                    i3 = d2 & i5;
                } else if (i4 > 0) {
                    int i6 = d2 >>> 1;
                    while (true) {
                        int i7 = i6 + i5;
                        i3 = i6 % i4;
                        if (i7 - i3 >= 0) {
                            break;
                        }
                        i6 = d(f()) >>> 1;
                    }
                } else {
                    while (true) {
                        if (d2 < i || d2 >= i2) {
                            d2 = d(f());
                        } else {
                            return d2;
                        }
                    }
                }
                return i3 + i;
            }
            return d2;
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final long nextLong() {
        return e(f());
    }

    public long nextLong(long j) {
        if (j > 0) {
            long e2 = e(f());
            long j2 = j - 1;
            if ((j & j2) == 0) {
                return e2 & j2;
            }
            while (true) {
                long j3 = e2 >>> 1;
                long j4 = j3 + j2;
                long j5 = j3 % j;
                if (j4 - j5 >= 0) {
                    return j5;
                }
                e2 = e(f());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (!this.c) {
            return;
        }
        throw new UnsupportedOperationException();
    }
}
