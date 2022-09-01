package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0068u0 extends AbstractC0035i1 implements L, H {
    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: a */
    public final M mo61a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.function.i
    public final void accept(long j) {
        r();
        int i = this.a;
        this.a = i + 1;
        ((long[]) this.d)[i] = j;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.AbstractC0041k1, j$.util.stream.M
    public final Object b() {
        return (long[]) super.b();
    }

    @Override // j$.util.stream.H, j$.util.stream.I
    /* renamed from: build */
    public final L mo62build() {
        return this;
    }

    @Override // j$.util.stream.H, j$.util.stream.I
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
        super.f(i, (long[]) obj);
    }

    @Override // j$.util.stream.AbstractC0041k1, j$.util.stream.M
    public final void g(Object obj) {
        super.g((j$.util.function.i) obj);
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
        return E.p(this, j, j2);
    }

    @Override // j$.util.stream.AbstractC0035i1
    public final j$.util.p s() {
        return new C0032h1(this, 0, this.b, 0, this.a);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: t */
    public final void accept(Long l) {
        if (!S1.a) {
            accept(l.longValue());
        } else {
            S1.a(C0068u0.class, "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
    }

    @Override // j$.util.stream.N
    /* renamed from: u */
    public final /* synthetic */ void i(Long[] lArr, int i) {
        E.j(this, lArr, i);
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    /* renamed from: a  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ N mo61a(int i) {
        mo61a(i);
        throw null;
    }
}
