package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ngh  reason: default package */
/* loaded from: classes2.dex */
public final class ngh implements Iterator, j$.util.Iterator {
    private final Iterator a;

    public ngh(Iterator it) {
        this.a = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        return entry.getValue() instanceof ngi ? new ngg(entry) : entry;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
