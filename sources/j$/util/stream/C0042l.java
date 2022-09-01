package j$.util.stream;

import j$.util.function.Predicate;
import j$.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.l  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0042l implements P1 {
    final int a;
    final Object b;
    final Predicate c;
    final Supplier d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0042l(boolean z, EnumC0056p1 enumC0056p1, Object obj, C0012b c0012b, C0012b c0012b2) {
        this.a = (z ? 0 : EnumC0053o1.p) | EnumC0053o1.s;
        this.b = obj;
        this.c = c0012b;
        this.d = c0012b2;
    }

    @Override // j$.util.stream.P1
    public final Object a(E e, j$.util.r rVar) {
        return new C0054p(this, EnumC0053o1.ORDERED.d(e.F()), e, rVar).invoke();
    }

    @Override // j$.util.stream.P1
    public final int b() {
        return this.a;
    }

    @Override // j$.util.stream.P1
    public final Object f(E e, j$.util.r rVar) {
        Q1 q1 = (Q1) this.d.get();
        e.K(rVar, q1);
        Object obj = q1.get();
        return obj != null ? obj : this.b;
    }
}
