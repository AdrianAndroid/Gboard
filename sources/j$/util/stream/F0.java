package j$.util.stream;

import j$.util.Objects;
import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Consumer;
import j$.util.function.Supplier;

/* loaded from: classes3.dex */
final class F0 extends M0 implements L0 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ BiConsumer c;
    final /* synthetic */ BinaryOperator d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F0(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = binaryOperator;
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.c.accept(this.a, obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.L0
    public final void h(L0 l0) {
        this.a = this.d.apply(this.a, ((F0) l0).a);
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void j() {
    }
}
