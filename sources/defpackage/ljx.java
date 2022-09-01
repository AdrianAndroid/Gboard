package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ljx  reason: default package */
/* loaded from: classes.dex */
final class ljx extends AbstractSet {
    final /* synthetic */ lkc a;

    public ljx(lkc lkcVar) {
        this.a = lkcVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map o = this.a.o();
        if (o != null) {
            return o.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int f = this.a.f(entry.getKey());
            if (f != -1 && jdg.W(this.a.k(f), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        lkc lkcVar;
        Map o = this.a.o();
        if (o != null) {
            return o.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        lkc lkcVar2 = this.a;
        if (lkcVar2.v()) {
            return false;
        }
        int e = lkcVar2.e();
        int M = jez.M(entry.getKey(), entry.getValue(), e, this.a.j(), this.a.w(), this.a.x(), this.a.y());
        if (M == -1) {
            return false;
        }
        this.a.s(M, e);
        lkcVar.f--;
        this.a.p();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
