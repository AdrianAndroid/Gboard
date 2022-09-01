package com.google.android.libraries.inputmethod.userfeaturecache.metrics;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class InputActionsUserFeatureProcessor implements idm {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor");
    public final nfh b;
    public lre c;
    private final boolean d;
    private final List e;
    private byte[] f;
    private final iym g;
    private final idb h;
    private final boe i;

    static {
        lfy.c(',');
    }

    public InputActionsUserFeatureProcessor(iym iymVar, boe boeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = mra.d.t();
        this.c = new lre();
        this.e = llp.q();
        this.i = boeVar;
        this.h = new jae(this);
        this.g = iymVar;
        this.d = true;
    }

    public static void a(ieh iehVar, List list, byte[] bArr) {
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "addToMetricsManager", 118, "InputActionsUserFeatureProcessor.java")).w("addToMetricsManager: %s", list);
        try {
            iehVar.u(new InputActionsUserFeatureProcessor(list, bArr));
        } catch (RuntimeException e) {
            iehVar.e(idd.METRICS_PROCESSOR_CRASH_INIT, e);
        }
    }

    public static void b(ieh iehVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "removeFromMetricsManager", 156, "InputActionsUserFeatureProcessor.java")).t("removeFromMetricsManager");
        iehVar.x(InputActionsUserFeatureProcessor.class);
    }

    public static void c(ieh iehVar, iym iymVar, boe boeVar) {
        try {
            if (boeVar == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "addToMetricsManager", 140, "InputActionsUserFeatureProcessor.java")).t("Can't find feature id helper.");
            } else {
                iehVar.u(new InputActionsUserFeatureProcessor(iymVar, boeVar, null, null, null));
            }
        } catch (RuntimeException e) {
            iehVar.e(idd.METRICS_PROCESSOR_CRASH_INIT, e);
        }
    }

    public static native void nativeProcessRequest(byte[] bArr);

    public static native void nativeRegisterProcessor(long j, byte[] bArr);

    public static native void nativeUnregisterProcessors();

    public static native void nativeUpdateKeyboardLayout(byte[] bArr);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.idj
    public final void e() {
        char c;
        if (this.d) {
            iym iymVar = this.g;
            if (iymVar == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "onAttached", 255, "InputActionsUserFeatureProcessor.java")).t("Can't find inputActionsProcessorParamsV2");
                return;
            } else if (this.i == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "onAttached", 259, "InputActionsUserFeatureProcessor.java")).t("Can't find featureIdHelper.");
                return;
            } else {
                for (iyk iykVar : iymVar.a) {
                    int i = iykVar.e;
                    if (iykVar.f.size() == 0) {
                        long t = this.i.t(i, "");
                        if (t == -1) {
                            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "onAttached", 269, "InputActionsUserFeatureProcessor.java")).u("Can't find proto_id %d in global namespace", i);
                            return;
                        } else if (this.c != null) {
                            nativeRegisterProcessor(t, iykVar.q());
                        } else {
                            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "onAttached", 275, "InputActionsUserFeatureProcessor.java")).t("Can't find native delegate.");
                        }
                    }
                    for (String str : iykVar.f) {
                        long t2 = this.i.t(i, str);
                        if (t2 == -1) {
                            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "onAttached", 281, "InputActionsUserFeatureProcessor.java")).z("Can't find proto_id %d and namespace %s", i, str);
                            return;
                        } else if (this.c != null) {
                            nativeRegisterProcessor(t2, iykVar.q());
                        } else {
                            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "onAttached", 287, "InputActionsUserFeatureProcessor.java")).t("Can't find native delegate.");
                        }
                    }
                }
                return;
            }
        }
        try {
            iyl iylVar = (iyl) nfm.z(iyl.f, this.f, nfb.b());
            nfh t3 = iyk.g.t();
            for (String str2 : this.e) {
                t3.b = (nfm) t3.b.N(4);
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                iyk iykVar2 = (iyk) t3.b;
                nga ngaVar = iykVar2.f;
                if (!ngaVar.c()) {
                    iykVar2.f = nfm.H(ngaVar);
                }
                iykVar2.f.add("");
                switch (str2.hashCode()) {
                    case -2047341385:
                        if (str2.equals("SpatialStatsProcessor")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1631612807:
                        if (str2.equals("ACTThresholdProcessor")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1242322945:
                        if (str2.equals("KcThresholdProcessor")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -474244804:
                        if (str2.equals("LiteralStartPenaltyProcessor")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -377259209:
                        if (str2.equals("TypoStatsProcessor")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1133564576:
                        if (str2.equals("AutoCorrectionStatsProcessor")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1523125925:
                        if (str2.equals("GestureRevertProcessor")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar3 = (iyk) t3.b;
                        iykVar3.a |= 1;
                        iykVar3.d = "TypoStatsProcessor";
                        int i2 = izq.TYPO_STATS.m - 1;
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar4 = (iyk) t3.b;
                        iykVar4.a |= 2;
                        iykVar4.e = i2;
                        nativeRegisterProcessor(izq.TYPO_STATS.m - 1, ((iyk) t3.cz()).q());
                        break;
                    case 1:
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar5 = (iyk) t3.b;
                        iykVar5.a |= 1;
                        iykVar5.d = "SpatialStatsProcessor";
                        int i3 = izq.SPATIAL_STATS.m - 1;
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar6 = (iyk) t3.b;
                        iykVar6.a |= 2;
                        iykVar6.e = i3;
                        iyp iypVar = iylVar.c;
                        if (iypVar == null) {
                            iypVar = iyp.d;
                        }
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar7 = (iyk) t3.b;
                        iypVar.getClass();
                        iykVar7.c = iypVar;
                        iykVar7.b = 6;
                        nativeRegisterProcessor(izq.SPATIAL_STATS.m - 1, ((iyk) t3.cz()).q());
                        break;
                    case 2:
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar8 = (iyk) t3.b;
                        iykVar8.a |= 1;
                        iykVar8.d = "KcThresholdProcessor";
                        int i4 = izq.KC_THRESHOLD.m - 1;
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar9 = (iyk) t3.b;
                        iykVar9.a |= 2;
                        iykVar9.e = i4;
                        iyn iynVar = iylVar.b;
                        if (iynVar == null) {
                            iynVar = iyn.a;
                        }
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar10 = (iyk) t3.b;
                        iynVar.getClass();
                        iykVar10.c = iynVar;
                        iykVar10.b = 5;
                        nativeRegisterProcessor(izq.KC_THRESHOLD.m - 1, ((iyk) t3.cz()).q());
                        break;
                    case 3:
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar11 = (iyk) t3.b;
                        iykVar11.a |= 1;
                        iykVar11.d = "LiteralStartPenaltyProcessor";
                        int i5 = izq.LITERAL_START_PENALTY.m - 1;
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar12 = (iyk) t3.b;
                        iykVar12.a |= 2;
                        iykVar12.e = i5;
                        iyo iyoVar = iylVar.d;
                        if (iyoVar == null) {
                            iyoVar = iyo.a;
                        }
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar13 = (iyk) t3.b;
                        iyoVar.getClass();
                        iykVar13.c = iyoVar;
                        iykVar13.b = 7;
                        nativeRegisterProcessor(izq.LITERAL_START_PENALTY.m - 1, ((iyk) t3.cz()).q());
                        break;
                    case 4:
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar14 = (iyk) t3.b;
                        iykVar14.a |= 1;
                        iykVar14.d = "GestureRevertProcessor";
                        int i6 = izq.GESTURE_REVERT_STATS.m - 1;
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar15 = (iyk) t3.b;
                        iykVar15.a |= 2;
                        iykVar15.e = i6;
                        nativeRegisterProcessor(izq.GESTURE_REVERT_STATS.m - 1, ((iyk) t3.cz()).q());
                        break;
                    case 5:
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar16 = (iyk) t3.b;
                        iykVar16.a |= 1;
                        iykVar16.d = "AutoCorrectionStatsProcessor";
                        int i7 = izq.AUTO_CORRECTION_THRESHOLD.m - 1;
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar17 = (iyk) t3.b;
                        iykVar17.a |= 2;
                        iykVar17.e = i7;
                        nativeRegisterProcessor(izq.AUTO_CORRECTION_STATS.m - 1, ((iyk) t3.cz()).q());
                        break;
                    case 6:
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar18 = (iyk) t3.b;
                        iykVar18.a |= 1;
                        iykVar18.d = "ACTThresholdProcessor";
                        int i8 = izq.AUTO_CORRECTION_THRESHOLD.m - 1;
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar19 = (iyk) t3.b;
                        iykVar19.a |= 2;
                        iykVar19.e = i8;
                        ijq ijqVar = iylVar.e;
                        if (ijqVar == null) {
                            ijqVar = ijq.a;
                        }
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        iyk iykVar20 = (iyk) t3.b;
                        ijqVar.getClass();
                        iykVar20.c = ijqVar;
                        iykVar20.b = 8;
                        nativeRegisterProcessor(izq.AUTO_CORRECTION_THRESHOLD.m - 1, ((iyk) t3.cz()).q());
                        break;
                    default:
                        ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "onAttached", 362, "InputActionsUserFeatureProcessor.java")).w("Unsupported processor: %s", str2);
                        break;
                }
            }
        } catch (ngd unused) {
        }
    }

    @Override // defpackage.idj
    public final void f() {
        if (this.c != null) {
            nativeUnregisterProcessors();
        } else {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/userfeaturecache/metrics/InputActionsUserFeatureProcessor", "onDetached", 375, "InputActionsUserFeatureProcessor.java")).t("Can't find nativeDelegate.");
        }
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.h.b(idoVar, iduVar, j, j2, objArr);
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
        return jae.a;
    }

    public InputActionsUserFeatureProcessor(List list, byte[] bArr) {
        this.b = mra.d.t();
        this.c = new lre();
        this.i = null;
        this.e = list;
        this.f = bArr;
        this.h = new jae(this);
        this.g = null;
        this.d = false;
    }
}
