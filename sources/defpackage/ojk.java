package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: ojk  reason: default package */
/* loaded from: classes2.dex */
class ojk implements Iterator, j$.util.Iterator {
    public int a;
    final /* synthetic */ ojn b;

    public ojk(ojn ojnVar) {
        this.b = ojnVar;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ojn ojnVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return ojnVar.get(i);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
