package j$.util.stream;

import j$.util.Optional;

/* renamed from: j$.util.stream.n  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0048n extends AbstractC0051o {
    static final C0042l c;
    static final C0042l d;

    static {
        EnumC0056p1 enumC0056p1 = EnumC0056p1.REFERENCE;
        c = new C0042l(true, enumC0056p1, Optional.empty(), new C0012b(21), new C0012b(5));
        d = new C0042l(false, enumC0056p1, Optional.empty(), new C0012b(21), new C0012b(5));
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}
