package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0057q implements P1, Q1 {
    private final boolean a = false;
    final Consumer b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0057q(Consumer consumer) {
        this.b = consumer;
    }

    @Override // j$.util.stream.P1
    public final Object a(E e, j$.util.r rVar) {
        (this.a ? new r(e, rVar, this) : new C0062s(e, rVar, e.L(this))).invoke();
        return null;
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.b.accept(obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.P1
    public final int b() {
        if (this.a) {
            return 0;
        }
        return EnumC0053o1.p;
    }

    @Override // j$.util.stream.X0
    public final /* bridge */ /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.X0
    public final /* bridge */ /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.P1
    public final Object f(E e, j$.util.r rVar) {
        ((C0057q) e.K(rVar, this)).getClass();
        return null;
    }

    @Override // j$.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.X0
    public final /* bridge */ /* synthetic */ void j() {
    }
}
