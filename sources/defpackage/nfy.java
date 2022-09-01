package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: nfy  reason: default package */
/* loaded from: classes2.dex */
final class nfy extends AbstractSet {
    final /* synthetic */ nfz a;
    private final Set b;

    public nfy(nfz nfzVar, Set set) {
        this.a = nfzVar;
        this.b = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new nic(this.a, this.b.iterator(), 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}
