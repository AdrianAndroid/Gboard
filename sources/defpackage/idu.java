package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: idu  reason: default package */
/* loaded from: classes.dex */
public final class idu {
    private final llw a;

    public idu() {
        this.a = lrq.b;
    }

    public idu(Map map) {
        this.a = llw.k(map);
    }

    public final long a(idq idqVar) {
        Long l = (Long) this.a.get(idqVar);
        if (l != null) {
            return l.longValue();
        }
        return Long.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof idu)) {
            return false;
        }
        return this.a.equals(((idu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("SessionInfo@%x : %s", Integer.valueOf(hashCode()), this.a);
    }
}
