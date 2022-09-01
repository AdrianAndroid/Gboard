package com.google.android.apps.inputmethod.libs.trainingcache.maintenance;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaintenanceTaskRunner implements isc {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/MaintenanceTaskRunner");
    public static boolean b = false;
    public final ewc c;
    public final exv d;
    public final exg e;
    public final exl f;
    public final ewt g;
    public final exz h;
    private final mkr i;
    private mko j;

    public MaintenanceTaskRunner(Context context) {
        exe exeVar;
        ewc ewcVar = (ewc) evw.b.a(context);
        exv a2 = exv.a(context);
        exg exgVar = exg.b;
        if (exgVar == null) {
            synchronized (exg.class) {
                exgVar = exg.b;
                if (exgVar == null) {
                    exe exeVar2 = exe.b;
                    if (exeVar2 == null) {
                        synchronized (exe.class) {
                            exeVar = exe.b;
                            if (exeVar == null) {
                                exeVar = new exe(bzd.a(context), gxo.a(10));
                                exe.b = exeVar;
                                bze bzeVar = exeVar.c;
                                bzt a3 = bzu.a("lm_personalization");
                                a3.e = 300;
                                a3.f = 300;
                                bzeVar.i(a3.a());
                            }
                        }
                        exeVar2 = exeVar;
                    }
                    exgVar = new exg(context, exeVar2, gxo.a(10), ino.M(context));
                    exg.b = exgVar;
                }
            }
        }
        exl exlVar = exl.b;
        if (exlVar == null) {
            synchronized (exl.class) {
                exlVar = exl.b;
                if (exlVar == null) {
                    feo c = feo.c(context, "speech-packs");
                    mks a4 = gxo.a(10);
                    ino L = ino.L();
                    mho mhoVar = mho.a;
                    exlVar = new exl(context, c, a4, L, new ewj(context), null);
                    exl.b = exlVar;
                }
            }
        }
        ewt a5 = ewt.a(context);
        exz a6 = exz.a(context);
        mks c2 = gxo.c(11);
        this.c = ewcVar;
        this.g = a5;
        this.d = a2;
        this.e = exgVar;
        this.f = exlVar;
        this.h = a6;
        this.i = c2;
    }

    public static final void d() {
        if (eyh.a == null) {
            synchronized (eyh.class) {
                if (eyh.a == null) {
                    eyh.a = new eyh();
                }
            }
        }
        eyh eyhVar = eyh.a;
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        mko mkoVar = this.j;
        if (mkoVar == null || mkoVar.isDone()) {
            return isb.FINISHED;
        }
        this.j.cancel(false);
        return isb.FINISHED_NEED_RESCHEDULE;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        d();
        boolean equals = "EkhoDebugMaintenance".equals(jlsVar.b);
        if (equals || !irx.b()) {
            mko K = kcu.K(true);
            if (((Boolean) evs.a.c()).booleanValue()) {
                K = mio.h(mio.h(mio.h(mio.h(mio.h(mio.h(mkh.q(K), new eoi(this, 6), this.i), new eoi(this, 7), this.i), new eoi(this, 8), this.i), new eoi(this, 9), this.i), new eoi(this, 10), this.i), new eoi(this, 5), this.i);
            }
            haz a2 = evg.a();
            a2.e(equals);
            evg d = a2.d();
            mko g = mio.g(mio.g(mkh.q(mio.h(mio.h(mio.h(mio.h(mio.h(mkh.q(K), new dvb(this, d, 6), this.i), new dvb(this, d, 7), this.i), new dvb(this, d, 8), this.i), new dvb(this, d, 9), this.i), new dvb(this, d, 10), this.i)), new eki(7), this.i), eki.g, this.i);
            this.j = g;
            return g;
        }
        d();
        return kcu.K(isb.SKIPPED);
    }

    public final mko c(mko mkoVar, String str, int i, boolean z) {
        return mhu.g(mio.g(mkh.q(mkoVar), new jvd(z, 1), this.i), Throwable.class, new ebi(str, 12), this.i);
    }
}
