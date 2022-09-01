package defpackage;

import j$.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: lso  reason: default package */
/* loaded from: classes.dex */
abstract class lso extends lsn implements ListIterator, Iterator {
    public lso(ListIterator listIterator) {
        super(listIterator);
    }

    private final ListIterator b() {
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
