package defpackage;

/* compiled from: PG */
/* renamed from: jlq  reason: default package */
/* loaded from: classes.dex */
public final class jlq {
    public final jiq a;
    public final jig b;

    public jlq(jiq jiqVar, jig jigVar) {
        if (jiqVar != null) {
            this.a = jiqVar;
            if (jigVar != null) {
                this.b = jigVar;
                return;
            }
            throw new NullPointerException("Null dataFileGroup");
        }
        throw new NullPointerException("Null groupKey");
    }

    public static jlq a(jiq jiqVar, jig jigVar) {
        return new jlq(jiqVar, jigVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jlq) {
            jlq jlqVar = (jlq) obj;
            if (this.a.equals(jlqVar.a) && this.b.equals(jlqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "GroupKeyAndGroup{groupKey=" + obj + ", dataFileGroup=" + obj2 + "}";
    }

    public final int hashCode() {
        jiq jiqVar = this.a;
        int i = jiqVar.cO;
        if (i == 0) {
            i = nhh.a.b(jiqVar).b(jiqVar);
            jiqVar.cO = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        jig jigVar = this.b;
        int i3 = jigVar.cO;
        if (i3 == 0) {
            i3 = nhh.a.b(jigVar).b(jigVar);
            jigVar.cO = i3;
        }
        return i2 ^ i3;
    }

    public jlq() {
    }
}
