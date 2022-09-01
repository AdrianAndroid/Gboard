package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import j$.util.function.ToIntFunction;
import j$.util.stream.Collector;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class T0 extends AbstractC0015c implements Stream {
    /* JADX INFO: Access modifiers changed from: package-private */
    public T0(j$.util.r rVar, int i, boolean z) {
        super(rVar, i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public T0(AbstractC0015c abstractC0015c, int i) {
        super(abstractC0015c, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.E
    public final I H(long j, IntFunction intFunction) {
        return E.w(j, intFunction);
    }

    @Override // j$.util.stream.AbstractC0015c
    final N P(E e, j$.util.r rVar, boolean z, IntFunction intFunction) {
        return E.x(e, rVar, z, intFunction);
    }

    @Override // j$.util.stream.AbstractC0015c
    final boolean Q(j$.util.r rVar, X0 x0) {
        boolean e;
        do {
            e = x0.e();
            if (e) {
                break;
            }
        } while (rVar.f(x0));
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0015c
    public final EnumC0056p1 R() {
        return EnumC0056p1.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        B b = B.ALL;
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(b);
        return ((Boolean) N(new C(EnumC0056p1.REFERENCE, b, new C0030h(1, b, predicate)))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        B b = B.ANY;
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(b);
        return ((Boolean) N(new C(EnumC0056p1.REFERENCE, b, new C0030h(1, b, predicate)))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC0015c
    final j$.util.r c0(E e, C0009a c0009a, boolean z) {
        return new J1(e, c0009a, z);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object N;
        if (isParallel() && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!T() || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            N = collector.supplier().get();
            forEach(new C0030h(2, collector.accumulator(), N));
        } else {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            BiConsumer accumulator = collector.accumulator();
            N = N(new E0(EnumC0056p1.REFERENCE, collector.combiner(), accumulator, supplier, collector));
        }
        if (!collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH)) {
            return collector.finisher().apply(N);
        }
        return N;
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) N(new I0(EnumC0056p1.REFERENCE))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        EnumC0056p1 enumC0056p1 = EnumC0056p1.REFERENCE;
        return new C0039k(this, EnumC0053o1.m | EnumC0053o1.r);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        EnumC0056p1 enumC0056p1 = EnumC0056p1.REFERENCE;
        return new C0069v(this, EnumC0053o1.r, predicate, 1);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) N(C0048n.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) N(C0048n.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(Function function) {
        Objects.requireNonNull(function);
        EnumC0056p1 enumC0056p1 = EnumC0056p1.REFERENCE;
        return new P0(this, EnumC0053o1.o | EnumC0053o1.n | EnumC0053o1.r, function, 1);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        N(new C0057q(consumer));
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator iterator() {
        return j$.util.F.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        int i;
        if (j >= 0) {
            EnumC0056p1 enumC0056p1 = EnumC0056p1.REFERENCE;
            int i2 = EnumC0053o1.r;
            if (j != -1) {
                i = EnumC0053o1.s;
            } else {
                i = 0;
            }
            return new Z0(this, i2 | i, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        EnumC0056p1 enumC0056p1 = EnumC0056p1.REFERENCE;
        return new P0(this, EnumC0053o1.o | EnumC0053o1.n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        EnumC0056p1 enumC0056p1 = EnumC0056p1.REFERENCE;
        return new C0071w(this, EnumC0053o1.o | EnumC0053o1.n, toIntFunction, 1);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        j$.util.function.a aVar = new j$.util.function.a(0, comparator);
        Objects.requireNonNull(aVar);
        return (Optional) N(new C0(EnumC0056p1.REFERENCE, aVar));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return E.D(O(intFunction), intFunction).l(intFunction);
    }
}
