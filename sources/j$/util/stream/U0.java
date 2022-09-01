package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class U0 implements W0 {
    protected final X0 a;

    public U0(X0 x0) {
        this.a = (X0) Objects.requireNonNull(x0);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.W0
    public final /* synthetic */ void d(Integer num) {
        E.d(this, num);
    }

    @Override // j$.util.stream.X0
    public final boolean e() {
        return this.a.e();
    }

    @Override // j$.util.stream.X0
    public final void j() {
        this.a.j();
    }
}
