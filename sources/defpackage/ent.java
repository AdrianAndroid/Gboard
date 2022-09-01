package defpackage;

/* compiled from: PG */
/* renamed from: ent  reason: default package */
/* loaded from: classes.dex */
public final class ent extends idb {
    public static final ido[] a = {hsp.IMS_INPUT_VIEW_FINISHED, iqu.SC_ADD_TO_DICT, iqu.SC_ADD_TO_DICT_UNDO, iqu.SC_IGNORE_SUGGESTION, iqu.SC_LANGUAGE_BASED_TRIGGER_MODEL, iqu.SC_REJECT_SUGGESTION, iqu.SC_REQUEST_PERFORMANCE, iqu.SC_RULE_BASED_TRIGGER_MODEL, iqu.SC_SELECT_SUGGESTION, iqu.SC_SHOW_SUGGESTION, iqu.SC_SPELLING_CHECK_REQUEST_GBOARD, iqu.SC_SPELLING_CHECK_REQUEST_THIRD_PARTY, iqu.SC_STARTUP_PERFORMANCE, iqu.SC_SUGGESTION_PROPOSED};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper");
    private final ens g;

    public ent(ens ensVar) {
        this.g = ensVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (hsp.IMS_INPUT_VIEW_FINISHED == idoVar) {
            ens ensVar = this.g;
            mcu mcuVar = (mcu) objArr[0];
            if (((med) ensVar.d.b).b.size() > 0) {
                nfh nfhVar = ensVar.c;
                nfh nfhVar2 = ensVar.d;
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mbh mbhVar = (mbh) nfhVar.b;
                med medVar = (med) nfhVar2.cz();
                mbh mbhVar2 = mbh.aT;
                medVar.getClass();
                mbhVar.m = medVar;
                mbhVar.a |= 2048;
                ensVar.g(ensVar.c, 301, ensVar.a, ensVar.b);
            }
            nfh nfhVar3 = ensVar.d;
            nfhVar3.b = (nfm) nfhVar3.b.N(4);
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            med.b((med) nfhVar3.b);
        } else if (iqu.SC_ADD_TO_DICT == idoVar) {
            this.g.c((meb) objArr[0]);
        } else if (iqu.SC_ADD_TO_DICT_UNDO == idoVar) {
            this.g.c((meb) objArr[0]);
        } else if (iqu.SC_IGNORE_SUGGESTION == idoVar) {
            this.g.c((meb) objArr[0]);
        } else if (iqu.SC_LANGUAGE_BASED_TRIGGER_MODEL == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper", "doProcessMetrics", 41, "SpellCheckerMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.b(((Number) obj).intValue());
        } else if (iqu.SC_REJECT_SUGGESTION == idoVar) {
            this.g.c((meb) objArr[0]);
        } else if (iqu.SC_REQUEST_PERFORMANCE == idoVar) {
            Object obj2 = objArr[0];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper", "doProcessMetrics", 51, "SpellCheckerMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper", "doProcessMetrics", 55, "SpellCheckerMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper", "doProcessMetrics", 59, "SpellCheckerMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper", "doProcessMetrics", 63, "SpellCheckerMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else {
                ens ensVar2 = this.g;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                int intValue = ((Number) objArr[1]).intValue();
                int intValue2 = ((Number) objArr[2]).intValue();
                long longValue = ((Number) objArr[3]).longValue();
                idb idbVar = ensVar2.e;
                ensVar2.a = idbVar.c;
                ensVar2.b = idbVar.d;
                nfh t = mef.f.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mef mefVar = (mef) t.b;
                int i = mefVar.a | 1;
                mefVar.a = i;
                mefVar.b = booleanValue;
                int i2 = i | 4;
                mefVar.a = i2;
                mefVar.d = intValue2;
                int i3 = i2 | 8;
                mefVar.a = i3;
                mefVar.e = intValue;
                mefVar.a = i3 | 2;
                mefVar.c = longValue;
                mef mefVar2 = (mef) t.cz();
                nfh nfhVar4 = ensVar2.d;
                if (nfhVar4.c) {
                    nfhVar4.cD();
                    nfhVar4.c = false;
                }
                med medVar2 = (med) nfhVar4.b;
                med medVar3 = med.d;
                mefVar2.getClass();
                nga ngaVar = medVar2.b;
                if (!ngaVar.c()) {
                    medVar2.b = nfm.H(ngaVar);
                }
                medVar2.b.add(mefVar2);
            }
        } else if (iqu.SC_RULE_BASED_TRIGGER_MODEL == idoVar) {
            Object obj3 = objArr[0];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper", "doProcessMetrics", 70, "SpellCheckerMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.b(((Number) obj3).intValue());
        } else if (iqu.SC_SELECT_SUGGESTION == idoVar) {
            Object obj4 = objArr[1];
            if (obj4 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper", "doProcessMetrics", 77, "SpellCheckerMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            ens ensVar3 = this.g;
            meb mebVar = (meb) objArr[0];
            int intValue3 = ((Number) obj4).intValue();
            nfh nfhVar5 = ensVar3.c;
            nfh t2 = mec.g.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mec mecVar = (mec) t2.b;
            mecVar.c = 4;
            int i4 = mecVar.a | 2;
            mecVar.a = i4;
            mecVar.d = mebVar.d;
            int i5 = i4 | 4;
            mecVar.a = i5;
            mecVar.a = i5 | 16;
            mecVar.f = intValue3;
            mec mecVar2 = (mec) t2.cz();
            if (nfhVar5.c) {
                nfhVar5.cD();
                nfhVar5.c = false;
            }
            mbh mbhVar3 = (mbh) nfhVar5.b;
            mbh mbhVar4 = mbh.aT;
            mecVar2.getClass();
            mbhVar3.k = mecVar2;
            mbhVar3.a |= 512;
            ensVar3.d(ensVar3.c, 286);
        } else if (iqu.SC_SHOW_SUGGESTION == idoVar) {
            this.g.c((meb) objArr[0]);
        } else if (iqu.SC_SPELLING_CHECK_REQUEST_GBOARD == idoVar) {
            Object obj5 = objArr[0];
            if (obj5 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper", "doProcessMetrics", 87, "SpellCheckerMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Boolean) obj5).booleanValue());
        } else if (iqu.SC_SPELLING_CHECK_REQUEST_THIRD_PARTY == idoVar) {
            Object obj6 = objArr[0];
            if (obj6 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper", "doProcessMetrics", 94, "SpellCheckerMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Boolean) obj6).booleanValue());
        } else if (iqu.SC_STARTUP_PERFORMANCE == idoVar) {
            Object obj7 = objArr[2];
            if (obj7 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper", "doProcessMetrics", 101, "SpellCheckerMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper", "doProcessMetrics", 105, "SpellCheckerMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else {
                ens ensVar4 = this.g;
                String str = (String) objArr[1];
                int intValue4 = ((Number) obj7).intValue();
                long longValue2 = ((Number) objArr[3]).longValue();
                nfh t3 = meg.f.t();
                String str2 = ((jav) objArr[0]).n;
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                meg megVar = (meg) t3.b;
                str2.getClass();
                int i6 = 4 | megVar.a;
                megVar.a = i6;
                megVar.d = str2;
                str.getClass();
                int i7 = i6 | 1;
                megVar.a = i7;
                megVar.b = str;
                int i8 = i7 | 2;
                megVar.a = i8;
                megVar.c = intValue4;
                megVar.a = i8 | 8;
                megVar.e = longValue2;
                meg megVar2 = (meg) t3.cz();
                nfh t4 = med.d.t();
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                med.b((med) t4.b);
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                med medVar4 = (med) t4.b;
                megVar2.getClass();
                medVar4.c = megVar2;
                medVar4.a |= 2;
                med medVar5 = (med) t4.cz();
                nfh nfhVar6 = ensVar4.c;
                if (nfhVar6.c) {
                    nfhVar6.cD();
                    nfhVar6.c = false;
                }
                mbh mbhVar5 = (mbh) nfhVar6.b;
                mbh mbhVar6 = mbh.aT;
                medVar5.getClass();
                mbhVar5.m = medVar5;
                mbhVar5.a |= 2048;
                ensVar4.d(ensVar4.c, 301);
            }
        } else if (iqu.SC_SUGGESTION_PROPOSED == idoVar) {
            ens ensVar5 = this.g;
            mee meeVar = (mee) objArr[0];
            nfh nfhVar7 = ensVar5.c;
            if (nfhVar7.c) {
                nfhVar7.cD();
                nfhVar7.c = false;
            }
            mbh mbhVar7 = (mbh) nfhVar7.b;
            mbh mbhVar8 = mbh.aT;
            meeVar.getClass();
            mbhVar7.l = meeVar;
            mbhVar7.a |= 1024;
            ensVar5.d(ensVar5.c, 287);
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/spellchecker/metrics/SpellCheckerMetricsProcessorHelper", "doProcessMetrics", 114, "SpellCheckerMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
