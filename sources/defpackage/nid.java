package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: nid  reason: default package */
/* loaded from: classes2.dex */
public final class nid extends AbstractList implements RandomAccess, ngl {
    public final ngl a;

    public nid(ngl nglVar) {
        this.a = nglVar;
    }

    @Override // defpackage.ngl
    public final ngl d() {
        return this;
    }

    @Override // defpackage.ngl
    public final Object f(int i) {
        return this.a.f(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((ngk) this.a).get(i);
    }

    @Override // defpackage.ngl
    public final List h() {
        return this.a.h();
    }

    @Override // defpackage.ngl
    public final void i(nem nemVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new nic(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new nib(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
