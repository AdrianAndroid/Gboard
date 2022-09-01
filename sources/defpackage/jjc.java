package defpackage;

/* compiled from: PG */
/* renamed from: jjc  reason: default package */
/* loaded from: classes.dex */
public final class jjc {
    public final String a;
    public final lfb b;
    public final lfb c;

    public jjc() {
    }

    public jjc(String str, lfb lfbVar, lfb lfbVar2) {
        this.a = str;
        this.b = lfbVar;
        this.c = lfbVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jjc) {
            jjc jjcVar = (jjc) obj;
            if (this.a.equals(jjcVar.a) && this.b.equals(jjcVar.b) && this.c.equals(jjcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        return "RemoveFileGroupRequest{groupName=" + str + ", accountOptional=" + valueOf + ", variantIdOptional=" + valueOf2 + ", pendingOnly=false}";
    }
}
