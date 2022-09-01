package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;

/* compiled from: PG */
/* renamed from: lof  reason: default package */
/* loaded from: classes.dex */
public final class lof implements Iterator, lrd {
    public final java.util.Iterator a;
    public boolean b;
    public Object c;

    public lof(java.util.Iterator it) {
        jdg.u(it);
        this.a = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    @Override // j$.util.Iterator
    public final Object next() {
        if (!this.b) {
            return this.a.next();
        }
        Object obj = this.c;
        this.b = false;
        this.c = null;
        return obj;
    }

    @Override // j$.util.Iterator
    public final void remove() {
        jdg.G(!this.b, "Can't remove after you've peeked at next");
        this.a.remove();
    }
}
