package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lsn  reason: default package */
/* loaded from: classes.dex */
abstract class lsn implements Iterator, j$.util.Iterator {
    final Iterator b;

    public lsn(Iterator it) {
        jdg.u(it);
        this.b = it;
    }

    public abstract Object a(Object obj);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        return a(this.b.next());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
