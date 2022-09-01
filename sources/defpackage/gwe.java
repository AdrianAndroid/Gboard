package defpackage;

/* compiled from: PG */
/* renamed from: gwe  reason: default package */
/* loaded from: classes.dex */
public final class gwe {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;
    public final llp f;
    public final mhf g;

    public gwe() {
    }

    public gwe(String str, long j, long j2, String str2, boolean z, llp llpVar, mhf mhfVar) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = z;
        this.f = llpVar;
        this.g = mhfVar;
    }

    public static gwd a() {
        gwd gwdVar = new gwd();
        gwdVar.e("");
        gwdVar.c(0L);
        gwdVar.d(0L);
        gwdVar.a = "";
        gwdVar.f(false);
        gwdVar.b(llp.q());
        gwdVar.b = mhf.a;
        return gwdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gwe) {
            gwe gweVar = (gwe) obj;
            if (this.a.equals(gweVar.a) && this.b == gweVar.b && this.c == gweVar.c && this.d.equals(gweVar.d) && this.e == gweVar.e && lre.I(this.f, gweVar.f) && this.g.equals(gweVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        long j2 = this.c;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) j)) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        long j2 = this.c;
        String str2 = this.d;
        boolean z = this.e;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        return "BugParameters{issueTitle=" + str + ", componentId=" + j + ", happenedTime=" + j2 + ", bugAssignee=" + str2 + ", requireBugReport=" + z + ", clipDatas=" + valueOf + ", hotListIds=" + valueOf2 + "}";
    }
}
