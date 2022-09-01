package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: loi  reason: default package */
/* loaded from: classes.dex */
final class loi implements Iterator, j$.util.Iterator {
    lok a;
    loh b;
    int c;
    final /* synthetic */ loj d;

    public loi(loj lojVar) {
        this.d = lojVar;
        this.a = lojVar.c;
        this.c = lojVar.b;
    }

    private final void a() {
        if (this.d.b == this.c) {
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
        return this.a != this.d;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        loh lohVar = (loh) this.a;
        Object obj = lohVar.b;
        this.b = lohVar;
        this.a = lohVar.d();
        return obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        a();
        jdg.G(this.b != null, "no calls to next() since the last call to remove()");
        this.d.remove(this.b.b);
        this.c = this.d.b;
        this.b = null;
    }
}
