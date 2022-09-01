package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: ojf  reason: default package */
/* loaded from: classes2.dex */
public final class ojf implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public ojf(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojf)) {
            return false;
        }
        ojf ojfVar = (ojf) obj;
        return oll.g(this.a, ojfVar.a) && oll.g(this.b, ojfVar.b) && oll.g(this.c, ojfVar.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ')';
    }
}
