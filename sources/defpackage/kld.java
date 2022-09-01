package defpackage;

/* compiled from: PG */
/* renamed from: kld  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kld implements leq {
    public static final /* synthetic */ kld a = new kld();

    private /* synthetic */ kld() {
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        nem nemVar;
        kjx kjxVar = (kjx) obj;
        nfh t = klf.h.t();
        if (kjxVar == null) {
            return (klf) t.cz();
        }
        for (kjy kjyVar : kjxVar.e) {
            nfh t2 = klg.e.t();
            String str = kjyVar.d;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            klg klgVar = (klg) t2.b;
            str.getClass();
            klgVar.a |= 1;
            klgVar.d = str;
            int i = kjyVar.b;
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    long longValue = i == 1 ? ((Long) kjyVar.c).longValue() : 0L;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    klg klgVar2 = (klg) t2.b;
                    klgVar2.b = 2;
                    klgVar2.c = Long.valueOf(longValue);
                } else if (i3 == 1) {
                    boolean booleanValue = i == 2 ? ((Boolean) kjyVar.c).booleanValue() : false;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    klg klgVar3 = (klg) t2.b;
                    klgVar3.b = 3;
                    klgVar3.c = Boolean.valueOf(booleanValue);
                } else if (i3 == 2) {
                    double doubleValue = i == 3 ? ((Double) kjyVar.c).doubleValue() : 0.0d;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    klg klgVar4 = (klg) t2.b;
                    klgVar4.b = 4;
                    klgVar4.c = Double.valueOf(doubleValue);
                } else if (i3 == 3) {
                    String str2 = i == 4 ? (String) kjyVar.c : "";
                    klg klgVar5 = (klg) t2.b;
                    str2.getClass();
                    klgVar5.b = 5;
                    klgVar5.c = str2;
                } else if (i3 == 4) {
                    if (i == 5) {
                        nemVar = (nem) kjyVar.c;
                    } else {
                        nemVar = nem.b;
                    }
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    klg klgVar6 = (klg) t2.b;
                    nemVar.getClass();
                    klgVar6.b = 6;
                    klgVar6.c = nemVar;
                } else {
                    throw new IllegalStateException("No known flag type");
                }
                klg klgVar7 = (klg) t2.cz();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                klf klfVar = (klf) t.b;
                klgVar7.getClass();
                nga ngaVar = klfVar.g;
                if (!ngaVar.c()) {
                    klfVar.g = nfm.H(ngaVar);
                }
                klfVar.g.add(klgVar7);
            } else {
                throw null;
            }
        }
        String str3 = kjxVar.d;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        klf klfVar2 = (klf) t.b;
        str3.getClass();
        int i4 = 4 | klfVar2.a;
        klfVar2.a = i4;
        klfVar2.d = str3;
        String str4 = kjxVar.b;
        str4.getClass();
        int i5 = 1 | i4;
        klfVar2.a = i5;
        klfVar2.b = str4;
        long j = kjxVar.h;
        int i6 = i5 | 8;
        klfVar2.a = i6;
        klfVar2.e = j;
        if ((kjxVar.a & 2) != 0) {
            nem nemVar2 = kjxVar.c;
            nemVar2.getClass();
            klfVar2.a = i6 | 2;
            klfVar2.c = nemVar2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        klf klfVar3 = (klf) t.b;
        klfVar3.a |= 16;
        klfVar3.f = currentTimeMillis;
        return (klf) t.cz();
    }
}
