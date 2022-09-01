package defpackage;

/* compiled from: PG */
/* renamed from: xv  reason: default package */
/* loaded from: classes2.dex */
public final class xv {
    public final Object a;
    public final Object b;

    public xv(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static xv a(Object obj, Object obj2) {
        return new xv(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xv)) {
            return false;
        }
        xv xvVar = (xv) obj;
        return xu.b(xvVar.a, this.a) && xu.b(xvVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
