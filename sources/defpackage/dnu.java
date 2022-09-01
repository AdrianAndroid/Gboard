package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: dnu  reason: default package */
/* loaded from: classes.dex */
public final class dnu implements idm {
    private static final ltg l = ltg.j("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessor");
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public hqt k;
    private final Context m;
    private final dnt n;
    private idl o;
    private int p;
    private final PriorityQueue q;
    public long i = 0;
    public long j = 0;
    private final idb r = new dnv(this);

    public dnu(Context context, idi idiVar) {
        this.p = 0;
        this.m = context;
        this.n = new dnt(context, idiVar);
        if (ino.M(context).al("enable_ondevice_voice", false, false)) {
            this.p = -1;
        }
        this.q = new PriorityQueue(100, new kp(7));
    }

    private final long h(long j) {
        idb idbVar = this.r;
        return idbVar.d - (idbVar.c - j);
    }

    private final void i(mve mveVar, long j) {
        nfh t;
        long j2;
        Iterator it;
        mve mveVar2 = mveVar;
        if (mveVar2 == null) {
            return;
        }
        for (muy muyVar : mveVar2.a) {
            if (!TextUtils.isEmpty(muyVar.a)) {
                dnt dntVar = this.n;
                String str = muyVar.a;
                if (dntVar.b) {
                    dntVar.a.c(str);
                }
            }
        }
        for (muw muwVar : mveVar2.b) {
            String str2 = muwVar.b;
            if (!TextUtils.isEmpty(str2)) {
                dnt dntVar2 = this.n;
                boolean z = muwVar.a;
                if (dntVar2.b) {
                    dntVar2.a.b(str2, z);
                }
            }
        }
        for (mva mvaVar : mveVar2.c) {
            String str3 = mvaVar.b;
            if (!TextUtils.isEmpty(str3)) {
                dnt dntVar3 = this.n;
                int i = mvaVar.a;
                if (dntVar3.b) {
                    dntVar3.a.d(str3, i);
                }
            }
        }
        for (mvb mvbVar : mveVar2.d) {
            String str4 = mvbVar.b;
            if (!TextUtils.isEmpty(str4)) {
                dnt dntVar4 = this.n;
                long j3 = mvbVar.a;
                if (dntVar4.b) {
                    dntVar4.a.e(str4, j3);
                }
            }
        }
        for (Iterator it2 = mveVar2.e.iterator(); it2.hasNext(); it2 = it) {
            mux muxVar = (mux) it2.next();
            int i2 = muxVar.b;
            if (i2 == 7) {
                ieh.j().e(cap.INPUT_CONTEXT_REVERT_AUTO_CORRECT, new Object[0]);
            } else if (i2 == 11) {
                ieh.j().e(cap.INPUT_CONTEXT_WORD_AUTO_CORRECTION, new Object[0]);
            }
            if ((muxVar.a & 2) != 0) {
                mbh mbhVar = muxVar.c;
                if (mbhVar == null) {
                    mbhVar = mbh.aT;
                }
                t = (nfh) mbhVar.N(5);
                t.cG(mbhVar);
            } else {
                t = mbh.aT.t();
            }
            mde mdeVar = ieo.a().b;
            nfh nfhVar = (nfh) mdeVar.N(5);
            nfhVar.cG(mdeVar);
            hqt hqtVar = this.k;
            if (hqtVar != null) {
                String str5 = hqtVar.i().n;
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mde mdeVar2 = (mde) nfhVar.b;
                mde mdeVar3 = mde.i;
                str5.getClass();
                mdeVar2.a |= 4;
                mdeVar2.d = str5;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbh mbhVar2 = (mbh) t.b;
            mde mdeVar4 = (mde) nfhVar.cz();
            mdeVar4.getClass();
            mbhVar2.A = mdeVar4;
            mbhVar2.a |= 536870912;
            int i3 = muxVar.b;
            if (i3 == 3 || i3 == 26 || i3 == 25 || i3 == 4 || i3 == 11 || i3 == 291) {
                j2 = this.j - this.i;
                TimeUnit.MILLISECONDS.toSeconds(j2);
                k();
            } else {
                j2 = 0;
            }
            mbh mbhVar3 = (mbh) t.b;
            int i4 = mbhVar3.a;
            if ((i4 & 2) != 0) {
                mfa mfaVar = mbhVar3.f;
                if (mfaVar == null) {
                    mfaVar = mfa.w;
                }
                nfh nfhVar2 = (nfh) mfaVar.N(5);
                nfhVar2.cG(mfaVar);
                it = it2;
                mes c = ihm.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                mfa mfaVar2 = (mfa) nfhVar2.b;
                c.getClass();
                mfaVar2.s = c;
                mfaVar2.a |= 134217728;
                j();
                if (j2 > 0) {
                    int i5 = (int) j2;
                    if (nfhVar2.c) {
                        nfhVar2.cD();
                        nfhVar2.c = false;
                    }
                    mfa mfaVar3 = (mfa) nfhVar2.b;
                    mfaVar3.a |= 536870912;
                    mfaVar3.u = i5;
                }
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbh mbhVar4 = (mbh) t.b;
                mfa mfaVar4 = (mfa) nfhVar2.cz();
                mfaVar4.getClass();
                mbhVar4.f = mfaVar4;
                mbhVar4.a |= 2;
                int i6 = this.p;
                if (i6 >= 0 && ((mfa) nfhVar2.b).h) {
                    int i7 = i6 + 1;
                    this.p = i7;
                    if (i7 > 10) {
                        ino.K(this.m, null).f("voice_word_commit_number_meets_target", true);
                        this.p = -1;
                    }
                }
            } else {
                it = it2;
                if ((i4 & 64) != 0 && j2 > 0) {
                    mae maeVar = mbhVar3.i;
                    if (maeVar == null) {
                        maeVar = mae.d;
                    }
                    nfh nfhVar3 = (nfh) maeVar.N(5);
                    nfhVar3.cG(maeVar);
                    int i8 = (int) j2;
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    mae maeVar2 = (mae) nfhVar3.b;
                    maeVar2.a |= 512;
                    maeVar2.c = i8;
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mbh mbhVar5 = (mbh) t.b;
                    mae maeVar3 = (mae) nfhVar3.cz();
                    maeVar3.getClass();
                    mbhVar5.i = maeVar3;
                    mbhVar5.a |= 64;
                }
            }
            if (!((Boolean) doa.a.c()).booleanValue() || j == -1) {
                if (((Boolean) doa.b.c()).booleanValue()) {
                    dnt dntVar5 = this.n;
                    mbh mbhVar6 = (mbh) t.cz();
                    int i9 = muxVar.b;
                    long j4 = muxVar.d;
                    dntVar5.a(mbhVar6, i9, j4, h(j4), new chf(this, 5));
                } else {
                    dnt dntVar6 = this.n;
                    mbh mbhVar7 = (mbh) t.cz();
                    int i10 = muxVar.b;
                    idb idbVar = this.r;
                    dntVar6.a(mbhVar7, i10, idbVar.c, idbVar.d, new chf(this, 6));
                }
            } else {
                nfh nfhVar4 = (nfh) muxVar.N(5);
                nfhVar4.cG(muxVar);
                if (nfhVar4.c) {
                    nfhVar4.cD();
                    nfhVar4.c = false;
                }
                mux muxVar2 = (mux) nfhVar4.b;
                muxVar2.a |= 16;
                muxVar2.f = j;
                mbh mbhVar8 = (mbh) t.cz();
                if (nfhVar4.c) {
                    nfhVar4.cD();
                    nfhVar4.c = false;
                }
                mux muxVar3 = (mux) nfhVar4.b;
                mbhVar8.getClass();
                muxVar3.c = mbhVar8;
                muxVar3.a |= 2;
                if (((Boolean) doa.b.c()).booleanValue()) {
                    long j5 = muxVar.d;
                    if (nfhVar4.c) {
                        nfhVar4.cD();
                        nfhVar4.c = false;
                    }
                    mux muxVar4 = (mux) nfhVar4.b;
                    muxVar4.a |= 4;
                    muxVar4.d = j5;
                    long h = h(muxVar.d);
                    if (nfhVar4.c) {
                        nfhVar4.cD();
                        nfhVar4.c = false;
                    }
                    mux muxVar5 = (mux) nfhVar4.b;
                    muxVar5.a |= 8;
                    muxVar5.e = h;
                } else {
                    long j6 = this.r.c;
                    if (nfhVar4.c) {
                        nfhVar4.cD();
                        nfhVar4.c = false;
                    }
                    mux muxVar6 = (mux) nfhVar4.b;
                    int i11 = muxVar6.a | 4;
                    muxVar6.a = i11;
                    muxVar6.d = j6;
                    long j7 = this.r.d;
                    muxVar6.a = i11 | 8;
                    muxVar6.e = j7;
                }
                this.q.add((mux) nfhVar4.cz());
            }
            mveVar2 = mveVar;
        }
        nga ngaVar = mveVar2.f;
        if (ngaVar.isEmpty()) {
            return;
        }
        b(iwc.INPUT_ACTION, ngaVar);
    }

    private final void j() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    private final void k() {
        this.i = 0L;
        this.j = 0L;
    }

    public final void a(long j, boolean z) {
        while (!this.q.isEmpty()) {
            mux muxVar = (mux) this.q.element();
            long j2 = muxVar.f;
            if (j2 > j) {
                return;
            }
            int i = 1;
            if (j2 >= j && true == z) {
                i = 2;
            }
            mbh mbhVar = muxVar.c;
            if (mbhVar == null) {
                mbhVar = mbh.aT;
            }
            nfh nfhVar = (nfh) mbhVar.N(5);
            nfhVar.cG(mbhVar);
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbh mbhVar2 = (mbh) nfhVar.b;
            mbhVar2.aG = i - 1;
            mbhVar2.d |= 65536;
            this.n.a((mbh) nfhVar.cz(), muxVar.b, muxVar.d, muxVar.e, new chf(this, 4));
            this.q.poll();
        }
    }

    public final void b(ido idoVar, Object... objArr) {
        idl idlVar = this.o;
        if (idlVar != null) {
            idlVar.i(idoVar, objArr);
        } else {
            ((ltd) l.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessor", "logMetricsInSitu", 434, "Latin5NativeMetricsProcessor.java")).t("metricsDelegate is not set.");
        }
    }

    public final void c(mvd mvdVar) {
        for (mve mveVar : mvdVar.a) {
            i(mveVar, 0L);
        }
        k();
        if (((Boolean) ifn.e.c()).booleanValue()) {
            j();
        }
        if (((Boolean) doa.a.c()).booleanValue()) {
            while (!this.q.isEmpty()) {
                mux muxVar = (mux) this.q.peek();
                mbh mbhVar = muxVar.c;
                if (mbhVar == null) {
                    mbhVar = mbh.aT;
                }
                nfh nfhVar = (nfh) mbhVar.N(5);
                nfhVar.cG(mbhVar);
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mbh mbhVar2 = (mbh) nfhVar.b;
                mbhVar2.aG = 2;
                mbhVar2.d |= 65536;
                this.n.a((mbh) nfhVar.cz(), muxVar.b, muxVar.d, muxVar.e, new chf(this, 3));
                this.q.poll();
            }
        }
    }

    public final void d(long j, long j2) {
        Delight5Facilitator g = Delight5Facilitator.g();
        if (g == null) {
            return;
        }
        i(g.h.e.a.getMetricsByClientId(j), j2);
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final void f() {
        this.n.a.a();
    }

    public final void g(long j) {
        if (!((Boolean) doa.a.c()).booleanValue()) {
            return;
        }
        a(j, true);
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.r.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final void r(idl idlVar) {
        this.o = idlVar;
    }

    @Override // defpackage.idj
    public final boolean s() {
        return false;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return dnv.a;
    }
}
