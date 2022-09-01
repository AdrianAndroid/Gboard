package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: lif  reason: default package */
/* loaded from: classes.dex */
final class lif implements Map.Entry {
    final Object a;
    Object b;
    final /* synthetic */ lig c;

    public lif(lig ligVar, Object obj, Object obj2) {
        this.c = ligVar;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.a.equals(entry.getKey()) && this.b.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object put = this.c.put(this.a, obj);
        this.b = obj;
        return put;
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
