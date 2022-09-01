package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;

/* loaded from: classes3.dex */
final class J0 implements L0, W0 {
    private int a;
    final /* synthetic */ int b;
    final /* synthetic */ j$.util.function.f c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J0(int i, j$.util.function.f fVar) {
        this.b = i;
        this.c = fVar;
    }

    @Override // j$.util.stream.X0
    public final void accept(int i) {
        int i2 = this.a;
        ((C0012b) this.c).getClass();
        this.a = i2 + i;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        this.a = this.b;
    }

    @Override // j$.util.stream.W0
    public final /* synthetic */ void d(Integer num) {
        E.d(this, num);
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.a);
    }

    @Override // j$.util.stream.L0
    public final void h(L0 l0) {
        accept(((J0) l0).a);
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void j() {
    }
}
