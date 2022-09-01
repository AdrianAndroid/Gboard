package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ehb  reason: default package */
/* loaded from: classes.dex */
public final class ehb implements eig {
    private final oiy A;
    private final oiy B;
    private final oiy C;
    private final oiy D;
    private final oiy E;
    private final oiy F;
    private final oiy G;
    private final oiy H;
    private final oiy I;
    private final oiy J;
    private final oiy K;
    private final csh a;
    private final oiy b;
    private final oiy c;
    private final oiy d;
    private final oiy e;
    private final oiy f;
    private final oiy g;
    private final oiy h;
    private final oiy i;
    private final oiy j;
    private final oiy k;
    private final oiy l;
    private final oiy m;
    private final oiy n;
    private final oiy o;
    private final oiy p;
    private final oiy q;
    private final oiy r;
    private final oiy s;
    private final oiy t;
    private final oiy u;
    private final oiy v;
    private final oiy w;
    private final oiy x;
    private final oiy y;
    private final oiy z;

    public ehb(csh cshVar) {
        this.a = cshVar;
        egx egxVar = new egx(cshVar, 3);
        this.b = egxVar;
        eha ehaVar = new eha(cshVar, 0);
        this.c = ehaVar;
        cnj cnjVar = new cnj(cshVar, 5);
        this.d = cnjVar;
        oiy c = npd.c(csm.d(cnjVar));
        this.e = c;
        csn b = csn.b(c);
        this.f = b;
        oiy c2 = npd.c(csm.b(cnjVar));
        this.g = c2;
        csn d = csn.d(c2);
        this.h = d;
        egx egxVar2 = new egx(cshVar, 2);
        this.i = egxVar2;
        dyy c3 = dyy.c(egxVar2);
        this.j = c3;
        csd b2 = csd.b(egxVar2);
        this.k = b2;
        egz egzVar = new egz(cshVar, 0);
        this.l = egzVar;
        ehu ehuVar = new ehu(egxVar2);
        this.m = ehuVar;
        cwp cwpVar = new cwp(ehuVar);
        this.n = cwpVar;
        csd e = csd.e(egxVar2);
        this.o = e;
        cxg cxgVar = new cxg(egxVar2, ehuVar, e);
        this.p = cxgVar;
        cui cuiVar = new cui(egxVar2);
        this.q = cuiVar;
        oiy c4 = npd.c(new csm(cuiVar, 3));
        this.r = c4;
        eht ehtVar = new eht(ehuVar);
        this.s = ehtVar;
        ehv ehvVar = new ehv(ehtVar);
        this.t = ehvVar;
        cwq cwqVar = new cwq(ehvVar);
        this.u = cwqVar;
        oiy c5 = npd.c(csm.c(b));
        this.v = c5;
        ehh ehhVar = new ehh(e);
        this.w = ehhVar;
        oiy c6 = npd.c(new gmh((oiy) egxVar, (oiy) b, c5, (oiy) ehhVar, 1, (byte[]) null));
        this.x = c6;
        eih eihVar = new eih(egxVar2, 0);
        this.y = eihVar;
        cql c7 = cql.c(egxVar2);
        this.z = c7;
        crm c8 = crm.c(egxVar2);
        this.A = c8;
        cqr c9 = cqr.c(egxVar);
        this.B = c9;
        crg c10 = crg.c(egxVar, c7, c8, c9);
        this.C = c10;
        csa b3 = csa.b(egxVar2);
        this.D = b3;
        egw c11 = egw.c(egxVar);
        this.E = c11;
        egv c12 = egv.c(egxVar, c11);
        this.F = c12;
        egw egwVar = new egw(egxVar, 0);
        this.G = egwVar;
        ehq ehqVar = new ehq(egxVar, d, e, eihVar, ehaVar, c6, cwqVar, c4, c10, egzVar, b3, c12, c11, egwVar, ehhVar);
        this.H = ehqVar;
        this.I = new eif(egxVar, ehaVar, b, d, c3, b2, egzVar, cwpVar, cxgVar, c4, cwqVar, c6, ehqVar, ehhVar);
        eit eitVar = new eit(egxVar, d, e, eihVar, ehaVar, cwqVar, c4, c10, egzVar, b3, c12, c11, egwVar, ehhVar);
        this.J = eitVar;
        this.K = new eik(egxVar, ehaVar, d, c3, b2, egzVar, cwpVar, cxgVar, c4, cwqVar, eitVar, ehhVar);
    }

    @Override // defpackage.eig
    public final ctv a() {
        Context context = ((csg) this.a).b;
        nxp.W(context);
        oiy oiyVar = this.I;
        oiy oiyVar2 = this.K;
        if (!cuz.a.i(context)) {
            return ((eif) oiyVar).a();
        }
        return ((eik) oiyVar2).a();
    }
}
