package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class u implements l, j$.util.function.i, Iterator {
    boolean a = false;
    long b;
    final /* synthetic */ p c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(p pVar) {
        this.c = pVar;
    }

    @Override // j$.util.function.i
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    @Override // j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof j$.util.function.i) {
            j$.util.function.i iVar = (j$.util.function.i) consumer;
            Objects.requireNonNull(iVar);
            while (hasNext()) {
                if (!this.a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                iVar.accept(this.b);
            }
            return;
        }
        Objects.requireNonNull(consumer);
        if (!H.a) {
            Objects.requireNonNull(consumer);
            k kVar = new k(consumer);
            Objects.requireNonNull(kVar);
            while (hasNext()) {
                if (!this.a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                kVar.accept(this.b);
            }
            return;
        }
        H.a(u.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.b(this);
        }
        return this.a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!H.a) {
            if (!this.a && !hasNext()) {
                throw new NoSuchElementException();
            }
            this.a = false;
            return Long.valueOf(this.b);
        }
        H.a(u.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
