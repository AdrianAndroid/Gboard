package j$.util.stream;

import j$.util.OptionalInt;

/* renamed from: j$.util.stream.m  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0045m extends AbstractC0051o implements W0 {
    static final C0042l c;

    static {
        EnumC0056p1 enumC0056p1 = EnumC0056p1.INT_VALUE;
        c = new C0042l(true, enumC0056p1, OptionalInt.empty(), new C0012b(20), new C0012b(4));
        new C0042l(false, enumC0056p1, OptionalInt.empty(), new C0012b(20), new C0012b(4));
    }

    @Override // j$.util.stream.AbstractC0051o, j$.util.stream.X0
    public final void accept(int i) {
        d(Integer.valueOf(i));
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalInt.a(((Integer) this.b).intValue());
        }
        return null;
    }
}
