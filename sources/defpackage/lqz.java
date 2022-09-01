package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lqz  reason: default package */
/* loaded from: classes.dex */
final class lqz extends lse {
    final /* synthetic */ lji a;

    public lqz(lji ljiVar) {
        this.a = ljiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof lqw) {
            lqw lqwVar = (lqw) obj;
            if (lqwVar.a() > 0 && this.a.a(lqwVar.b()) == lqwVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof lqw) {
            lqw lqwVar = (lqw) obj;
            Object b = lqwVar.b();
            int a = lqwVar.a();
            if (a == 0) {
                return false;
            }
            return this.a.i(b, a);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b();
    }

    public lqz() {
    }
}
