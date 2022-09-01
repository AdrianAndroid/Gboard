package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: liv  reason: default package */
/* loaded from: classes.dex */
public final class liv extends lql {
    final /* synthetic */ ljc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public liv(ljc ljcVar, Map map) {
        super(map);
        this.a = ljcVar;
    }

    @Override // defpackage.lql, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        lre.T(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.b.keySet().hashCode();
    }

    @Override // defpackage.lql, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new liu(this, this.b.entrySet().iterator());
    }

    @Override // defpackage.lql, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            ljc.u(this.a, size);
            return size > 0;
        }
        return false;
    }
}
