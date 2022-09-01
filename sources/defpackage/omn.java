package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: omn  reason: default package */
/* loaded from: classes2.dex */
public final class omn implements Iterator, j$.util.Iterator {
    final /* synthetic */ omh a;
    private final Iterator b;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, omi] */
    public omn(omh omhVar, byte[] bArr) {
        this.a = omhVar;
        this.b = omhVar.b.a();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [okq, java.lang.Object] */
    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        return this.a.a.a(this.b.next());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
