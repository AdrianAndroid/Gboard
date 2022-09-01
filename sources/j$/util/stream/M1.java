package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class M1 implements j$.util.r {
    protected final j$.util.r a;
    protected final j$.util.r b;
    boolean c = true;
    final boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M1(j$.util.r rVar, j$.util.r rVar2) {
        this.a = rVar;
        this.b = rVar2;
        boolean z = true;
        this.d = rVar2.estimateSize() + rVar.estimateSize() >= 0 ? false : z;
    }

    @Override // j$.util.r
    public final int characteristics() {
        boolean z = this.c;
        j$.util.r rVar = this.b;
        if (z) {
            return this.a.characteristics() & rVar.characteristics() & (((this.d ? 16448 : 0) | 5) ^ (-1));
        }
        return rVar.characteristics();
    }

    @Override // j$.util.r
    public final long estimateSize() {
        boolean z = this.c;
        j$.util.r rVar = this.b;
        if (z) {
            long estimateSize = rVar.estimateSize() + this.a.estimateSize();
            if (estimateSize < 0) {
                return Long.MAX_VALUE;
            }
            return estimateSize;
        }
        return rVar.estimateSize();
    }

    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        if (this.c) {
            boolean f = this.a.f(consumer);
            if (f) {
                return f;
            }
            this.c = false;
        }
        return this.b.f(consumer);
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        if (this.c) {
            this.a.forEachRemaining(consumer);
        }
        this.b.forEachRemaining(consumer);
    }

    @Override // j$.util.r
    public final Comparator getComparator() {
        if (!this.c) {
            return this.b.getComparator();
        }
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
        j$.util.r trySplit = this.c ? this.a : this.b.trySplit();
        this.c = false;
        return trySplit;
    }
}
