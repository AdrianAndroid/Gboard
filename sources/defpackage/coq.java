package defpackage;

/* compiled from: PG */
/* renamed from: coq  reason: default package */
/* loaded from: classes.dex */
public final class coq {
    public final col a;
    public final coo b;
    public final cop c;
    public final com d;
    public final cok e;

    public coq() {
    }

    public coq(col colVar, coo cooVar, cop copVar, com comVar, cok cokVar) {
        this.a = colVar;
        this.b = cooVar;
        this.c = copVar;
        this.d = comVar;
        this.e = cokVar;
    }

    public static osr a() {
        osr osrVar = new osr((short[]) null);
        osrVar.e = cok.a(-10000);
        return osrVar;
    }

    public final boolean equals(Object obj) {
        coo cooVar;
        cop copVar;
        com comVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof coq) {
            coq coqVar = (coq) obj;
            if (this.a.equals(coqVar.a) && ((cooVar = this.b) != null ? cooVar.equals(coqVar.b) : coqVar.b == null) && ((copVar = this.c) != null ? copVar.equals(coqVar.c) : coqVar.c == null) && ((comVar = this.d) != null ? comVar.equals(coqVar.d) : coqVar.d == null) && this.e.equals(coqVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        coo cooVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (cooVar == null ? 0 : cooVar.hashCode())) * 1000003;
        cop copVar = this.c;
        int hashCode3 = (hashCode2 ^ (copVar == null ? 0 : copVar.hashCode())) * 1000003;
        com comVar = this.d;
        if (comVar != null) {
            i = comVar.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        return "Element{contentType=" + valueOf + ", textInfo=" + valueOf2 + ", textResourceInfo=" + valueOf3 + ", imageResourceInfo=" + valueOf4 + ", callbackInfo=" + valueOf5 + "}";
    }
}
