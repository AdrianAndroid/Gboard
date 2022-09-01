package defpackage;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lnb  reason: default package */
/* loaded from: classes.dex */
public final class lnb extends lmz {
    private final transient lnd a;

    public lnb(lnd lndVar) {
        this.a = lndVar;
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.a.B(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // defpackage.lmz, defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final lsz iterator() {
        return this.a.F();
    }

    @Override // defpackage.llg
    public final boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size;
    }
}
