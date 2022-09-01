package defpackage;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: liq  reason: default package */
/* loaded from: classes.dex */
final class liq extends lqi {
    final /* synthetic */ lis a;

    public liq(lis lisVar) {
        this.a = lisVar;
    }

    @Override // defpackage.lqi
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.lqi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return jez.T(this.a.a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new lir(this.a);
    }

    @Override // defpackage.lqi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        ljc ljcVar = this.a.b;
        Object key = ((Map.Entry) Objects.requireNonNull((Map.Entry) obj)).getKey();
        Map map = ljcVar.a;
        jdg.u(map);
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        ljcVar.b -= size;
        return true;
    }
}
