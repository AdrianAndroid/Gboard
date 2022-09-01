package j$.util.stream;

import j$.util.Objects;
import j$.util.OptionalInt;
import j$.util.function.IntFunction;
import j$.util.function.IntPredicate;
import java.util.Iterator;

/* renamed from: j$.util.stream.z  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0077z extends AbstractC0015c implements IntStream {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0077z(j$.util.o oVar, int i) {
        super(oVar, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0077z(AbstractC0015c abstractC0015c, int i) {
        super(abstractC0015c, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.E
    public final I H(long j, IntFunction intFunction) {
        return E.G(j);
    }

    @Override // j$.util.stream.AbstractC0015c
    final N P(E e, j$.util.r rVar, boolean z, IntFunction intFunction) {
        long C = e.C(rVar);
        if (C >= 0 && rVar.hasCharacteristics(16384)) {
            if (C < 2147483639) {
                int[] iArr = new int[(int) C];
                new C0070v0(rVar, e, iArr).invoke();
                return new C0037j0(iArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        K k = (K) new T(e, rVar).invoke();
        if (z) {
            return E.E(k);
        }
        return k;
    }

    @Override // j$.util.stream.AbstractC0015c
    final boolean Q(j$.util.r rVar, final X0 x0) {
        j$.util.function.g gVar;
        boolean e;
        if (rVar instanceof j$.util.o) {
            j$.util.o oVar = (j$.util.o) rVar;
            if (x0 instanceof j$.util.function.g) {
                gVar = (j$.util.function.g) x0;
            } else if (!S1.a) {
                Objects.requireNonNull(x0);
                gVar = new j$.util.function.g() { // from class: j$.util.stream.t
                    @Override // j$.util.function.g
                    public final void accept(int i) {
                        X0.this.accept(i);
                    }
                };
            } else {
                S1.a(AbstractC0015c.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            do {
                e = x0.e();
                if (e) {
                    break;
                }
            } while (oVar.g(gVar));
            return e;
        } else if (S1.a) {
            S1.a(AbstractC0015c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        } else {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0015c
    public final EnumC0056p1 R() {
        return EnumC0056p1.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC0015c
    final j$.util.r c0(E e, C0009a c0009a, boolean z) {
        return new v1(e, c0009a, z);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream filter(IntPredicate intPredicate) {
        Objects.requireNonNull(intPredicate);
        EnumC0056p1 enumC0056p1 = EnumC0056p1.REFERENCE;
        return new C0071w(this, EnumC0053o1.r, intPredicate, 0);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findFirst() {
        return (OptionalInt) N(C0045m.c);
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator<Integer> iterator() {
        j$.util.r spliterator = spliterator();
        if (spliterator instanceof j$.util.o) {
            return j$.util.F.g((j$.util.o) spliterator);
        }
        if (S1.a) {
            S1.a(AbstractC0015c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        EnumC0056p1 enumC0056p1 = EnumC0056p1.REFERENCE;
        return new C0069v(this, EnumC0053o1.o | EnumC0053o1.n, intFunction, 0);
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        C0012b c0012b = new C0012b(22);
        Objects.requireNonNull(c0012b);
        return ((Integer) N(new K0(EnumC0056p1.INT_VALUE, c0012b))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) E.E((K) O(new C0012b(7))).b();
    }
}
