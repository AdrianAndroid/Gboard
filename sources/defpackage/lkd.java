package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: lkd  reason: default package */
/* loaded from: classes.dex */
final class lkd implements Iterator, j$.util.Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ lke d;

    public lkd(lke lkeVar) {
        this.d = lkeVar;
        this.a = lkeVar.b;
        this.b = lkeVar.c();
    }

    private final void a() {
        if (this.d.b == this.a) {
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
        return this.b >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.b;
            this.c = i;
            Object e = this.d.e(i);
            this.b = this.d.d(this.b);
            return e;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        a();
        jez.V(this.c >= 0);
        this.a += 32;
        lke lkeVar = this.d;
        lkeVar.remove(lkeVar.e(this.c));
        this.b = this.d.a(this.b, this.c);
        this.c = -1;
    }
}
