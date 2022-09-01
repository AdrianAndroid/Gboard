package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lsq  reason: default package */
/* loaded from: classes.dex */
final class lsq extends lql {
    final /* synthetic */ lsu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsq(lsu lsuVar, Map map) {
        super(map);
        this.a = lsuVar;
    }

    @Override // defpackage.lql, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.a.remove(obj) != null;
    }

    @Override // defpackage.lse, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        return this.a.a(jdg.r(jdg.t(jdg.s(collection)), lqh.KEY));
    }
}
