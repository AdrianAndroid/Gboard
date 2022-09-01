package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: lmc  reason: default package */
/* loaded from: classes.dex */
final class lmc extends llp {
    final /* synthetic */ llp a;

    public lmc(llp llpVar) {
        this.a = llpVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((Map.Entry) this.a.get(i)).getValue();
    }

    @Override // defpackage.llg
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
