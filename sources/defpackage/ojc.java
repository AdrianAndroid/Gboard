package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: ojc  reason: default package */
/* loaded from: classes2.dex */
public final class ojc implements Serializable {
    public final Object a;
    public final Object b;

    public ojc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojc)) {
            return false;
        }
        ojc ojcVar = (ojc) obj;
        return oll.g(this.a, ojcVar.a) && oll.g(this.b, ojcVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}
