package defpackage;

/* compiled from: PG */
/* renamed from: kkb  reason: default package */
/* loaded from: classes.dex */
public final class kkb implements kjz {
    private final gdh a;

    public kkb(gdh gdhVar) {
        this.a = gdhVar;
    }

    public static final kjx c(gen genVar) {
        kjy kjyVar;
        gct gctVar = (gct) genVar.c();
        nfh t = kjx.i.t();
        String str = gctVar.a;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        kjx kjxVar = (kjx) t.b;
        str.getClass();
        int i = kjxVar.a | 1;
        kjxVar.a = i;
        kjxVar.b = str;
        String str2 = gctVar.c;
        str2.getClass();
        int i2 = 4;
        int i3 = i | 4;
        kjxVar.a = i3;
        kjxVar.d = str2;
        boolean z = gctVar.f;
        int i4 = i3 | 8;
        kjxVar.a = i4;
        kjxVar.g = z;
        long j = gctVar.g;
        kjxVar.a = i4 | 16;
        kjxVar.h = j;
        byte[] bArr = gctVar.b;
        int i5 = 2;
        if (bArr != null) {
            nem u = nem.u(bArr);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            kjx kjxVar2 = (kjx) t.b;
            kjxVar2.a |= 2;
            kjxVar2.c = u;
        }
        gcs[] gcsVarArr = gctVar.d;
        int length = gcsVarArr.length;
        int i6 = 0;
        while (i6 < length) {
            gcs gcsVar = gcsVarArr[i6];
            gcx[] gcxVarArr = gcsVar.b;
            int length2 = gcxVarArr.length;
            int i7 = 0;
            while (i7 < length2) {
                gcx gcxVar = gcxVarArr[i7];
                int i8 = gcxVar.g;
                if (i8 == 1) {
                    nfh t2 = kjy.e.t();
                    String str3 = gcxVar.a;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    kjy kjyVar2 = (kjy) t2.b;
                    str3.getClass();
                    kjyVar2.a |= 1;
                    kjyVar2.d = str3;
                    long b = gcxVar.b();
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    kjy kjyVar3 = (kjy) t2.b;
                    kjyVar3.b = 1;
                    kjyVar3.c = Long.valueOf(b);
                    kjyVar = (kjy) t2.cz();
                } else if (i8 == i5) {
                    nfh t3 = kjy.e.t();
                    String str4 = gcxVar.a;
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    kjy kjyVar4 = (kjy) t3.b;
                    str4.getClass();
                    kjyVar4.a |= 1;
                    kjyVar4.d = str4;
                    boolean e = gcxVar.e();
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    kjy kjyVar5 = (kjy) t3.b;
                    kjyVar5.b = 2;
                    kjyVar5.c = Boolean.valueOf(e);
                    kjyVar = (kjy) t3.cz();
                } else if (i8 == 3) {
                    nfh t4 = kjy.e.t();
                    String str5 = gcxVar.a;
                    if (t4.c) {
                        t4.cD();
                        t4.c = false;
                    }
                    kjy kjyVar6 = (kjy) t4.b;
                    str5.getClass();
                    kjyVar6.a |= 1;
                    kjyVar6.d = str5;
                    double a = gcxVar.a();
                    if (t4.c) {
                        t4.cD();
                        t4.c = false;
                    }
                    kjy kjyVar7 = (kjy) t4.b;
                    kjyVar7.b = 3;
                    kjyVar7.c = Double.valueOf(a);
                    kjyVar = (kjy) t4.cz();
                } else if (i8 == i2) {
                    nfh t5 = kjy.e.t();
                    String str6 = gcxVar.a;
                    if (t5.c) {
                        t5.cD();
                        t5.c = false;
                    }
                    kjy kjyVar8 = (kjy) t5.b;
                    str6.getClass();
                    kjyVar8.a |= 1;
                    kjyVar8.d = str6;
                    String c = gcxVar.c();
                    if (t5.c) {
                        t5.cD();
                        t5.c = false;
                    }
                    kjy kjyVar9 = (kjy) t5.b;
                    kjyVar9.b = 4;
                    kjyVar9.c = c;
                    kjyVar = (kjy) t5.cz();
                } else if (i8 != 5) {
                    throw new IllegalArgumentException("Unrecognized flag type: " + i8);
                } else {
                    nfh t6 = kjy.e.t();
                    String str7 = gcxVar.a;
                    if (t6.c) {
                        t6.cD();
                        t6.c = false;
                    }
                    kjy kjyVar10 = (kjy) t6.b;
                    str7.getClass();
                    kjyVar10.a |= 1;
                    kjyVar10.d = str7;
                    nem u2 = nem.u(gcxVar.f());
                    if (t6.c) {
                        t6.cD();
                        t6.c = false;
                    }
                    kjy kjyVar11 = (kjy) t6.b;
                    kjyVar11.b = 5;
                    kjyVar11.c = u2;
                    kjyVar = (kjy) t6.cz();
                }
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                kjx kjxVar3 = (kjx) t.b;
                kjyVar.getClass();
                nga ngaVar = kjxVar3.e;
                if (!ngaVar.c()) {
                    kjxVar3.e = nfm.H(ngaVar);
                }
                kjxVar3.e.add(kjyVar);
                i7++;
                i5 = 2;
                i2 = 4;
            }
            String[] strArr = gcsVar.c;
            if (strArr != null) {
                for (String str8 : strArr) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    kjx kjxVar4 = (kjx) t.b;
                    str8.getClass();
                    nga ngaVar2 = kjxVar4.f;
                    if (!ngaVar2.c()) {
                        kjxVar4.f = nfm.H(ngaVar2);
                    }
                    kjxVar4.f.add(str8);
                }
            }
            i6++;
            i5 = 2;
            i2 = 4;
        }
        return (kjx) t.cz();
    }

    private static mko d(gen genVar) {
        return mhu.h(gni.c(genVar), fnx.class, jlf.e, mjl.a);
    }

    @Override // defpackage.kjz
    public final mko a(String str) {
        jdg.u(str);
        return d(this.a.a(str));
    }

    @Override // defpackage.kjz
    public final mko b(String str, String str2) {
        jdg.u(str2);
        gen b = this.a.b(str, str2, null);
        mjl mjlVar = mjl.a;
        ger gerVar = new ger();
        ger gerVar2 = (ger) b;
        gerVar2.f.e(new gee(mjlVar, gerVar));
        gerVar2.m();
        return d(gerVar);
    }
}
