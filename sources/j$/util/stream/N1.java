package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.Objects;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class N1 implements j$.util.o {
    private int a;
    private final int b;
    private int c;

    private N1(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public N1(int i, int i2, int i3) {
        this(i, i2);
    }

    @Override // j$.util.r
    public final int characteristics() {
        return 17749;
    }

    @Override // j$.util.r
    public final long estimateSize() {
        return (this.b - this.a) + this.c;
    }

    @Override // j$.util.r
    public final /* synthetic */ boolean f(Consumer consumer) {
        return AbstractC0002b.p(this, consumer);
    }

    @Override // j$.util.o, j$.util.r
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0002b.d(this, consumer);
    }

    @Override // j$.util.q
    /* renamed from: g */
    public final boolean tryAdvance(j$.util.function.g gVar) {
        Objects.requireNonNull(gVar);
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
        } else if (this.c <= 0) {
            return false;
        } else {
            this.c = 0;
        }
        gVar.accept(i);
        return true;
    }

    @Override // j$.util.r
    public final Comparator getComparator() {
        return null;
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
    /* renamed from: i */
    public final void forEachRemaining(j$.util.function.g gVar) {
        Objects.requireNonNull(gVar);
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        this.a = i3;
        this.c = 0;
        while (i < i3) {
            gVar.accept(i);
            i++;
        }
        if (i2 > 0) {
            gVar.accept(i);
        }
    }

    @Override // j$.util.r
    public final j$.util.r trySplit() {
        int i;
        long estimateSize = estimateSize();
        if (estimateSize <= 1) {
            return null;
        }
        int i2 = this.a;
        if (estimateSize < 16777216) {
            i = 2;
        } else {
            i = 8;
        }
        int i3 = ((int) (estimateSize / i)) + i2;
        this.a = i3;
        return new N1(i2, i3);
    }
}
