package j$.util;

/* loaded from: classes3.dex */
public abstract class F {
    private static final r a = new B();
    private static final o b = new z();
    private static final p c = new A();
    private static final n d = new y();

    private static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static n b() {
        return d;
    }

    public static o c() {
        return b;
    }

    public static p d() {
        return c;
    }

    public static r e() {
        return a;
    }

    public static AbstractC0008h f(n nVar) {
        Objects.requireNonNull(nVar);
        return new v(nVar);
    }

    public static j g(o oVar) {
        Objects.requireNonNull(oVar);
        return new t(oVar);
    }

    public static l h(p pVar) {
        Objects.requireNonNull(pVar);
        return new u(pVar);
    }

    public static java.util.Iterator i(r rVar) {
        Objects.requireNonNull(rVar);
        return new s(rVar);
    }

    public static n j(double[] dArr, int i, int i2) {
        a(((double[]) Objects.requireNonNull(dArr)).length, i, i2);
        return new x(dArr, i, i2, 1040);
    }

    public static o k(int[] iArr, int i, int i2) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i, i2);
        return new C(iArr, i, i2, 1040);
    }

    public static p l(long[] jArr, int i, int i2) {
        a(((long[]) Objects.requireNonNull(jArr)).length, i, i2);
        return new E(jArr, i, i2, 1040);
    }

    public static r m(Object[] objArr, int i, int i2) {
        a(((Object[]) Objects.requireNonNull(objArr)).length, i, i2);
        return new w(objArr, i, i2, 1040);
    }
}
