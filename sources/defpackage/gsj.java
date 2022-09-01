package defpackage;

/* compiled from: PG */
/* renamed from: gsj  reason: default package */
/* loaded from: classes.dex */
public final class gsj {
    public final String a;
    public final boolean b;
    public final gso c;

    public gsj() {
    }

    public gsj(String str, boolean z, gso gsoVar) {
        this.a = str;
        this.b = z;
        this.c = gsoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gsj) {
            gsj gsjVar = (gsj) obj;
            if (this.a.equals(gsjVar.a) && this.b == gsjVar.b && this.c.equals(gsjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        return "AccessPointFeatureClick{featureId=" + str + ", clickedInBar=" + z + ", accessPointsSetting=" + valueOf + "}";
    }
}
