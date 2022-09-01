package j$.util.stream;

import j$.util.Objects;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0015c extends E implements BaseStream {
    private final AbstractC0015c h;
    private final AbstractC0015c i;
    protected final int j;
    private AbstractC0015c k;
    private int l;
    private int m;
    private j$.util.r n;
    private boolean o;
    private boolean p;
    private Runnable q;
    private boolean r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0015c(j$.util.r rVar, int i, boolean z) {
        this.i = null;
        this.n = rVar;
        this.h = this;
        int i2 = EnumC0053o1.g & i;
        this.j = i2;
        this.m = ((i2 << 1) ^ (-1)) & EnumC0053o1.l;
        this.l = 0;
        this.r = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0015c(AbstractC0015c abstractC0015c, int i) {
        if (!abstractC0015c.o) {
            abstractC0015c.o = true;
            abstractC0015c.k = this;
            this.i = abstractC0015c;
            this.j = EnumC0053o1.h & i;
            this.m = EnumC0053o1.a(i, abstractC0015c.m);
            AbstractC0015c abstractC0015c2 = abstractC0015c.h;
            this.h = abstractC0015c2;
            if (Y()) {
                abstractC0015c2.p = true;
            }
            this.l = abstractC0015c.l + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    private j$.util.r a0(int i) {
        int i2;
        int i3;
        AbstractC0015c abstractC0015c = this.h;
        j$.util.r rVar = abstractC0015c.n;
        if (rVar != null) {
            abstractC0015c.n = null;
            if (abstractC0015c.r && abstractC0015c.p) {
                AbstractC0015c abstractC0015c2 = abstractC0015c.k;
                int i4 = 1;
                while (abstractC0015c != this) {
                    int i5 = abstractC0015c2.j;
                    if (abstractC0015c2.Y()) {
                        if (EnumC0053o1.SHORT_CIRCUIT.d(i5)) {
                            i5 &= EnumC0053o1.s ^ (-1);
                        }
                        rVar = abstractC0015c2.X(abstractC0015c, rVar);
                        if (rVar.hasCharacteristics(64)) {
                            i2 = (EnumC0053o1.r ^ (-1)) & i5;
                            i3 = EnumC0053o1.q;
                        } else {
                            i2 = (EnumC0053o1.q ^ (-1)) & i5;
                            i3 = EnumC0053o1.r;
                        }
                        i5 = i3 | i2;
                        i4 = 0;
                    }
                    abstractC0015c2.l = i4;
                    abstractC0015c2.m = EnumC0053o1.a(i5, abstractC0015c.m);
                    i4++;
                    AbstractC0015c abstractC0015c3 = abstractC0015c2;
                    abstractC0015c2 = abstractC0015c2.k;
                    abstractC0015c = abstractC0015c3;
                }
            }
            if (i != 0) {
                this.m = EnumC0053o1.a(i, this.m);
            }
            return rVar;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.E
    public final boolean A(j$.util.r rVar, X0 x0) {
        AbstractC0015c abstractC0015c = this;
        while (abstractC0015c.l > 0) {
            abstractC0015c = abstractC0015c.i;
        }
        x0.c(rVar.getExactSizeIfKnown());
        boolean Q = abstractC0015c.Q(rVar, x0);
        x0.j();
        return Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.E
    public final long C(j$.util.r rVar) {
        if (EnumC0053o1.SIZED.d(this.m)) {
            return rVar.getExactSizeIfKnown();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.E
    public final int F() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.E
    public final X0 K(j$.util.r rVar, X0 x0) {
        z(rVar, L((X0) Objects.requireNonNull(x0)));
        return x0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.E
    public final X0 L(X0 x0) {
        Objects.requireNonNull(x0);
        AbstractC0015c abstractC0015c = this;
        while (abstractC0015c.l > 0) {
            AbstractC0015c abstractC0015c2 = abstractC0015c.i;
            x0 = abstractC0015c.Z(abstractC0015c2.m, x0);
            abstractC0015c = abstractC0015c2;
        }
        return x0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final N M(j$.util.r rVar, boolean z, IntFunction intFunction) {
        if (this.h.r) {
            return P(this, rVar, z, intFunction);
        }
        I H = H(C(rVar), intFunction);
        K(rVar, H);
        return H.mo62build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object N(P1 p1) {
        if (!this.o) {
            this.o = true;
            if (this.h.r) {
                return p1.a(this, a0(p1.b()));
            }
            return p1.f(this, a0(p1.b()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final N O(IntFunction intFunction) {
        AbstractC0015c abstractC0015c;
        if (!this.o) {
            this.o = true;
            if (this.h.r && (abstractC0015c = this.i) != null && Y()) {
                this.l = 0;
                return W(abstractC0015c.a0(0), intFunction, abstractC0015c);
            }
            return M(a0(0), true, intFunction);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    abstract N P(E e, j$.util.r rVar, boolean z, IntFunction intFunction);

    abstract boolean Q(j$.util.r rVar, X0 x0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract EnumC0056p1 R();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EnumC0056p1 S() {
        AbstractC0015c abstractC0015c = this;
        while (abstractC0015c.l > 0) {
            abstractC0015c = abstractC0015c.i;
        }
        return abstractC0015c.R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean T() {
        return EnumC0053o1.ORDERED.d(this.m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ j$.util.r U() {
        return a0(0);
    }

    public final BaseStream V(Runnable runnable) {
        if (!this.o) {
            Objects.requireNonNull(runnable);
            AbstractC0015c abstractC0015c = this.h;
            Runnable runnable2 = abstractC0015c.q;
            if (runnable2 != null) {
                runnable = new K1(0, runnable2, runnable);
            }
            abstractC0015c.q = runnable;
            return this;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    N W(j$.util.r rVar, IntFunction intFunction, AbstractC0015c abstractC0015c) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    j$.util.r X(AbstractC0015c abstractC0015c, j$.util.r rVar) {
        return W(rVar, new C0012b(0), abstractC0015c).mo59spliterator();
    }

    abstract boolean Y();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract X0 Z(int i, X0 x0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.util.r b0() {
        AbstractC0015c abstractC0015c = this.h;
        if (this == abstractC0015c) {
            if (this.o) {
                throw new IllegalStateException("stream has already been operated upon or closed");
            }
            this.o = true;
            j$.util.r rVar = abstractC0015c.n;
            if (rVar == null) {
                throw new IllegalStateException("source already consumed or closed");
            }
            abstractC0015c.n = null;
            return rVar;
        }
        throw new IllegalStateException();
    }

    abstract j$.util.r c0(E e, C0009a c0009a, boolean z);

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.o = true;
        this.n = null;
        AbstractC0015c abstractC0015c = this.h;
        Runnable runnable = abstractC0015c.q;
        if (runnable != null) {
            abstractC0015c.q = null;
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.util.r d0(j$.util.r rVar) {
        if (this.l == 0) {
            return rVar;
        }
        return c0(this, new C0009a(0, rVar), this.h.r);
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.h.r;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        this.h.r = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.r spliterator() {
        if (!this.o) {
            this.o = true;
            AbstractC0015c abstractC0015c = this.h;
            if (this == abstractC0015c) {
                j$.util.r rVar = abstractC0015c.n;
                if (rVar != null) {
                    abstractC0015c.n = null;
                    return rVar;
                }
                throw new IllegalStateException("source already consumed or closed");
            }
            return c0(this, new C0009a(1, this), abstractC0015c.r);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.E
    public final void z(j$.util.r rVar, X0 x0) {
        Objects.requireNonNull(x0);
        if (!EnumC0053o1.SHORT_CIRCUIT.d(this.m)) {
            x0.c(rVar.getExactSizeIfKnown());
            rVar.forEachRemaining(x0);
            x0.j();
            return;
        }
        A(rVar, x0);
    }
}
