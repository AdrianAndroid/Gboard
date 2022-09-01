package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class v implements AbstractC0008h, j$.util.function.c, Iterator {
    boolean a = false;
    double b;
    final /* synthetic */ n c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(n nVar) {
        this.c = nVar;
    }

    @Override // j$.util.function.c
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    @Override // j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof j$.util.function.c) {
            j$.util.function.c cVar = (j$.util.function.c) consumer;
            Objects.requireNonNull(cVar);
            while (hasNext()) {
                if (!this.a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                cVar.accept(this.b);
            }
            return;
        }
        Objects.requireNonNull(consumer);
        if (!H.a) {
            Objects.requireNonNull(consumer);
            C0007g c0007g = new C0007g(consumer);
            Objects.requireNonNull(c0007g);
            while (hasNext()) {
                if (!this.a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                c0007g.accept(this.b);
            }
            return;
        }
        H.a(v.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.k(this);
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
            return Double.valueOf(this.b);
        }
        H.a(v.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
