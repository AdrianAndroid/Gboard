package j$.util;

import j$.util.function.Consumer;

/* loaded from: classes3.dex */
final class B extends AbstractC0002b implements r {
    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return false;
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
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
}
