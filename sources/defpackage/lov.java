package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lov  reason: default package */
/* loaded from: classes.dex */
public final class lov extends AbstractSequentialList implements Serializable {
    private static final long serialVersionUID = 0;
    final List a;
    final leq b;

    public lov(List list, leq leqVar) {
        jdg.u(list);
        this.a = list;
        jdg.u(leqVar);
        this.b = leqVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new lou(this, this.a.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
