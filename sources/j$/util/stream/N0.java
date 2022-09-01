package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;

/* loaded from: classes3.dex */
final class N0 extends M0 implements L0 {
    long b;

    @Override // j$.util.stream.X0
    public final /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        this.b = 0L;
    }

    @Override // j$.util.stream.X0
    public final /* bridge */ /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.M0, j$.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.L0
    public final void h(L0 l0) {
        this.b += ((N0) l0).b;
    }

    @Override // j$.util.stream.X0
    public final /* bridge */ /* synthetic */ void j() {
    }
}
