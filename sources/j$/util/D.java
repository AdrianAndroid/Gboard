package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class D implements r {
    private final Collection a;
    private java.util.Iterator b = null;
    private final int c;
    private long d;
    private int e;

    public D(Collection collection, int i) {
        this.a = collection;
        this.c = (i & 4096) == 0 ? i | 64 | 16384 : i;
    }

    @Override // j$.util.r
    public final int characteristics() {
        return this.c;
    }

    @Override // j$.util.r
    public final long estimateSize() {
        if (this.b == null) {
            Collection collection = this.a;
            this.b = collection.iterator();
            long size = collection.size();
            this.d = size;
            return size;
        }
        return this.d;
    }

    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        if (consumer != null) {
            if (this.b == null) {
                Collection collection = this.a;
                this.b = collection.iterator();
                this.d = collection.size();
            }
            if (!this.b.hasNext()) {
                return false;
            }
            consumer.accept(this.b.next());
            return true;
        }
        throw null;
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        if (consumer != null) {
            java.util.Iterator it = this.b;
            if (it == null) {
                Collection collection = this.a;
                java.util.Iterator it2 = collection.iterator();
                this.b = it2;
                this.d = collection.size();
                it = it2;
            }
            if (it instanceof Iterator) {
                ((Iterator) it).forEachRemaining(consumer);
                return;
            } else {
                Iterator.CC.$default$forEachRemaining(it, consumer);
                return;
            }
        }
        throw null;
    }

    @Override // j$.util.r
    public java.util.Comparator getComparator() {
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
        long j;
        java.util.Iterator it = this.b;
        if (it == null) {
            Collection collection = this.a;
            java.util.Iterator it2 = collection.iterator();
            this.b = it2;
            j = collection.size();
            this.d = j;
            it = it2;
        } else {
            j = this.d;
        }
        if (j <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.e + 1024;
        if (i > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (it.hasNext());
        this.e = i2;
        long j2 = this.d;
        if (j2 != Long.MAX_VALUE) {
            this.d = j2 - i2;
        }
        return new w(objArr, 0, i2, this.c);
    }
}
