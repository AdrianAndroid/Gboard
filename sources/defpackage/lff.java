package defpackage;

import java.io.Serializable;
import java.util.List;

/* compiled from: PG */
/* renamed from: lff  reason: default package */
/* loaded from: classes.dex */
public final class lff implements Serializable, lfe {
    private static final long serialVersionUID = 0;
    private final List a;

    public lff(List list) {
        this.a = list;
    }

    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        for (int i = 0; i < this.a.size(); i++) {
            if (!((lfe) this.a.get(i)).a(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.lfe
    public final boolean equals(Object obj) {
        if (obj instanceof lff) {
            return this.a.equals(((lff) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.a;
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
