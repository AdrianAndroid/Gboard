package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Z extends P {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Z(N n, N n2) {
        super(n, n2);
    }

    @Override // j$.util.stream.N
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.N
    public final void i(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        N n = this.a;
        n.i(objArr, i);
        this.b.i(objArr, i + ((int) n.count()));
    }

    @Override // j$.util.stream.N
    public final Object[] l(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            i(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.N
    public final N m(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long count = this.a.count();
        if (j >= count) {
            return this.b.m(j - count, j2 - count, intFunction);
        }
        if (j2 <= count) {
            return this.a.m(j, j2, intFunction);
        }
        return E.y(EnumC0056p1.REFERENCE, this.a.m(j, count, intFunction), this.b.m(0L, j2 - count, intFunction));
    }

    @Override // j$.util.stream.N
    /* renamed from: spliterator */
    public final j$.util.r mo59spliterator() {
        return new C0058q0(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
