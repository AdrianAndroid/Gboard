package j$.util;

import j$.util.function.Consumer;

/* loaded from: classes3.dex */
final class A extends AbstractC0002b implements p {
    @Override // j$.util.p
    public final void a(j$.util.function.i iVar) {
        Objects.requireNonNull(iVar);
    }

    @Override // j$.util.p
    public final boolean b(j$.util.function.i iVar) {
        Objects.requireNonNull(iVar);
        return false;
    }

    @Override // j$.util.r
    public final /* synthetic */ boolean f(Consumer consumer) {
        return AbstractC0002b.q(this, consumer);
    }

    @Override // j$.util.p, j$.util.r
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0002b.e(this, consumer);
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
