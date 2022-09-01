package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class V0 implements X0 {
    protected final X0 a;

    public V0(X0 x0) {
        this.a = (X0) Objects.requireNonNull(x0);
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

    @Override // j$.util.stream.X0
    public boolean e() {
        return this.a.e();
    }

    @Override // j$.util.stream.X0
    public void j() {
        this.a.j();
    }
}
