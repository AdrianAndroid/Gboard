package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: pu  reason: default package */
/* loaded from: classes2.dex */
public final class pu implements Map.Entry {
    public final Object a;
    public final Object b;
    pu c;
    public pu d;

    public pu(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pu)) {
            return false;
        }
        pu puVar = (pu) obj;
        return this.a.equals(puVar.a) && this.b.equals(puVar.b);
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
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
