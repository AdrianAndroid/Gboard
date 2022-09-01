package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lgw  reason: default package */
/* loaded from: classes.dex */
public final class lgw extends AbstractQueue {
    final lih a = new lgu();

    @Override // java.util.Queue
    /* renamed from: a */
    public final lih peek() {
        lih lihVar = this.a;
        lih lihVar2 = ((lgu) lihVar).a;
        if (lihVar2 == lihVar) {
            return null;
        }
        return lihVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        lih lihVar = ((lgu) this.a).a;
        while (true) {
            lih lihVar2 = this.a;
            if (lihVar == lihVar2) {
                lgu lguVar = (lgu) lihVar2;
                lguVar.a = lihVar2;
                lguVar.b = lihVar2;
                return;
            }
            lih f = lihVar.f();
            lig.g(lihVar);
            lihVar = f;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((lih) obj).f() != lhl.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        lih lihVar = this.a;
        return ((lgu) lihVar).a == lihVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lgv(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        lih lihVar = (lih) obj;
        lig.e(lihVar.h(), lihVar.f());
        lig.e(((lgu) this.a).b, lihVar);
        lig.e(lihVar, this.a);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        lih lihVar = this.a;
        lih lihVar2 = ((lgu) lihVar).a;
        if (lihVar2 == lihVar) {
            return null;
        }
        remove(lihVar2);
        return lihVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        lih lihVar = (lih) obj;
        lih h = lihVar.h();
        lih f = lihVar.f();
        lig.e(h, f);
        lig.g(lihVar);
        return f != lhl.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (lih lihVar = ((lgu) this.a).a; lihVar != this.a; lihVar = lihVar.f()) {
            i++;
        }
        return i;
    }
}
