package defpackage;

/* compiled from: PG */
/* renamed from: hxd  reason: default package */
/* loaded from: classes.dex */
public final class hxd {
    private final ibz a;
    private final ice b;

    public hxd(ibz ibzVar, ice iceVar) {
        this.a = ibzVar;
        if (iceVar != null) {
            this.b = iceVar;
            return;
        }
        throw new NullPointerException("Null viewType");
    }

    public static hxd a(ibz ibzVar, ice iceVar) {
        return new hxd(ibzVar, iceVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hxd) {
            hxd hxdVar = (hxd) obj;
            ibz ibzVar = this.a;
            if (ibzVar != null ? ibzVar.equals(hxdVar.a) : hxdVar.a == null) {
                if (this.b.equals(hxdVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String obj = this.b.toString();
        return "KeyboardViewInfo{keyboardType=" + valueOf + ", viewType=" + obj + "}";
    }

    public hxd() {
    }

    public final int hashCode() {
        ibz ibzVar = this.a;
        return (((ibzVar == null ? 0 : ibzVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
