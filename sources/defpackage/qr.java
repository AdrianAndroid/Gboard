package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qr  reason: default package */
/* loaded from: classes2.dex */
public abstract class qr implements Iterator, j$.util.Iterator {
    private int a;
    private int b;
    private boolean c;

    public qr(int i) {
        this.a = i;
    }

    protected abstract Object a(int i);

    protected abstract void b(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a = a(this.b);
        this.b++;
        this.c = true;
        return a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        int i = this.b - 1;
        this.b = i;
        b(i);
        this.a--;
        this.c = false;
    }
}
