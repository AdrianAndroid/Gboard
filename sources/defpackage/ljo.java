package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ljo  reason: default package */
/* loaded from: classes.dex */
final class ljo extends lrc implements Serializable {
    private static final long serialVersionUID = 0;
    final leq a;
    final lrc b;

    public ljo(leq leqVar, lrc lrcVar) {
        jdg.u(leqVar);
        this.a = leqVar;
        this.b = lrcVar;
    }

    @Override // defpackage.lrc, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(this.a.a(obj), this.a.a(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ljo) {
            ljo ljoVar = (ljo) obj;
            if (this.a.equals(ljoVar.a) && this.b.equals(ljoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
