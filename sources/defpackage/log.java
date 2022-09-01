package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: log  reason: default package */
/* loaded from: classes.dex */
final class log implements Iterator, j$.util.Iterator {
    loh a;
    loh b;
    final /* synthetic */ lol c;

    public log(lol lolVar) {
        this.c = lolVar;
        this.a = lolVar.d.b();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a != this.c.d;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        loh lohVar = this.a;
        this.b = lohVar;
        this.a = lohVar.b();
        return lohVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        jdg.G(this.b != null, "no calls to next() since the last call to remove()");
        lol lolVar = this.c;
        loh lohVar = this.b;
        lolVar.E(lohVar.a, lohVar.b);
        this.b = null;
    }
}
