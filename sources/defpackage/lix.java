package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: lix  reason: default package */
/* loaded from: classes.dex */
class lix implements Iterator, j$.util.Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ liy c;

    public lix(liy liyVar) {
        Iterator it;
        this.c = liyVar;
        this.b = liyVar.b;
        Collection collection = liyVar.b;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.a = it;
    }

    public lix(liy liyVar, Iterator it) {
        this.c = liyVar;
        this.b = liyVar.b;
        this.a = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.b();
        if (this.c.b == this.b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.a.remove();
        ljc.s(this.c.e);
        this.c.c();
    }
}
