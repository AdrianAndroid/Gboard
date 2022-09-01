package defpackage;

import j$.util.Iterator;
import j$.util.Map;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: ql  reason: default package */
/* loaded from: classes2.dex */
final class ql implements Iterator, Map.Entry, j$.util.Iterator, Map.Entry {
    int a;
    int b = -1;
    boolean c;
    final /* synthetic */ qo d;

    public ql(qo qoVar) {
        this.d = qoVar;
        this.a = qoVar.d - 1;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return oll.g(entry.getKey(), this.d.c(this.b)) && oll.g(entry.getValue(), this.d.f(this.b));
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object getKey() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.c(this.b);
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object getValue() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.f(this.b);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object c = this.d.c(this.b);
        Object f = this.d.f(this.b);
        int i = 0;
        int hashCode = c == null ? 0 : c.hashCode();
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.b++;
            this.c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        this.d.d(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.e(this.b, obj);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
