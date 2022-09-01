package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bqy  reason: default package */
/* loaded from: classes.dex */
public final class bqy implements idm {
    public static final llw c;
    private int A;
    private int B;
    private idb C;
    public final Context e;
    public final idi f;
    public final ino g;
    String h;
    public String m;
    public boolean n;
    public boolean o;
    final nfh q;
    private Account[] s;
    private final Resources t;
    private int u;
    private float v;
    private int w;
    private float x;
    private int y;
    private int z;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/latin/metrics/LatinMetricsProcessor");
    public static final llw b = llw.m("first_run_pages", mdr.WIZARD_NORMAL_FIRST_RUN, "activation_pages", mdr.WIZARD_ACTIVATION);
    private static final llw r = llw.n("first_run_page_enable", mdq.PAGE_ENABLE_INPUT_METHOD, "first_run_page_select_input_method", mdq.PAGE_SELECT_INPUT_METHOD, "first_run_page_done", mdq.PAGE_DONE);
    public static final llw d = llw.m("first_run_pages", "SetupWizard.AllPages", "activation_pages", "SetupWizard.ActivationPages");
    public final nfh p = mbh.aT.t();
    public mdr j = mdr.WIZARD_UNKNOWN;
    public mdq k = mdq.PAGE_UNKNOWN;
    public mdq l = mdq.PAGE_UNKNOWN;
    public final cpu i = cqh.a().b;

    static {
        mdr mdrVar = mdr.WIZARD_NORMAL_FIRST_RUN;
        mdq mdqVar = mdq.PAGE_ENABLE_INPUT_METHOD;
        mdq mdqVar2 = mdq.PAGE_SELECT_INPUT_METHOD;
        c = llw.m(mdrVar, new mdq[]{mdqVar, mdqVar2, mdq.PAGE_DONE}, mdr.WIZARD_ACTIVATION, new mdq[]{mdqVar, mdqVar2});
    }

    private bqy(Context context, idi idiVar, nfh nfhVar) {
        ino M = ino.M(context);
        this.e = context;
        this.f = idiVar;
        this.q = nfhVar;
        this.g = M;
        hrx.y(context);
        this.t = context.getResources();
    }

    public static mac a(gso gsoVar) {
        nfh t = mac.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mac macVar = (mac) t.b;
        int i = macVar.a | 8;
        macVar.a = i;
        macVar.b = true;
        boolean z = gsoVar.a;
        int i2 = i | 16;
        macVar.a = i2;
        macVar.c = z;
        boolean z2 = gsoVar.b;
        macVar.a = i2 | 64;
        macVar.d = z2;
        return (mac) t.cz();
    }

