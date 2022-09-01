package j$.util.concurrent;

import j$.util.AbstractC0002b;
import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class f extends q implements j$.util.r {
    final ConcurrentHashMap i;
    long j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(l[] lVarArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, i2, i3);
        this.i = concurrentHashMap;
        this.j = j;
    }

    @Override // j$.util.r
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.r
    public final long estimateSize() {
        return this.j;
    }

    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        if (consumer != null) {
            l c = c();
            if (c == null) {
                return false;
            }
            consumer.accept(new k(c.b, c.c, this.i));
            return true;
        }
        throw null;
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        if (consumer != null) {
            while (true) {
                l c = c();
                if (c == null) {
                    return;
                }
                consumer.accept(new k(c.b, c.c, this.i));
            }
        } else {
            throw null;
        }
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
        int i = this.f;
        int i2 = this.g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        l[] lVarArr = this.a;
        int i4 = this.h;
        this.g = i3;
        long j = this.j >>> 1;
        this.j = j;
        return new f(lVarArr, i4, i3, i2, j, this.i);
    }
}
