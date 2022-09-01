package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lst  reason: default package */
/* loaded from: classes.dex */
final class lst extends lqp {
    final /* synthetic */ lsu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lst(lsu lsuVar, Map map) {
        super(map);
        this.b = lsuVar;
    }

    @Override // defpackage.lqp, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.b.a(jdg.r(jdg.s(collection), lqh.VALUE));
    }

    @Override // defpackage.lqp, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.b.a(jdg.r(jdg.t(jdg.s(collection)), lqh.VALUE));
    }
}
