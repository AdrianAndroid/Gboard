package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: omj  reason: default package */
/* loaded from: classes2.dex */
final class omj extends omk implements Iterator, j$.util.Iterator, ojv {
    public ojv a;
    private int b;
    private Object c;
    private Iterator d;

    @Override // defpackage.omk
    public final Object a(Object obj, ojv ojvVar) {
        this.c = obj;
        this.b = 3;
        this.a = ojvVar;
        return ojx.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.omk
    public final Object b(Iterator it, ojv ojvVar) {
        if (!it.hasNext()) {
            return oji.a;
        }
        this.d = it;
        this.b = 2;
        this.a = ojvVar;
        return ojx.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.ojv
    public final void d(Object obj) {
        oix.c(obj);
        this.b = 4;
    }

    @Override // defpackage.ojv
    public final ojw e() {
        return ojw.a;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i == 0 || i == 1) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return next();
        } else if (i == 2) {
            this.b = 1;
            java.util.Iterator it = this.d;
            oll.b(it);
            return it.next();
        } else if (i != 3) {
            throw f();
        } else {
            this.b = 0;
            Object obj = this.c;
            this.c = null;
            return obj;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i != 4) {
                        throw f();
                    }
                    return false;
                }
                java.util.Iterator it = this.d;
                oll.b(it);
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            ojv ojvVar = this.a;
            oll.b(ojvVar);
            this.a = null;
            ojvVar.d(oji.a);
        }
    }

    private final Throwable f() {
        int i = this.b;
        if (i != 4) {
            if (i == 5) {
                return new IllegalStateException("Iterator has failed.");
            }
            return new IllegalStateException("Unexpected state of the iterator: " + this.b);
        }
        return new NoSuchElementException();
    }
}
