package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ljb  reason: default package */
/* loaded from: classes.dex */
final class ljb extends liy implements Set {
    final /* synthetic */ ljc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljb(ljc ljcVar, Object obj, Set set) {
        super(ljcVar, obj, set, null);
        this.f = ljcVar;
    }

    @Override // defpackage.liy, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean q = lvw.q((Set) this.b, collection);
        if (q) {
            ljc.t(this.f, this.b.size() - size);
            c();
        }
        return q;
    }
}
