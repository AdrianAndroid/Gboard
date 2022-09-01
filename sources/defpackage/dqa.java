package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.inputmethod.CompletionInfo;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dqa  reason: default package */
/* loaded from: classes.dex */
public final class dqa implements idm {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessor");
    final nfh b;
    private final Context c;
    private final idi d;
    private final hqy f;
    private final ino g;
    private final ino h;
    private final Resources j;
    private hqt k;
    private Collection l;
    private int n;
    private idb q;
    private final nfh p = mbh.aT.t();
    private mey e = mey.UNKNOWN;
    private int o = 1;
    private final Set i = new HashSet();
    private final Point m = new Point();

    public dqa(Context context, idi idiVar, nfh nfhVar) {
        ino M = ino.M(context);
        ino K = ino.K(context, null);
        this.c = context;
        this.d = idiVar;
        this.b = nfhVar;
        this.g = M;
        this.h = K;
        this.f = hrx.y(context);
        this.j = context.getResources();
    }

    public static int aK(boolean z, boolean z2, boolean z3, List list, boolean z4) {
        if (z) {
            return 7;
        }
        if (z3) {
            return 8;
        }
        if (z2) {
            return 4;
        }
        return (!list.contains(few.S3) || !z4) ? 1 : 5;
    }

    private final int aL() {
        return (int) Math.ceil(this.g.A(R.string.f161550_resource_name_obfuscated_res_0x7f1406bc, 1.0f) * 100.0f);
    }

    private final int aM() {
        return Math.round(this.g.A(R.string.f161560_resource_name_obfuscated_res_0x7f1406bd, 1.0f) * 100.0f);
    }

    private static int aN(hlg hlgVar) {
        if (!hlgVar.b) {
            return 4;
        }
        return hlgVar.c != 0 ? 1 : 2;
    }

    private static maf aO(CompletionInfo completionInfo) {
        nfh t = maf.o.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maf mafVar = (maf) t.b;
        mafVar.a |= 8;
        mafVar.c = 15;
        int position = completionInfo.getPosition();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maf mafVar2 = (maf) t.b;
        mafVar2.a |= 128;
        mafVar2.f = position;
        int position2 = completionInfo.getPosition();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maf mafVar3 = (maf) t.b;
        mafVar3.a |= 256;
        mafVar3.g = position2;
        return (maf) t.cz();
    }