    public static mad b(int i) {
        double[] dArr = new double[3];
        vo.f(i, dArr);
        Integer valueOf = Integer.valueOf(Color.rgb(255, 182, 144));
        mad madVar = mad.DYNAMIC_COLOR_RED;
        Integer valueOf2 = Integer.valueOf(Color.rgb(101, 221, 145));
        mad madVar2 = mad.DYNAMIC_COLOR_GREEN;
        Integer valueOf3 = Integer.valueOf(Color.rgb(172, 199, 255));
        mad madVar3 = mad.DYNAMIC_COLOR_BLUE;
        Integer valueOf4 = Integer.valueOf(Color.rgb(254, 178, 189));
        mad madVar4 = mad.DYNAMIC_COLOR_MAGENTA;
        Integer valueOf5 = Integer.valueOf(Color.rgb(219, 200, 13));
        mad madVar5 = mad.DYNAMIC_COLOR_YELLOW;
        jez.U(valueOf, madVar);
        jez.U(valueOf2, madVar2);
        jez.U(valueOf3, madVar3);
        jez.U(valueOf4, madVar4);
        jez.U(valueOf5, madVar5);
        double[] dArr2 = new double[3];
        lsz it = lrq.a(5, new Object[]{valueOf, madVar, valueOf2, madVar2, valueOf3, madVar3, valueOf4, madVar4, valueOf5, madVar5}).entrySet().iterator();
        double d2 = Double.MAX_VALUE;
        mad madVar6 = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            vo.f(((Integer) entry.getKey()).intValue(), dArr2);
            double a2 = vo.a(dArr, dArr2);
            if (a2 < d2) {
                madVar6 = (mad) entry.getValue();
                d2 = a2;
            }
        }
        return madVar6;
    }

    public static mdq c(String str) {
        mdq mdqVar = (mdq) r.get(str);
        return mdqVar != null ? mdqVar : mdq.PAGE_UNKNOWN;
    }

    public static void h(ieh iehVar) {
        iehVar.x(bqy.class);
    }

    static final List j(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : lfy.e(" ").i(str)) {
            arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
        }
        return arrayList;
    }

    public static void l(Context context, ieh iehVar, idi idiVar, nfh nfhVar) {
        try {
            iehVar.u(new bqy(context, idiVar, nfhVar));
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/latin/metrics/LatinMetricsProcessor", "addToMetricsManager", (char) 248, "LatinMetricsProcessor.java")).t("Failed to create LatinMetricsProcessor");
            iehVar.e(idd.METRICS_PROCESSOR_CRASH_INIT, e);
        }
    }

    private final idb n() {
        if (this.C == null) {
            this.C = new bqz(this);
        }
        return this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 2480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqy.d(int, java.util.List):void");
    }

    @Override // defpackage.idj
    public final void e() {
        TypedArray obtainStyledAttributes;
        int i;
        this.u = Integer.parseInt(this.t.getString(R.string.f160140_resource_name_obfuscated_res_0x7f14062b));
        TypedArray typedArray = null;
        try {
            obtainStyledAttributes = this.e.getTheme().obtainStyledAttributes(bos.c);
            i = 0;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.w = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.v = obtainStyledAttributes.getFloat(7, 1.0f);
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes.recycle();
            }
            try {
                typedArray = this.e.getTheme().obtainStyledAttributes(bos.a);
                this.y = typedArray.getDimensionPixelSize(9, 0);
                this.x = typedArray.getFloat(11, 1.0f);
                this.z = jam.d(this.e);
                this.B = this.t.getDimensionPixelSize(R.dimen.f34430_resource_name_obfuscated_res_0x7f0701a5);
                int b2 = jbi.b(this.e, "status_bar_height", "dimen", "android", false);
                if (b2 != 0) {
                    i = this.t.getDimensionPixelSize(b2);
                }
                this.A = gvv.h(gvv.k(this.e)).heightPixels - i;
                this.h = jbt.x(this.e, R.string.f163150_resource_name_obfuscated_res_0x7f140768);
            } finally {
                if (typedArray != null) {
                    typedArray.recycle();
                }
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = obtainStyledAttributes;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    @Override // defpackage.idj
    public final void f() {
        this.f.a();
    }

    public final void g(String str) {
        if (this.j == mdr.WIZARD_UNKNOWN && this.k == mdq.PAGE_UNKNOWN) {
            return;
        }
        mdq c2 = c(str);
        if (c2 == mdq.PAGE_DONE && !TextUtils.isEmpty(this.m)) {
            this.f.d(String.valueOf(this.m).concat(".Done"), c2.f);
        }
        boolean z = true;
        boolean z2 = ijt.e(this.e).p().length <= 0;
        nfh t = mbh.aT.t();
        nfh t2 = mds.k.t();
        mdr mdrVar = this.j;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mds mdsVar = (mds) t2.b;
        mdsVar.b = mdrVar.e;
        int i = mdsVar.a | 1;
        mdsVar.a = i;
        mdsVar.c = this.k.f;
        int i2 = i | 2;
        mdsVar.a = i2;
        mdsVar.d = c2.f;
        int i3 = i2 | 4;
        mdsVar.a = i3;
        if (c2 != mdq.PAGE_DONE && c2 != this.l) {
            z = false;
        }
        mdsVar.a = i3 | 8;
        mdsVar.e = z;
        boolean c3 = dcd.c(this.e);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mds mdsVar2 = (mds) t2.b;
        mdsVar2.a |= 16;
        mdsVar2.f = c3;
        boolean d2 = dcd.d(this.e);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mds mdsVar3 = (mds) t2.b;
        int i4 = mdsVar3.a | 32;
        mdsVar3.a = i4;
        mdsVar3.g = d2;
        boolean z3 = this.n;
        int i5 = i4 | 128;
        mdsVar3.a = i5;
        mdsVar3.i = z3;
        boolean z4 = this.o;
        int i6 = i5 | 256;
        mdsVar3.a = i6;
        mdsVar3.j = z4;
        mdsVar3.a = i6 | 64;
        mdsVar3.h = z2;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbh mbhVar = (mbh) t.b;
        mds mdsVar4 = (mds) t2.cz();
        mdsVar4.getClass();
        mbhVar.U = mdsVar4;
        mbhVar.c |= 2;
        m(t, 118);
        this.j = mdr.WIZARD_UNKNOWN;
        mdq mdqVar = mdq.PAGE_UNKNOWN;
        this.k = mdqVar;
        this.l = mdqVar;
        this.m = null;
        this.n = false;
        this.o = false;
    }

    public final boolean i() {
        mfc mfcVar;
        if (!jez.h()) {
            return false;
        }
        fjh a2 = jez.a(this.e);
        if (!a2.e().k()) {
            return false;
        }
        if (!jez.f(this.e)) {
            nfh nfhVar = this.p;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbh mbhVar = (mbh) nfhVar.b;
            mbh mbhVar2 = mbh.aT;
            mbhVar.aF = null;
            mbhVar.d &= -32769;
            return true;
        }
        boolean s = a2.f().s();
        nfh nfhVar2 = this.p;
        nfh t = mfc.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mfc mfcVar2 = (mfc) t.b;
        mfcVar2.a |= 1;
        mfcVar2.b = s;
        boolean d2 = a2.d();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mfc mfcVar3 = (mfc) t.b;
        mfcVar3.a |= 2;
        mfcVar3.c = d2;
        mfc mfcVar4 = (mfc) t.cz();
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        mbh mbhVar3 = (mbh) nfhVar2.b;
        mbh mbhVar4 = mbh.aT;
        mfcVar4.getClass();
        mfc mfcVar5 = mbhVar3.aF;
        if (mfcVar5 != null && mfcVar5 != (mfcVar = mfc.d)) {
            nfh u = mfcVar.u(mfcVar5);
            u.cG(mfcVar4);
            mfcVar4 = (mfc) u.cA();
        }
        mbhVar3.aF = mfcVar4;
        mbhVar3.d |= 32768;
        return true;
    }

    final int k(int i, long j) {
        long o = this.g.o(i, 0L);
        if (o == 0) {
            return 3;
        }
        long days = TimeUnit.MILLISECONDS.toDays(j - o);
        if (days < 1) {
            return 4;
        }
        if (days < 7) {
            return 5;
        }
        return days < 30 ? 6 : 2;
    }

    public final void m(nfh nfhVar, int i) {
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
        this.f.f((mbh) nfhVar.cz(), i, n().c, n().d);
        nfhVar.b = (nfm) nfhVar.b.N(4);
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        n().b(idoVar, iduVar, j, j2, objArr);
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
        n();
        return bqz.a;
    }
}
