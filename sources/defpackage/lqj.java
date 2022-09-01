package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lqj  reason: default package */
/* loaded from: classes.dex */
final class lqj extends lqi {
    final /* synthetic */ lqk a;

    public lqj(lqk lqkVar) {
        this.a = lqkVar;
    }

    @Override // defpackage.lqi
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.a();
    }
}
