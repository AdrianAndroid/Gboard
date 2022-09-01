package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ljy  reason: default package */
/* loaded from: classes.dex */
public abstract class ljy implements Iterator, j$.util.Iterator {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ lkc e;

    public ljy(lkc lkcVar) {
        this.e = lkcVar;
        this.b = lkcVar.e;
        this.c = lkcVar.c();
    }

    private final void b() {
        if (this.e.e == this.b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public abstract Object a(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        b();
        if (hasNext()) {
            int i = this.c;
            this.d = i;
            Object a = a(i);
            this.c = this.e.d(this.c);
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        b();
        jez.V(this.d >= 0);
        this.b += 32;
        lkc lkcVar = this.e;
        lkcVar.remove(lkcVar.h(this.d));
        this.c = this.e.a(this.c, this.d);
        this.d = -1;
    }
}
