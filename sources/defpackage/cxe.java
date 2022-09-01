package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: cxe  reason: default package */
/* loaded from: classes.dex */
public final class cxe {
    public static final cxe a;
    public final llp b;
    public final llp c;
    public final llp d;
    public final llp e;
    public final lfb f;
    public final lfb g;
    public final boolean h;
    public final lfb i;
    public final lfb j;
    public final int k;

    static {
        cxd a2 = a();
        a2.g(llp.q());
        a2.d(llp.q());
        a2.f(llp.q());
        a2.c(llp.q());
        a2.e(false);
        a = a2.a();
    }

    public cxe() {
    }

    public cxe(llp llpVar, llp llpVar2, llp llpVar3, llp llpVar4, lfb lfbVar, lfb lfbVar2, boolean z, lfb lfbVar3, lfb lfbVar4, int i) {
        this.b = llpVar;
        this.c = llpVar2;
        this.d = llpVar3;
        this.e = llpVar4;
        this.f = lfbVar;
        this.g = lfbVar2;
        this.h = z;
        this.i = lfbVar3;
        this.j = lfbVar4;
        this.k = i;
    }

    public static cxd a() {
        cxd cxdVar = new cxd((byte[]) null);
        cxdVar.d = 1;
        return cxdVar;
    }

    public static llp d(List list, lmz lmzVar) {
        return fgy.n(list, new cjm(lmzVar, 10));
    }

    public final cxe b() {
        llp d = d(this.b, lmz.p(this.e));
        cxd e = e();
        e.f(d);
        return e.a();
    }

    public final cxe c(cws cwsVar) {
        cxd e = e();
        e.c = cwsVar.g.c;
        return e.a();
    }

    public final cxd e() {
        return new cxd(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxe) {
            cxe cxeVar = (cxe) obj;
            if (lre.I(this.b, cxeVar.b) && lre.I(this.c, cxeVar.c) && lre.I(this.d, cxeVar.d) && lre.I(this.e, cxeVar.e) && this.f.equals(cxeVar.f) && this.g.equals(cxeVar.g) && this.h == cxeVar.h && this.i.equals(cxeVar.i) && this.j.equals(cxeVar.j)) {
                int i = this.k;
                int i2 = cxeVar.k;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final cxe f(dpe dpeVar) {
        llp f = dpeVar.f(this.b);
        cxd e = e();
        e.c(f);
        return e.a();
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        int i = true != this.h ? 1237 : 1231;
        int hashCode2 = this.i.hashCode();
        int hashCode3 = this.j.hashCode();
        int i2 = this.k;
        lxj.h(i2);
        return ((((((hashCode ^ i) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        boolean z = this.h;
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        int i = this.k;
        String g = i != 0 ? lxj.g(i) : "null";
        return "StickerPacks{all=" + valueOf + ", promos=" + valueOf2 + ", unfavorites=" + valueOf3 + ", favorites=" + valueOf4 + ", featuredHeaderId=" + valueOf5 + ", featuredHeaderPack=" + valueOf6 + ", shouldShowFeatureHeader=" + z + ", featuredBrowseIds=" + valueOf7 + ", featuredBrowsePacks=" + valueOf8 + ", featuredModelType=" + g + "}";
    }
}
