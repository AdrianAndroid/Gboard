package j$.util.stream;

import j$.util.function.Supplier;

/* loaded from: classes3.dex */
final class C implements P1 {
    final B a;
    final Supplier b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(EnumC0056p1 enumC0056p1, B b, C0030h c0030h) {
        this.a = b;
        this.b = c0030h;
    }

    @Override // j$.util.stream.P1
    public final Object a(E e, j$.util.r rVar) {
        return (Boolean) new D(this, e, rVar).invoke();
    }

    @Override // j$.util.stream.P1
    public final int b() {
        return EnumC0053o1.s | EnumC0053o1.p;
    }

    @Override // j$.util.stream.P1
    public final Object f(E e, j$.util.r rVar) {
        return Boolean.valueOf(((A) e.K(rVar, (A) this.b.get())).b);
    }
}
