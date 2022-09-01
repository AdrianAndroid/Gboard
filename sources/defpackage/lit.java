package defpackage;

import j$.util.Iterator;
import j$.util.Objects;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lit  reason: default package */
/* loaded from: classes.dex */
abstract class lit implements Iterator, j$.util.Iterator {
    final Iterator a;
    Object b = null;
    Collection c = null;
    Iterator d = loe.a;
    final /* synthetic */ ljc e;

    public lit(ljc ljcVar) {
        this.e = ljcVar;
        this.a = ljcVar.a.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.d.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        return a(this.b, this.d.next());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.d.remove();
        if (((Collection) Objects.requireNonNull(this.c)).isEmpty()) {
            this.a.remove();
        }
        ljc.s(this.e);
    }
}
