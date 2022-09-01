package defpackage;

/* compiled from: PG */
/* renamed from: apc  reason: default package */
/* loaded from: classes.dex */
public final class apc {
    public Object a;
    public Object b;

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xv)) {
            return false;
        }
        xv xvVar = (xv) obj;
        return a(xvVar.a, this.a) && a(xvVar.b, this.b);
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
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return "Pair{" + valueOf + " " + valueOf2 + "}";
    }
}
