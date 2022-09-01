package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.Objects;
import java.util.Comparator;

/* loaded from: classes3.dex */
abstract class C1 extends E1 implements j$.util.q {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1(j$.util.q qVar, long j, long j2) {
        super(qVar, j, j2, 0L, Math.min(qVar.estimateSize(), j2));
    }

    protected abstract Object d();

    @Override // j$.util.q
    /* renamed from: forEachRemaining */
    public final void l(Object obj) {
        Objects.requireNonNull(obj);
        long j = this.e;
        long j2 = this.a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && ((j$.util.q) this.c).estimateSize() + j3 <= this.b) {
            ((j$.util.q) this.c).forEachRemaining(obj);
            this.d = this.e;
            return;
        }
        while (j2 > this.d) {
            ((j$.util.q) this.c).tryAdvance(d());
            this.d++;
        }
        while (this.d < this.e) {
            ((j$.util.q) this.c).tryAdvance(obj);
            this.d++;
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

    @Override // j$.util.q
    /* renamed from: tryAdvance */
    public final boolean k(Object obj) {
        long j;
        Objects.requireNonNull(obj);
        long j2 = this.e;
        long j3 = this.a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.d;
            if (j3 <= j) {
                break;
            }
            ((j$.util.q) this.c).tryAdvance(d());
            this.d++;
        }
        if (j >= this.e) {
            return false;
        }
        this.d = j + 1;
        return ((j$.util.q) this.c).tryAdvance(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1(j$.util.q qVar, long j, long j2, long j3, long j4) {
        super(qVar, j, j2, j3, j4);
    }
}
