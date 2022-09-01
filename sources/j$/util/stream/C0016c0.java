package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0016c0 extends AbstractC0023e1 implements J, F {
    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: a */
    public final M mo61a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.function.c
    public final void accept(double d) {
        r();
        int i = this.a;
        this.a = i + 1;
        ((double[]) this.d)[i] = d;
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.AbstractC0041k1, j$.util.stream.M
    public final Object b() {
        return (double[]) super.b();
    }

    @Override // j$.util.stream.F, j$.util.stream.I
    /* renamed from: build */
    public final J mo62build() {
        return this;
    }

    @Override // j$.util.stream.F, j$.util.stream.I
    /* renamed from: build  reason: collision with other method in class */
    public final N mo62build() {
        return this;
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        clear();
        p(j);
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0041k1, j$.util.stream.M
    public final void f(int i, Object obj) {
        super.f(i, (double[]) obj);
    }

    @Override // j$.util.stream.AbstractC0041k1, j$.util.stream.M
    public final void g(Object obj) {
        super.g((j$.util.function.c) obj);
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
        return E.n(this, j, j2);
    }

    @Override // j$.util.stream.AbstractC0023e1
    public final j$.util.n s() {
        return new C0020d1(this, 0, this.b, 0, this.a);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: t */
    public final void accept(Double d) {
        if (!S1.a) {
            accept(d.doubleValue());
        } else {
            S1.a(C0016c0.class, "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    @Override // j$.util.stream.N
    /* renamed from: u */
    public final /* synthetic */ void i(Double[] dArr, int i) {
        E.h(this, dArr, i);
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: a  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ N mo61a(int i) {
        mo61a(i);
        throw null;
    }
}
