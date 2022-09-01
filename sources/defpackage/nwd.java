package defpackage;

/* compiled from: PG */
/* renamed from: nwd  reason: default package */
/* loaded from: classes2.dex */
public final class nwd {
    public static final nwd a;
    public final int b;

    static {
        ozd ozdVar = new ozd(0);
        ozdVar.c(1);
        a = ozdVar.b();
    }

    public nwd(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.b == ((nwd) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.b);
        return "BindServiceFlags{" + hexString + "}";
    }
}
