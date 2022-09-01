package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lkb  reason: default package */
/* loaded from: classes.dex */
final class lkb extends AbstractCollection {
    final /* synthetic */ lkc a;

    public lkb(lkc lkcVar) {
        this.a = lkcVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        lkc lkcVar = this.a;
        Map o = lkcVar.o();
        if (o != null) {
            return o.values().iterator();
        }
        return new ljw(lkcVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
