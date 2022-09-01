package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ljt  reason: default package */
/* loaded from: classes.dex */
public final class ljt extends AbstractCollection {
    final Collection a;
    final leq b;

    public ljt(Collection collection, leq leqVar) {
        jdg.u(collection);
        this.a = collection;
        jdg.u(leqVar);
        this.b = leqVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return lre.S(this.a.iterator(), this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
