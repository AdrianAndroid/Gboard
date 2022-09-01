package j$.util.stream;

import j$.util.AbstractC0002b;
import java.util.Comparator;

/* loaded from: classes3.dex */
abstract class L1 implements j$.util.r {
    int a;

    @Override // j$.util.r
    public final int characteristics() {
        return 17488;
    }

    @Override // j$.util.r
    public final long estimateSize() {
        return (-this.a) - 1;
    }

    @Override // j$.util.r
    public final Comparator getComparator() {
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

    @Override // j$.util.r
    public final j$.util.r trySplit() {
        return null;
    }
}
