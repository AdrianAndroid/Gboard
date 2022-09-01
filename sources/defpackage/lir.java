package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lir  reason: default package */
/* loaded from: classes.dex */
final class lir implements Iterator, j$.util.Iterator {
    final Iterator a;
    Collection b;
    final /* synthetic */ lis c;

    public lir(lis lisVar) {
        this.c = lisVar;
        this.a = lisVar.a.entrySet().iterator();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        lis lisVar = this.c;
        Object key = entry.getKey();
        return lre.u(key, lisVar.b.c(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        jdg.G(this.b != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        ljc.u(this.c.b, this.b.size());
        this.b.clear();
        this.b = null;
    }
}
