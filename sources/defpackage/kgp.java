package defpackage;

/* compiled from: PG */
/* renamed from: kgp  reason: default package */
/* loaded from: classes.dex */
public final class kgp implements kco {
    public final int a;
    public final llp b;
    private final int c;

    public kgp() {
    }

    public kgp(int i, int i2, llp llpVar) {
        this.c = i;
        this.a = i2;
        this.b = llpVar;
    }

    @Override // defpackage.kco
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.kco
    public final boolean b() {
        return this.c == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kgp)) {
            return false;
        }
        kgp kgpVar = (kgp) obj;
        int i = this.c;
        int i2 = kgpVar.c;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a == kgpVar.a && lre.I(this.b, kgpVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        kcp.b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.a;
        String valueOf = String.valueOf(this.b);
        return "DirStatsConfigurations{enablement=" + kcp.a(i) + ", maxFolderDepth=" + i2 + ", listPathMatchers=" + valueOf + ", includeDeviceEncryptedStorage=false}";
    }
}
