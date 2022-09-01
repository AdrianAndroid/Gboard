package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BinaryOperator;
import j$.util.function.Consumer;

/* loaded from: classes3.dex */
final class D0 implements L0 {
    private boolean a;
    private Object b;
    final /* synthetic */ BinaryOperator c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D0(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            this.a = false;
        } else {
            obj = this.c.apply(this.b, obj);
        }
        this.b = obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        return this.a ? Optional.empty() : Optional.of(this.b);
    }

    @Override // j$.util.stream.L0
    public final void h(L0 l0) {
        D0 d0 = (D0) l0;
        if (!d0.a) {
            accept(d0.b);
        }
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void j() {
    }
}
