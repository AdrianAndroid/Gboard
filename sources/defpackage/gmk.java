package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: gmk  reason: default package */
/* loaded from: classes.dex */
public final class gmk implements blq {
    private static final lmz h = lmz.s(lzs.OFFLINE, lzs.NETWORK_LEVEL_NOT_MET);
    public final blu c;
    public final bmf d;
    public final gms e;
    public final lfb g;
    private final gnn i;
    public final mld a = mld.e();
    public final mld b = mld.e();
    public final gmi f = new gmi();

    public gmk(blu bluVar, bmf bmfVar, gms gmsVar, lfb lfbVar, gnn gnnVar) {
        this.c = bluVar;
        this.d = bmfVar;
        this.e = gmsVar;
        this.g = lfbVar;
        this.i = gnnVar;
    }

    public final blp a(gmm gmmVar, gmm gmmVar2, gmm gmmVar3) {
        blp blpVar;
        char c;
        int i;
        blb blbVar;
        blr blrVar = gmmVar3.b;
        int i2 = blrVar.b;
        int i3 = this.c.d;
        if (i2 == 0) {
            blpVar = new blp(lzs.OFFLINE, new blb(262160));
        } else if (i2 != 2) {
            jdg.F(true);
            if (i3 != 3) {
                if (i3 == 2 && blrVar.d) {
                    blpVar = new blp(lzs.NETWORK_LEVEL_NOT_MET, new blb(262207));
                }
                blt bltVar = this.c.b;
                blpVar = blp.c;
            } else {
                if (blrVar.c) {
                    blpVar = new blp(lzs.NETWORK_LEVEL_NOT_MET, new blb(262207));
                }
                blt bltVar2 = this.c.b;
                blpVar = blp.c;
            }
        } else if (i3 == 1) {
            blpVar = blp.b;
        } else {
            blpVar = new blp(lzs.NETWORK_LEVEL_NOT_MET, new blb(262207));
        }
        if (bky.i.a || !h.contains(blpVar.d)) {
            c = 1;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - gmmVar.m;
            long j2 = elapsedRealtime - gmmVar2.m;
            long j3 = this.c.c;
            long j4 = 5000;
            if (j3 != Long.MAX_VALUE) {
                j4 = Math.min(5000L, j3);
            }
            c = j2 >= j4 ? (char) 3 : j >= 10000 ? (char) 4 : (char) 2;
            if (c == 2) {
                return new blp(lzs.UNSTABLE_NOT_MET, new blb(262160));
            }
        }
        if (blpVar.d == lzs.OFFLINE) {
            Boolean bool = gmmVar3.k;
            if (bool == null || gmmVar3.j == null || gmmVar3.i == null) {
                i = -1;
            } else {
                boolean z = gmmVar3.e;
                if (gmmVar3.h) {
                    i = z ? 262212 : 262211;
                } else if (!bool.booleanValue()) {
                    i = z ? 262214 : 262213;
                } else if (gmmVar3.j.intValue() == 1) {
                    i = z ? 262216 : 262215;
                } else if (gmmVar3.j.intValue() != 5) {
                    i = z ? 262218 : 262217;
                } else if (!gmmVar3.f) {
                    i = z ? 262222 : 262221;
                } else {
                    i = (!jdg.W(gmmVar3.i, true) || gmmVar3.g) ? z ? 262226 : 262225 : z ? 262224 : 262223;
                }
            }
            if (i == -1) {
                return blpVar;
            }
            if (c == 4) {
                blbVar = new blb(new blb(65568), i);
            } else {
                blbVar = new blb(i);
            }
            return new blp(lzs.OFFLINE, blbVar);
        }
        return blpVar;
    }

    public final mko b(gmm gmmVar, gmm gmmVar2, gmm gmmVar3, blo bloVar) {
        blp a = a(gmmVar, gmmVar2, gmmVar3);
        if (a.d != lzs.UNSTABLE_NOT_MET) {
            if (a.d == lzs.QUALITY_MET && !gmmVar3.b.equals(gmmVar.b)) {
                bloVar.e();
            }
            return kcu.K(a);
        }
        return this.i.c(new gmj(this, gmmVar, lrb.a.d(fxd.k).compare(gmmVar2, gmmVar3) < 0 ? gmmVar3 : gmmVar2, bloVar, 0));
    }
}
