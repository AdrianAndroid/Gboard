package defpackage;

import android.content.Context;
import android.util.Printer;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ifp  reason: default package */
/* loaded from: classes.dex */
public final class ifp implements idm, gzv {
    private static final ltg l = ltg.j("com/google/android/libraries/inputmethod/metricstracker/metricsprocessor/StartupMetricsProcessor");
    public final ino a;
    public final long b;
    public final String c;
    public final idi d;
    public long e;
    public boolean f;
    public boolean g;
    public long j;
    public long k;
    private final idk m;
    private idl n;
    private long o;
    private mej p;
    private int q;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    private final idb r = new ifq(this);

    public ifp(Context context, idk idkVar, idi idiVar) {
        ino L = ino.L();
        long l2 = jbt.l(context);
        String j = jam.j();
        this.m = idkVar;
        this.d = idiVar;
        this.a = L;
        this.b = l2;
        this.c = j;
        gzt.a.a(this);
    }

    private static void g(Printer printer, mej mejVar) {
        int f = mhb.f(mejVar.b);
        if (f == 0) {
            f = 1;
        }
        StringBuilder sb = new StringBuilder("startup_type: ");
        sb.append(f - 1);
        printer.println(sb.toString());
        boolean z = mejVar.c;
        printer.println("is_user_unlock: " + z);
        int i = mejVar.d;
        printer.println("startup_latency: " + i);
        int i2 = mejVar.f;
        printer.println("estimated_user_experienced_latency: " + i2);
        printer.println("trace_segment: [");
        for (meq meqVar : mejVar.e) {
            mep b = mep.b(meqVar.b);
            if (b == null) {
                b = mep.UNKNOWN_NODE;
            }
            int i3 = b.p;
            int i4 = meqVar.c;
            int i5 = meqVar.d;
            int i6 = meqVar.e;
            int i7 = meqVar.f;
            printer.println(" segment_type: " + i3 + ", trace_id:" + i4 + ", duration_ms:" + i5 + ", method_duration_ms:" + i6 + ", delay_from_last_segment_ms:" + i7);
        }
        printer.println("]");
    }

    public final void a(mep mepVar, long j, long j2) {
        ArrayList arrayList = this.i;
        nfh t = meq.g.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        meq meqVar = (meq) t.b;
        meqVar.b = mepVar.p;
        int i = meqVar.a | 1;
        meqVar.a = i;
        long j3 = this.e;
        long j4 = this.j;
        int i2 = i | 4;
        meqVar.a = i2;
        meqVar.d = (int) (j3 - j4);
        int i3 = i2 | 8;
        meqVar.a = i3;
        meqVar.e = (int) j2;
        long j5 = this.k;
        int i4 = i3 | 16;
        meqVar.a = i4;
        meqVar.f = (int) (j - j5);
        int i5 = this.q;
        this.q = i5 + 1;
        meqVar.a = i4 | 2;
        meqVar.c = i5;
        arrayList.add((meq) t.cz());
        this.k = this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.j = 0L;
        this.k = 0L;
        this.q = 0;
        this.f = true;
        this.i.clear();
    }

    public final void c(long j, long j2) {
        if (this.j <= 0 || this.k <= 0) {
            b();
            this.j = j;
            this.k = j;
            this.f = false;
        }
        a(mep.M_GIMS_ON_CREATE, j, j2);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        if (this.p != null) {
            printer.println("Last tracked startup trace:");
            g(printer, this.p);
        }
        if (!this.h.isEmpty()) {
            printer.println("Cached startup trace before user unlocked:");
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                g(printer, (mej) arrayList.get(i));
            }
        }
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "StartupMetricsProcessor";
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.o = j;
        this.e = j2;
        this.r.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final void r(idl idlVar) {
        this.n = idlVar;
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return ifq.a;
    }

    public final void d(mej mejVar) {
        ifr ifrVar;
        int f = mhb.f(mejVar.b);
        if (f == 0) {
            f = 1;
        }
        boolean z = mejVar.c;
        int i = f - 1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            ifrVar = null;
                        } else if (z) {
                            ifrVar = ifr.OS_UPGRADE_STARTUP_AFTER_USER_UNLOCK;
                        } else {
                            ifrVar = ifr.OS_UPGRADE_STARTUP_BEFORE_USER_UNLOCK;
                        }
                    } else if (z) {
                        ifrVar = ifr.WARM_STARTUP_AFTER_USER_UNLOCK;
                    } else {
                        ifrVar = ifr.WARM_STARTUP_BEFORE_USER_UNLOCK;
                    }
                } else if (z) {
                    ifrVar = ifr.COLD_STARTUP_AFTER_USER_UNLOCK;
                } else {
                    ifrVar = ifr.COLD_STARTUP_BEFORE_USER_UNLOCK;
                }
            } else if (z) {
                ifrVar = ifr.FIRST_UPGRADE_STARTUP_AFTER_USER_UNLOCK;
            } else {
                ifrVar = ifr.FIRST_UPGRADE_STARTUP_BEFORE_USER_UNLOCK;
            }
        } else if (z) {
            ifrVar = ifr.FIRST_INSTALL_STARTUP_AFTER_USER_UNLOCK;
        } else {
            ifrVar = ifr.FIRST_INSTALL_STARTUP_BEFORE_USER_UNLOCK;
        }
        if (ifrVar == null) {
            b();
            return;
        }
        this.p = mejVar;
        this.m.g(ifrVar, mejVar.d);
        nfh t = mbh.aT.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbh mbhVar = (mbh) t.b;
        mejVar.getClass();
        mbhVar.aa = mejVar;
        mbhVar.c |= 2048;
        mde mdeVar = ieo.a().a;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbh mbhVar2 = (mbh) t.b;
        mdeVar.getClass();
        mbhVar2.A = mdeVar;
        mbhVar2.a |= 536870912;
        mbh mbhVar3 = (mbh) t.cz();
        if (this.f) {
            ifg ifgVar = ifg.COLD_STARTUP_TRACE_TIMESTAMP;
            Object[] objArr = {Long.valueOf(this.o)};
            idl idlVar = this.n;
            if (idlVar != null) {
                idlVar.i(ifgVar, objArr);
            } else {
                ((ltd) ((ltd) l.c()).k("com/google/android/libraries/inputmethod/metricstracker/metricsprocessor/StartupMetricsProcessor", "logMetricsInSitu", 426, "StartupMetricsProcessor.java")).t("metricsDelegate is not set.");
            }
        }
        this.d.f(mbhVar3, 167, this.o, this.e);
    }
}
