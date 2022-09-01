package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: nic  reason: default package */
/* loaded from: classes2.dex */
final class nic implements Iterator, j$.util.Iterator {
    final Iterator a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public nic(nfz nfzVar, Iterator it, int i) {
        this.c = i;
        this.b = nfzVar;
        this.a = it;
    }

    public nic(nid nidVar, int i) {
        this.c = i;
        this.b = nidVar;
        this.a = nidVar.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (this.c == 0) {
            throw new UnsupportedOperationException();
        }
        this.a.remove();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        if (this.c != 0) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.c != 0 ? this.a.hasNext() : this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.c != 0) {
            return new nfx((nfz) this.b, (Map.Entry) this.a.next());
        }
        return (String) this.a.next();
    }
}
