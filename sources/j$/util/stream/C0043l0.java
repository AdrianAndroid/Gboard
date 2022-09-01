package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.l0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0043l0 extends C0029g1 implements K, G {
    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: a */
    public final M mo61a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.C0029g1, j$.util.function.g
    public final void accept(int i) {
        super.accept(i);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.AbstractC0041k1, j$.util.stream.M
    public final Object b() {
        return (int[]) super.b();
    }

    @Override // j$.util.stream.G, j$.util.stream.I
    /* renamed from: build */
    public final K mo62build() {
        return this;
    }

    @Override // j$.util.stream.G, j$.util.stream.I
    /* renamed from: build  reason: collision with other method in class */
    public final N mo62build() {
        return this;
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        clear();
        p(j);
    }

    @Override // j$.util.stream.W0
    public final /* synthetic */ void d(Integer num) {
        E.d(this, num);
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0041k1, j$.util.stream.M
    public final void f(int i, Object obj) {
        super.f(i, (int[]) obj);
    }

    @Override // j$.util.stream.AbstractC0041k1, j$.util.stream.M
    public final void g(Object obj) {
        super.g((j$.util.function.g) obj);
    }

    @Override // j$.util.stream.X0
    public final void j() {
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ int k() {
        return 0;
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ Object[] l(IntFunction intFunction) {
        return E.g(this, intFunction);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ N m(long j, long j2, IntFunction intFunction) {
        return E.o(this, j, j2);
    }

    @Override // j$.util.stream.C0029g1
    public final j$.util.o s() {
        return super.s();
    }

    @Override // java.lang.Iterable, j$.util.stream.M, j$.util.stream.N
    /* renamed from: spliterator */
    public final j$.util.q mo59spliterator() {
        return super.s();
    }

    @Override // j$.util.stream.N
    /* renamed from: t */
    public final /* synthetic */ void i(Integer[] numArr, int i) {
        E.i(this, numArr, i);
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: a  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ N mo61a(int i) {
        mo61a(i);
        throw null;
    }

    @Override // java.lang.Iterable, j$.util.stream.M, j$.util.stream.N
    /* renamed from: spliterator  reason: collision with other method in class */
    public final j$.util.r mo59spliterator() {
        return super.s();
    }
}
