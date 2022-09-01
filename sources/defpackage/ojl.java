package defpackage;

import j$.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: ojl  reason: default package */
/* loaded from: classes2.dex */
final class ojl extends ojk implements ListIterator, Iterator {
    final /* synthetic */ ojn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojl(ojn ojnVar, int i) {
        super(ojnVar);
        this.c = ojnVar;
        int a = ojnVar.a();
        if (i < 0 || i > a) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + a);
        }
        this.a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        ojn ojnVar = this.c;
        int i = this.a - 1;
        this.a = i;
        return ojnVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
