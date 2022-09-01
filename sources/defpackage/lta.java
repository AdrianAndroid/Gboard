package defpackage;

import j$.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: lta  reason: default package */
/* loaded from: classes.dex */
public abstract class lta extends lsz implements ListIterator, Iterator {
    private final int a;
    private int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public lta(int i, int i2) {
        jdg.P(i2, i);
        this.a = i;
        this.b = i2;
    }

    protected abstract Object a(int i);

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
