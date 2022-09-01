package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ens  reason: default package */
/* loaded from: classes.dex */
public final class ens implements idm {
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessor");
    public long a;
    public long b;
    public final nfh c = mbh.aT.t();
    public final nfh d;
    public idb e;
    private final idi g;

    public ens(idi idiVar) {
        nfh t = med.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        med.b((med) t.b);
        this.d = t;
        this.a = 0L;
        this.b = 0L;
        this.g = idiVar;
    }

    private final idb h() {
        if (this.e == null) {
            this.e = new ent(this);
        }
        return this.e;
    }

    public final void a(boolean z) {
        ido idoVar = h().b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.g.b(b, z);
            } else {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessor", "processBoolHistogramMetrics", 91, "SpellCheckerMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    public final void b(int i) {
        ido idoVar = h().b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.g.d(b, i);
            } else {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessor", "processIntegerHistogramMetrics", 107, "SpellCheckerMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    public final void c(meb mebVar) {
        int i;
        ido idoVar = this.e.b;
        if (!(idoVar instanceof iqu)) {
            return;
        }
        iqu iquVar = iqu.SC_SPELLING_CHECK_REQUEST_GBOARD;
        switch (((iqu) idoVar).ordinal()) {
            case 7:
                i = 4;
                break;
            case 8:
            default:
                return;
            case 9:
                i = 8;
                break;
            case 10:
                i = 9;
                break;
            case 11:
                i = 6;
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                i = 7;
                break;
        }
        nfh nfhVar = this.c;
        nfh t = mec.g.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mec mecVar = (mec) t.b;
        mecVar.c = i - 1;
        int i2 = mecVar.a | 2;
        mecVar.a = i2;
        mecVar.d = mebVar.d;
        mecVar.a = i2 | 4;
        mec mecVar2 = (mec) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mecVar2.getClass();
        mbhVar.k = mecVar2;
        mbhVar.a |= 512;
        d(this.c, 286);
    }

    public final void d(nfh nfhVar, int i) {
        idb idbVar = this.e;
        g(nfhVar, i, idbVar.c, idbVar.d);
    }

    @Override // defpackage.idj
    public final void e() {
    }

    @Override // defpackage.idj
    public final void f() {
    }

    public final void g(nfh nfhVar, int i, long j, long j2) {
        if ((((mbh) nfhVar.b).a & 536870912) == 0) {
            mde mdeVar = ieo.a().a;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbh mbhVar = (mbh) nfhVar.b;
            mdeVar.getClass();
            mbhVar.A = mdeVar;
            mbhVar.a |= 536870912;
        }
        this.g.f((mbh) nfhVar.cz(), i, j, j2);
        nfhVar.b = (nfm) nfhVar.b.N(4);
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        h().b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        h();
        return ent.a;
    }
}
