package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t implements j, j$.util.function.g, Iterator {
    boolean a = false;
    int b;
    final /* synthetic */ o c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(o oVar) {
        this.c = oVar;
    }

    @Override // j$.util.function.g
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    @Override // j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof j$.util.function.g) {
            j$.util.function.g gVar = (j$.util.function.g) consumer;
            Objects.requireNonNull(gVar);
            while (hasNext()) {
                if (!this.a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                gVar.accept(this.b);
            }
            return;
        }
        Objects.requireNonNull(consumer);
        if (!H.a) {
            Objects.requireNonNull(consumer);
            i iVar = new i(consumer);
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
        H.a(t.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.g(this);
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
            return Integer.valueOf(this.b);
        }
        H.a(t.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
