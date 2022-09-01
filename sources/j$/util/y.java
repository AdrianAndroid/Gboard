package j$.util;

import j$.util.function.Consumer;

/* loaded from: classes3.dex */
final class y extends AbstractC0002b implements n {
    @Override // j$.util.r
    public final /* synthetic */ boolean f(Consumer consumer) {
        return AbstractC0002b.o(this, consumer);
    }

    @Override // j$.util.n, j$.util.r
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0002b.c(this, consumer);
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

    @Override // j$.util.n
    public final boolean k(j$.util.function.c cVar) {
        Objects.requireNonNull(cVar);
        return false;
    }

    @Override // j$.util.n
    public final void l(j$.util.function.c cVar) {
        Objects.requireNonNull(cVar);
    }
}
