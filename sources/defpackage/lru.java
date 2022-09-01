package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lru  reason: default package */
/* loaded from: classes.dex */
final class lru extends lrc implements Serializable {
    private static final long serialVersionUID = 0;
    final lrc a;

    public lru(lrc lrcVar) {
        this.a = lrcVar;
    }

    @Override // defpackage.lrc
    public final lrc a() {
        return this.a;
    }

    @Override // defpackage.lrc, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lru)) {
            return false;
        }
        return this.a.equals(((lru) obj).a);
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        lrc lrcVar = this.a;
        sb.append(lrcVar);
        return lrcVar.toString().concat(".reverse()");
    }
}
