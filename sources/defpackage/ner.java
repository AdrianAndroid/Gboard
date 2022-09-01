package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ner  reason: default package */
/* loaded from: classes2.dex */
public abstract class ner {
    public static final /* synthetic */ int e = 0;
    private static volatile int f = 100;
    int a;
    final int b = f;
    public int c = Integer.MAX_VALUE;
    nes d;

    public static int F(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long G(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static ner H(InputStream inputStream) {
        if (inputStream == null) {
            return I(ngb.b);
        }
        return new nep(inputStream);
    }

    public static ner I(byte[] bArr) {
        return J(bArr, bArr.length);
    }

    public static ner J(byte[] bArr, int i) {
        return K(bArr, 0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ner K(byte[] bArr, int i, int i2) {
        nen nenVar = new nen(bArr, i, i2);
        try {
            nenVar.e(i2);
            return nenVar;
        } catch (ngd e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract void A(int i);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E(int i);

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int i);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract nem w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i);
}
