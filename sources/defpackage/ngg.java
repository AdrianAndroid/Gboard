package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: ngg  reason: default package */
/* loaded from: classes2.dex */
final class ngg implements Map.Entry {
    public final Map.Entry a;

    public ngg(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((ngi) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof ngz)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        ngi ngiVar = (ngi) this.a.getValue();
        ngz ngzVar = ngiVar.a;
        ngiVar.b = null;
        ngiVar.a = (ngz) obj;
        return ngzVar;
    }
}
