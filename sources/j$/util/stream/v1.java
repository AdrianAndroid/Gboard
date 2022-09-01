package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.Objects;
import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class v1 extends AbstractC0059q1 implements j$.util.o {
    v1(E e, j$.util.r rVar, boolean z) {
        super(e, rVar, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(E e, C0009a c0009a, boolean z) {
        super(e, c0009a, z);
    }

    @Override // j$.util.r
    public final /* synthetic */ boolean f(Consumer consumer) {
        return AbstractC0002b.p(this, consumer);
    }

    @Override // j$.util.r
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0002b.d(this, consumer);
    }

    @Override // j$.util.q
    /* renamed from: g */
    public final boolean tryAdvance(j$.util.function.g gVar) {
        int i;
        Objects.requireNonNull(gVar);
        boolean c = c();
        if (c) {
            C0029g1 c0029g1 = (C0029g1) this.h;
            long j = this.g;
            int i2 = 0;
            if (c0029g1.b == 0) {
                if (j >= c0029g1.a) {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
            } else if (j < c0029g1.count()) {
                while (i2 <= c0029g1.b) {
                    if (j >= c0029g1.c[i2] + c0029g1.o(c0029g1.e[i2])) {
                        i2++;
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            if (c0029g1.b == 0 && i2 == 0) {
                i = ((int[]) c0029g1.d)[(int) j];
            } else {
                i = ((int[][]) c0029g1.e)[i2][(int) (j - c0029g1.c[i2])];
            }
            gVar.accept(i);
        }
        return c;
    }

    @Override // j$.util.stream.AbstractC0059q1
    final void h() {
        C0029g1 c0029g1 = new C0029g1();
        this.h = c0029g1;
        Objects.requireNonNull(c0029g1);
        this.e = this.b.L(new u1(c0029g1, 0));
        this.f = new C0009a(3, this);
    }

    @Override // j$.util.q
    /* renamed from: i */
    public final void forEachRemaining(j$.util.function.g gVar) {
        if (this.h != null || this.i) {
            do {
            } while (tryAdvance(gVar));
            return;
        }
        Objects.requireNonNull(gVar);
        e();
        Objects.requireNonNull(gVar);
        u1 u1Var = new u1(gVar, 1);
        this.b.K(this.d, u1Var);
        this.i = true;
    }

    @Override // j$.util.stream.AbstractC0059q1
    final AbstractC0059q1 j(j$.util.r rVar) {
        return new v1(this.b, rVar, this.a);
    }

    @Override // j$.util.stream.AbstractC0059q1, j$.util.r
    public final j$.util.r trySplit() {
        return (j$.util.o) super.trySplit();
    }
}
