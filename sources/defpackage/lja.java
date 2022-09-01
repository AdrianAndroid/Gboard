package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lja  reason: default package */
/* loaded from: classes.dex */
public class lja extends liy implements List {
    final /* synthetic */ ljc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lja(ljc ljcVar, Object obj, List list, liy liyVar) {
        super(ljcVar, obj, list, liyVar);
        this.f = ljcVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        d().add(i, obj);
        ljc.r(this.f);
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = d().addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        ljc.t(this.f, this.b.size() - size);
        if (size != 0) {
            return addAll;
        }
        a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List d() {
        return (List) this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return d().get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new liz(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object remove = d().remove(i);
        ljc.s(this.f);
        c();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return d().set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        ljc ljcVar = this.f;
        Object obj = this.a;
        List subList = d().subList(i, i2);
        liy liyVar = this.c;
        if (liyVar == null) {
            liyVar = this;
        }
        return ljcVar.l(obj, subList, liyVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new liz(this, i);
    }
}
