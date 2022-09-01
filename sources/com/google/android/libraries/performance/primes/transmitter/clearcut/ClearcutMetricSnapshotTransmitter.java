package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ClearcutMetricSnapshotTransmitter implements kih {
    private static final lgb a = jdg.n(jgf.g);
    private volatile flo b;
    private volatile flo c;
    private final lgb d = jdg.n(jgf.h);

    @Override // defpackage.kih
    public final mko a(Context context, kig kigVar) {
        flo floVar;
        ngt ngtVar = kin.i;
        kigVar.e(ngtVar);
        jdg.w(kigVar.d.m((nfl) ngtVar.c), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        oos oosVar = kigVar.b;
        if (oosVar == null) {
            oosVar = oos.u;
        }
        oos a2 = kit.a(oosVar);
        if (((Boolean) this.d.a()).booleanValue()) {
            return mkk.a;
        }
        ngt ngtVar2 = kin.i;
        kigVar.e(ngtVar2);
        Object k = kigVar.d.k((nfl) ngtVar2.c);
        if (k == null) {
            k = ngtVar2.b;
        } else {
            ngtVar2.c(k);
        }
        kin kinVar = (kin) k;
        String str = kinVar.b;
        if (kinVar.d) {
            floVar = this.c;
            if (floVar == null) {
                synchronized (this) {
                    floVar = this.c;
                    if (floVar == null) {
                        flo d = flo.d(context, str);
                        this.c = d;
                        floVar = d;
                    }
                }
            }
        } else {
            floVar = this.b;
            if (floVar == null) {
                synchronized (this) {
                    floVar = this.b;
                    if (floVar == null) {
                        flo a3 = flo.a(context, str).a();
                        this.b = a3;
                        floVar = a3;
                    }
                }
            }
        }
        flm c = floVar.c(a2);
        if (nrb.a.a().a(context)) {
            c.j = gkd.a(context, (gjb) a.a());
        }
        String str2 = kinVar.e;
        if (!lfd.e(str2)) {
            if (!c.a.g()) {
                nfj nfjVar = c.i;
                if (nfjVar.c) {
                    nfjVar.cD();
                    nfjVar.c = false;
                }
                nol nolVar = (nol) nfjVar.b;
                nol nolVar2 = nol.j;
                str2.getClass();
                nolVar.a |= 16777216;
                nolVar.i = str2;
            } else {
                throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
            }
        }
        if (!kinVar.d) {
            if ((kinVar.a & 2) != 0) {
                String str3 = kinVar.c;
                if (!c.a.g()) {
                    if (c.d == null) {
                        c.d = new ArrayList();
                    }
                    c.d.add(str3);
                } else {
                    throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
                }
            }
            if ((kinVar.a & 16) != 0) {
                String str4 = kinVar.f;
                if (c.a.g.contains(fmd.ACCOUNT_NAME)) {
                    c.f = str4;
                } else {
                    throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
                }
            }
            nfs nfsVar = kinVar.g;
            if (!nfsVar.isEmpty()) {
                int[] p = mhq.p(nfsVar);
                if (c.a.g()) {
                    throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
                }
                if (p != null && (r7 = p.length) != 0) {
                    if (c.e == null) {
                        c.e = new ArrayList();
                    }
                    for (int i : p) {
                        c.e.add(Integer.valueOf(i));
                    }
                }
            }
        }
        return gni.c(fyb.aI(c.a()));
    }
}
