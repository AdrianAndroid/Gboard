package j$.util;

import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class E implements p {
    private final long[] a;
    private int b;
    private final int c;
    private final int d;

    public E(long[] jArr, int i, int i2, int i3) {
        this.a = jArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 64 | 16384;
    }

    @Override // j$.util.q
    /* renamed from: a */
    public final void forEachRemaining(j$.util.function.i iVar) {
        int i;
        if (iVar != null) {
            long[] jArr = this.a;
            int length = jArr.length;
            int i2 = this.c;
            if (length < i2 || (i = this.b) < 0) {
                return;
            }
            this.b = i2;
            if (i >= i2) {
                return;
            }
            do {
                iVar.accept(jArr[i]);
                i++;
            } while (i < i2);
            return;
        }
        throw null;
    }

    @Override // j$.util.q
    /* renamed from: b */
    public final boolean tryAdvance(j$.util.function.i iVar) {
        if (iVar != null) {
            int i = this.b;
            if (i < 0 || i >= this.c) {
                return false;
            }
            this.b = i + 1;
            iVar.accept(this.a[i]);
            return true;
        }
        throw null;
    }

    @Override // j$.util.r
    public final int characteristics() {
        return this.d;
    }

    @Override // j$.util.r
    public final long estimateSize() {
        return this.c - this.b;
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
        if (AbstractC0002b.j(this, 4)) {
            return null;
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
    public final r trySplit() {
        int i = this.b;
        int i2 = (this.c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new E(this.a, i, i2, this.d);
    }
}
