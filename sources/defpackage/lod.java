package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lod  reason: default package */
/* loaded from: classes.dex */
public final class lod implements Iterator, j$.util.Iterator {
    private Iterator a;
    private Iterator b = loc.a;
    private Iterator c;
    private Deque d;

    public lod(Iterator it) {
        this.c = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        java.util.Iterator it;
        while (true) {
            java.util.Iterator it2 = this.b;
            jdg.u(it2);
            if (!it2.hasNext()) {
                while (true) {
                    java.util.Iterator it3 = this.c;
                    if (it3 == null || !it3.hasNext()) {
                        Deque deque = this.d;
                        if (deque == null || deque.isEmpty()) {
                            break;
                        }
                        this.c = (java.util.Iterator) this.d.removeFirst();
                    } else {
                        it = this.c;
                        break;
                    }
                }
                it = null;
                this.c = it;
                if (it == null) {
                    return false;
                }
                java.util.Iterator it4 = (java.util.Iterator) it.next();
                this.b = it4;
                if (it4 instanceof lod) {
                    lod lodVar = (lod) it4;
                    this.b = lodVar.b;
                    if (this.d == null) {
                        this.d = new ArrayDeque();
                    }
                    this.d.addFirst(this.c);
                    if (lodVar.d != null) {
                        while (!lodVar.d.isEmpty()) {
                            this.d.addFirst((java.util.Iterator) lodVar.d.removeLast());
                        }
                    }
                    this.c = lodVar.c;
                }
            } else {
                return true;
            }
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            java.util.Iterator it = this.b;
            this.a = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        java.util.Iterator it = this.a;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.a = null;
    }
}
