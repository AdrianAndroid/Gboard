package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lnw  reason: default package */
/* loaded from: classes.dex */
final class lnw extends lsz {
    final /* synthetic */ Iterator a;

    public lnw(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        return this.a.next();
    }
}
