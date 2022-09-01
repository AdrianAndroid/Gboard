package j$.util;

import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0001a implements r {
    private final List a;
    private int b;
    private int c;

    private C0001a(C0001a c0001a, int i, int i2) {
        this.a = c0001a.a;
        this.b = i;
        this.c = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0001a(List list) {
        this.a = list;
        this.b = 0;
        this.c = -1;
    }

    private int c() {
        int i = this.c;
        if (i < 0) {
            int size = this.a.size();
            this.c = size;
            return size;
        }
        return i;
    }

    @Override // j$.util.r
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.r
    public final long estimateSize() {
        return c() - this.b;
    }

    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        consumer.getClass();
        int c = c();
        int i = this.b;
        if (i < c) {
            this.b = i + 1;
            try {
                consumer.accept(this.a.get(i));
                return true;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
        return false;
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int c = c();
        this.b = c;
        for (int i = this.b; i < c; i++) {
            try {
                consumer.accept(this.a.get(i));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.r
    public final java.util.Comparator getComparator() {
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
        int c = c();
        int i = this.b;
        int i2 = (c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new C0001a(this, i, i2);
    }
}
