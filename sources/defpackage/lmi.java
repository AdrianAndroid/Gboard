package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: lmi  reason: default package */
/* loaded from: classes.dex */
final class lmi extends llg {
    private static final long serialVersionUID = 0;
    final lmn a;

    public lmi(lmn lmnVar) {
        this.a = lmnVar;
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.a.B(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final lsz iterator() {
        return this.a.F();
    }

    @Override // defpackage.llg
    public final boolean m() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size;
    }
}
