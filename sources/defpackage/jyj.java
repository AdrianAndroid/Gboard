package defpackage;

/* compiled from: PG */
/* renamed from: jyj  reason: default package */
/* loaded from: classes.dex */
public final class jyj {
    public final jzm a;
    public final jza b;
    public final mks c;
    public final jws d;
    public final jux e;

    public jyj() {
    }

    public jyj(jzm jzmVar, jza jzaVar, mks mksVar, jws jwsVar, jux juxVar) {
        this.a = jzmVar;
        this.b = jzaVar;
        this.c = mksVar;
        this.d = jwsVar;
        this.e = juxVar;
    }

    public static osr a() {
        return new osr((char[]) null);
    }

    public final boolean equals(Object obj) {
        jza jzaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jyj) {
            jyj jyjVar = (jyj) obj;
            if (this.a.equals(jyjVar.a) && ((jzaVar = this.b) != null ? jzaVar.equals(jyjVar.b) : jyjVar.b == null) && this.c.equals(jyjVar.c) && this.d.equals(jyjVar.d) && this.e.equals(jyjVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        jza jzaVar = this.b;
        return ((((((hashCode ^ (jzaVar == null ? 0 : jzaVar.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        return "DownloadJobConfig{scheduler=" + valueOf + ", retryParameters=" + valueOf2 + ", controlExecutor=" + valueOf3 + ", downloadFetcher=" + valueOf4 + ", downloadQueue=" + valueOf5 + "}";
    }
}
