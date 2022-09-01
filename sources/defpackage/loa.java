package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: loa  reason: default package */
/* loaded from: classes.dex */
final class loa implements Iterator, j$.util.Iterator {
    final /* synthetic */ int a;
    final /* synthetic */ Iterator b;
    private int c;

    public loa(int i, Iterator it) {
        this.a = i;
        this.b = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.c < this.a && this.b.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.c++;
            return this.b.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
