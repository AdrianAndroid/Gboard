package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class I1 implements X0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ I1(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                E.c();
                throw null;
            default:
                E.c();
                throw null;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                return Objects.requireNonNull(consumer);
            default:
                return Objects.requireNonNull(consumer);
        }
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Consumer consumer = this.b;
        switch (i) {
            case 0:
                ((C0044l1) consumer).accept(obj);
                return;
            default:
                consumer.accept(obj);
                return;
        }
    }
}
