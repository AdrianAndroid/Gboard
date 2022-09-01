package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: dju  reason: default package */
/* loaded from: classes.dex */
public final class dju extends idb {
    public static final ido[] a = {dda.DUAL_CANDIDATES_VIEW_CONTROLLER_SELECTED_MORE_CANDIDATES_AREA, dda.MORE_CANDIDATES_AREA_VISIBILITY_CHANGED, dja.AUTO_CORRECTION_REVERTED, dja.CANDIDATE_SELECTED, dja.DATA_DICTIONARY_CHANGED, dja.DEFAULT_CANDIDATE_SELECTED, dja.DOUBLE_SPACE_TO_INSERT_PERIOD, dja.ENGINE_PREDICTION_IMPRESSION, dja.SPACE_INSERTED_AFTER_COMMIT, dja.TEXT_COMMITTED, dja.TEXT_COMMIT_DELETED, dja.TEXT_COMPOSING_DELETED, dja.TOKEN_CANDIDATE_UNSELECTED, hfe.EVENT_UNHANDLED_BY_IME, hlw.SPACE_INSERTED_BEFORE_NEXT_COMPOSING, hpb.IME_COMPOSING_ABORTED, hpb.IME_COMPOSING_CLEARED, hpb.IME_SELECTION_CHANGED, hpb.READING_TEXT_CANDIDATES_SET, hpb.TEXT_CANDIDATES_APPENDED, hpb.TEXT_CANDIDATES_UPDATED, hry.INPUT_METHOD_ENTRY_CHANGED, hsp.IMS_INPUT_FINISHED, hsp.IMS_INPUT_STARTED, hsp.IMS_INPUT_VIEW_STARTED, hxo.EMOJI_KEY_IGNORED, hxo.GLOBE_KEY_IGNORED};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper");
    private final djt g;

