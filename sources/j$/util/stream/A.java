package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;
import j$.util.function.Predicate;

/* loaded from: classes3.dex */
final class A implements X0 {
    boolean a;
    boolean b;
    final /* synthetic */ B c;
    final /* synthetic */ Predicate d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(Predicate predicate, B b) {
        boolean z;
        this.c = b;
        this.d = predicate;
        z = b.b;
        this.b = !z;
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (!this.a) {
            boolean test = this.d.test(obj);
            B b = this.c;
            z = b.a;
            if (test != z) {
                return;
            }
            this.a = true;
            z2 = b.b;
            this.b = z2;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.X0
    public final /* bridge */ /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.X0
    public final boolean e() {
        return this.a;
    }

    @Override // j$.util.stream.X0
    public final /* bridge */ /* synthetic */ void j() {
    }
}
