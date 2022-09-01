package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class s implements java.util.Iterator, Consumer {
    boolean a = false;
    Object b;
    final /* synthetic */ r c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(r rVar) {
        this.c = rVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.a = true;
        this.b = obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.f(this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a || hasNext()) {
            this.a = false;
            return this.b;
        }
        throw new NoSuchElementException();
    }
}
