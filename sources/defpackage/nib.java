package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: nib  reason: default package */
/* loaded from: classes2.dex */
final class nib implements ListIterator, Iterator {
    final ListIterator a;
    final /* synthetic */ int b;
    final /* synthetic */ nid c;

    public nib(nid nidVar, int i) {
        this.c = nidVar;
        this.b = i;
        this.a = nidVar.a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
