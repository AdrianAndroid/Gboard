package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: nar  reason: default package */
/* loaded from: classes2.dex */
public final class nar implements nap {
    private final List a;

    public nar(List list) {
        oll.e(list, "members");
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nar) && oll.g(this.a, ((nar) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        List list = this.a;
        return "ExpressionList(members=" + list + ")";
    }
}
