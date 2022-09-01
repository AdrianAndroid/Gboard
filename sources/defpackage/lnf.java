package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* renamed from: lnf  reason: default package */
/* loaded from: classes.dex */
final class lnf extends llp {
    final /* synthetic */ lng a;

    public lnf(lng lngVar) {
        this.a = lngVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return new AbstractMap.SimpleImmutableEntry(this.a.a.b.d.get(i), this.a.a.c.get(i));
    }

    @Override // defpackage.llg
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.a.size();
    }
}
