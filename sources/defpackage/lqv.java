package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lqv  reason: default package */
/* loaded from: classes.dex */
final class lqv extends lji {
    final lqr a;

    public lqv(lqr lqrVar) {
        this.a = lqrVar;
    }

    @Override // defpackage.lqx
    public final int a(Object obj) {
        Collection collection = (Collection) lre.o(this.a.z(), obj);
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    @Override // defpackage.lji
    public final int b() {
        return this.a.z().size();
    }

    @Override // defpackage.lji
    public final Iterator c() {
        return new lqu(this.a.z().entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.o();
    }

    @Override // defpackage.lji, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.q(obj);
    }

    @Override // defpackage.lji, defpackage.lqx
    public final int d(Object obj, int i) {
        jez.W(i, "occurrences");
        if (i == 0) {
            return a(obj);
        }
        Collection collection = (Collection) lre.o(this.a.z(), obj);
        if (collection == null) {
            return 0;
        }
        int size = collection.size();
        if (i >= size) {
            collection.clear();
        } else {
            Iterator it = collection.iterator();
            for (int i2 = 0; i2 < i; i2++) {
                it.next();
                it.remove();
            }
        }
        return size;
    }

    @Override // defpackage.lji, defpackage.lqx
    public final Set e() {
        return this.a.A();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, defpackage.lqx
    public final Iterator iterator() {
        return lre.r(this.a.x().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.lqx
    public final int size() {
        return this.a.e();
    }
}
