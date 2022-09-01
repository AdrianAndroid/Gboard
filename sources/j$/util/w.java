package j$.util;

import j$.util.function.Consumer;

/* loaded from: classes3.dex */
final class w implements r {
    private final Object[] a;
    private int b;
    private final int c;
    private final int d;

    public w(Object[] objArr, int i, int i2, int i3) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 64 | 16384;
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
    public final boolean f(Consumer consumer) {
        if (consumer != null) {
            int i = this.b;
            if (i < 0 || i >= this.c) {
                return false;
            }
            this.b = i + 1;
            consumer.accept(this.a[i]);
            return true;
        }
        throw null;
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        int i;
        if (consumer != null) {
            Object[] objArr = this.a;
            int length = objArr.length;
            int i2 = this.c;
            if (length < i2 || (i = this.b) < 0) {
                return;
            }
            this.b = i2;
            if (i >= i2) {
                return;
            }
            do {
                consumer.accept(objArr[i]);
                i++;
            } while (i < i2);
            return;
        }
        throw null;
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
        return new w(this.a, i, i2, this.d);
    }
}
