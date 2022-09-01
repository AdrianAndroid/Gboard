package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: loq  reason: default package */
/* loaded from: classes.dex */
final class loq implements ListIterator, Iterator {
    boolean a;
    final /* synthetic */ ListIterator b;
    final /* synthetic */ lor c;

    public loq(lor lorVar, ListIterator listIterator) {
        this.c = lorVar;
        this.b = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.b.add(obj);
        this.b.previous();
        this.a = false;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.a = true;
            return this.b.previous();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c.a(this.b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.a = true;
            return this.b.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        jez.V(this.a);
        this.b.remove();
        this.a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        jdg.F(this.a);
        this.b.set(obj);
    }
}
