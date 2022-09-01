package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.Objects;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class D1 extends E1 implements j$.util.r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public D1(j$.util.r rVar, long j, long j2) {
        super(rVar, j, j2, 0L, Math.min(rVar.estimateSize(), j2));
    }

    private D1(j$.util.r rVar, long j, long j2, long j3, long j4) {
        super(rVar, j, j2, j3, j4);
    }

    @Override // j$.util.stream.E1
    protected final j$.util.r c(j$.util.r rVar, long j, long j2, long j3, long j4) {
        return new D1(rVar, j, j2, j3, j4);
    }

    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        long j;
        Objects.requireNonNull(consumer);
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
            this.c.f(new C0012b(13));
            this.d++;
        }
        if (j >= this.e) {
            return false;
        }
        this.d = j + 1;
        return this.c.f(consumer);
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j = this.e;
        long j2 = this.a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && this.c.estimateSize() + j3 <= this.b) {
            this.c.forEachRemaining(consumer);
            this.d = this.e;
            return;
        }
        while (j2 > this.d) {
            this.c.f(new C0012b(12));
            this.d++;
        }
        while (this.d < this.e) {
            this.c.f(consumer);
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
}
