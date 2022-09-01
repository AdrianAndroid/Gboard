package defpackage;

/* compiled from: PG */
/* renamed from: jnr  reason: default package */
/* loaded from: classes.dex */
public final class jnr {
    private static final llp c = llp.x("OK", "CANCELLED", "UNKNOWN", "INVALID_ARGUMENT", "DEADLINE_EXCEEDED", "NOT_FOUND", "ALREADY_EXISTS", "PERMISSION_DENIED", "RESOURCE_EXHAUSTED", "FAILED_PRECONDITION", "ABORTED", "OUT_OF_RANGE", "UNIMPLEMENTED", "INTERNAL", "UNAVAILABLE", "DATA_LOSS", "UNAUTHENTICATED");
    public final int a;
    public final String b;

    private jnr(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static jnr a(int i) {
        return new jnr(i, null);
    }

    public static jnr b(int i, String str) {
        return new jnr(i, str);
    }

    public static jnr c(int i, String str, Object... objArr) {
        return new jnr(i, String.format(str, objArr));
    }

    public final String toString() {
        return this.b == null ? d(this.a) : String.format("%s: %s", d(this.a), this.b);
    }

    public static String d(int i) {
        if (i >= 0) {
            llp llpVar = c;
            if (i < ((lrl) llpVar).c) {
                return (String) llpVar.get(i);
            }
        }
        return "#" + i;
    }
}
