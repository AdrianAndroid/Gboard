package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: oju  reason: default package */
/* loaded from: classes2.dex */
public final class oju implements Iterator, j$.util.Iterator {
    public boolean a;
    private final int b;
    private final int c;
    private int d;

    public oju() {
    }

    public oju(int i, int i2) {
        this.b = 1;
        this.c = i2;
        boolean z = i <= i2;
        this.a = z;
        this.d = true != z ? i2 : i;
    }

    public final int a() {
        int i = this.d;
        if (i != this.c) {
            this.d = this.b + i;
        } else if (!this.a) {
            throw new NoSuchElementException();
        } else {
            this.a = false;
        }
        return i;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
