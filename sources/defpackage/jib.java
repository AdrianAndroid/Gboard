package defpackage;

/* compiled from: PG */
/* renamed from: jib  reason: default package */
/* loaded from: classes.dex */
public final class jib {
    public final boolean a;
    public final lfb b;
    public final lfb c;
    public final lfb d;

    public jib() {
    }

    public jib(boolean z, lfb lfbVar, lfb lfbVar2, lfb lfbVar3) {
        this.a = z;
        this.b = lfbVar;
        this.c = lfbVar2;
        this.d = lfbVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jib) {
            jib jibVar = (jib) obj;
            if (this.a == jibVar.a && this.b.equals(jibVar.b) && this.c.equals(jibVar.c) && this.d.equals(jibVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        return "GetFileGroupsByFilterRequest{includeAllGroups=" + z + ", groupWithNoAccountOnly=false, groupNameOptional=" + valueOf + ", accountOptional=" + valueOf2 + ", sourceOptional=" + valueOf3 + ", preserveZipDirectories=false}";
    }
}
