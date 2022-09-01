package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lve  reason: default package */
/* loaded from: classes.dex */
final class lve extends AbstractSet {
    final /* synthetic */ lvg a;

    public lve(lvg lvgVar) {
        this.a = lvgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new lvd(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b;
    }
}
