package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: olc  reason: default package */
/* loaded from: classes2.dex */
public final class olc implements Iterator, j$.util.Iterator {
    private final Object[] a;
    private int b;

    public olc(Object[] objArr) {
        oll.e(objArr, "array");
        this.a = objArr;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
