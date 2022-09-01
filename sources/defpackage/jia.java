package defpackage;

/* compiled from: PG */
/* renamed from: jia  reason: default package */
/* loaded from: classes.dex */
public final class jia {
    public final String a;
    public final lfb b;
    public final lfb c;

    public jia() {
    }

    public jia(String str, lfb lfbVar, lfb lfbVar2) {
        this.a = str;
        this.b = lfbVar;
        this.c = lfbVar2;
    }

    public static jhz a() {
        jhz jhzVar = new jhz(null);
        jhzVar.a = (byte) 1;
        return jhzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jia) {
            jia jiaVar = (jia) obj;
            if (this.a.equals(jiaVar.a) && this.b.equals(jiaVar.b) && this.c.equals(jiaVar.c)) {
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
        return "GetFileGroupRequest{groupName=" + str + ", accountOptional=" + valueOf + ", variantIdOptional=" + valueOf2 + ", preserveZipDirectories=false}";
    }
}