    public dju(djt djtVar) {
        this.g = djtVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        int length;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        if (dda.DUAL_CANDIDATES_VIEW_CONTROLLER_SELECTED_MORE_CANDIDATES_AREA == idoVar) {
            djt djtVar = this.g;
            djtVar.k = true;
            djtVar.b.d("MoreCandidatesArea.Opened", 1);
        } else if (dda.MORE_CANDIDATES_AREA_VISIBILITY_CHANGED == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 38, "HmmMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            djt djtVar2 = this.g;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            djtVar2.j = booleanValue;
            if (!booleanValue && !djtVar2.k) {
                djtVar2.b.d("MoreCandidatesArea.Opened", 0);
            }
            djtVar2.k = false;
        } else if (dja.AUTO_CORRECTION_REVERTED == idoVar) {
            djt djtVar3 = this.g;
            nfh t = mbh.aT.t();
            mae maeVar = mae.d;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbh mbhVar = (mbh) t.b;
            maeVar.getClass();
            mbhVar.i = maeVar;
            mbhVar.a |= 64;
            nfh nfhVar = djtVar3.r;
            if (nfhVar != null) {
                mfa mfaVar = (mfa) nfhVar.cz();
                mfaVar.getClass();
                mbhVar.f = mfaVar;
                mbhVar.a |= 2;
            }
            djtVar3.k(t, 7);
        } else if (dja.CANDIDATE_SELECTED == idoVar) {
            Object obj2 = objArr[2];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 48, "HmmMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            }
            djt djtVar4 = this.g;
            hln hlnVar = (hln) objArr[0];
            String str2 = (String) objArr[1];
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            djtVar4.h = hlnVar;
            if (hlnVar != null && (hlnVar.e != hlm.READING_TEXT ? !(hlnVar.e == hlm.PREDICTION || djtVar4.d.isEmpty()) : !djtVar4.e.isEmpty())) {
                nfh t2 = mag.d.t();
                if (hlnVar.e == hlm.READING_TEXT) {
                    djtVar4.o++;
                    i4 = djtVar4.e.indexOf(hlnVar);
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    mag magVar = (mag) t2.b;
                    magVar.c = 2;
                    magVar.a |= 2;
                    if (djtVar4.j) {
                        djtVar4.k = true;
                        djtVar4.b.d("MoreCandidatesArea.Opened", 0);
                    }
                } else {
                    int indexOf = djtVar4.d.indexOf(hlnVar);
                    int i5 = true != booleanValue2 ? 2 : 1;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    mag magVar2 = (mag) t2.b;
                    magVar2.c = i5 - 1;
                    magVar2.a |= 2;
                    i4 = indexOf;
                }
                nfh t3 = mbh.aT.t();
                maf b = djt.b(hlnVar, i4, hlnVar == djtVar4.g);
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mag magVar3 = (mag) t2.b;
                b.getClass();
                magVar3.b = b;
                magVar3.a |= 1;
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                mbh mbhVar2 = (mbh) t3.b;
                mag magVar4 = (mag) t2.cz();
                magVar4.getClass();
                mbhVar2.L = magVar4;
                mbhVar2.b |= 32768;
                djtVar4.k(t3, 87);
            }
        } else if (dja.DATA_DICTIONARY_CHANGED == idoVar) {
            djt djtVar5 = this.g;
            din dinVar = (din) objArr[1];
            nfh t4 = mbh.aT.t();
            mbl c = djt.c(dinVar, (String) objArr[0]);
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mbh mbhVar3 = (mbh) t4.b;
            c.getClass();
            mbhVar3.T = c;
            mbhVar3.b |= Integer.MIN_VALUE;
            djtVar5.k(t4, 114);
        } else if (dja.DEFAULT_CANDIDATE_SELECTED == idoVar) {
            Object obj3 = objArr[0];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 58, "HmmMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            djt djtVar6 = this.g;
            int intValue = ((Number) obj3).intValue();
            if (intValue >= 0 && djtVar6.d.size() > intValue) {
                hln hlnVar2 = (hln) djtVar6.d.get(intValue);
                djtVar6.g = hlnVar2;
                djtVar6.h = hlnVar2;
            }
        } else if (dja.DOUBLE_SPACE_TO_INSERT_PERIOD == idoVar) {
            this.g.k(mbh.aT.t(), 17);
        } else if (dja.ENGINE_PREDICTION_IMPRESSION == idoVar) {
            djt djtVar7 = this.g;
            List list = (List) objArr[0];
            if (list != null && list.size() > 0) {
                nfh t5 = mbh.aT.t();
                nfh t6 = mcf.k.t();
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int min = Math.min(size, ((Long) dca.a.c()).intValue());
                int i6 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    hln hlnVar3 = (hln) list.get(i7);
                    if (i6 < min) {
                        arrayList.add(djt.b(hlnVar3, i7, hlnVar3 == null));
                        i6++;
                    }
                }
                t6.dk(arrayList);
                if (t6.c) {
                    t6.cD();
                    t6.c = false;
                }
                mcf mcfVar = (mcf) t6.b;
                int i8 = mcfVar.a | 4;
                mcfVar.a = i8;
                mcfVar.d = 0;
                mcfVar.a = i8 | 1;
                mcfVar.b = -1;
                mcf mcfVar2 = (mcf) t6.cz();
                if (t5.c) {
                    t5.cD();
                    t5.c = false;
                }
                mbh mbhVar4 = (mbh) t5.b;
                mcfVar2.getClass();
                mbhVar4.h = mcfVar2;
                mbhVar4.a |= 32;
                djtVar7.k(t5, 41);
            }
        } else if (dja.SPACE_INSERTED_AFTER_COMMIT == idoVar) {
            this.g.q = 3;
        } else if (dja.TEXT_COMMITTED == idoVar) {
            Object obj4 = objArr[1];
            if (obj4 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 74, "HmmMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            djt djtVar8 = this.g;
            String str3 = (String) objArr[0];
            int intValue2 = ((Number) obj4).intValue();
            String str4 = (String) objArr[2];
            String str5 = (String) objArr[3];
            String[] strArr = (String[]) objArr[4];
            int[] iArr = (int[]) objArr[5];
            mes mesVar = (mes) objArr[6];
            djtVar8.i();
            if (TextUtils.isEmpty(str5) || (TextUtils.isEmpty(str4) && djtVar8.h == null)) {
                djtVar8.g();
            } else {
                hln hlnVar4 = djtVar8.h;
                hln hlnVar5 = djtVar8.g;
                List list2 = djtVar8.d;
                jav javVar = djtVar8.i;
                boolean z = djtVar8.l;
                boolean z2 = djtVar8.m;
                int i9 = djtVar8.o;
                nfh t7 = mfa.w.t();
                if (TextUtils.isEmpty(str4)) {
                    str = str3;
                    length = 0;
                } else {
                    length = str4.length();
                    str = str3;
                }
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                mfa mfaVar2 = (mfa) t7.b;
                mfaVar2.a |= 1;
                mfaVar2.b = length;
                int length2 = str5.length();
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                mfa mfaVar3 = (mfa) t7.b;
                int i10 = mfaVar3.a | 2;
                mfaVar3.a = i10;
                mfaVar3.c = length2;
                if (intValue2 > 0) {
                    if (hlnVar4 != null) {
                        intValue2--;
                    }
                    i = 65536 | i10;
                    mfaVar3.a = i;
                    mfaVar3.l = intValue2;
                } else {
                    i = i10 | 65536;
                    mfaVar3.a = i;
                    mfaVar3.l = 0;
                }
                mfaVar3.a = i | 8388608;
                mfaVar3.r = 1;
                if (strArr != null) {
                    int i11 = 0;
                    for (String str6 : strArr) {
                        if ("GESTURE".equals(str6)) {
                            i11++;
                            if (t7.c) {
                                t7.cD();
                                t7.c = false;
                            }
                            mfa mfaVar4 = (mfa) t7.b;
                            mfaVar4.a |= 8388608;
                            mfaVar4.r = 2;
                        } else if ("TAPPING_CORRECTED".equals(str6)) {
                            if (t7.c) {
                                t7.cD();
                                t7.c = false;
                            }
                            mfa mfaVar5 = (mfa) t7.b;
                            mfaVar5.a |= 2097152;
                            mfaVar5.q = true;
                        }
                    }
                    if (t7.c) {
                        t7.cD();
                        t7.c = false;
                    }
                    mfa mfaVar6 = (mfa) t7.b;
                    int i12 = mfaVar6.a | 32768;
                    mfaVar6.a = i12;
                    mfaVar6.k = i11;
                    if (i11 <= 0) {
                        int i13 = i12 | 4;
                        mfaVar6.a = i13;
                        mfaVar6.d = false;
                        mfaVar6.a = i13 | 16384;
                        mfaVar6.j = false;
                    } else if (strArr.length == i11) {
                        int i14 = i12 | 4;
                        mfaVar6.a = i14;
                        mfaVar6.d = true;
                        mfaVar6.a = i14 | 16384;
                        mfaVar6.j = false;
                    } else {
                        int i15 = i12 | 4;
                        mfaVar6.a = i15;
                        mfaVar6.d = false;
                        mfaVar6.a = i15 | 16384;
                        mfaVar6.j = true;
                    }
                }
                if (javVar != null && iArr != null) {
                    int length3 = iArr.length;
                    boolean z3 = false;
                    boolean z4 = false;
                    for (int i16 = 0; i16 < length3; i16++) {
                        int i17 = iArr[i16];
                        boolean z5 = !javVar.r("zh-CN") ? !(javVar.r("zh-TW") || javVar.r("zh-HK") ? i17 != 69 : !javVar.r("zh") ? !javVar.r("ko") || i17 != 9 : !(i17 == 16 || i17 == 69)) : i17 == 16;
                        z4 |= !z5;
                        z3 |= z5;
                    }
                    if (z3 && z4) {
                        if (t7.c) {
                            t7.cD();
                            t7.c = false;
                        }
                        mfa mfaVar7 = (mfa) t7.b;
                        mfaVar7.p = 2;
                        mfaVar7.a = 1048576 | mfaVar7.a;
                    } else if (z3) {
                        if (t7.c) {
                            t7.cD();
                            i3 = 0;
                            t7.c = false;
                        } else {
                            i3 = 0;
                        }
                        mfa mfaVar8 = (mfa) t7.b;
                        mfaVar8.p = i3;
                        mfaVar8.a = 1048576 | mfaVar8.a;
                    } else if (z4) {
                        if (t7.c) {
                            t7.cD();
                            t7.c = false;
                        }
                        mfa mfaVar9 = (mfa) t7.b;
                        mfaVar9.p = 1;
                        mfaVar9.a = 1048576 | mfaVar9.a;
                    }
                }
                if (!list2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = list2.size();
                    int min2 = Math.min(size2, ((Long) dca.a.c()).intValue());
                    if (hlnVar4 != null) {
                        min2--;
                    }
                    maf mafVar = null;
                    int i18 = 0;
                    for (int i19 = 0; i19 < size2; i19++) {
                        hln hlnVar6 = (hln) list2.get(i19);
                        if (mafVar != null && i18 == min2) {
                            break;
                        }
                        if (hlnVar4 != null && hlnVar6 == hlnVar4) {
                            mafVar = djt.b(hlnVar6, i19, hlnVar6 == hlnVar5);
                        } else if (i18 < min2) {
                            arrayList2.add(djt.b(hlnVar6, i19, hlnVar6 == hlnVar5));
                            i18++;
                        }
                    }
                    if (hlnVar4 != null) {
                        if (hlnVar4.e == hlm.PREDICTION) {
                            if (t7.c) {
                                t7.cD();
                                t7.c = false;
                            }
                            mfa mfaVar10 = (mfa) t7.b;
                            mfaVar10.a |= 8388608;
                            mfaVar10.r = 4;
                        } else if (hlnVar4.g) {
                            if (t7.c) {
                                t7.cD();
                                t7.c = false;
                            }
                            mfa mfaVar11 = (mfa) t7.b;
                            mfaVar11.a |= 8388608;
                            mfaVar11.r = 5;
                        }
                    }
                    if (mafVar != null) {
                        if (t7.c) {
                            t7.cD();
                            t7.c = false;
                        }
                        mfa mfaVar12 = (mfa) t7.b;
                        mfaVar12.e = mafVar;
                        mfaVar12.a |= 32;
                    }
                    t7.dn(arrayList2);
                }
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                mfa mfaVar13 = (mfa) t7.b;
                int i20 = mfaVar13.a | 512;
                mfaVar13.a = i20;
                mfaVar13.g = z;
                int i21 = i20 | 524288;
                mfaVar13.a = i21;
                mfaVar13.o = z2;
                int i22 = i21 | 131072;
                mfaVar13.a = i22;
                mfaVar13.m = i9;
                if (mesVar != null) {
                    mfaVar13.s = mesVar;
                    mfaVar13.a = i22 | 134217728;
                }
                nfh t8 = mbh.aT.t();
                hln hlnVar7 = djtVar8.h;
                if (hlnVar7 != null && hlnVar7.g) {
                    i2 = 11;
                } else if ("SELECT_CANDIDATE".equals(str)) {
                    hln hlnVar8 = djtVar8.h;
                    if (hlnVar8 == null || hlnVar8.e != hlm.PREDICTION) {
                        if (t7.c) {
                            t7.cD();
                            t7.c = false;
                        }
                        mfa mfaVar14 = (mfa) t7.b;
                        mfaVar14.a |= 8388608;
                        mfaVar14.r = 3;
                        i2 = 4;
                    } else {
                        i2 = 22;
                    }
                } else {
                    i2 = 3;
                }
                if (!djtVar8.f.isEmpty()) {
                    List list3 = djtVar8.f;
                    if (t7.c) {
                        t7.cD();
                        t7.c = false;
                    }
                    mfa mfaVar15 = (mfa) t7.b;
                    nga ngaVar = mfaVar15.i;
                    if (!ngaVar.c()) {
                        mfaVar15.i = nfm.H(ngaVar);
                    }
                    ndt.cs(list3, mfaVar15.i);
                    djtVar8.f.clear();
                }
                if (t8.c) {
                    t8.cD();
                    t8.c = false;
                }
                mbh mbhVar5 = (mbh) t8.b;
                mfa mfaVar16 = (mfa) t7.cz();
                mfaVar16.getClass();
                mbhVar5.f = mfaVar16;
                mbhVar5.a |= 2;
                djtVar8.k(t8, i2);
                djtVar8.g();
                djtVar8.q = 2;
                djtVar8.r = t7;
            }
        } else if (dja.TEXT_COMMIT_DELETED == idoVar) {
            djt djtVar9 = this.g;
            if (djtVar9.q == 2) {
                nfh t9 = mbh.aT.t();
                mae maeVar2 = mae.d;
                if (t9.c) {
                    t9.cD();
                    t9.c = false;
                }
                mbh mbhVar6 = (mbh) t9.b;
                maeVar2.getClass();
                mbhVar6.i = maeVar2;
                mbhVar6.a |= 64;
                djtVar9.k(t9, 5);
            }
            hlm hlmVar = hlm.RECOMMENDATION;
            hqe hqeVar = hqe.UNKNOWN;
            int i23 = djtVar9.q;
            int i24 = i23 - 1;
            if (i23 == 0) {
                throw null;
            }
            int i25 = 1;
            if (i24 != 1) {
                if (i24 == 2) {
                    djtVar9.q = 5;
                } else if (i24 == 3) {
                    ((ltd) ((ltd) djt.a.d()).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessor", "processTextCommitmentDeleted", 424, "HmmMetricsProcessor.java")).t("Unhandled continuous deletion");
                    djtVar9.i();
                    djtVar9.q = 1;
                } else if (i24 == 4) {
                    i25 = 1;
                }
            }
            djtVar9.q = 4;
            djtVar9.i();
            djtVar9.q = i25;
        } else if (dja.TEXT_COMPOSING_DELETED == idoVar) {
            Object obj5 = objArr[0];
            if (obj5 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 84, "HmmMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            djt djtVar10 = this.g;
            boolean booleanValue3 = ((Boolean) obj5).booleanValue();
            djtVar10.l = true;
            if (booleanValue3) {
                djtVar10.m = true;
            }
        } else if (dja.TOKEN_CANDIDATE_UNSELECTED == idoVar) {
            djt djtVar11 = this.g;
            djtVar11.o--;
        } else if (hfe.EVENT_UNHANDLED_BY_IME == idoVar) {
            djt djtVar12 = this.g;
            djtVar12.i();
            djtVar12.q = 1;
        } else if (hlw.SPACE_INSERTED_BEFORE_NEXT_COMPOSING == idoVar) {
            this.g.q = 3;
        } else if (hpb.IME_COMPOSING_ABORTED == idoVar) {
            Object obj6 = objArr[0];
            if (obj6 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 100, "HmmMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            djt djtVar13 = this.g;
            ((Boolean) obj6).booleanValue();
            djtVar13.j();
        } else if (hpb.IME_COMPOSING_CLEARED == idoVar) {
            djt djtVar14 = this.g;
            djtVar14.l = true;
            djtVar14.m = true;
            djtVar14.o = 0;
        } else if (hpb.IME_SELECTION_CHANGED == idoVar) {
            djt djtVar15 = this.g;
            hlm hlmVar2 = hlm.RECOMMENDATION;
            hqe hqeVar2 = hqe.UNKNOWN;
            if (((hqe) objArr[0]).ordinal() == 3) {
                djtVar15.n = true;
            }
        } else if (hpb.READING_TEXT_CANDIDATES_SET == idoVar) {
            djt djtVar16 = this.g;
            List list4 = (List) objArr[0];
            djtVar16.e.clear();
            if (list4 != null && !list4.isEmpty()) {
                djtVar16.e.addAll(list4);
            }
        } else if (hpb.TEXT_CANDIDATES_APPENDED == idoVar) {
            djt djtVar17 = this.g;
            List<hln> list5 = (List) objArr[0];
            djtVar17.g = (hln) objArr[1];
            djtVar17.h = null;
            if (djtVar17.p) {
                djtVar17.h();
            }
            if (list5 != null && !list5.isEmpty()) {
                for (hln hlnVar9 : list5) {
                    djtVar17.d.add(hlnVar9);
                }
                if (djtVar17.g == null) {
                    djtVar17.g = (hln) djtVar17.d.get(0);
                }
            }
        } else if (hpb.TEXT_CANDIDATES_UPDATED == idoVar) {
            Object obj7 = objArr[0];
            if (obj7 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 119, "HmmMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            djt djtVar18 = this.g;
            ((Boolean) obj7).booleanValue();
            djtVar18.p = true;
            return true;
        } else if (hry.INPUT_METHOD_ENTRY_CHANGED == idoVar) {
            Object obj8 = objArr[3];
            if (obj8 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 126, "HmmMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            djt djtVar19 = this.g;
            hqt hqtVar = (hqt) objArr[0];
            Collection collection = (Collection) objArr[2];
            ((Boolean) obj8).booleanValue();
            djtVar19.i = djt.a((hqt) objArr[1]);
        } else if (hsp.IMS_INPUT_FINISHED == idoVar) {
            Object obj9 = objArr[0];
            if (obj9 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 133, "HmmMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            djt djtVar20 = this.g;
            ((Boolean) obj9).booleanValue();
            djtVar20.j();
        } else if (hsp.IMS_INPUT_STARTED == idoVar) {
            Object obj10 = objArr[0];
            if (obj10 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 140, "HmmMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 144, "HmmMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 148, "HmmMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else {
                djt djtVar21 = this.g;
                ((Boolean) obj10).booleanValue();
                ((Number) objArr[1]).longValue();
                ((Number) objArr[2]).longValue();
                djtVar21.j();
            }
        } else if (hsp.IMS_INPUT_VIEW_STARTED == idoVar) {
            Object obj11 = objArr[0];
            if (obj11 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 155, "HmmMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 159, "HmmMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                djt djtVar22 = this.g;
                ((Number) obj11).longValue();
                ((Number) objArr[1]).longValue();
                hqt b2 = hqp.b();
                if (b2 != null) {
                    String locale = b2.h().q().toString();
                    din a2 = din.a(djtVar22.c.Q(din.b(locale)));
                    if (a2 != null) {
                        nfh t10 = mbh.aT.t();
                        mbl c2 = djt.c(a2, locale);
                        if (t10.c) {
                            t10.cD();
                            t10.c = false;
                        }
                        mbh mbhVar7 = (mbh) t10.b;
                        c2.getClass();
                        mbhVar7.T = c2;
                        mbhVar7.b |= Integer.MIN_VALUE;
                        djtVar22.k(t10, 163);
                    }
                }
            }
        } else if (hxo.EMOJI_KEY_IGNORED == idoVar) {
            this.g.d();
        } else if (hxo.GLOBE_KEY_IGNORED == idoVar) {
            this.g.d();
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/metrics/HmmMetricsProcessorHelper", "doProcessMetrics", 171, "HmmMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
