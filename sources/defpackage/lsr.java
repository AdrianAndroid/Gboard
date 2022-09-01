package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lsr  reason: default package */
/* loaded from: classes.dex */
final class lsr extends lqi {
    final /* synthetic */ lsu a;

    public lsr(lsu lsuVar) {
        this.a = lsuVar;
    }

    @Override // defpackage.lqi
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.lqi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return !iterator().hasNext();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        lsu lsuVar = this.a;
        if (lsuVar.a.a.q()) {
            return loc.a;
        }
        lsv lsvVar = lsuVar.a;
        return new lss(lsuVar, lsuVar.a.b.a.tailMap((lkp) jdg.U((lkp) lsvVar.b.a.floorKey(lsvVar.a.b), lsuVar.a.a.b), true).values().iterator());
    }

    @Override // defpackage.lqi, defpackage.lse, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        return this.a.a(jdg.t(jdg.s(collection)));
    }

    @Override // defpackage.lqi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return lre.L(iterator());
    }
}
