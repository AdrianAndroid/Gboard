package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lie  reason: default package */
/* loaded from: classes.dex */
public final class lie extends AbstractQueue {
    final lih a = new lic();

    @Override // java.util.Queue
    /* renamed from: a */
    public final lih peek() {
        lih lihVar = this.a;
        lih lihVar2 = ((lic) lihVar).a;
        if (lihVar2 == lihVar) {
            return null;
        }
        return lihVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        lih lihVar = ((lic) this.a).a;
        while (true) {
            lih lihVar2 = this.a;
            if (lihVar == lihVar2) {
                lic licVar = (lic) lihVar2;
                licVar.a = lihVar2;
                licVar.b = lihVar2;
                return;
            }
            lih g = lihVar.g();
            lig.h(lihVar);
            lihVar = g;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((lih) obj).g() != lhl.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        lih lihVar = this.a;
        return ((lic) lihVar).a == lihVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lid(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        lih lihVar = (lih) obj;
        lig.f(lihVar.i(), lihVar.g());
        lig.f(((lic) this.a).b, lihVar);
        lig.f(lihVar, this.a);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        lih lihVar = this.a;
        lih lihVar2 = ((lic) lihVar).a;
        if (lihVar2 == lihVar) {
            return null;
        }
        remove(lihVar2);
        return lihVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        lih lihVar = (lih) obj;
        lih i = lihVar.i();
        lih g = lihVar.g();
        lig.f(i, g);
        lig.h(lihVar);
        return g != lhl.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (lih lihVar = ((lic) this.a).a; lihVar != this.a; lihVar = lihVar.g()) {
            i++;
        }
        return i;
    }
}
