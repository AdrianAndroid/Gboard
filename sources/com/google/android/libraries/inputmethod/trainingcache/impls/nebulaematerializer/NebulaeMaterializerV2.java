package com.google.android.libraries.inputmethod.trainingcache.impls.nebulaematerializer;

import android.content.Context;
import android.os.Build;
import com.google.android.libraries.inputmethod.trainingcache.impls.nebulaematerializer.NebulaeMaterializerV2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NebulaeMaterializerV2 implements itt {
    static final hic b;
    static final mvt c;
    public static final /* synthetic */ int e = 0;
    private final iur g;
    private final File h;
    private final ixi i;
    private final Context j;
    private final idk k;
    private boolean r;
    private File s;
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2");
    public static final hhl a = hhq.f("native_materializer_default_batch_size", 100);
    private llp l = llp.q();
    public List d = new ArrayList();
    private long m = 0;
    private byte[] n = gvw.a;
    private ixh o = null;
    private int p = 0;
    private iup q = iup.a;

    static {
        nfh t = njc.b.t();
        t.eg("/native/language");
        t.eg("/native/voice");
        b = hhq.k("collections_requiring_trimmed_input_actions", (njc) t.cz());
        nfh t2 = mvt.d.t();
        String str = Build.MANUFACTURER;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mvt mvtVar = (mvt) t2.b;
        str.getClass();
        mvtVar.a |= 1;
        mvtVar.b = str;
        String str2 = Build.MODEL;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mvt mvtVar2 = (mvt) t2.b;
        str2.getClass();
        mvtVar2.a |= 2;
        mvtVar2.c = str2;
        c = (mvt) t2.cz();
    }

    public NebulaeMaterializerV2(ixi ixiVar, Context context, idk idkVar) {
        this.i = ixiVar;
        this.j = context;
        this.k = idkVar;
        this.g = new iur(context);
        this.h = new File(context.getCacheDir(), "nebulae/materializer");
    }

    static native byte[] createNativeMaterializerNative(byte[] bArr);

    private static ixg d(ixi ixiVar, ipl iplVar, long j) {
        List i = ixiVar.i(iplVar, j);
        if (i.size() > 1) {
            ((ltd) ((ltd) f.d()).k("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2", "getOnlyDataBySession", 516, "NebulaeMaterializerV2.java")).u("Abnormal count of data items: %d, should be <= 1.", i.size());
            return null;
        }
        return (ixg) lre.ap(i);
    }

    static native void deleteNativeMaterializerNative(long j);

    private final void e(leq leqVar) {
        ixh ixhVar;
        mxq mxqVar;
        Iterable H;
        while (true) {
            Boolean bool = (Boolean) leqVar.a(null);
            if (bool == null || !bool.booleanValue() || (ixhVar = this.o) == null || !ixhVar.hasNext()) {
                return;
            }
            Object next = this.o.next();
            List list = this.d;
            nfh t = mxp.m.t();
            long j = this.m;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mxp mxpVar = (mxp) t.b;
            int i = 1;
            mxpVar.a |= 1;
            mxpVar.b = j;
            if (this.l.contains(mxo.INPUT_ACTIONS)) {
                ixi ixiVar = this.i;
                idk idkVar = this.k;
                boolean z = this.r;
                ixg ixgVar = (ixg) next;
                long j2 = ixgVar.b;
                if (!z || !ixgVar.d.d("__has_trimmed_ia_collection")) {
                    idkVar.e(iwc.INPUT_ACTION_SOURCE, 1);
                    ixg d = d(ixiVar, iuy.e, j2);
                    H = d != null ? lre.H(((mrd) d.b()).a, hwy.t) : llp.q();
                } else {
                    idkVar.e(iwc.INPUT_ACTION_SOURCE, 2);
                    ixg d2 = d(ixiVar, iuy.k, j2);
                    H = d2 != null ? lre.H(((mre) d2.b()).a, hwy.t) : llp.q();
                }
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mxp mxpVar2 = (mxp) t.b;
                nga ngaVar = mxpVar2.c;
                if (!ngaVar.c()) {
                    mxpVar2.c = nfm.H(ngaVar);
                }
                ndt.cs(H, mxpVar2.c);
            }
            if (this.l.contains(mxo.KEYBOARD_LAYOUT)) {
                ixg o = this.i.o(iuy.g, ((mxa) ((ixg) next).b()).o);
                if (o != null) {
                    nem u = nem.u(o.c);
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mxp mxpVar3 = (mxp) t.b;
                    mxpVar3.a |= 2;
                    mxpVar3.d = u;
                } else {
                    ((ltd) ((ltd) f.d()).k("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2", "getResults", 341, "NebulaeMaterializerV2.java")).t("Keyboard layout data not found.");
                }
            }
            if (this.l.contains(mxo.UNIFIED_PARAMS)) {
                ixg o2 = this.i.o(iuy.l, ((mxa) ((ixg) next).b()).p);
                if (o2 != null) {
                    nem u2 = nem.u(o2.c);
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mxp mxpVar4 = (mxp) t.b;
                    mxpVar4.a |= 8;
                    mxpVar4.f = u2;
                } else {
                    ((ltd) ((ltd) f.d()).k("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2", "getResults", 354, "NebulaeMaterializerV2.java")).t("Unified params data not found.");
                }
            }
            if (this.l.contains(mxo.AUTO_CORRECTION_STATS)) {
                ixg d3 = d(this.i, iuy.c, ((ixg) next).b);
                if (d3 != null) {
                    nem u3 = nem.u(d3.c);
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mxp mxpVar5 = (mxp) t.b;
                    mxpVar5.a |= 16;
                    mxpVar5.g = u3;
                } else {
                    ((ltd) ((ltd) f.d()).k("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2", "getResults", 368, "NebulaeMaterializerV2.java")).t("Auto correction stats data not found.");
                }
            }
            if (this.l.contains(mxo.SPATIAL_STATS)) {
                ixg d4 = d(this.i, iuy.m, ((ixg) next).b);
                if (d4 != null) {
                    nem u4 = nem.u(d4.c);
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mxp mxpVar6 = (mxp) t.b;
                    mxpVar6.a |= 32;
                    mxpVar6.h = u4;
                } else {
                    ((ltd) ((ltd) f.d()).k("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2", "getResults", 381, "NebulaeMaterializerV2.java")).t("Spatial stats data not found.");
                }
            }
            if (this.l.contains(mxo.TYPO_STATS)) {
                ixg d5 = d(this.i, iuy.n, ((ixg) next).b);
                if (d5 != null) {
                    nem u5 = nem.u(d5.c);
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mxp mxpVar7 = (mxp) t.b;
                    mxpVar7.a |= 64;
                    mxpVar7.i = u5;
                } else {
                    ((ltd) ((ltd) f.d()).k("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2", "getResults", 394, "NebulaeMaterializerV2.java")).t("Typo stats data not found.");
                }
            }
            if (this.l.contains(mxo.AC_THRESHOLD)) {
                ixg d6 = d(this.i, iuy.a, ((ixg) next).b);
                if (d6 != null) {
                    nem u6 = nem.u(d6.c);
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mxp mxpVar8 = (mxp) t.b;
                    mxpVar8.a |= 512;
                    mxpVar8.k = u6;
                } else {
                    ((ltd) ((ltd) f.d()).k("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2", "getResults", 405, "NebulaeMaterializerV2.java")).t("AC Threshold not found.");
                }
            }
            if (this.l.contains(mxo.KC_THRESHOLD)) {
                ixg d7 = d(this.i, iuy.f, ((ixg) next).b);
                if (d7 != null) {
                    nem u7 = nem.u(d7.c);
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mxp mxpVar9 = (mxp) t.b;
                    mxpVar9.a |= 1024;
                    mxpVar9.l = u7;
                } else {
                    ((ltd) ((ltd) f.d()).k("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2", "getResults", 416, "NebulaeMaterializerV2.java")).t("KC Threshold not found.");
                }
            }
            if (this.l.contains(mxo.SESSION)) {
                nem u8 = nem.u(((ixg) next).c);
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mxp mxpVar10 = (mxp) t.b;
                mxpVar10.a |= 4;
                mxpVar10.e = u8;
            }
            if (this.l.contains(mxo.COUNTS)) {
                ixg d8 = d(this.i, iuy.d, ((ixg) next).b);
                if (d8 != null) {
                    nem u9 = nem.u(d8.c);
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mxp mxpVar11 = (mxp) t.b;
                    mxpVar11.a |= 128;
                    mxpVar11.j = u9;
                } else {
                    ((ltd) ((ltd) f.d()).k("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2", "getResults", 433, "NebulaeMaterializerV2.java")).t("No counts found.");
                }
            }
            mxp mxpVar12 = (mxp) t.cz();
            ArrayList arrayList = new ArrayList();
            try {
                mxqVar = (mxq) nfm.z(mxq.c, materializeNative(mxpVar12.q()), nfb.b());
            } catch (ngd e2) {
                ((ltd) ((ltd) ((ltd) f.c()).i(e2)).k("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2", "materialize", (char) 633, "NebulaeMaterializerV2.java")).t("Failed to parse the response of initialize global materials.");
                mxqVar = mxq.c;
            }
            int s = jco.s(mxqVar.a);
            if (s != 0 && s == 2) {
                mxqVar.b.size();
                for (nem nemVar : mxqVar.b) {
                    byte[] D = nemVar.D();
                    int length = D.length;
                    arrayList.add(new jls(this.n, D));
                }
            } else {
                ltd ltdVar = (ltd) ((ltd) f.c()).k("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2", "callNativeMaterializer", 445, "NebulaeMaterializerV2.java");
                int s2 = jco.s(mxqVar.a);
                if (s2 != 0) {
                    i = s2;
                }
                ltdVar.u("Failed to materialize data, response status: %d", i - 1);
            }
            list.addAll(arrayList);
        }
    }

    private final void f() {
        this.d.clear();
        this.l = llp.q();
        this.n = gvw.a;
        this.p = 0;
        this.q = iup.a;
        this.r = false;
        ixh ixhVar = this.o;
        if (ixhVar != null) {
            gvt.a(ixhVar);
            this.o = null;
        }
        long j = this.m;
        if (j != 0) {
            deleteNativeMaterializerNative(j);
            this.m = 0L;
        }
        if (this.s != null) {
            jan.b.e(this.s);
            this.s = null;
        }
    }

    static native byte[] initializeGlobalMaterialsNative(byte[] bArr);

    static native byte[] materializeNative(byte[] bArr);

    @Override // defpackage.itt
    public final void b(final int i) {
        e(new leq() { // from class: iun
            @Override // defpackage.leq
            public final Object a(Object obj) {
                Void r3 = (Void) obj;
                return Boolean.valueOf(NebulaeMaterializerV2.this.d.size() < i);
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:1|(3:142|143|(17:145|(1:147)|4|(7:105|106|107|108|109|110|111)|6|(1:8)(3:101|(1:103)|104)|9|(1:11)|12|(1:14)|15|(1:17)|18|19|20|21|(20:24|(1:26)|27|28|(1:30)|31|(3:33|(1:35)|36)|37|(5:39|(1:41)|42|(1:44)|45)|46|(4:48|(1:50)(2:57|(2:59|(3:53|(1:55)|56))(1:60))|51|(0))|61|(3:63|(1:65)|66)|67|(3:69|(1:71)|72)|73|74|75|76|(4:79|(1:81)|82|83)(4:85|(1:87)|88|89))(4:93|(1:95)|96|97)))|3|4|(0)|6|(0)(0)|9|(0)|12|(0)|15|(0)|18|19|20|21|(24:24|(0)|27|28|(0)|31|(0)|37|(0)|46|(0)|61|(0)|67|(0)|73|74|75|76|(4:79|(0)|82|83)|85|(0)|88|89)|93|(0)|96|97|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0172, code lost:
        ((defpackage.ltd) ((defpackage.ltd) ((defpackage.ltd) com.google.android.libraries.inputmethod.trainingcache.impls.nebulaematerializer.NebulaeMaterializerV2.f.c()).i(r0)).k("com/google/android/libraries/inputmethod/trainingcache/impls/nebulaematerializer/NebulaeMaterializerV2", "createNativeMaterializer", 609, "NebulaeMaterializerV2.java")).t("Failed to parse the response of create native materializer.");
        r0 = defpackage.mxk.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0171, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b9 A[LOOP:0: B:25:0x01b7->B:26:0x01b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03d3  */
    @Override // defpackage.itt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r21, byte[] r22, byte[] r23) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.inputmethod.trainingcache.impls.nebulaematerializer.NebulaeMaterializerV2.c(java.lang.String, byte[], byte[]):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        f();
    }

    @Override // defpackage.itt
    public final llp a() {
        ArrayList arrayList;
        iup iupVar = this.q;
        int i = iupVar.b;
        final int min = i == 0 ? iupVar.c : Math.min(iupVar.c, Math.max(0, i - this.p));
        if (min <= 0) {
            return llp.q();
        }
        e(new leq() { // from class: iuo
            @Override // defpackage.leq
            public final Object a(Object obj) {
                Void r3 = (Void) obj;
                return Boolean.valueOf(NebulaeMaterializerV2.this.d.size() < min);
            }
        });
        if (this.d.size() <= min) {
            arrayList = new ArrayList(this.d);
            this.d.clear();
        } else {
            ArrayList arrayList2 = new ArrayList(this.d.subList(0, min));
            List list = this.d;
            this.d = list.subList(min, list.size());
            arrayList = arrayList2;
        }
        if (this.q.d) {
            Collections.shuffle(arrayList);
        }
        this.p += arrayList.size();
        arrayList.size();
        return llp.o(arrayList);
    }
}
