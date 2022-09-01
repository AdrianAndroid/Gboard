package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: egy  reason: default package */
/* loaded from: classes.dex */
public final class egy implements egs {
    private final oiy A;
    private final oiy B;
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

    public egy(csh cshVar) {
        this.a = cshVar;
        egx egxVar = new egx(cshVar, 0);
        this.b = egxVar;
        eha ehaVar = new eha(cshVar, 1);
        this.c = ehaVar;
        egx egxVar2 = new egx(cshVar, 1);
        this.d = egxVar2;
        cvy cvyVar = new cvy(egxVar2, 0);
        this.e = cvyVar;
        cwd cwdVar = new cwd(egxVar2, cvyVar);
        this.f = cwdVar;
        egz egzVar = new egz(cshVar, 1);
        this.g = egzVar;
        cnj cnjVar = new cnj(cshVar, 4);
        this.h = cnjVar;
        oiy c = npd.c(csm.d(cnjVar));
        this.i = c;
        csn b = csn.b(c);
        this.j = b;
        oiy c2 = npd.c(csm.b(cnjVar));
        this.k = c2;
        csn d = csn.d(c2);
        this.l = d;
        oiy c3 = npd.c(csm.c(b));
        this.m = c3;
        eih eihVar = new eih(egxVar2, 1);
        this.n = eihVar;
        cql c4 = cql.c(egxVar2);
        this.o = c4;
        crm c5 = crm.c(egxVar2);
        this.p = c5;
        cqr c6 = cqr.c(egxVar);
        this.q = c6;
        crg c7 = crg.c(egxVar, c4, c5, c6);
        this.r = c7;
        csa b2 = csa.b(egxVar2);
        this.s = b2;
        egw c8 = egw.c(egxVar);
        this.t = c8;
        egv c9 = egv.c(egxVar, c8);
        this.u = c9;
        egr egrVar = new egr(egxVar, d, c3, eihVar, ehaVar, c7, b2, c9);
        this.v = egrVar;
        dyy c10 = dyy.c(egxVar2);
        this.w = c10;
        csd b3 = csd.b(egxVar2);
        this.x = b3;
        csd e = csd.e(egxVar2);
        this.y = e;
        this.z = new egl(egxVar, ehaVar, cvyVar, cwdVar, egzVar, b, d, c3, egrVar, c10, b3, e);
        egq egqVar = new egq(egxVar, d, eihVar, ehaVar, egzVar, c7, b2, c9);
        this.A = egqVar;
        this.B = new egk(egxVar, ehaVar, cvyVar, cwdVar, egzVar, d, egqVar, c10, b3, e);
    }

    @Override // defpackage.egs
    public final ctv a() {
        Context context = ((csg) this.a).b;
        nxp.W(context);
        oiy oiyVar = this.z;
        oiy oiyVar2 = this.B;
        if (!cuz.a.i(context)) {
            return ((egl) oiyVar).a();
        }
        return ((egk) oiyVar2).a();
    }
}
