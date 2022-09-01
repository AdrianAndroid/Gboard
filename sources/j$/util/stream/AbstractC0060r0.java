package j$.util.stream;

import j$.util.AbstractC0002b;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.r0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0060r0 implements j$.util.r {
    N a;
    int b;
    j$.util.r c;
    j$.util.r d;
    ArrayDeque e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0060r0(N n) {
        this.a = n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static N c(ArrayDeque arrayDeque) {
        while (true) {
            N n = (N) arrayDeque.pollFirst();
            if (n != null) {
                if (n.k() != 0) {
                    int k = n.k();
                    while (true) {
                        k--;
                        if (k >= 0) {
                            arrayDeque.addFirst(n.mo61a(k));
                        }
                    }
                } else if (n.count() > 0) {
                    return n;
                }
            } else {
                return null;
            }
        }
    }

    @Override // j$.util.r
    public final int characteristics() {
        return 64;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayDeque d() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int k = this.a.k();
        while (true) {
            k--;
            if (k >= this.b) {
                arrayDeque.addFirst(this.a.mo61a(k));
            } else {
                return arrayDeque;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        j$.util.r rVar = this.c;
        if (rVar == null) {
            ArrayDeque d = d();
            this.e = d;
            N c = c(d);
            if (c == null) {
                this.a = null;
                return false;
            }
            rVar = c.mo59spliterator();
        }
        this.d = rVar;
        return true;
    }

    @Override // j$.util.r
    public final long estimateSize() {
        long j = 0;
        if (this.a == null) {
            return 0L;
        }
        j$.util.r rVar = this.c;
        if (rVar != null) {
            return rVar.estimateSize();
        }
        for (int i = this.b; i < this.a.k(); i++) {
            j += this.a.mo61a(i).count();
        }
        return j;
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
        N n = this.a;
        if (n == null || this.d != null) {
            return null;
        }
        j$.util.r rVar = this.c;
        if (rVar != null) {
            return rVar.trySplit();
        }
        if (this.b < n.k() - 1) {
            N n2 = this.a;
            int i = this.b;
            this.b = i + 1;
            return n2.mo61a(i).mo59spliterator();
        }
        N mo61a = this.a.mo61a(this.b);
        this.a = mo61a;
        if (mo61a.k() == 0) {
            j$.util.r mo59spliterator = this.a.mo59spliterator();
            this.c = mo59spliterator;
            return mo59spliterator.trySplit();
        }
        N n3 = this.a;
        this.b = 0 + 1;
        return n3.mo61a(0).mo59spliterator();
    }
}
