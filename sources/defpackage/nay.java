package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: nay  reason: default package */
/* loaded from: classes2.dex */
public final class nay extends ndb {
    private final List a;

    public nay(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nay) && oll.g(this.a, ((nay) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        List list = this.a;
        return "UsingConstraint(columns=" + list + ")";
    }
}
