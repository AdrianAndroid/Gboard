package defpackage;

/* compiled from: PG */
/* renamed from: lvo  reason: default package */
/* loaded from: classes.dex */
public final class lvo {
    public final lxc a;
    public final String b;

    public lvo(lxc lxcVar, String str) {
        lxj.b(lxcVar, "parser");
        this.a = lxcVar;
        lxj.b(str, "message");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lvo) {
            lvo lvoVar = (lvo) obj;
            if (this.a.equals(lvoVar.a) && this.b.equals(lvoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
