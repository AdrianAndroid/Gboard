package j$.util.stream;

import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Q0 extends T0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Q0(j$.util.r rVar, int i, boolean z) {
        super(rVar, i, z);
    }

    @Override // j$.util.stream.AbstractC0015c
    final boolean Y() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0015c
    public final X0 Z(int i, X0 x0) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.T0, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            b0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }
}
