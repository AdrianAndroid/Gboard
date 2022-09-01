package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class E implements P1 {
    private static final C0028g0 a = new C0028g0();
    private static final K b = new C0022e0();
    private static final L c = new C0025f0();
    private static final J d = new C0019d0();
    private static final int[] e = new int[0];
    private static final long[] f = new long[0];
    private static final double[] g = new double[0];

    public /* synthetic */ E() {
    }

    public /* synthetic */ E(EnumC0056p1 enumC0056p1) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC0031h0 B(EnumC0056p1 enumC0056p1) {
        M m;
        int i = O.a[enumC0056p1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        m = d;
                    } else {
                        throw new IllegalStateException(j$.net.a.a("Unknown shape ", String.valueOf(enumC0056p1)));
                    }
                } else {
                    m = c;
                }
            } else {
                m = b;
            }
            return (AbstractC0031h0) m;
        }
        return a;
    }

    public static N D(N n, IntFunction intFunction) {
        if (n.k() > 0) {
            long count = n.count();
            if (count < 2147483639) {
                Object[] objArr = (Object[]) intFunction.apply((int) count);
                new A0(n, objArr).invoke();
                return new Q(objArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return n;
    }

    public static K E(K k) {
        if (k.k() > 0) {
            long count = k.count();
            if (count < 2147483639) {
                int[] iArr = new int[(int) count];
                new C0078z0(k, iArr).invoke();
                return new C0037j0(iArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static G G(long j) {
        if (j >= 0 && j < 2147483639) {
            return new C0040k0(j);
        }
        return new C0043l0();
    }

    public static Stream J(j$.util.r rVar, boolean z) {
        Objects.requireNonNull(rVar);
        return new Q0(rVar, EnumC0053o1.c(rVar), z);
    }

    public static void c() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void d(W0 w0, Integer num) {
        if (!S1.a) {
            w0.accept(num.intValue());
        } else {
            S1.a(w0.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
    }

    public static Object[] g(M m, IntFunction intFunction) {
        if (S1.a) {
            S1.a(m.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (m.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            Object[] objArr = (Object[]) intFunction.apply((int) m.count());
            m.i(objArr, 0);
            return objArr;
        }
    }

    public static void h(J j, Double[] dArr, int i) {
        if (S1.a) {
            S1.a(j.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) j.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void i(K k, Integer[] numArr, int i) {
        if (S1.a) {
            S1.a(k.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) k.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void j(L l, Long[] lArr, int i) {
        if (S1.a) {
            S1.a(l.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) l.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void k(J j, Consumer consumer) {
        if (consumer instanceof j$.util.function.c) {
            j.g((j$.util.function.c) consumer);
        } else if (!S1.a) {
            ((j$.util.n) j.mo59spliterator()).forEachRemaining(consumer);
        } else {
            S1.a(j.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void l(K k, Consumer consumer) {
        if (consumer instanceof j$.util.function.g) {
            k.g((j$.util.function.g) consumer);
        } else if (!S1.a) {
            ((j$.util.o) k.mo59spliterator()).forEachRemaining(consumer);
        } else {
            S1.a(k.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void m(L l, Consumer consumer) {
        if (consumer instanceof j$.util.function.i) {
            l.g((j$.util.function.i) consumer);
        } else if (!S1.a) {
            ((j$.util.p) l.mo59spliterator()).forEachRemaining(consumer);
        } else {
            S1.a(l.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static J n(J j, long j2, long j3) {
        F c0016c0;
        if (j2 == 0 && j3 == j.count()) {
            return j;
        }
        long j4 = j3 - j2;
        j$.util.n nVar = (j$.util.n) j.mo59spliterator();
        if (j4 >= 0 && j4 < 2147483639) {
            c0016c0 = new C0013b0(j4);
        } else {
            c0016c0 = new C0016c0();
        }
        c0016c0.c(j4);
        for (int i = 0; i < j2 && nVar.k(new w1(1)); i++) {
        }
        if (j3 == j.count()) {
            nVar.l(c0016c0);
        } else {
            for (int i2 = 0; i2 < j4 && nVar.k(c0016c0); i2++) {
            }
        }
        c0016c0.j();
        return c0016c0.mo62build();
    }

    public static K o(K k, long j, long j2) {
        if (j == 0 && j2 == k.count()) {
            return k;
        }
        long j3 = j2 - j;
        j$.util.o oVar = (j$.util.o) k.mo59spliterator();
        G G = G(j3);
        G.c(j3);
        for (int i = 0; i < j && oVar.g(new y1(1)); i++) {
        }
        if (j2 == k.count()) {
            oVar.i(G);
        } else {
            for (int i2 = 0; i2 < j3 && oVar.g(G); i2++) {
            }
        }
        G.j();
        return G.mo62build();
    }

    public static L p(L l, long j, long j2) {
        H c0068u0;
        if (j == 0 && j2 == l.count()) {
            return l;
        }
        long j3 = j2 - j;
        j$.util.p pVar = (j$.util.p) l.mo59spliterator();
        if (j3 >= 0 && j3 < 2147483639) {
            c0068u0 = new C0066t0(j3);
        } else {
            c0068u0 = new C0068u0();
        }
        c0068u0.c(j3);
        for (int i = 0; i < j && pVar.b(new A1(1)); i++) {
        }
        if (j2 == l.count()) {
            pVar.a(c0068u0);
        } else {
            for (int i2 = 0; i2 < j3 && pVar.b(c0068u0); i2++) {
            }
        }
        c0068u0.j();
        return c0068u0.mo62build();
    }

    public static N q(N n, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == n.count()) {
            return n;
        }
        j$.util.r mo59spliterator = n.mo59spliterator();
        long j3 = j2 - j;
        I w = w(j3, intFunction);
        w.c(j3);
        for (int i = 0; i < j && mo59spliterator.f(new C0012b(23)); i++) {
        }
        if (j2 == n.count()) {
            mo59spliterator.forEachRemaining(w);
        } else {
            for (int i2 = 0; i2 < j3 && mo59spliterator.f(w); i2++) {
            }
        }
        w.j();
        return w.mo62build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long u(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j$.util.r v(EnumC0056p1 enumC0056p1, j$.util.r rVar, long j, long j2) {
        long j3;
        long j4;
        if (j2 >= 0) {
            j3 = j + j2;
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 >= 0) {
            j4 = j3;
        } else {
            j4 = Long.MAX_VALUE;
        }
        int i = AbstractC0011a1.a[enumC0056p1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new x1((j$.util.n) rVar, j, j4);
                    }
                    throw new IllegalStateException(j$.net.a.a("Unknown shape ", String.valueOf(enumC0056p1)));
                }
                return new B1((j$.util.p) rVar, j, j4);
            }
            return new z1((j$.util.o) rVar, j, j4);
        }
        return new D1(rVar, j, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static I w(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new C0034i0(j, intFunction);
        }
        return new C0076y0();
    }

    public static N x(E e2, j$.util.r rVar, boolean z, IntFunction intFunction) {
        long C = e2.C(rVar);
        if (C >= 0 && rVar.hasCharacteristics(16384)) {
            if (C < 2147483639) {
                Object[] objArr = (Object[]) intFunction.apply((int) C);
                new C0072w0(rVar, e2, objArr).invoke();
                return new Q(objArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        N n = (N) new T(rVar, intFunction, e2).invoke();
        if (z) {
            return D(n, intFunction);
        }
        return n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static P y(EnumC0056p1 enumC0056p1, N n, N n2) {
        int i = O.a[enumC0056p1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new V((J) n, (J) n2);
                    }
                    throw new IllegalStateException(j$.net.a.a("Unknown shape ", String.valueOf(enumC0056p1)));
                }
                return new X((L) n, (L) n2);
            }
            return new W((K) n, (K) n2);
        }
        return new Z(n, n2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean A(j$.util.r rVar, X0 x0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long C(j$.util.r rVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int F();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract I H(long j, IntFunction intFunction);

    public abstract L0 I();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract X0 K(j$.util.r rVar, X0 x0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract X0 L(X0 x0);

    @Override // j$.util.stream.P1
    public Object a(E e2, j$.util.r rVar) {
        return ((L0) new O0(this, e2, rVar).invoke()).get();
    }

    @Override // j$.util.stream.P1
    public /* synthetic */ int b() {
        return 0;
    }

    @Override // j$.util.stream.P1
    public Object f(E e2, j$.util.r rVar) {
        L0 I = I();
        e2.K(rVar, I);
        return I.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void z(j$.util.r rVar, X0 x0);
}
