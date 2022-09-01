package defpackage;

import android.os.SystemClock;
import android.util.Printer;
import android.view.MotionEvent;
import com.google.android.inputmethod.latin.R;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: ieh  reason: default package */
/* loaded from: classes.dex */
public final class ieh implements idk, idl, gzv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager");
    public static final hhl b = hhq.f("timer_default_sample_rate", 500);
    static final hhl c = hhq.a("enable_timer_logging", true);
    public static final int d = R.string.f161080_resource_name_obfuscated_res_0x7f14068c;
    public volatile boolean i;
    public volatile boolean j;
    private final mkr k;
    private volatile mkr l;
    private final iej m;
    private final inm r;
    private volatile int s;
    private final hho u;
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    private final ConcurrentHashMap n = new ConcurrentHashMap();
    private volatile List o = null;
    private final ArrayDeque p = new ArrayDeque();
    private ief q = null;
    public final AtomicInteger h = new AtomicInteger(0);
    private final AtomicBoolean t = new AtomicBoolean(true);
    private volatile ihm v = new ihm();

    public ieh(mkr mkrVar) {
        fdo fdoVar = new fdo(this, 12);
        this.r = fdoVar;
        bya byaVar = new bya(this, 5);
        this.u = byaVar;
        iej iejVar = new iej();
        this.m = iejVar;
        ino L = ino.L();
        this.j = s(L);
        L.X(fdoVar, d);
        iejVar.b = new opu(this);
        r();
        hhq.p(byaVar, b, c);
        gzt.a.a(this);
        this.k = mkrVar;
    }

    private final boolean A(idt idtVar) {
        if (this.i) {
            return true;
        }
        int a2 = idtVar.a();
        if (a2 == -1) {
            a2 = idtVar instanceof ids ? this.s : 1000;
        }
        if (a2 >= 1000 || a2 < 0) {
            return true;
        }
        return a2 != 0 && ThreadLocalRandom.current().nextInt(0, 1000) < a2;
    }

    public static ieh j() {
        return ied.a;
    }

    public static boolean s(ino inoVar) {
        return inoVar.am(d, R.bool.f20080_resource_name_obfuscated_res_0x7f050059, true, true);
    }

    public static boolean w(long j) {
        return j >= 0 && j <= 2147483647L;
    }

    private final void z(mko mkoVar) {
        kcu.U(mkoVar, new hyw(this, 4), mjl.a);
    }

    @Override // defpackage.idk
    public final idn a(ids idsVar) {
        return (!this.t.get() || !A(idsVar)) ? idg.a : new iei(idsVar, this);
    }

    @Override // defpackage.idk
    public final idu b() {
        return this.m.a;
    }

    @Override // defpackage.idk
    public final void c(idq idqVar) {
        this.m.a(idqVar);
    }

    @Override // defpackage.idk
    public final void d(idq idqVar) {
        this.m.b(idqVar);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        for (Class cls : this.e.keySet()) {
            printer.println(cls.getName());
        }
    }

    @Override // defpackage.idk
    public final void e(ido idoVar, Object... objArr) {
        f(idoVar, this.m.a, objArr);
    }

    @Override // defpackage.idk
    public final void f(ido idoVar, idu iduVar, Object... objArr) {
        if (idoVar == idd.BEGIN_SESSION || idoVar == idd.END_SESSION) {
            throw new IllegalArgumentException(String.format("Metrics type [%s] should not be used by developers.", idoVar));
        }
        m(idoVar, iduVar, objArr);
    }

    @Override // defpackage.idk
    public final void g(ids idsVar, long j) {
        if (!this.t.get() || !w(j) || !A(idsVar)) {
            return;
        }
        p(idsVar, j);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "MetricsManager";
    }

    @Override // defpackage.idk
    public final boolean h(ido idoVar) {
        return this.h.get() > 0 || this.f.get(idoVar) != null;
    }

    @Override // defpackage.idl
    public final void i(ido idoVar, Object... objArr) {
        if (this.q == null) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager", "logMetricsInSitu", 538, "MetricsManager.java")).t("inSituMetricsMetadata should have been set when processing in-situ metrics.");
        } else if (!A(idoVar)) {
        } else {
            this.p.add(new iee(idoVar, this.q, objArr));
        }
    }

    public final mkr k() {
        return this.k;
    }

    public final void l(iee ieeVar) {
        Object[] objArr;
        int i;
        int i2;
        long j;
        ido idoVar;
        idm[] idmVarArr;
        this.q = ieeVar.c;
        this.p.add(ieeVar);
        while (!this.p.isEmpty()) {
            iee ieeVar2 = (iee) this.p.poll();
            if (ieeVar2 != null) {
                ido idoVar2 = ieeVar2.a;
                ief iefVar = ieeVar2.c;
                idu iduVar = iefVar.a;
                long j2 = iefVar.b;
                long j3 = iefVar.c;
                Object[] objArr2 = ieeVar2.b;
                idm[] idmVarArr2 = (idm[]) this.f.get(idoVar2);
                if (idmVarArr2 == null || idoVar2 == idd.UNKNOWN) {
                    lvw.e(new cae(idmVarArr2, 13));
                } else {
                    int length = idmVarArr2.length;
                    int i3 = 0;
                    while (i3 < length) {
                        idm idmVar = idmVarArr2[i3];
                        try {
                            if (this.j || !idmVar.s()) {
                                ido idoVar3 = idoVar2;
                                i = length;
                                i2 = i3;
                                j = j3;
                                idoVar = idoVar2;
                                idmVarArr = idmVarArr2;
                                try {
                                    idmVar.p(idoVar3, iduVar, j2, j3, objArr2);
                                } catch (Throwable th) {
                                    th = th;
                                    e(idd.METRICS_PROCESSOR_CRASH_PROCESS, th);
                                    i3 = i2 + 1;
                                    idmVarArr2 = idmVarArr;
                                    length = i;
                                    j3 = j;
                                    idoVar2 = idoVar;
                                }
                            } else {
                                i = length;
                                i2 = i3;
                                j = j3;
                                idoVar = idoVar2;
                                idmVarArr = idmVarArr2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i = length;
                            i2 = i3;
                            j = j3;
                            idoVar = idoVar2;
                            idmVarArr = idmVarArr2;
                        }
                        i3 = i2 + 1;
                        idmVarArr2 = idmVarArr;
                        length = i;
                        j3 = j;
                        idoVar2 = idoVar;
                    }
                    lvw.e(new cae(idmVarArr2, 14));
                }
                ihm ihmVar = ieeVar2.c.d;
                for (Object obj : ieeVar2.b) {
                    if (obj != null && !(obj instanceof Integer) && !(obj instanceof Boolean) && !(obj instanceof Long) && !(obj instanceof String) && !(obj instanceof Double) && !(obj instanceof Float)) {
                        if (obj instanceof gvx) {
                            ((gvx) obj).a();
                        } else if (obj instanceof MotionEvent) {
                            ((MotionEvent) obj).recycle();
                        }
                    }
                }
            }
        }
        this.q = null;
    }

    public final void m(ido idoVar, idu iduVar, Object... objArr) {
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((idoVar.c() || !hsu.f()) && A(idoVar)) {
            if (this.o != null) {
                synchronized (this) {
                    if (this.o != null) {
                        this.o.add(new iee(idoVar, iduVar, currentTimeMillis, elapsedRealtime, objArr, this.v, null, null));
                        return;
                    }
                }
            }
            if (!h(idoVar)) {
                return;
            }
            z(kcu.N(new idx(this, new iee(idoVar, iduVar, currentTimeMillis, elapsedRealtime, objArr, this.v, null, null), 3), k()));
        }
    }

    public final synchronized void n() {
        if (this.o != null && !this.o.isEmpty()) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager", "maybeStopCaching", 437, "MetricsManager.java")).t("Stop caching metrics.");
            List list = this.o;
            if (list != null) {
                z(kcu.N(new idx(this, list, 2), k()));
            }
            this.o = null;
            return;
        }
        this.o = null;
    }

    public final void o(ids idsVar, long j) {
        idr[] idrVarArr = (idr[]) this.g.get(idsVar);
        if (idrVarArr == null || idsVar == idf.a) {
            lvw.e(new cae(idrVarArr, 11));
            return;
        }
        for (idr idrVar : idrVarArr) {
            if (this.j) {
                idrVar.b(idsVar, j);
            } else {
                idrVar.s();
            }
        }
        lvw.e(new cae(idrVarArr, 12));
    }

    public final void p(ids idsVar, long j) {
        if (this.o != null) {
            synchronized (this) {
                if (this.o != null) {
                    this.o.add(new ieg(idsVar, j));
                    return;
                }
            }
        }
        if (this.h.get() > 0 || this.g.get(idsVar) != null) {
            z(kcu.N(new fsm(this, idsVar, j, 4), k()));
        }
    }

    public final synchronized void q() {
        if (this.o == null) {
            this.o = new ArrayList();
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager", "startCaching", 423, "MetricsManager.java")).t("Start caching metrics.");
        }
    }

    public final void r() {
        this.s = ((Long) b.c()).intValue();
        boolean booleanValue = ((Boolean) c.c()).booleanValue();
        if (!this.t.getAndSet(booleanValue) || booleanValue) {
            return;
        }
        this.n.clear();
    }

    public final void u(idj idjVar) {
        v(llp.r(idjVar));
    }

    public final void v(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        this.h.incrementAndGet();
        z(kcu.N(new idx(this, collection, 5), k()));
    }

    public final void x(Class cls) {
        y(llp.r(cls));
    }

    public final void y(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        this.h.incrementAndGet();
        z(kcu.N(new idx(this, collection, 4), k()));
    }

    public static Object[] t(Object[] objArr, Object obj, Object[] objArr2) {
        int length = objArr.length;
        if (length == 1) {
            if (objArr[0] == obj) {
                return null;
            }
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager", "removeProcessorFromArray", 763, "MetricsManager.java")).G("Failed to find %s in map: %s", obj, objArr);
            return objArr;
        }
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (objArr[i] == obj) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager", "removeProcessorFromArray", 776, "MetricsManager.java")).G("Failed to find %s in map: %s", obj, objArr);
            return objArr;
        }
        if (i > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, i);
        }
        if (i < length - 1) {
            System.arraycopy(objArr, i + 1, objArr2, i, (length - i) - 1);
        }
        return objArr2;
    }
}
