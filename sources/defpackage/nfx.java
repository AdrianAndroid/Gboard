package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: nfx  reason: default package */
/* loaded from: classes2.dex */
final class nfx implements Map.Entry {
    final /* synthetic */ nfz a;
    private final Map.Entry b;

    public nfx(nfz nfzVar, Map.Entry entry) {
        this.a = nfzVar;
        this.b = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.a.a(this.b.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object valueOf;
        Map.Entry entry = this.b;
        valueOf = Integer.valueOf(((nfp) obj).a());
        Object value = entry.setValue(valueOf);
        if (value == null) {
            return null;
        }
        return this.a.a.a(value);
    }
}
