package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lhi  reason: default package */
/* loaded from: classes.dex */
final class lhi extends lgs {
    final /* synthetic */ lig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhi(lig ligVar) {
        super(ligVar);
        this.b = ligVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new lhh(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.b.remove(obj) != null;
    }
}
