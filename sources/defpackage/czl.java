package defpackage;

/* compiled from: PG */
/* renamed from: czl  reason: default package */
/* loaded from: classes.dex */
public final class czl {
    public final boolean a;
    public final llp b;
    public final llp c;
    public final llp d;
    private final int e;
    private final String f;

    public czl() {
    }

    public czl(int i, boolean z, llp llpVar, llp llpVar2, String str, llp llpVar3) {
        this.e = i;
        this.a = z;
        this.b = llpVar;
        this.c = llpVar2;
        this.f = str;
        this.d = llpVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czl) {
            czl czlVar = (czl) obj;
            if (this.e == czlVar.e && this.a == czlVar.a && lre.I(this.b, czlVar.b) && lre.I(this.c, czlVar.c) && this.f.equals(czlVar.f) && lre.I(this.d, czlVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.e ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.e;
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String str = this.f;
        String valueOf3 = String.valueOf(this.d);
        return "DynamicArtAnimationTemplateInfo{maxLines=" + i + ", isGeneric=" + z + ", concepts=" + valueOf + ", keywords=" + valueOf2 + ", altText=" + str + ", linesInfo=" + valueOf3 + "}";
    }
}
