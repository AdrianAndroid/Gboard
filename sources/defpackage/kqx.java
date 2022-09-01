package defpackage;

/* compiled from: PG */
/* renamed from: kqx  reason: default package */
/* loaded from: classes.dex */
public final class kqx {
    public final ngz a;
    public final nfb b;

    public kqx(ngz ngzVar, nfb nfbVar) {
        if (ngzVar != null) {
            this.a = ngzVar;
            if (nfbVar != null) {
                this.b = nfbVar;
                return;
            }
            throw new NullPointerException("Null extensionRegistryLite");
        }
        throw new NullPointerException("Null defaultValue");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kqx) {
            kqx kqxVar = (kqx) obj;
            if (this.a.equals(kqxVar.a) && this.b.equals(kqxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "ProtoSerializer{defaultValue=" + obj + ", extensionRegistryLite=" + obj2 + "}";
    }

    public kqx() {
    }
}
