package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* renamed from: kdb  reason: default package */
/* loaded from: classes.dex */
public final class kdb extends kdc {
    public static final kdb a = new kdb();

    private kdb() {
    }

    @Override // defpackage.kdc
    public final /* synthetic */ ngz a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        nfh t = oni.i.t();
        long d = kcu.d(healthStats, 30001);
        if (d != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oni oniVar = (oni) t.b;
            oniVar.a |= 1;
            oniVar.b = d;
        }
        long d2 = kcu.d(healthStats, 30002);
        if (d2 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oni oniVar2 = (oni) t.b;
            oniVar2.a |= 2;
            oniVar2.c = d2;
        }
        long d3 = kcu.d(healthStats, 30003);
        if (d3 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oni oniVar3 = (oni) t.b;
            oniVar3.a |= 4;
            oniVar3.d = d3;
        }
        long d4 = kcu.d(healthStats, 30004);
        if (d4 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oni oniVar4 = (oni) t.b;
            oniVar4.a |= 8;
            oniVar4.e = d4;
        }
        long d5 = kcu.d(healthStats, 30005);
        if (d5 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oni oniVar5 = (oni) t.b;
            oniVar5.a |= 16;
            oniVar5.f = d5;
        }
        long d6 = kcu.d(healthStats, 30006);
        if (d6 != 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oni oniVar6 = (oni) t.b;
            oniVar6.a |= 32;
            oniVar6.g = d6;
        }
        if (str != null) {
            onf g = kcu.g(str);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oni oniVar7 = (oni) t.b;
            g.getClass();
            oniVar7.h = g;
            oniVar7.a |= 64;
        }
        oni oniVar8 = (oni) t.cz();
        if (kcu.m(oniVar8)) {
            return null;
        }
        return oniVar8;
    }

    @Override // defpackage.kdc
    public final /* synthetic */ ngz b(ngz ngzVar, ngz ngzVar2) {
        oni oniVar = (oni) ngzVar;
        oni oniVar2 = (oni) ngzVar2;
        if (oniVar == null || oniVar2 == null) {
            return oniVar;
        }
        nfh t = oni.i.t();
        if ((oniVar.a & 1) != 0) {
            long j = oniVar.b - oniVar2.b;
            if (j != 0) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                oni oniVar3 = (oni) t.b;
                oniVar3.a |= 1;
                oniVar3.b = j;
            }
        }
        if ((oniVar.a & 2) != 0) {
            long j2 = oniVar.c - oniVar2.c;
            if (j2 != 0) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                oni oniVar4 = (oni) t.b;
                oniVar4.a |= 2;
                oniVar4.c = j2;
            }
        }
        if ((oniVar.a & 4) != 0) {
            long j3 = oniVar.d - oniVar2.d;
            if (j3 != 0) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                oni oniVar5 = (oni) t.b;
                oniVar5.a |= 4;
                oniVar5.d = j3;
            }
        }
        if ((oniVar.a & 8) != 0) {
            long j4 = oniVar.e - oniVar2.e;
            if (j4 != 0) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                oni oniVar6 = (oni) t.b;
                oniVar6.a |= 8;
                oniVar6.e = j4;
            }
        }
        if ((oniVar.a & 16) != 0) {
            long j5 = oniVar.f - oniVar2.f;
            if (j5 != 0) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                oni oniVar7 = (oni) t.b;
                oniVar7.a |= 16;
                oniVar7.f = j5;
            }
        }
        if ((oniVar.a & 32) != 0) {
            long j6 = oniVar.g - oniVar2.g;
            if (j6 != 0) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                oni oniVar8 = (oni) t.b;
                oniVar8.a |= 32;
                oniVar8.g = j6;
            }
        }
        onf onfVar = oniVar.h;
        if (onfVar == null) {
            onfVar = onf.d;
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        oni oniVar9 = (oni) t.b;
        onfVar.getClass();
        oniVar9.h = onfVar;
        oniVar9.a |= 64;
        oni oniVar10 = (oni) t.cz();
        if (!kcu.m(oniVar10)) {
            return oniVar10;
        }
        return null;
    }

    @Override // defpackage.kdc
    public final /* bridge */ /* synthetic */ String c(ngz ngzVar) {
        onf onfVar = ((oni) ngzVar).h;
        if (onfVar == null) {
            onfVar = onf.d;
        }
        return onfVar.c;
    }
}
