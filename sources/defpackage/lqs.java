package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lqs  reason: default package */
/* loaded from: classes.dex */
class lqs extends AbstractCollection {
    final /* synthetic */ ljh a;

    public lqs(ljh ljhVar) {
        this.a = ljhVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.a.B(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.a.E(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.e();
    }

    public lqs() {
    }
}
