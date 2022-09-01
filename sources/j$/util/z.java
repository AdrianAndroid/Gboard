package j$.util;

import j$.util.function.Consumer;

/* loaded from: classes3.dex */
final class z extends AbstractC0002b implements o {
    @Override // j$.util.r
    public final /* synthetic */ boolean f(Consumer consumer) {
        return AbstractC0002b.p(this, consumer);
    }

    @Override // j$.util.o, j$.util.r
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0002b.d(this, consumer);
    }

    @Override // j$.util.o
    public final boolean g(j$.util.function.g gVar) {
        Objects.requireNonNull(gVar);
        return false;
    }

    @Override // j$.util.r
    public final java.util.Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.r
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0002b.h(this);
    }

    @Override // j$.util.r
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC0002b.j(this, i);
    }

    @Override // j$.util.o
    public final void i(j$.util.function.g gVar) {
        Objects.requireNonNull(gVar);
    }
}
