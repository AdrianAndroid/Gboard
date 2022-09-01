package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: omf  reason: default package */
/* loaded from: classes2.dex */
public final class omf implements Iterator, j$.util.Iterator {
    final /* synthetic */ omh a;
    private final Iterator b;
    private int c = -1;
    private Object d;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, omi] */
    public omf(omh omhVar, byte[] bArr) {
        this.a = omhVar;
        this.b = omhVar.b.a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [okq, java.lang.Object] */
    private final void a() {
        int i;
        while (true) {
            if (!this.b.hasNext()) {
                i = 0;
                break;
            }
            Object next = this.b.next();
            if (!((Boolean) this.a.a.a(next)).booleanValue()) {
                this.d = next;
                i = 1;
                break;
            }
        }
        this.c = i;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.c == -1) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (this.c == -1) {
            a();
        }
        if (this.c != 0) {
            Object obj = this.d;
            this.d = null;
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
