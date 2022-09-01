package defpackage;

import android.net.Network;

/* compiled from: PG */
/* renamed from: gmm  reason: default package */
/* loaded from: classes.dex */
public final class gmm {
    public static final gmm a = a(blr.a).a();
    public final blr b;
    public final gmn c;
    public final Network d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Boolean i;
    public final Integer j;
    public final Boolean k;
    public final llw l;
    public final long m;

    public gmm() {
    }

    public gmm(blr blrVar, gmn gmnVar, Network network, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, Integer num, Boolean bool2, llw llwVar, long j) {
        this.b = blrVar;
        this.c = gmnVar;
        this.d = network;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = bool;
        this.j = num;
        this.k = bool2;
        this.l = llwVar;
        this.m = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gml a(blr blrVar) {
        gml gmlVar = new gml();
        gmlVar.a = blrVar;
        gmlVar.b = gmn.b;
        gmlVar.f(true);
        gmlVar.c(true);
        gmlVar.d(true);
        gmlVar.b(false);
        gmlVar.d = false;
        gmlVar.e = 5;
        gmlVar.f = true;
        gmlVar.g = lrq.b;
        gmlVar.e(0L);
        return gmlVar;
    }

    public final boolean equals(Object obj) {
        Network network;
        Boolean bool;
        Integer num;
        Boolean bool2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gmm) {
            gmm gmmVar = (gmm) obj;
            if (this.b.equals(gmmVar.b) && this.c.equals(gmmVar.c) && ((network = this.d) != null ? network.equals(gmmVar.d) : gmmVar.d == null) && this.e == gmmVar.e && this.f == gmmVar.f && this.g == gmmVar.g && this.h == gmmVar.h && ((bool = this.i) != null ? bool.equals(gmmVar.i) : gmmVar.i == null) && ((num = this.j) != null ? num.equals(gmmVar.j) : gmmVar.j == null) && ((bool2 = this.k) != null ? bool2.equals(gmmVar.k) : gmmVar.k == null) && lre.z(this.l, gmmVar.l) && this.m == gmmVar.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        Network network = this.d;
        int i = 0;
        int i2 = 1237;
        int hashCode2 = (((((((hashCode ^ (network == null ? 0 : network.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (true == this.h) {
            i2 = 1231;
        }
        int i3 = (hashCode2 ^ i2) * 1000003;
        Boolean bool = this.i;
        int hashCode3 = (i3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Integer num = this.j;
        int hashCode4 = (hashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Boolean bool2 = this.k;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        int hashCode5 = this.l.hashCode();
        long j = this.m;
        return ((((hashCode4 ^ i) * 1000003) ^ hashCode5) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return String.format("ConnectivityInfo=%s NetworkId=%s LastConnectivityInfoChangeTimeMs=%d", this.b, this.c, Long.valueOf(this.m));
    }
}