    private final mbw aP(hqt hqtVar, Collection collection, boolean z) {
        nfh t = mbw.k.t();
        if (hqtVar == null) {
            return (mbw) t.cz();
        }
        Delight5Facilitator g = Delight5Facilitator.g();
        if (g != null) {
            long j = 0;
            for (mvm mvmVar : g.p()) {
                nfh t2 = mcj.e.t();
                String str = mvmVar.g + "-" + mvmVar.h;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mcj mcjVar = (mcj) t2.b;
                int i = mcjVar.a | 1;
                mcjVar.a = i;
                mcjVar.b = str;
                long j2 = mvmVar.j;
                mcjVar.a = i | 2;
                mcjVar.c = j2;
                boolean H = g.H(mvmVar);
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mcj mcjVar2 = (mcj) t2.b;
                mcjVar2.a |= 4;
                mcjVar2.d = H;
                mcj mcjVar3 = (mcj) t2.cz();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbw mbwVar = (mbw) t.b;
                mcjVar3.getClass();
                nga ngaVar = mbwVar.i;
                if (!ngaVar.c()) {
                    mbwVar.i = nfm.H(ngaVar);
                }
                mbwVar.i.add(mcjVar3);
                mvl b = mvl.b(mvmVar.b);
                if (b == null) {
                    b = mvl.UNKNOWN;
                }
                j |= 1 << b.A;
            }
            for (mvm mvmVar2 : g.r()) {
                mvl b2 = mvl.b(mvmVar2.b);
                if (b2 == null) {
                    b2 = mvl.UNKNOWN;
                }
                j |= 1 << b2.A;
            }
            if (j != 0) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbw mbwVar2 = (mbw) t.b;
                mbwVar2.a |= 256;
                mbwVar2.j = j;
            }
        }
        String p = hqtVar.p();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbw mbwVar3 = (mbw) t.b;
        mbwVar3.a |= 2;
        mbwVar3.c = p;
        iav g2 = hqtVar.g();
        if (g2 == null || !g2.e.n.equals("my") || g2.A) {
            String str2 = hqtVar.i().n;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbw mbwVar4 = (mbw) t.b;
            str2.getClass();
            mbwVar4.a |= 1;
            mbwVar4.b = str2;
        } else {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbw mbwVar5 = (mbw) t.b;
            mbwVar5.a |= 1;
            mbwVar5.b = "my-Qaag";
        }
        String str3 = ((mbw) t.b).b;
        if (collection != null) {
            int size = collection.size();
            Iterator it = collection.iterator();
            for (int i2 = 0; i2 < size; i2++) {
                t.di(((jav) it.next()).n);
            }
        }
        if (g2 != null) {
            boolean d = g2.q.d(R.id.f54960_resource_name_obfuscated_res_0x7f0b01d8, false);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbw mbwVar6 = (mbw) t.b;
            mbwVar6.a |= 4;
            mbwVar6.e = d;
        }
        int e = dqc.e(this.c, hqtVar);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbw mbwVar7 = (mbw) t.b;
        mbwVar7.f = e - 1;
        int i3 = mbwVar7.a | 32;
        mbwVar7.a = i3;
        mbwVar7.a = i3 | 64;
        mbwVar7.g = z;
        cdx cdxVar = cdx.a;
        if (cdxVar != null) {
            Locale q = hqtVar.h().q();
            if (cdxVar.c.contains(q)) {
                Locale c = cdxVar.c(q);
                String str4 = c == null ? null : jav.d(c).n;
                if (str4 != null) {
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mbw mbwVar8 = (mbw) t.b;
                    mbwVar8.a |= 128;
                    mbwVar8.h = str4;
                }
            }
        }
        return (mbw) t.cz();
    }

    private final void aQ() {
        this.d.a();
    }

    private final void aR(mfq mfqVar) {
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mfqVar.getClass();
        mbhVar.B = mfqVar;
        mbhVar.a |= 1073741824;
        bi(this.p, 50);
    }

    private final void aS(mbn mbnVar, int i, Throwable th, int i2, int i3) {
        nfh t = mbo.g.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbo mboVar = (mbo) t.b;
        mboVar.b = mbnVar.E;
        int i4 = mboVar.a | 1;
        mboVar.a = i4;
        mboVar.a = i4 | 2;
        mboVar.c = i;
        if (th != null) {
            String simpleName = th.getClass().getSimpleName();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbo mboVar2 = (mbo) t.b;
            simpleName.getClass();
            mboVar2.a |= 4;
            mboVar2.d = simpleName;
        }
        mbo mboVar3 = (mbo) t.b;
        int i5 = mboVar3.a | 8;
        mboVar3.a = i5;
        mboVar3.e = i2;
        mboVar3.a = i5 | 16;
        mboVar3.f = i3;
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbo mboVar4 = (mbo) t.cz();
        mbh mbhVar2 = mbh.aT;
        mboVar4.getClass();
        mbhVar.Y = mboVar4;
        mbhVar.c |= 512;
        bi(this.p, 149);
    }

    private final void aT() {
        nfh nfhVar = this.b;
        boolean x = this.g.x(R.string.f161180_resource_name_obfuscated_res_0x7f140696, false);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mcc mccVar = (mcc) nfhVar.b;
        mcc mccVar2 = mcc.aB;
        mccVar.b |= 134217728;
        mccVar.T = x;
        if (((Boolean) hwq.d.c()).booleanValue()) {
            nfh nfhVar2 = this.b;
            boolean x2 = this.g.x(R.string.f161210_resource_name_obfuscated_res_0x7f140699, true);
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            mcc mccVar3 = (mcc) nfhVar2.b;
            mccVar3.b |= 268435456;
            mccVar3.U = x2;
        }
        if (((Boolean) hwq.c.c()).booleanValue()) {
            nfh nfhVar3 = this.b;
            boolean x3 = this.g.x(R.string.f161190_resource_name_obfuscated_res_0x7f140697, true);
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            mcc mccVar4 = (mcc) nfhVar3.b;
            mccVar4.b |= 536870912;
            mccVar4.V = x3;
        }
        if (((Boolean) hwq.b.c()).booleanValue()) {
            nfh nfhVar4 = this.b;
            boolean x4 = this.g.x(R.string.f161200_resource_name_obfuscated_res_0x7f140698, true);
            if (nfhVar4.c) {
                nfhVar4.cD();
                nfhVar4.c = false;
            }
            mcc mccVar5 = (mcc) nfhVar4.b;
            mccVar5.b |= 1073741824;
            mccVar5.W = x4;
        }
    }

    private final void aU() {
        int b = jbi.b(this.c, "navigation_bar_height", "dimen", "android", false);
        int dimensionPixelSize = b != 0 ? this.c.getResources().getDimensionPixelSize(b) : -1;
        int d = hwa.d(this.c, iau.SOFT, hwa.g(this.c));
        ((DisplayManager) this.c.getSystemService("display")).getDisplay(0).getRealSize(this.m);
        nfh nfhVar = this.b;
        float c = jam.c(this.c);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mcc mccVar = (mcc) nfhVar.b;
        mcc mccVar2 = mcc.aB;
        mccVar.c |= 131072;
        mccVar.an = c;
        nfh nfhVar2 = this.b;
        float g = jam.g(this.c);
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        mcc mccVar3 = (mcc) nfhVar2.b;
        mccVar3.c |= 262144;
        mccVar3.ao = g;
        nfh nfhVar3 = this.b;
        int i = this.m.x;
        if (nfhVar3.c) {
            nfhVar3.cD();
            nfhVar3.c = false;
        }
        mcc mccVar4 = (mcc) nfhVar3.b;
        mccVar4.c |= 16;
        mccVar4.ac = i;
        nfh nfhVar4 = this.b;
        int i2 = this.m.y;
        if (nfhVar4.c) {
            nfhVar4.cD();
            nfhVar4.c = false;
        }
        mcc mccVar5 = (mcc) nfhVar4.b;
        mccVar5.c |= 8;
        mccVar5.ab = i2;
        nfh nfhVar5 = this.b;
        if (nfhVar5.c) {
            nfhVar5.cD();
            nfhVar5.c = false;
        }
        mcc mccVar6 = (mcc) nfhVar5.b;
        mccVar6.c |= 4;
        mccVar6.aa = dimensionPixelSize;
        nfh nfhVar6 = this.b;
        if (nfhVar6.c) {
            nfhVar6.cD();
            nfhVar6.c = false;
        }
        mcc mccVar7 = (mcc) nfhVar6.b;
        mccVar7.c |= 2;
        mccVar7.Z = d;
        nfh nfhVar7 = this.b;
        boolean z = true;
        int b2 = this.g.b(true != jam.r(this.c) ? "normal_mode_keyboard_bottom_gap_portrait" : "normal_mode_keyboard_bottom_gap_landscape", -1);
        if (nfhVar7.c) {
            nfhVar7.cD();
            nfhVar7.c = false;
        }
        mcc mccVar8 = (mcc) nfhVar7.b;
        mccVar8.c |= 1;
        mccVar8.Y = b2;
        nfh nfhVar8 = this.b;
        int b3 = this.g.b(true != jam.r(this.c) ? "normal_mode_decor_view_stable_inset_bottom_portrait" : "normal_mode_decor_view_stable_inset_bottom_landscape", -1);
        if (nfhVar8.c) {
            nfhVar8.cD();
            nfhVar8.c = false;
        }
        mcc mccVar9 = (mcc) nfhVar8.b;
        mccVar9.c |= 1048576;
        mccVar9.ap = b3;
        boolean al = this.g.al("normal_mode_keyboard_qualified_to_higher_keyboard", false, false);
        nfh nfhVar9 = this.b;
        if (nfhVar9.c) {
            nfhVar9.cD();
            nfhVar9.c = false;
        }
        mcc mccVar10 = (mcc) nfhVar9.b;
        mccVar10.c |= 64;
        mccVar10.ae = al;
        nfh nfhVar10 = this.b;
        if (!al || ((Double) hwq.g.c()).doubleValue() <= 0.0d) {
            z = false;
        }
        if (nfhVar10.c) {
            nfhVar10.cD();
            nfhVar10.c = false;
        }
        mcc mccVar11 = (mcc) nfhVar10.b;
        mccVar11.c |= 32;
        mccVar11.ad = z;
    }

    private final void aV(hqt hqtVar, Collection collection) {
        nfh nfhVar = this.b;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mcc mccVar = (mcc) nfhVar.b;
        mcc mccVar2 = mcc.aB;
        mccVar.E = 1;
        mccVar.b |= 8;
        if (hqtVar != null && !hqtVar.l().isEmpty()) {
            if (collection == null || collection.isEmpty()) {
                nfh nfhVar2 = this.b;
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                mcc mccVar3 = (mcc) nfhVar2.b;
                mccVar3.E = 2;
                mccVar3.b |= 8;
                return;
            }
            nfh nfhVar3 = this.b;
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            mcc mccVar4 = (mcc) nfhVar3.b;
            mccVar4.E = 3;
            mccVar4.b |= 8;
        }
    }

    private final void aW(mvi mviVar) {
        nfh t = mdm.g.t();
        if (mviVar.c) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mdm mdmVar = (mdm) t.b;
            mdmVar.a |= 1;
            mdmVar.b = true;
        }
        if (mviVar.i) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mdm mdmVar2 = (mdm) t.b;
            mdmVar2.a |= 2;
            mdmVar2.c = true;
        }
        if (mviVar.E) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mdm mdmVar3 = (mdm) t.b;
            mdmVar3.a |= 8;
            mdmVar3.e = true;
        }
        if (mviVar.J) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mdm mdmVar4 = (mdm) t.b;
            mdmVar4.a |= 16;
            mdmVar4.f = true;
        }
        if (mviVar.H) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mdm mdmVar5 = (mdm) t.b;
            mdmVar5.a |= 4;
            mdmVar5.d = true;
        }
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mdm mdmVar6 = (mdm) t.cz();
        mbh mbhVar2 = mbh.aT;
        mdmVar6.getClass();
        mbhVar.S = mdmVar6;
        mbhVar.b |= 1073741824;
    }

    private final void aX(Configuration configuration) {
        nfh nfhVar = this.b;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mcc mccVar = mcc.aB;
        ((mcc) nfhVar.b).at = nfm.G();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            for (int i = 0; i < locales.size(); i++) {
                this.b.dj(locales.get(i).toLanguageTag());
            }
            return;
        }
        this.b.dj(configuration.locale.toLanguageTag());
    }

    private final boolean aY() {
        return this.g.E(R.string.f162210_resource_name_obfuscated_res_0x7f1406fe) != this.n;
    }

    private final boolean aZ() {
        mcc mccVar = (mcc) this.b.b;
        boolean z = mccVar.s;
        boolean z2 = mccVar.H;
        boolean aj = this.g.aj(R.string.f162520_resource_name_obfuscated_res_0x7f14071d);
        boolean aj2 = this.g.aj(R.string.f162510_resource_name_obfuscated_res_0x7f14071c);
        nfh nfhVar = this.b;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mcc mccVar2 = (mcc) nfhVar.b;
        mccVar2.a |= 32768;
        mccVar2.s = aj;
        nfh nfhVar2 = this.b;
        boolean z3 = this.f.p() && aj && !aj2;
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        mcc mccVar3 = (mcc) nfhVar2.b;
        mccVar3.a |= 65536;
        mccVar3.t = z3;
        nfh nfhVar3 = this.b;
        if (nfhVar3.c) {
            nfhVar3.cD();
            nfhVar3.c = false;
        }
        mcc mccVar4 = (mcc) nfhVar3.b;
        mccVar4.b |= 64;
        mccVar4.H = aj2;
        nfh nfhVar4 = this.b;
        boolean z4 = aj2 || jam.A(this.c);
        if (nfhVar4.c) {
            nfhVar4.cD();
            nfhVar4.c = false;
        }
        mcc mccVar5 = (mcc) nfhVar4.b;
        mccVar5.b |= 128;
        mccVar5.I = z4;
        mcc mccVar6 = (mcc) this.b.b;
        return (z == mccVar6.s && z2 == mccVar6.H) ? false : true;
    }

    private static mbx ba(hqt hqtVar) {
        nfh t = mbx.c.t();
        if (hqtVar == null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbx mbxVar = (mbx) t.b;
            mbxVar.b = 0;
            mbxVar.a = 1 | mbxVar.a;
        } else if ("handwriting".equals(hqtVar.p())) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbx mbxVar2 = (mbx) t.b;
            mbxVar2.b = 2;
            mbxVar2.a = 1 | mbxVar2.a;
        } else {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbx mbxVar3 = (mbx) t.b;
            mbxVar3.b = 1;
            mbxVar3.a = 1 | mbxVar3.a;
        }
        return (mbx) t.cz();
    }

    private final void bb(int i, mbx mbxVar, mbw mbwVar, int i2) {
        aQ();
        nfh t = mbh.aT.t();
        nfh t2 = mby.f.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mby mbyVar = (mby) t2.b;
        mbyVar.b = i - 1;
        int i3 = mbyVar.a | 1;
        mbyVar.a = i3;
        if (mbxVar != null) {
            mbyVar.d = mbxVar;
            i3 |= 4;
            mbyVar.a = i3;
        }
        if (mbwVar != null) {
            mbyVar.c = mbwVar;
            mbyVar.a = i3 | 2;
        }
        if (i2 != 1) {
            mby mbyVar2 = (mby) t2.b;
            mbyVar2.e = i2 - 1;
            mbyVar2.a |= 8;
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbh mbhVar = (mbh) t.b;
        mby mbyVar3 = (mby) t2.cz();
        mbyVar3.getClass();
        mbhVar.P = mbyVar3;
        mbhVar.b |= 134217728;
        mde mdeVar = ieo.a().b;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbh mbhVar2 = (mbh) t.b;
        mdeVar.getClass();
        mbhVar2.A = mdeVar;
        mbhVar2.a |= 536870912;
        bi(t, 110);
    }

    private final void bc(int i, jav javVar) {
        nfh t = mci.e.t();
        if (javVar != null) {
            String str = javVar.n;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mci mciVar = (mci) t.b;
            str.getClass();
            mciVar.a |= 1;
            mciVar.b = str;
        }
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mci mciVar2 = (mci) t.cz();
        mbh mbhVar2 = mbh.aT;
        mciVar2.getClass();
        mbhVar.y = mciVar2;
        mbhVar.a |= 134217728;
        bi(this.p, i);
    }

    private final void bd(mev mevVar, int i, int i2, int i3) {
        nfh t = mew.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mew mewVar = (mew) t.b;
        mewVar.b = mevVar.d;
        int i4 = mewVar.a | 1;
        mewVar.a = i4;
        int i5 = i4 | 2;
        mewVar.a = i5;
        mewVar.c = i;
        mewVar.a = i5 | 4;
        mewVar.d = i2;
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mew mewVar2 = (mew) t.cz();
        mbh mbhVar2 = mbh.aT;
        mewVar2.getClass();
        mbhVar.aE = mewVar2;
        mbhVar.d |= 16384;
        bi(this.p, i3);
    }

    private static void be(nfh nfhVar) {
        int g = dpy.g(hyq.f());
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mcc mccVar = (mcc) nfhVar.b;
        mcc mccVar2 = mcc.aB;
        mccVar.O = g - 1;
        mccVar.b |= 2097152;
    }

    private static nfh bf(int i, String str) {
        nfh t = mfp.c.t();
        if (str != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ((mfp) t.b).a = str;
        }
        nfh t2 = mfq.g.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ((mfq) t2.b).a = lxj.q(i);
        mfp mfpVar = (mfp) t.cz();
        mfpVar.getClass();
        ((mfq) t2.b).b = mfpVar;
        return t2;
    }

    private static nfh bg(int i, String str, String str2, String str3, int i2) {
        nfh t = mfp.c.t();
        if (str != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ((mfp) t.b).a = str;
        }
        nfh t2 = mfn.c.t();
        if (str3 != null) {
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            ((mfn) t2.b).a = str3;
        }
        String num = Integer.toString(i2, 10);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        num.getClass();
        ((mfn) t2.b).b = num;
        nfh t3 = mfo.c.t();
        if (str2 != null) {
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            ((mfo) t3.b).a = str2;
        }
        nfh t4 = mfq.g.t();
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        ((mfq) t4.b).a = lxj.q(i);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mfn mfnVar = (mfn) t2.cz();
        mfnVar.getClass();
        ((mfp) t.b).b = mfnVar;
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        mfp mfpVar = (mfp) t.cz();
        mfpVar.getClass();
        ((mfq) t4.b).b = mfpVar;
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        mfo mfoVar = (mfo) t3.cz();
        mfoVar.getClass();
        ((mfq) t4.b).c = mfoVar;
        return t4;
    }

    private static nfh bh(int i, String str, String str2, String str3, int i2, long j) {
        nfh t;
        nfh bg = bg(i, str, str2, str3, i2);
        mfo mfoVar = ((mfq) bg.b).c;
        if (mfoVar == null) {
            t = mfo.c.t();
        } else {
            t = mfo.c.u(mfoVar);
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mfo) t.b).b = j;
        if (bg.c) {
            bg.cD();
            bg.c = false;
        }
        mfo mfoVar2 = (mfo) t.cz();
        mfoVar2.getClass();
        ((mfq) bg.b).c = mfoVar2;
        return bg;
    }

    private final void bi(nfh nfhVar, int i) {
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
        this.d.f((mbh) nfhVar.cz(), i, bj().c, bj().d);
        nfhVar.b = (nfm) nfhVar.b.N(4);
    }

    private final idb bj() {
        if (this.q == null) {
            this.q = new dqb(this);
        }
        return this.q;
    }

    public final void A(int i) {
        nfh nfhVar = this.p;
        nfh t = mci.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mci mciVar = (mci) t.b;
        mciVar.a |= 2;
        mciVar.c = i;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mci mciVar2 = (mci) t.cz();
        mbh mbhVar2 = mbh.aT;
        mciVar2.getClass();
        mbhVar.y = mciVar2;
        mbhVar.a |= 134217728;
        bi(this.p, 84);
    }

    public final void B(jav javVar) {
        bc(98, javVar);
    }

    public final void C(jav javVar) {
        bc(80, javVar);
    }

    public final void D(jav javVar) {
        bc(97, javVar);
    }

    public final void E(jav javVar) {
        bc(96, javVar);
    }

    public final void F(jav javVar) {
        bc(79, javVar);
    }

    public final void G(List list) {
        if (list == null) {
            return;
        }
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        nga ngaVar = mbhVar.an;
        if (!ngaVar.c()) {
            mbhVar.an = nfm.H(ngaVar);
        }
        ndt.cs(list, mbhVar.an);
        bi(this.p, 197);
    }

    public final void H(int i, String str, String str2, String str3, String str4) {
        this.d.d("LMLoader.Failed", i);
        nfh nfhVar = this.p;
        nfh t = mao.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mao maoVar = (mao) t.b;
        str.getClass();
        int i2 = maoVar.a | 2;
        maoVar.a = i2;
        maoVar.b = str;
        str2.getClass();
        int i3 = i2 | 4;
        maoVar.a = i3;
        maoVar.c = str2;
        str3.getClass();
        int i4 = i3 | 8;
        maoVar.a = i4;
        maoVar.d = str3;
        str4.getClass();
        maoVar.a = i4 | 16;
        maoVar.e = str4;
        mao maoVar2 = (mao) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        maoVar2.getClass();
        mbhVar.aB = maoVar2;
        mbhVar.d |= 2048;
        bi(this.p, 259);
    }

    public final void I(jav javVar) {
        bc(45, javVar);
    }

    public final void J(int i, boolean z) {
        this.o = z ? 4 : (i & 1) == 1 ? 2 : 3;
    }

    public final void K(int i, String str, float f, float f2, float f3, float f4) {
        nfh t = mcv.h.t();
        nfh nfhVar = this.p;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mcv mcvVar = (mcv) t.b;
        int i2 = mcvVar.a | 32;
        mcvVar.a = i2;
        mcvVar.g = i;
        str.getClass();
        int i3 = i2 | 1;
        mcvVar.a = i3;
        mcvVar.b = str;
        int i4 = i3 | 2;
        mcvVar.a = i4;
        mcvVar.c = f;
        int i5 = i4 | 4;
        mcvVar.a = i5;
        mcvVar.d = f2;
        int i6 = i5 | 8;
        mcvVar.a = i6;
        mcvVar.e = f3;
        mcvVar.a = i6 | 16;
        mcvVar.f = f4;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mcv mcvVar2 = (mcv) t.cz();
        mbh mbhVar2 = mbh.aT;
        mcvVar2.getClass();
        mbhVar.az = mcvVar2;
        mbhVar.d |= 512;
        bi(this.p, 252);
    }

    public final void L() {
        bi(this.p, 255);
    }

    public final void M() {
        bi(this.p, 253);
    }

    public final void N() {
        bi(this.p, 254);
    }

    public final void O(mcy mcyVar, jav javVar, int i, int i2) {
        nfh nfhVar = this.p;
        nfh t = mcz.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mcz mczVar = (mcz) t.b;
        mczVar.b = mcyVar.d;
        int i3 = mczVar.a | 1;
        mczVar.a = i3;
        String str = javVar.n;
        str.getClass();
        int i4 = i3 | 2;
        mczVar.a = i4;
        mczVar.c = str;
        int i5 = i4 | 4;
        mczVar.a = i5;
        mczVar.d = i;
        mczVar.a = i5 | 8;
        mczVar.e = i2;
        mcz mczVar2 = (mcz) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mczVar2.getClass();
        mbhVar.ag = mczVar2;
        mbhVar.c |= 524288;
        bi(this.p, 176);
    }

    public final void P(int i) {
        if (!((Boolean) dpz.a.c()).booleanValue()) {
            return;
        }
        nfh t = mbv.c.t();
        if (lxj.l(i) != 0) {
            int l = lxj.l(i);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbv mbvVar = (mbv) t.b;
            int i2 = l - 1;
            if (l == 0) {
                throw null;
            }
            mbvVar.b = i2;
            mbvVar.a |= 1;
        } else {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbv mbvVar2 = (mbv) t.b;
            mbvVar2.b = 0;
            mbvVar2.a |= 1;
        }
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbv mbvVar3 = (mbv) t.cz();
        mbh mbhVar2 = mbh.aT;
        mbvVar3.getClass();
        mbhVar.aC = mbvVar3;
        mbhVar.d |= 8192;
        bi(this.p, 262);
    }

    public final void Q(mvi mviVar) {
        if (mviVar != null) {
            aW(mviVar);
            bi(this.p, 264);
        }
    }

    public final void R(int i, int i2) {
        nfh t = mdn.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdn mdnVar = (mdn) t.b;
        mdnVar.a |= 1;
        mdnVar.b = i;
        if (mhb.h(i2) != 0) {
            int h = mhb.h(i2);
            mdn mdnVar2 = (mdn) t.b;
            int i3 = h - 1;
            if (h == 0) {
                throw null;
            }
            mdnVar2.c = i3;
            mdnVar2.a |= 2;
        } else {
            mdn mdnVar3 = (mdn) t.b;
            mdnVar3.c = 0;
            mdnVar3.a |= 2;
        }
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mdn mdnVar4 = (mdn) t.cz();
        mbh mbhVar2 = mbh.aT;
        mdnVar4.getClass();
        mbhVar.ap = mdnVar4;
        mbhVar.c |= 1073741824;
        bi(this.p, 219);
    }

    public final void S(int i, int i2) {
        nfh t = mdn.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdn mdnVar = (mdn) t.b;
        mdnVar.a |= 1;
        mdnVar.b = i;
        if (mhb.h(i2) != 0) {
            int h = mhb.h(i2);
            mdn mdnVar2 = (mdn) t.b;
            int i3 = h - 1;
            if (h == 0) {
                throw null;
            }
            mdnVar2.c = i3;
            mdnVar2.a |= 2;
        } else {
            mdn mdnVar3 = (mdn) t.b;
            mdnVar3.c = 0;
            mdnVar3.a |= 2;
        }
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mdn mdnVar4 = (mdn) t.cz();
        mbh mbhVar2 = mbh.aT;
        mdnVar4.getClass();
        mbhVar.ap = mdnVar4;
        mbhVar.c |= 1073741824;
        bi(this.p, 218);
    }

    public final void T() {
        bi(this.p, 215);
    }

    public final void U(int i) {
        nfh t = mdn.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdn mdnVar = (mdn) t.b;
        mdnVar.a |= 1;
        mdnVar.b = i;
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mdn mdnVar2 = (mdn) t.cz();
        mbh mbhVar2 = mbh.aT;
        mdnVar2.getClass();
        mbhVar.ap = mdnVar2;
        mbhVar.c |= 1073741824;
        bi(this.p, 216);
    }

    public final void V(String str, String str2) {
        nfh t = mdn.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdn mdnVar = (mdn) t.b;
        str.getClass();
        int i = mdnVar.a | 4;
        mdnVar.a = i;
        mdnVar.d = str;
        str2.getClass();
        mdnVar.a = i | 8;
        mdnVar.e = str2;
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mdn mdnVar2 = (mdn) t.cz();
        mbh mbhVar2 = mbh.aT;
        mdnVar2.getClass();
        mbhVar.ap = mdnVar2;
        mbhVar.c |= 1073741824;
        bi(this.p, 217);
    }

    public final void W(int i) {
        nfh nfhVar = this.p;
        nfh t = mae.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mae maeVar = (mae) t.b;
        maeVar.a |= 1;
        maeVar.b = i;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mae maeVar2 = (mae) t.cz();
        mbh mbhVar2 = mbh.aT;
        maeVar2.getClass();
        mbhVar.i = maeVar2;
        mbhVar.a |= 64;
        bi(this.p, 31);
    }

    public final void X() {
        bi(this.p, 33);
    }

    public final void Y() {
        bi(this.p, 30);
    }

    public final void Z(int i) {
        nfh t;
        if (i < 0) {
            return;
        }
        mbh mbhVar = (mbh) this.p.b;
        if ((mbhVar.a & 16384) == 0) {
            t = mdp.c.t();
        } else {
            mdp mdpVar = mbhVar.o;
            if (mdpVar == null) {
                mdpVar = mdp.c;
            }
            t = mdp.c.u(mdpVar);
        }
        if (mhb.g(i) != 0) {
            int g = mhb.g(i);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mdp mdpVar2 = (mdp) t.b;
            int i2 = g - 1;
            if (g == 0) {
                throw null;
            }
            mdpVar2.b = i2;
            mdpVar2.a |= 1;
        }
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar2 = (mbh) nfhVar.b;
        mdp mdpVar3 = (mdp) t.cz();
        mdpVar3.getClass();
        mbhVar2.o = mdpVar3;
        mbhVar2.a |= 16384;
        bi(this.p, 18);
    }

    public final void a(mty mtyVar) {
        nfh t;
        int i;
        if (mtyVar != null) {
            if (mtyVar.c.size() == 0) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessor", "setSuggestionProposedMetadata", 1397, "LatinCommonMetricsProcessor.java")).t("Must have at least one suggestion.");
            } else {
                mbh mbhVar = (mbh) this.p.b;
                if ((mbhVar.a & 32) == 0) {
                    t = mcf.k.t();
                } else {
                    mcf mcfVar = mbhVar.h;
                    if (mcfVar == null) {
                        mcfVar = mcf.k;
                    }
                    t = (nfh) mcfVar.N(5);
                    t.cG(mcfVar);
                }
                int min = Math.min(mtyVar.c.size(), ((Long) dca.a.c()).intValue());
                int i2 = 0;
                while (true) {
                    i = 1;
                    if (i2 >= min) {
                        break;
                    }
                    nfh t2 = maf.o.t();
                    int i3 = ((mse) mtyVar.c.get(i2)).f;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    maf mafVar = (maf) t2.b;
                    mafVar.a |= 1;
                    mafVar.b = i3;
                    int b = msc.b(((mse) mtyVar.c.get(i2)).c);
                    if (b == 0) {
                        b = 1;
                    }
                    int i4 = b - 1;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    maf mafVar2 = (maf) t2.b;
                    mafVar2.a |= 8;
                    mafVar2.c = i4;
                    int b2 = msc.b(((mse) mtyVar.c.get(i2)).c);
                    if (b2 == 0) {
                        b2 = 1;
                    }
                    if (((mse) mtyVar.c.get(i2)).k && b2 == 1) {
                        if (((mse) mtyVar.c.get(i2)).l <= 0) {
                            int length = ((mse) mtyVar.c.get(i2)).d.split(" ").length;
                            if (t2.c) {
                                t2.cD();
                                t2.c = false;
                            }
                            maf mafVar3 = (maf) t2.b;
                            mafVar3.a |= 32;
                            mafVar3.d = length;
                        } else {
                            int i5 = ((mse) mtyVar.c.get(i2)).l;
                            if (t2.c) {
                                t2.cD();
                                t2.c = false;
                            }
                            maf mafVar4 = (maf) t2.b;
                            mafVar4.a |= 32;
                            mafVar4.d = i5;
                        }
                    }
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mcf mcfVar2 = (mcf) t.b;
                    maf mafVar5 = (maf) t2.cz();
                    mafVar5.getClass();
                    mcfVar2.b();
                    mcfVar2.g.add(mafVar5);
                    i2++;
                }
                if ((mtyVar.a & 1) != 0) {
                    int B = jco.B(mtyVar.b);
                    if (B != 0) {
                        i = B;
                    }
                    int i6 = i - 1;
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mcf mcfVar3 = (mcf) t.b;
                    mcfVar3.a |= 8192;
                    mcfVar3.j = i6;
                }
                nfh nfhVar = this.p;
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mbh mbhVar2 = (mbh) nfhVar.b;
                mcf mcfVar4 = (mcf) t.cz();
                mcfVar4.getClass();
                mbhVar2.h = mcfVar4;
                mbhVar2.a |= 32;
            }
            bi(this.p, 41);
        }
    }

    public final void aA(int i, int i2) {
        nfh t = mew.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mew mewVar = (mew) t.b;
        int i3 = mewVar.a | 2;
        mewVar.a = i3;
        mewVar.c = i;
        mewVar.a = i3 | 4;
        mewVar.d = i2;
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mew mewVar2 = (mew) t.cz();
        mbh mbhVar2 = mbh.aT;
        mewVar2.getClass();
        mbhVar.aE = mewVar2;
        mbhVar.d |= 16384;
        bi(this.p, 279);
    }

    public final void aB(int i) {
        nfh t = mew.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mew mewVar = (mew) t.b;
        mewVar.a |= 2;
        mewVar.c = i;
        nfh nfhVar = this.p;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mew mewVar2 = (mew) t.cz();
        mbh mbhVar2 = mbh.aT;
        mewVar2.getClass();
        mbhVar.aE = mewVar2;
        mbhVar.d |= 16384;
        bi(this.p, 280);
    }

    public final void aC(jav javVar, Collection collection, few fewVar, String str, boolean z, int i, int i2, long j, long j2, boolean z2) {
        nfh t;
        this.g.i("pref_key_latest_unified_ime_activation_time", System.currentTimeMillis());
        if (javVar != null || collection != null) {
            nfh nfhVar = this.p;
            nfh t2 = mcs.c.t();
            if (javVar != null) {
                t2.dl(javVar.n);
            }
            if (!hgw.f(collection)) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    jav javVar2 = (jav) it.next();
                    if (javVar2 != null) {
                        t2.dl(javVar2.n);
                    }
                }
            }
            mcs mcsVar = (mcs) t2.cz();
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbh mbhVar = (mbh) nfhVar.b;
            mbh mbhVar2 = mbh.aT;
            mcsVar.getClass();
            mbhVar.v = mcsVar;
            mbhVar.a |= 16777216;
        }
        if (fewVar != null) {
            mbh mbhVar3 = (mbh) this.p.b;
            if ((mbhVar3.b & 4194304) == 0) {
                t = mez.l.t();
            } else {
                mez mezVar = mbhVar3.N;
                if (mezVar == null) {
                    mezVar = mez.l;
                }
                t = mez.l.u(mezVar);
            }
            if (str != null) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mez mezVar2 = (mez) t.b;
                mezVar2.a |= 32;
                mezVar2.e = str;
            }
            if (fewVar == few.ON_DEVICE) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mez mezVar3 = (mez) t.b;
                int i3 = mezVar3.a | 1024;
                mezVar3.a = i3;
                mezVar3.f = z;
                int i4 = i3 | 2048;
                mezVar3.a = i4;
                mezVar3.g = i;
                int i5 = i4 | 4096;
                mezVar3.a = i5;
                mezVar3.h = i2;
                int i6 = i5 | 16384;
                mezVar3.a = i6;
                mezVar3.j = j;
                mezVar3.a = i6 | 32768;
                mezVar3.k = j2;
            }
            if (((Boolean) dpz.b.c()).booleanValue()) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mez mezVar4 = (mez) t.b;
                mezVar4.a |= 8192;
                mezVar4.i = z2;
            }
            nfh nfhVar2 = this.p;
            ise iseVar = ise.FIREBASE_JOB_DISPATCHER;
            isa isaVar = isa.ON_SUCCESS;
            iau iauVar = iau.SOFT;
            int ordinal = fewVar.ordinal();
            int i7 = 1;
            if (ordinal == 1) {
                i7 = 6;
            } else if (ordinal == 2) {
                i7 = 7;
            } else if (ordinal == 3) {
                i7 = 4;
            } else if (ordinal == 4) {
                i7 = 2;
            } else if (ordinal == 5) {
                i7 = 5;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mez mezVar5 = (mez) t.b;
            mezVar5.d = i7 - 1;
            mezVar5.a |= 4;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            mbh mbhVar4 = (mbh) nfhVar2.b;
            mez mezVar6 = (mez) t.cz();
            mezVar6.getClass();
            mbhVar4.N = mezVar6;
            mbhVar4.b |= 4194304;
        }
        bi(this.p, 42);
    }

    public final void aD() {
        bi(this.p, 43);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x04bc, code lost:
        if (r0 == ((defpackage.mcc) r9.b.b).K) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0849, code lost:
        if (r0 == ((defpackage.mcc) r9.b.b).aw) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x091b, code lost:
        if (((defpackage.mcc) r9.b.b).A == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0190, code lost:
        if (r4 == ((defpackage.mcc) r9.b.b).v) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x091f, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x091d, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aE(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 2380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqa.aE(java.lang.String):void");
    }

    public final void aF(int i, long j, long j2, boolean z, boolean z2) {
        nfh nfhVar = this.p;
        nfh t = maa.g.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maa maaVar = (maa) t.b;
        int i2 = maaVar.a | 1;
        maaVar.a = i2;
        maaVar.b = i;
        int i3 = i2 | 2;
        maaVar.a = i3;
        maaVar.c = (int) j;
        int i4 = i3 | 4;
        maaVar.a = i4;
        maaVar.d = (int) j2;
        int i5 = i4 | 8;
        maaVar.a = i5;
        maaVar.e = z;
        maaVar.a = i5 | 16;
        maaVar.f = z2;
        maa maaVar2 = (maa) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        maaVar2.getClass();
        mbhVar.at = maaVar2;
        mbhVar.d |= 8;
        bi(this.p, this.q.b == cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_CLIENT_REQUEST ? 238 : 239);
    }

    public final void aG() {
        bi(this.p, 8);
    }

    public final void aH() {
        nfh nfhVar = this.p;
        nfh nfhVar2 = this.b;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mcc mccVar = (mcc) nfhVar2.cz();
        mbh mbhVar2 = mbh.aT;
        mccVar.getClass();
        mbhVar.e = mccVar;
        mbhVar.a |= 1;
        bi(this.p, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aI(android.view.inputmethod.EditorInfo r11, int r12, boolean r13, defpackage.iau r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqa.aI(android.view.inputmethod.EditorInfo, int, boolean, iau, boolean):void");
    }

    public final void aJ(List list) {
        if (list.isEmpty() || ((hln) list.get(0)).e != hlm.APP_COMPLETION) {
            return;
        }
        nfh nfhVar = this.p;
        nfh t = mcf.k.t();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((hln) it.next()).j;
            if (obj instanceof hlg) {
                maf aO = aO(((hlg) obj).a);
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mcf mcfVar = (mcf) t.b;
                aO.getClass();
                mcfVar.b();
                mcfVar.g.add(aO);
            }
        }
        if (list.isEmpty()) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mcf mcfVar2 = (mcf) t.b;
            int i = mcfVar2.a | 4;
            mcfVar2.a = i;
            mcfVar2.d = 0;
            mcfVar2.a = i | 8192;
            mcfVar2.j = 4;
        } else if (((hln) list.get(0)).j instanceof hlg) {
            hlg hlgVar = (hlg) ((hln) list.get(0)).j;
            int i2 = hlgVar.c;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mcf mcfVar3 = (mcf) t.b;
            mcfVar3.a = 4 | mcfVar3.a;
            mcfVar3.d = i2;
            int aN = aN(hlgVar);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mcf mcfVar4 = (mcf) t.b;
            mcfVar4.a |= 8192;
            mcfVar4.j = aN;
        }
        mcf mcfVar5 = (mcf) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mcfVar5.getClass();
        mbhVar.h = mcfVar5;
        mbhVar.a |= 32;
        bi(this.p, 41);
        Object obj2 = ((hln) list.get(0)).j;
        if (!(obj2 instanceof hlg)) {
            return;
        }
        this.d.e("AppCompletion.Latency", ((hlg) obj2).d);
    }

    public final void aa() {
        aQ();
    }

    public final void ab(mey meyVar) {
        this.e = meyVar;
    }

    public final void ac(String str) {
        aR((mfq) bf(16, str).cz());
    }

    public final void ad(String str) {
        aR((mfq) bf(19, str).cz());
    }

    public final void ae(String str) {
        aR((mfq) bf(18, str).cz());
    }

    public final void af(String str, String str2, String str3, int i, long j, jxy jxyVar) {
        nfh bh = bh(4, str, str2, str3, i, j);
        if (bh.c) {
            bh.cD();
            bh.c = false;
        }
        mfq mfqVar = mfq.g;
        ((mfq) bh.b).e = jxyVar.a();
        aR((mfq) bh.cz());
    }

    public final void ag(String str, String str2, String str3, int i, long j) {
        aR((mfq) bh(6, str, str2, str3, i, j).cz());
    }

    public final void ah(String str, String str2, String str3, int i, Throwable th) {
        nfh bg = bg(9, str, str2, str3, i);
        if (bg.c) {
            bg.cD();
            bg.c = false;
        }
        mfq mfqVar = mfq.g;
        ((mfq) bg.b).f = mfq.G();
        bg.dp(jwc.b(th));
        aR((mfq) bg.cz());
    }

    public final void ai(String str, String str2, String str3, int i, long j, jxy jxyVar) {
        nfh bh = bh(7, str, str2, str3, i, j);
        if (bh.c) {
            bh.cD();
            bh.c = false;
        }
        mfq mfqVar = mfq.g;
        ((mfq) bh.b).e = jxyVar.a();
        aR((mfq) bh.cz());
    }

    public final void aj(String str, String str2, String str3, int i, long j) {
        aR((mfq) bh(8, str, str2, str3, i, j).cz());
    }

    public final void ak(String str, String str2, String str3, int i) {
        aR((mfq) bg(3, str, str2, str3, i).cz());
    }

    public final void al(String str, String str2, String str3, int i, Throwable th) {
        nfh bg = bg(17, str, str2, str3, i);
        if (bg.c) {
            bg.cD();
            bg.c = false;
        }
        mfq mfqVar = mfq.g;
        ((mfq) bg.b).f = mfq.G();
        bg.dp(jwc.b(th));
        aR((mfq) bg.cz());
    }

    public final void am(String str, String str2, String str3, int i) {
        aR((mfq) bg(5, str, str2, str3, i).cz());
    }

    public final void an(String str, String str2, String str3, int i, Throwable th) {
        nfh bg = bg(13, str, str2, str3, i);
        if (bg.c) {
            bg.cD();
            bg.c = false;
        }
        mfq mfqVar = mfq.g;
        ((mfq) bg.b).f = mfq.G();
        bg.dp(jwc.b(th));
        aR((mfq) bg.cz());
    }

    public final void ao(String str, String str2, String str3, int i, jxz jxzVar) {
        nfh bg = bg(11, str, str2, str3, i);
        if (bg.c) {
            bg.cD();
            bg.c = false;
        }
        mfq mfqVar = mfq.g;
        ((mfq) bg.b).d = jxzVar.a();
        aR((mfq) bg.cz());
    }

    public final void ap(String str, String str2, String str3, int i) {
        aR((mfq) bg(10, str, str2, str3, i).cz());
    }

    public final void aq(String str, String str2, String str3, int i, Throwable th) {
        nfh bg = bg(15, str, str2, str3, i);
        if (bg.c) {
            bg.cD();
            bg.c = false;
        }
        mfq mfqVar = mfq.g;
        ((mfq) bg.b).f = mfq.G();
        bg.dp(jwc.b(th));
        aR((mfq) bg.cz());
    }

    public final void ar(String str, String str2, String str3, int i, Throwable th) {
        nfh bg = bg(14, str, str2, str3, i);
        if (bg.c) {
            bg.cD();
            bg.c = false;
        }
        mfq mfqVar = mfq.g;
        ((mfq) bg.b).f = mfq.G();
        bg.dp(jwc.b(th));
        aR((mfq) bg.cz());
    }

    public final void as(boolean z, int i, int i2, boolean z2) {
        nfh nfhVar = this.p;
        nfh t = mem.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mem memVar = (mem) t.b;
        int i3 = memVar.a | 4;
        memVar.a = i3;
        memVar.d = z;
        int i4 = i3 | 2;
        memVar.a = i4;
        memVar.c = i;
        int i5 = i4 | 1;
        memVar.a = i5;
        memVar.b = i2;
        memVar.a = i5 | 8;
        memVar.e = z2;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mem memVar2 = (mem) t.cz();
        mbh mbhVar2 = mbh.aT;
        memVar2.getClass();
        mbhVar.p = memVar2;
        mbhVar.a |= 32768;
        bi(this.p, 19);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void at(java.lang.String r7, int r8, defpackage.isa r9, defpackage.ise r10) {
        /*
            r6 = this;
            nfh r0 = r6.p
            men r1 = defpackage.men.f
            nfh r1 = r1.t()
            boolean r2 = r1.c
            r3 = 0
            if (r2 == 0) goto L12
            r1.cD()
            r1.c = r3
        L12:
            nfm r2 = r1.b
            men r2 = (defpackage.men) r2
            r7.getClass()
            int r4 = r2.a
            r5 = 1
            r4 = r4 | r5
            r2.a = r4
            r2.b = r7
            r7 = 2
            r4 = r4 | r7
            r2.a = r4
            r2.c = r8
            ise r8 = defpackage.ise.FIREBASE_JOB_DISPATCHER
            isa r8 = defpackage.isa.ON_SUCCESS
            few r8 = defpackage.few.AIAI
            iau r8 = defpackage.iau.SOFT
            int r8 = r9.ordinal()
            r9 = 4
            r2 = 3
            if (r8 == 0) goto L48
            if (r8 == r5) goto L46
            if (r8 == r7) goto L44
            if (r8 == r2) goto L42
            if (r8 == r9) goto L40
            goto L48
        L40:
            r8 = 6
            goto L49
        L42:
            r8 = 4
            goto L49
        L44:
            r8 = 3
            goto L49
        L46:
            r8 = 2
            goto L49
        L48:
            r8 = 1
        L49:
            boolean r4 = r1.c
            if (r4 == 0) goto L52
            r1.cD()
            r1.c = r3
        L52:
            nfm r4 = r1.b
            men r4 = (defpackage.men) r4
            int r8 = r8 + (-1)
            r4.d = r8
            int r8 = r4.a
            r8 = r8 | r9
            r4.a = r8
            int r8 = r10.ordinal()
            if (r8 == 0) goto L71
            if (r8 == r5) goto L70
            if (r8 == r7) goto L6e
            if (r8 == r2) goto L6c
            goto L71
        L6c:
            r5 = 4
            goto L71
        L6e:
            r5 = 3
            goto L71
        L70:
            r5 = 2
        L71:
            boolean r7 = r1.c
            if (r7 == 0) goto L7a
            r1.cD()
            r1.c = r3
        L7a:
            nfm r7 = r1.b
            men r7 = (defpackage.men) r7
            int r5 = r5 + (-1)
            r7.e = r5
            int r8 = r7.a
            r8 = r8 | 8
            r7.a = r8
            boolean r7 = r0.c
            if (r7 == 0) goto L91
            r0.cD()
            r0.c = r3
        L91:
            nfm r7 = r0.b
            mbh r7 = (defpackage.mbh) r7
            nfm r8 = r1.cz()
            men r8 = (defpackage.men) r8
            mbh r9 = defpackage.mbh.aT
            r8.getClass()
            r7.K = r8
            int r8 = r7.b
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            r7.b = r8
            nfh r7 = r6.p
            r8 = 78
            r6.bi(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqa.at(java.lang.String, int, isa, ise):void");
    }

    public final void au(hqt hqtVar, Collection collection) {
        this.k = hqtVar;
        this.l = collection;
        aV(hqtVar, collection);
    }

    public final void av(mev mevVar, int i, int i2) {
        bd(mevVar, i, i2, 271);
    }

    public final void aw(mev mevVar, int i, int i2) {
        bd(mevVar, i, i2, 270);
    }

    public final void ax(mev mevVar, int i, int i2) {
        bd(mevVar, i, i2, 269);
    }

    public final void ay(mev mevVar, int i, int i2) {
        bd(mevVar, i, i2, 268);
    }

    public final void az(mev mevVar, int i, int i2) {
        bd(mevVar, i, i2, 267);
    }

    public final void b(int i, mbh mbhVar) {
        if (mbhVar != null) {
            this.d.f(mbhVar, i, bj().c, bj().d);
        }
    }

    public final void c(Configuration configuration) {
        if (configuration != null) {
            aX(configuration);
        }
    }

    public final void d(String str, String str2) {
        int i;
        ido idoVar = this.q.b;
        if (idoVar == dda.DATA_PACKAGE_DOWNLOAD_FAILED) {
            i = 1;
        } else if (idoVar == dda.DOWNLOADED_FILE_OPERATION_FAILED) {
            i = 3;
        } else if (idoVar == dda.DOWNLOADED_FILE_CHECKSUM_ERROR) {
            i = 4;
        } else {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessor", "processDataPackageDownloadFailed", 698, "LatinCommonMetricsProcessor.java")).w("Failed to map metrics type: %s", idoVar);
            i = 0;
        }
        nfh t = mau.e.t();
        if (!TextUtils.isEmpty(str)) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mau mauVar = (mau) t.b;
            str.getClass();
            mauVar.a = 1 | mauVar.a;
            mauVar.b = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mau mauVar2 = (mau) t.b;
            str2.getClass();
            mauVar2.a |= 2;
            mauVar2.c = str2;
        }
        if (i != 0) {
            nfh nfhVar = this.p;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mau mauVar3 = (mau) t.b;
            mauVar3.d = i - 1;
            mauVar3.a |= 8;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbh mbhVar = (mbh) nfhVar.b;
            mau mauVar4 = (mau) t.cz();
            mbh mbhVar2 = mbh.aT;
            mauVar4.getClass();
            mbhVar.F = mauVar4;
            mbhVar.b |= 32;
        }
        bi(this.p, 65);
    }

    @Override // defpackage.idj
    public final void e() {
        hqt b = hqp.b();
        this.k = b;
        if (b != null) {
            this.l = b.k();
        }
        TypedArray obtainTypedArray = this.j.obtainTypedArray(R.array.f1930_resource_name_obfuscated_res_0x7f030060);
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            this.i.add(obtainTypedArray.getString(i));
        }
        obtainTypedArray.recycle();
        this.n = Integer.parseInt(this.j.getString(R.string.f160150_resource_name_obfuscated_res_0x7f14062c));
        nfh nfhVar = this.b;
        boolean aj = this.g.aj(R.string.f160360_resource_name_obfuscated_res_0x7f140641);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mcc mccVar = (mcc) nfhVar.b;
        mcc mccVar2 = mcc.aB;
        mccVar.a |= 2;
        mccVar.g = aj;
        nfh nfhVar2 = this.b;
        boolean aj2 = this.g.aj(R.string.f161650_resource_name_obfuscated_res_0x7f1406c6);
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        mcc mccVar3 = (mcc) nfhVar2.b;
        mccVar3.a |= 1024;
        mccVar3.o = aj2;
        nfh nfhVar3 = this.b;
        boolean aj3 = this.g.aj(R.string.f160400_resource_name_obfuscated_res_0x7f140645);
        if (nfhVar3.c) {
            nfhVar3.cD();
            nfhVar3.c = false;
        }
        mcc mccVar4 = (mcc) nfhVar3.b;
        mccVar4.a |= 2048;
        mccVar4.p = aj3;
        nfh nfhVar4 = this.b;
        boolean aj4 = this.g.aj(R.string.f160740_resource_name_obfuscated_res_0x7f14066a);
        if (nfhVar4.c) {
            nfhVar4.cD();
            nfhVar4.c = false;
        }
        mcc mccVar5 = (mcc) nfhVar4.b;
        mccVar5.a |= 4194304;
        mccVar5.y = aj4;
        nfh nfhVar5 = this.b;
        boolean aj5 = this.g.aj(R.string.f160840_resource_name_obfuscated_res_0x7f140674);
        if (nfhVar5.c) {
            nfhVar5.cD();
            nfhVar5.c = false;
        }
        mcc mccVar6 = (mcc) nfhVar5.b;
        mccVar6.a |= 4096;
        mccVar6.q = aj5;
        nfh nfhVar6 = this.b;
        boolean z = this.g.aj(R.string.f160990_resource_name_obfuscated_res_0x7f140683) || this.g.aj(R.string.f161000_resource_name_obfuscated_res_0x7f140684);
        if (nfhVar6.c) {
            nfhVar6.cD();
            nfhVar6.c = false;
        }
        mcc mccVar7 = (mcc) nfhVar6.b;
        mccVar7.a |= 1073741824;
        mccVar7.A = z;
        nfh nfhVar7 = this.b;
        boolean aj6 = this.g.aj(R.string.f161390_resource_name_obfuscated_res_0x7f1406ab);
        if (nfhVar7.c) {
            nfhVar7.cD();
            nfhVar7.c = false;
        }
        mcc mccVar8 = (mcc) nfhVar7.b;
        mccVar8.a |= 8192;
        mccVar8.r = aj6;
        nfh nfhVar8 = this.b;
        boolean aj7 = this.g.aj(R.string.f161070_resource_name_obfuscated_res_0x7f14068b);
        if (nfhVar8.c) {
            nfhVar8.cD();
            nfhVar8.c = false;
        }
        mcc mccVar9 = (mcc) nfhVar8.b;
        mccVar9.a |= 262144;
        mccVar9.v = aj7;
        nfh nfhVar9 = this.b;
        boolean aj8 = this.g.aj(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
        if (nfhVar9.c) {
            nfhVar9.cD();
            nfhVar9.c = false;
        }
        mcc mccVar10 = (mcc) nfhVar9.b;
        mccVar10.a |= 524288;
        mccVar10.w = aj8;
        nfh nfhVar10 = this.b;
        boolean aj9 = this.g.aj(R.string.f162620_resource_name_obfuscated_res_0x7f140727);
        if (nfhVar10.c) {
            nfhVar10.cD();
            nfhVar10.c = false;
        }
        mcc mccVar11 = (mcc) nfhVar10.b;
        mccVar11.a |= 128;
        mccVar11.m = aj9;
        nfh nfhVar11 = this.b;
        boolean aj10 = this.g.aj(R.string.f162160_resource_name_obfuscated_res_0x7f1406f9);
        if (nfhVar11.c) {
            nfhVar11.cD();
            nfhVar11.c = false;
        }
        mcc mccVar12 = (mcc) nfhVar11.b;
        mccVar12.a |= 131072;
        mccVar12.u = aj10;
        nfh nfhVar12 = this.b;
        boolean aj11 = this.g.aj(R.string.f162280_resource_name_obfuscated_res_0x7f140705);
        if (nfhVar12.c) {
            nfhVar12.cD();
            nfhVar12.c = false;
        }
        mcc mccVar13 = (mcc) nfhVar12.b;
        mccVar13.a |= 1;
        mccVar13.e = aj11;
        nfh nfhVar13 = this.b;
        boolean aj12 = this.g.aj(R.string.f160940_resource_name_obfuscated_res_0x7f14067e);
        if (nfhVar13.c) {
            nfhVar13.cD();
            nfhVar13.c = false;
        }
        mcc mccVar14 = (mcc) nfhVar13.b;
        mccVar14.a |= 32;
        mccVar14.k = aj12;
        nfh nfhVar14 = this.b;
        boolean aj13 = this.g.aj(R.string.f161950_resource_name_obfuscated_res_0x7f1406e4);
        if (nfhVar14.c) {
            nfhVar14.cD();
            nfhVar14.c = false;
        }
        mcc mccVar15 = (mcc) nfhVar14.b;
        mccVar15.a |= 2097152;
        mccVar15.x = aj13;
        nfh nfhVar15 = this.b;
        boolean aj14 = this.g.aj(R.string.f162530_resource_name_obfuscated_res_0x7f14071e);
        if (nfhVar15.c) {
            nfhVar15.cD();
            nfhVar15.c = false;
        }
        mcc mccVar16 = (mcc) nfhVar15.b;
        mccVar16.a |= 8388608;
        mccVar16.z = aj14;
        nfh nfhVar16 = this.b;
        boolean aj15 = this.g.aj(R.string.f161040_resource_name_obfuscated_res_0x7f140688);
        if (nfhVar16.c) {
            nfhVar16.cD();
            nfhVar16.c = false;
        }
        mcc mccVar17 = (mcc) nfhVar16.b;
        mccVar17.a |= 16;
        mccVar17.j = aj15;
        nfh nfhVar17 = this.b;
        boolean aj16 = this.g.aj(R.string.f161460_resource_name_obfuscated_res_0x7f1406b3);
        if (nfhVar17.c) {
            nfhVar17.cD();
            nfhVar17.c = false;
        }
        mcc mccVar18 = (mcc) nfhVar17.b;
        mccVar18.a |= 256;
        mccVar18.n = aj16;
        nfh nfhVar18 = this.b;
        boolean aj17 = this.g.aj(R.string.f160730_resource_name_obfuscated_res_0x7f140669);
        if (nfhVar18.c) {
            nfhVar18.cD();
            nfhVar18.c = false;
        }
        mcc mccVar19 = (mcc) nfhVar18.b;
        mccVar19.a |= 4;
        mccVar19.h = aj17;
        nfh nfhVar19 = this.b;
        boolean aj18 = this.g.aj(R.string.f161090_resource_name_obfuscated_res_0x7f14068d);
        if (nfhVar19.c) {
            nfhVar19.cD();
            nfhVar19.c = false;
        }
        mcc mccVar20 = (mcc) nfhVar19.b;
        mccVar20.a |= 8;
        mccVar20.i = aj18;
        nfh nfhVar20 = this.b;
        boolean aj19 = this.g.aj(R.string.f161110_resource_name_obfuscated_res_0x7f14068f);
        if (nfhVar20.c) {
            nfhVar20.cD();
            nfhVar20.c = false;
        }
        mcc mccVar21 = (mcc) nfhVar20.b;
        mccVar21.a |= 64;
        mccVar21.l = aj19;
        nfh nfhVar21 = this.b;
        boolean aj20 = this.g.aj(R.string.f160700_resource_name_obfuscated_res_0x7f140666);
        if (nfhVar21.c) {
            nfhVar21.cD();
            nfhVar21.c = false;
        }
        mcc mccVar22 = (mcc) nfhVar21.b;
        mccVar22.b |= 524288;
        mccVar22.M = aj20;
        nfh nfhVar22 = this.b;
        boolean aj21 = this.g.aj(R.string.f160910_resource_name_obfuscated_res_0x7f14067b);
        if (nfhVar22.c) {
            nfhVar22.cD();
            nfhVar22.c = false;
        }
        mcc mccVar23 = (mcc) nfhVar22.b;
        mccVar23.b |= 1048576;
        mccVar23.N = aj21;
        if (((Boolean) enl.a.c()).booleanValue()) {
            nfh nfhVar23 = this.b;
            boolean aj22 = this.g.aj(R.string.f160850_resource_name_obfuscated_res_0x7f140675);
            if (nfhVar23.c) {
                nfhVar23.cD();
                nfhVar23.c = false;
            }
            mcc mccVar24 = (mcc) nfhVar23.b;
            mccVar24.c |= 8388608;
            mccVar24.aq = aj22;
        }
        nfh nfhVar24 = this.b;
        boolean ak = this.g.ak("pref_key_enable_inline_suggestion");
        if (nfhVar24.c) {
            nfhVar24.cD();
            nfhVar24.c = false;
        }
        mcc mccVar25 = (mcc) nfhVar24.b;
        mccVar25.c |= 2048;
        mccVar25.aj = ak;
        nfh nfhVar25 = this.b;
        int aK = aK(this.g.x(R.string.f161100_resource_name_obfuscated_res_0x7f14068e, false), this.h.x(R.string.f162750_resource_name_obfuscated_res_0x7f140735, false), this.h.x(R.string.f162760_resource_name_obfuscated_res_0x7f140736, false), fby.b(this.h), fby.l(this.c, this.h));
        if (nfhVar25.c) {
            nfhVar25.cD();
            nfhVar25.c = false;
        }
        mcc mccVar26 = (mcc) nfhVar25.b;
        mccVar26.am = aK - 1;
        mccVar26.c |= 65536;
        nfh nfhVar26 = this.b;
        boolean aj23 = this.g.aj(R.string.f160780_resource_name_obfuscated_res_0x7f14066e);
        if (nfhVar26.c) {
            nfhVar26.cD();
            nfhVar26.c = false;
        }
        mcc mccVar27 = (mcc) nfhVar26.b;
        mccVar27.c |= 16384;
        mccVar27.ak = aj23;
        nfh nfhVar27 = this.b;
        boolean aj24 = this.g.aj(R.string.f160790_resource_name_obfuscated_res_0x7f14066f);
        if (nfhVar27.c) {
            nfhVar27.cD();
            nfhVar27.c = false;
        }
        mcc mccVar28 = (mcc) nfhVar27.b;
        mccVar28.c |= 32768;
        mccVar28.al = aj24;
        if (((Boolean) bwv.p.c()).booleanValue()) {
            nfh nfhVar28 = this.b;
            boolean aj25 = this.g.aj(R.string.f160980_resource_name_obfuscated_res_0x7f140682);
            if (nfhVar28.c) {
                nfhVar28.cD();
                nfhVar28.c = false;
            }
            mcc mccVar29 = (mcc) nfhVar28.b;
            mccVar29.c |= 16777216;
            mccVar29.ar = aj25;
        }
        aZ();
        nfh nfhVar29 = this.b;
        boolean aj26 = this.g.aj(R.string.f161010_resource_name_obfuscated_res_0x7f140685);
        if (nfhVar29.c) {
            nfhVar29.cD();
            nfhVar29.c = false;
        }
        mcc mccVar30 = (mcc) nfhVar29.b;
        mccVar30.b |= 4;
        mccVar30.D = aj26;
        aV(this.k, this.l);
        llp<hqt> b2 = hqr.b();
        nfh nfhVar30 = this.b;
        if (nfhVar30.c) {
            nfhVar30.cD();
            nfhVar30.c = false;
        }
        ((mcc) nfhVar30.b).f = mcc.G();
        for (hqt hqtVar : b2) {
            nfh t = mce.e.t();
            String locale = hqtVar.h().q().toString();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mce mceVar = (mce) t.b;
            locale.getClass();
            mceVar.a |= 1;
            mceVar.b = locale;
            String p = hqtVar.p();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mce mceVar2 = (mce) t.b;
            mceVar2.a |= 2;
            mceVar2.c = p;
            int e = dqc.e(this.c, hqtVar);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mce mceVar3 = (mce) t.b;
            mceVar3.d = e - 1;
            mceVar3.a |= 4;
            this.b.dN(t);
        }
        nfh nfhVar31 = this.b;
        boolean aj27 = this.g.aj(R.string.f160920_resource_name_obfuscated_res_0x7f14067c);
        if (nfhVar31.c) {
            nfhVar31.cD();
            nfhVar31.c = false;
        }
        mcc mccVar31 = (mcc) nfhVar31.b;
        mccVar31.b |= 32;
        mccVar31.G = aj27;
        nfh nfhVar32 = this.b;
        boolean aY = aY();
        if (nfhVar32.c) {
            nfhVar32.cD();
            nfhVar32.c = false;
        }
        mcc mccVar32 = (mcc) nfhVar32.b;
        mccVar32.b |= 256;
        mccVar32.J = aY;
        nfh nfhVar33 = this.b;
        int aL = aL();
        if (nfhVar33.c) {
            nfhVar33.cD();
            nfhVar33.c = false;
        }
        mcc mccVar33 = (mcc) nfhVar33.b;
        mccVar33.b |= 512;
        mccVar33.K = aL;
        nfh nfhVar34 = this.b;
        boolean ak2 = this.g.ak("enable_fast_access_bar");
        if (nfhVar34.c) {
            nfhVar34.cD();
            nfhVar34.c = false;
        }
        mcc mccVar34 = (mcc) nfhVar34.b;
        mccVar34.c |= 512;
        mccVar34.ah = ak2;
        nfh nfhVar35 = this.b;
        boolean ak3 = this.g.ak("enable_emojify");
        if (nfhVar35.c) {
            nfhVar35.cD();
            nfhVar35.c = false;
        }
        mcc mccVar35 = (mcc) nfhVar35.b;
        mccVar35.c |= 536870912;
        mccVar35.ax = ak3;
        nfh nfhVar36 = this.b;
        boolean aj28 = this.g.aj(R.string.f162540_resource_name_obfuscated_res_0x7f14071f);
        if (nfhVar36.c) {
            nfhVar36.cD();
            nfhVar36.c = false;
        }
        mcc mccVar36 = (mcc) nfhVar36.b;
        mccVar36.c |= 1024;
        mccVar36.ai = aj28;
        nfh nfhVar37 = this.b;
        boolean aj29 = this.g.aj(R.string.f160750_resource_name_obfuscated_res_0x7f14066b);
        if (nfhVar37.c) {
            nfhVar37.cD();
            nfhVar37.c = false;
        }
        mcc mccVar37 = (mcc) nfhVar37.b;
        mccVar37.c |= 33554432;
        mccVar37.as = aj29;
        nfh nfhVar38 = this.b;
        boolean ak4 = this.g.ak("enable_sticker_predictions_while_typing");
        if (nfhVar38.c) {
            nfhVar38.cD();
            nfhVar38.c = false;
        }
        mcc mccVar38 = (mcc) nfhVar38.b;
        mccVar38.c |= 128;
        mccVar38.af = ak4;
        nfh nfhVar39 = this.b;
        boolean ak5 = this.g.ak("enable_emoji_to_expression");
        if (nfhVar39.c) {
            nfhVar39.cD();
            nfhVar39.c = false;
        }
        mcc mccVar39 = (mcc) nfhVar39.b;
        mccVar39.b |= Integer.MIN_VALUE;
        mccVar39.X = ak5;
        nfh nfhVar40 = this.b;
        boolean aj30 = this.g.aj(R.string.f162580_resource_name_obfuscated_res_0x7f140723);
        if (nfhVar40.c) {
            nfhVar40.cD();
            nfhVar40.c = false;
        }
        mcc mccVar40 = (mcc) nfhVar40.b;
        mccVar40.c |= 67108864;
        mccVar40.au = aj30;
        nfh nfhVar41 = this.b;
        int aM = aM();
        if (nfhVar41.c) {
            nfhVar41.cD();
            nfhVar41.c = false;
        }
        mcc mccVar41 = (mcc) nfhVar41.b;
        mccVar41.c |= 268435456;
        mccVar41.aw = aM;
        nfh nfhVar42 = this.b;
        boolean aj31 = this.g.aj(R.string.f160270_resource_name_obfuscated_res_0x7f140638);
        if (nfhVar42.c) {
            nfhVar42.cD();
            nfhVar42.c = false;
        }
        mcc mccVar42 = (mcc) nfhVar42.b;
        mccVar42.c |= 1073741824;
        mccVar42.ay = aj31;
        nfh nfhVar43 = this.b;
        float z2 = this.g.z(R.string.f160250_resource_name_obfuscated_res_0x7f140636);
        if (nfhVar43.c) {
            nfhVar43.cD();
            nfhVar43.c = false;
        }
        mcc mccVar43 = (mcc) nfhVar43.b;
        mccVar43.c |= Integer.MIN_VALUE;
        mccVar43.az = z2;
        nfh nfhVar44 = this.b;
        boolean aj32 = this.g.aj(R.string.f160260_resource_name_obfuscated_res_0x7f140637);
        if (nfhVar44.c) {
            nfhVar44.cD();
            nfhVar44.c = false;
        }
        mcc mccVar44 = (mcc) nfhVar44.b;
        mccVar44.d = 1 | mccVar44.d;
        mccVar44.aA = aj32;
        be(this.b);
        if (this.g.ah(R.string.f160550_resource_name_obfuscated_res_0x7f140654)) {
            nfh nfhVar45 = this.b;
            boolean aj33 = this.g.aj(R.string.f160550_resource_name_obfuscated_res_0x7f140654);
            if (nfhVar45.c) {
                nfhVar45.cD();
                nfhVar45.c = false;
            }
            mcc mccVar45 = (mcc) nfhVar45.b;
            mccVar45.b |= 4194304;
            mccVar45.P = aj33;
        }
        aT();
        aU();
        aX(this.c.getResources().getConfiguration());
    }

    @Override // defpackage.idj
    public final void f() {
        aQ();
    }

    public final void g(mcu mcuVar) {
        bb(4, null, null, 1);
        if (mcuVar != null) {
            nfh nfhVar = this.p;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbh mbhVar = (mbh) nfhVar.b;
            mbh mbhVar2 = mbh.aT;
            mbhVar.aQ = mcuVar;
            mbhVar.d |= 134217728;
        }
        bi(this.p, 10);
    }

    public final void h(String str, int i, Throwable th, int i2, int i3) {
        mbn mbnVar;
        iic iicVar = iic.b;
        Iterator it = iicVar.c.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                lfe lfeVar = (lfe) it.next();
                if (lfeVar.a(str)) {
                    mbnVar = (mbn) iicVar.c.get(lfeVar);
                    if (mbnVar == null) {
                        ((ltd) iic.a.a(hip.a).k("com/google/android/libraries/inputmethod/net/common/GrpcMethodCategorizationHelper", "getSearchFeature", 49, "GrpcMethodCategorizationHelper.java")).t("Matched method name but no search feature found");
                        mbnVar = mbn.UNKNOWN_GRPC_FEATURE;
                    }
                }
            } else {
                mbnVar = mbn.UNKNOWN_GRPC_FEATURE;
                break;
            }
        }
        aS(mbnVar, i + 10000, th, i2, i3);
    }

    public final void i(iih iihVar, iij iijVar) {
        aS(iihVar.e.v, iijVar.b, iijVar.d, iijVar.e.d(), iijVar.g);
    }

    public final void j(hln hlnVar) {
        int i = 4;
        if (hlnVar.e == hlm.APP_COMPLETION) {
            Object obj = hlnVar.j;
            if (obj instanceof hlg) {
                hlg hlgVar = (hlg) obj;
                nfh nfhVar = this.p;
                CompletionInfo completionInfo = hlgVar.a;
                nfh t = mfa.w.t();
                int length = completionInfo.getText() == null ? 0 : completionInfo.getText().length();
                int i2 = hlgVar.c;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mfa mfaVar = (mfa) t.b;
                int i3 = mfaVar.a | 1;
                mfaVar.a = i3;
                mfaVar.b = i2;
                mfaVar.a = i3 | 2;
                mfaVar.c = length;
                maf aO = aO(completionInfo);
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mfa mfaVar2 = (mfa) t.b;
                aO.getClass();
                mfaVar2.e = aO;
                mfaVar2.a |= 32;
                mfa mfaVar3 = (mfa) t.cz();
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mbh mbhVar = (mbh) nfhVar.b;
                mbh mbhVar2 = mbh.aT;
                mfaVar3.getClass();
                mbhVar.f = mfaVar3;
                mbhVar.a |= 2;
                nfh nfhVar2 = this.p;
                CompletionInfo completionInfo2 = hlgVar.a;
                nfh t2 = mcf.k.t();
                int length2 = completionInfo2.getText() == null ? 0 : completionInfo2.getText().length();
                maf aO2 = aO(completionInfo2);
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mcf mcfVar = (mcf) t2.b;
                aO2.getClass();
                mcfVar.f = aO2;
                mcfVar.a |= 64;
                maf mafVar = mcfVar.f;
                if (mafVar == null) {
                    mafVar = maf.o;
                }
                int i4 = mafVar.f;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mcf mcfVar2 = (mcf) t2.b;
                int i5 = 1 | mcfVar2.a;
                mcfVar2.a = i5;
                mcfVar2.b = i4;
                maf mafVar2 = mcfVar2.f;
                if (mafVar2 == null) {
                    mafVar2 = maf.o;
                }
                int i6 = mafVar2.g;
                int i7 = i5 | 2;
                mcfVar2.a = i7;
                mcfVar2.c = i6;
                int i8 = hlgVar.c;
                int i9 = i7 | 4;
                mcfVar2.a = i9;
                mcfVar2.d = i8;
                mcfVar2.a = i9 | 8;
                mcfVar2.e = length2;
                int aN = aN(hlgVar);
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mcf mcfVar3 = (mcf) t2.b;
                mcfVar3.a |= 8192;
                mcfVar3.j = aN;
                mcf mcfVar4 = (mcf) t2.cz();
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                mbh mbhVar3 = (mbh) nfhVar2.b;
                mcfVar4.getClass();
                mbhVar3.g = mcfVar4;
                mbhVar3.a |= 8;
                nfh nfhVar3 = this.p;
                if (hlgVar.c == 0) {
                    i = 22;
                }
                bi(nfhVar3, i);
                return;
            }
        }
        if (hlnVar.e == hlm.AUTO_SUBMIT && hlnVar.s == 3) {
            nfh nfhVar4 = this.p;
            nfh t3 = mfa.w.t();
            CharSequence charSequence = hlnVar.a;
            int length3 = charSequence == null ? 0 : charSequence.length();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mfa mfaVar4 = (mfa) t3.b;
            int i10 = mfaVar4.a | 1;
            mfaVar4.a = i10;
            mfaVar4.b = 0;
            mfaVar4.a = i10 | 2;
            mfaVar4.c = length3;
            nfh t4 = maf.o.t();
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            maf mafVar3 = (maf) t4.b;
            int i11 = mafVar3.a | 8;
            mafVar3.a = i11;
            mafVar3.c = 16;
            int i12 = i11 | 128;
            mafVar3.a = i12;
            mafVar3.f = 0;
            mafVar3.a = i12 | 256;
            mafVar3.g = 0;
            maf mafVar4 = (maf) t4.cz();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mfa mfaVar5 = (mfa) t3.b;
            mafVar4.getClass();
            mfaVar5.e = mafVar4;
            mfaVar5.a |= 32;
            mfa mfaVar6 = (mfa) t3.cz();
            if (nfhVar4.c) {
                nfhVar4.cD();
                nfhVar4.c = false;
            }
            mbh mbhVar4 = (mbh) nfhVar4.b;
            mbh mbhVar5 = mbh.aT;
            mfaVar6.getClass();
            mbhVar4.f = mfaVar6;
            mbhVar4.a |= 2;
            nfh nfhVar5 = this.p;
            nfh t5 = mcf.k.t();
            CharSequence charSequence2 = hlnVar.a;
            int length4 = charSequence2 == null ? 0 : charSequence2.length();
            nfh t6 = maf.o.t();
            if (t6.c) {
                t6.cD();
                t6.c = false;
            }
            maf mafVar5 = (maf) t6.b;
            int i13 = mafVar5.a | 8;
            mafVar5.a = i13;
            mafVar5.c = 16;
            int i14 = i13 | 128;
            mafVar5.a = i14;
            mafVar5.f = 0;
            mafVar5.a = i14 | 256;
            mafVar5.g = 0;
            maf mafVar6 = (maf) t6.cz();
            if (t5.c) {
                t5.cD();
                t5.c = false;
            }
            mcf mcfVar5 = (mcf) t5.b;
            mafVar6.getClass();
            mcfVar5.f = mafVar6;
            int i15 = mcfVar5.a | 64;
            mcfVar5.a = i15;
            maf mafVar7 = mcfVar5.f;
            int i16 = (mafVar7 == null ? maf.o : mafVar7).f;
            int i17 = i15 | 1;
            mcfVar5.a = i17;
            mcfVar5.b = i16;
            if (mafVar7 == null) {
                mafVar7 = maf.o;
            }
            int i18 = mafVar7.g;
            int i19 = i17 | 2;
            mcfVar5.a = i19;
            mcfVar5.c = i18;
            int i20 = i19 | 4;
            mcfVar5.a = i20;
            mcfVar5.d = 0;
            int i21 = i20 | 8;
            mcfVar5.a = i21;
            mcfVar5.e = length4;
            mcfVar5.a = i21 | 8192;
            mcfVar5.j = 1;
            mcf mcfVar6 = (mcf) t5.cz();
            if (nfhVar5.c) {
                nfhVar5.cD();
                nfhVar5.c = false;
            }
            mbh mbhVar6 = (mbh) nfhVar5.b;
            mcfVar6.getClass();
            mbhVar6.g = mcfVar6;
            mbhVar6.a |= 8;
            bi(this.p, 4);
        }
    }

    public final void l(hqt hqtVar, hqt hqtVar2, Collection collection, boolean z) {
        this.k = hqtVar2;
        this.l = collection;
        bb(3, ba(hqtVar2), aP(this.k, this.l, z), 1);
        if (jdg.W(hqtVar, hqtVar2)) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessor", "processInputMethodEntryChanged", 2149, "LatinCommonMetricsProcessor.java")).t("The new entry is equal to the old entry");
            return;
        }
        aV(this.k, this.l);
        nfh t = mce.e.t();
        if (hqtVar != null) {
            String locale = hqtVar.h().q().toString();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mce mceVar = (mce) t.b;
            locale.getClass();
            mceVar.a |= 1;
            mceVar.b = locale;
            String p = hqtVar.p();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mce mceVar2 = (mce) t.b;
            mceVar2.a |= 2;
            mceVar2.c = p;
        }
        nfh t2 = mce.e.t();
        if (hqtVar2 != null) {
            String locale2 = hqtVar2.h().q().toString();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mce mceVar3 = (mce) t2.b;
            locale2.getClass();
            mceVar3.a |= 1;
            mceVar3.b = locale2;
            String p2 = hqtVar2.p();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mce mceVar4 = (mce) t2.b;
            mceVar4.a |= 2;
            mceVar4.c = p2;
        }
        nfh nfhVar = this.p;
        nfh t3 = mek.e.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mek mekVar = (mek) t3.b;
        mce mceVar5 = (mce) t.cz();
        mceVar5.getClass();
        mekVar.c = mceVar5;
        mekVar.a |= 2;
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mek mekVar2 = (mek) t3.b;
        mce mceVar6 = (mce) t2.cz();
        mceVar6.getClass();
        mekVar2.b = mceVar6;
        mekVar2.a |= 1;
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mek mekVar3 = (mek) t3.b;
        mekVar3.a |= 4;
        mekVar3.d = z;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mek mekVar4 = (mek) t3.cz();
        mbh mbhVar2 = mbh.aT;
        mekVar4.getClass();
        mbhVar.n = mekVar4;
        mbhVar.a |= 8192;
        bi(this.p, 16);
    }

    public final void m(int i) {
        nfh nfhVar = this.p;
        nfh t = mec.g.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mec mecVar = (mec) t.b;
        mecVar.a |= 1;
        mecVar.b = i;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mec mecVar2 = (mec) t.cz();
        mbh mbhVar2 = mbh.aT;
        mecVar2.getClass();
        mbhVar.k = mecVar2;
        mbhVar.a |= 512;
        bi(this.p, 14);
    }

    public final void n() {
        aU();
    }

    public final void o(int i) {
        bb(3, null, null, dpy.g(i));
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        bj().b(idoVar, iduVar, j, j2, objArr);
    }

    public final void q(ifh ifhVar, long j) {
        String str = ifhVar.f;
        if (str != null) {
            this.d.e(str, j);
        }
        ibz ibzVar = ifhVar.h;
        ibz ibzVar2 = ifhVar.i;
        if (ibzVar == null || ibzVar2 == null) {
            return;
        }
        nfh t = mel.e.t();
        mcg a2 = dqc.a(ibzVar);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mel melVar = (mel) t.b;
        melVar.b = a2.t;
        melVar.a |= 1;
        mcg a3 = dqc.a(ibzVar2);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mel melVar2 = (mel) t.b;
        melVar2.c = a3.t;
        int i = melVar2.a | 2;
        melVar2.a = i;
        melVar2.a = i | 4;
        melVar2.d = (int) j;
        mel melVar3 = (mel) t.cz();
        nfh t2 = mbh.aT.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbh mbhVar = (mbh) t2.b;
        melVar3.getClass();
        mbhVar.ac = melVar3;
        mbhVar.c |= 8192;
        bi(t2, 168);
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
        bj();
        return dqb.a;
    }

    public final void u(jav javVar) {
        bc(95, javVar);
    }

    public final void v(mch mchVar) {
        nfh nfhVar = this.p;
        nfh t = mci.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mci mciVar = (mci) t.b;
        mciVar.d = mchVar.g;
        mciVar.a |= 4;
        mci mciVar2 = (mci) t.cz();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mbh mbhVar2 = mbh.aT;
        mciVar2.getClass();
        mbhVar.y = mciVar2;
        mbhVar.a |= 134217728;
        bi(this.p, 85);
    }

    public final void w() {
        bi(this.p, 81);
    }

    public final void x() {
        bi(this.p, 82);
    }

    public final void y(jav javVar) {
        bc(44, javVar);
    }

    public final void z(int i) {
        nfh nfhVar = this.p;
        nfh t = mci.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mci mciVar = (mci) t.b;
        mciVar.a |= 2;
        mciVar.c = i;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mci mciVar2 = (mci) t.cz();
        mbh mbhVar2 = mbh.aT;
        mciVar2.getClass();
        mbhVar.y = mciVar2;
        mbhVar.a |= 134217728;
        bi(this.p, 83);
    }

    public final void k(mty mtyVar, boolean z) {
        nfh t;
        if (mtyVar != null) {
            if ((mtyVar.a & 2) == 0) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessor", "setInlineSuggestionProposedMetadata", 1458, "LatinCommonMetricsProcessor.java")).t("Must have at least one inline suggestion.");
            } else {
                mbh mbhVar = (mbh) this.p.b;
                if ((mbhVar.a & 32) == 0) {
                    t = mcf.k.t();
                } else {
                    mcf mcfVar = mbhVar.h;
                    if (mcfVar == null) {
                        mcfVar = mcf.k;
                    }
                    t = (nfh) mcfVar.N(5);
                    t.cG(mcfVar);
                }
                mse mseVar = mtyVar.d;
                if (mseVar == null) {
                    mseVar = mse.p;
                }
                nfh t2 = mbu.f.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbu mbuVar = (mbu) t2.b;
                mbuVar.a |= 8;
                mbuVar.e = z;
                int i = 1;
                if ((mseVar.b & 8) != 0) {
                    msu msuVar = mseVar.n;
                    if (msuVar == null) {
                        msuVar = msu.f;
                    }
                    if ((msuVar.a & 1) != 0) {
                        msu msuVar2 = mseVar.n;
                        if (msuVar2 == null) {
                            msuVar2 = msu.f;
                        }
                        int i2 = msuVar2.b;
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        mbu mbuVar2 = (mbu) t2.b;
                        mbuVar2.a |= 1;
                        mbuVar2.b = i2;
                    }
                    msu msuVar3 = mseVar.n;
                    if (((msuVar3 == null ? msu.f : msuVar3).a & 4) != 0) {
                        if (msuVar3 == null) {
                            msuVar3 = msu.f;
                        }
                        int i3 = msuVar3.d;
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        mbu mbuVar3 = (mbu) t2.b;
                        mbuVar3.a |= 4;
                        mbuVar3.d = i3;
                    }
                    msu msuVar4 = mseVar.n;
                    if (((msuVar4 == null ? msu.f : msuVar4).a & 2) != 0) {
                        if (msuVar4 == null) {
                            msuVar4 = msu.f;
                        }
                        int F = jco.F(msuVar4.c);
                        if (F == 0) {
                            F = 1;
                        }
                        int k = lwm.k(F - 1);
                        if (k != 0) {
                            if (t2.c) {
                                t2.cD();
                                t2.c = false;
                            }
                            mbu mbuVar4 = (mbu) t2.b;
                            mbuVar4.c = k - 1;
                            mbuVar4.a |= 2;
                        }
                    }
                }
                nfh t3 = maf.o.t();
                int i4 = mseVar.f;
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                maf mafVar = (maf) t3.b;
                mafVar.a |= 1;
                mafVar.b = i4;
                int b = msc.b(mseVar.c);
                if (b != 0) {
                    i = b;
                }
                maf mafVar2 = (maf) t3.b;
                mafVar2.a |= 8;
                mafVar2.c = i - 1;
                mbu mbuVar5 = (mbu) t2.cz();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                maf mafVar3 = (maf) t3.b;
                mbuVar5.getClass();
                mafVar3.h = mbuVar5;
                int i5 = mafVar3.a | 1024;
                mafVar3.a = i5;
                mse mseVar2 = mtyVar.d;
                if ((mseVar2 == null ? mse.p : mseVar2).k) {
                    if (mseVar2 == null) {
                        mseVar2 = mse.p;
                    }
                    int i6 = mseVar2.l;
                    mafVar3.a = i5 | 32;
                    mafVar3.d = i6;
                }
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mcf mcfVar2 = (mcf) t.b;
                maf mafVar4 = (maf) t3.cz();
                mafVar4.getClass();
                mcfVar2.h = mafVar4;
                mcfVar2.a |= 128;
                nfh nfhVar = this.p;
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mbh mbhVar2 = (mbh) nfhVar.b;
                mcf mcfVar3 = (mcf) t.cz();
                mcfVar3.getClass();
                mbhVar2.h = mcfVar3;
                mbhVar2.a |= 32;
            }
            bi(this.p, 251);
        }
    }
}
