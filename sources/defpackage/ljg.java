package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ljg  reason: default package */
/* loaded from: classes.dex */
final class ljg extends AbstractCollection {
    final /* synthetic */ ljh a;

    public ljg(ljh ljhVar) {
        this.a = ljhVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.C(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.e();
    }
}
