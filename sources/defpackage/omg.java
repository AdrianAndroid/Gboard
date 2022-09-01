package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: omg  reason: default package */
/* loaded from: classes2.dex */
public final class omg implements Iterator, j$.util.Iterator {
    final /* synthetic */ omh a;
    private Object b;
    private int c = -2;

    public omg(omh omhVar) {
        this.a = omhVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [okq, java.lang.Object] */
    private final void a() {
        Object a;
        if (this.c == -2) {
            a = ((omm) this.a.a).a;
        } else {
            ?? r0 = this.a.b;
            Object obj = this.b;
            oll.b(obj);
            a = r0.a(obj);
        }
        this.b = a;
        this.c = a == null ? 0 : 1;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c != 0) {
            Object obj = this.b;
            oll.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.c = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
