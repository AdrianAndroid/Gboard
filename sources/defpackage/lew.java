package defpackage;

import java.util.AbstractList;

/* compiled from: PG */
/* renamed from: lew  reason: default package */
/* loaded from: classes.dex */
final class lew extends AbstractList {
    final /* synthetic */ Object[] a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public lew(Object[] objArr, Object obj, Object obj2) {
        this.a = objArr;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return i != 0 ? i != 1 ? this.a[i - 2] : this.c : this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.length + 2;
    }
}
