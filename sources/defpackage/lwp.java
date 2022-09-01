package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: lwp  reason: default package */
/* loaded from: classes.dex */
final class lwp implements Iterator, j$.util.Iterator {
    final /* synthetic */ lwq a;
    private int b = 0;

    public lwp(lwq lwqVar) {
        this.a = lwqVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i < this.a.size()) {
            lwq lwqVar = this.a;
            Object obj = lwqVar.b.b[lwqVar.b() + i];
            this.b = i + 1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
