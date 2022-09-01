package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lis  reason: default package */
/* loaded from: classes.dex */
final class lis extends lqq {
    final transient Map a;
    final /* synthetic */ ljc b;

    public lis(ljc ljcVar, Map map) {
        this.b = ljcVar;
        this.a = map;
    }

    @Override // defpackage.lqq
    public final Set a() {
        return new liq(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.a;
        ljc ljcVar = this.b;
        if (map == ljcVar.a) {
            ljcVar.o();
        } else {
            lre.T(new lir(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.a;
        jdg.u(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) lre.o(this.a, obj);
        if (collection == null) {
            return null;
        }
        return this.b.c(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.lqq, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.b.A();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection a = this.b.a();
        a.addAll(collection);
        ljc.u(this.b, collection.size());
        collection.clear();
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.a.toString();
    }
}
