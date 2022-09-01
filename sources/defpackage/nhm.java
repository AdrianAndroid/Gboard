package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nhm  reason: default package */
/* loaded from: classes2.dex */
public final class nhm implements Iterator, j$.util.Iterator {
    private final ArrayDeque a;
    private nej b;

    public nhm(nem nemVar) {
        if (nemVar instanceof nhn) {
            nhn nhnVar = (nhn) nemVar;
            ArrayDeque arrayDeque = new ArrayDeque(nhnVar.g);
            this.a = arrayDeque;
            arrayDeque.push(nhnVar);
            this.b = b(nhnVar.e);
            return;
        }
        this.a = null;
        this.b = (nej) nemVar;
    }

    private final nej b(nem nemVar) {
        while (nemVar instanceof nhn) {
            nhn nhnVar = (nhn) nemVar;
            this.a.push(nhnVar);
            int[] iArr = nhn.a;
            nemVar = nhnVar.e;
        }
        return (nej) nemVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a */
    public final nej next() {
        nej nejVar;
        nej nejVar2 = this.b;
        if (nejVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            nejVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            int[] iArr = nhn.a;
            nejVar = b(((nhn) this.a.pop()).f);
        } while (nejVar.C());
        this.b = nejVar;
        return nejVar2;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
