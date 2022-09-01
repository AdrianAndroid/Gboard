package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: lkh  reason: default package */
/* loaded from: classes.dex */
final class lkh extends lrc implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;

    public lkh(Comparator comparator) {
        jdg.u(comparator);
        this.a = comparator;
    }

    @Override // defpackage.lrc, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lkh)) {
            return false;
        }
        return this.a.equals(((lkh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
