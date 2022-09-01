package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: qi  reason: default package */
/* loaded from: classes2.dex */
final class qi extends AbstractSet {
    final /* synthetic */ qo a;

    public qi(qo qoVar) {
        this.a = qoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ql(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.d;
    }
}
