package defpackage;

/* compiled from: PG */
/* renamed from: jhp  reason: default package */
/* loaded from: classes.dex */
public final class jhp {
    public final jhs a;
    public final lfb b;
    public final lfb c;

    public jhp() {
    }

    public jhp(jhs jhsVar, lfb lfbVar, lfb lfbVar2) {
        this.a = jhsVar;
        this.b = lfbVar;
        this.c = lfbVar2;
    }

    public static nzv a() {
        return new nzv((byte[]) null, (char[]) null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jhp) {
            jhp jhpVar = (jhp) obj;
            if (this.a.equals(jhpVar.a) && this.b.equals(jhpVar.b) && this.c.equals(jhpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        jhs jhsVar = this.a;
        int i = jhsVar.cO;
        if (i == 0) {
            i = nhh.a.b(jhsVar).b(jhsVar);
            jhsVar.cO = i;
        }
        return ((((i ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        return "AddFileGroupRequest{dataFileGroup=" + valueOf + ", accountOptional=" + valueOf2 + ", variantIdOptional=" + valueOf3 + "}";
    }
}
