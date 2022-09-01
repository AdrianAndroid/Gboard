package defpackage;

/* compiled from: PG */
/* renamed from: bvz  reason: default package */
/* loaded from: classes.dex */
public final class bvz extends idb {
    public static final ido[] a = {bwa.ADD_ITEM_EVENT, bwa.AUTO_PASTE_TEXT_ITEM_PASTE_LENGTH, bwa.CHIP_EVENT, bwa.COPY_ACTION, bwa.ENTITY_CHIP_CLICKED, bwa.ENTITY_CHIP_SHOWN_UNIQUE, bwa.ENTITY_NUMBER_IN_ORIGINAL_TEXT, bwa.ITEM_BOARD_OPERATION, bwa.PASTE_ACTION_SOURCE, bwa.PASTE_EDIT_BOX_TYPE, bwa.PASTE_ITEM_TYPE, bwa.PIN_ITEM_TIME, bwa.SCREENSHOT_EVENT, bwa.TOP_LEVEL_OPERATION, bwa.UI_CLOSE, bwa.UI_OPEN, bwa.UNPINNED_ITEM_PASTE_TIME, bwa.USER_OPT_IN, bwa.USER_RETENTION};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper");
    private final bvy g;

    public bvz(bvy bvyVar) {
        this.g = bvyVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (bwa.ADD_ITEM_EVENT == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 27, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj).intValue());
            return true;
        } else if (bwa.AUTO_PASTE_TEXT_ITEM_PASTE_LENGTH == idoVar) {
            Object obj2 = objArr[0];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 34, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            bvy bvyVar = this.g;
            bvyVar.b.e("Clipboard.autoPasteTextItem.length", ((Number) obj2).longValue());
            return true;
        } else if (bwa.CHIP_EVENT == idoVar) {
            Object obj3 = objArr[0];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 41, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj3).intValue());
            return true;
        } else if (bwa.COPY_ACTION == idoVar) {
            bvy bvyVar2 = this.g;
            ido idoVar2 = bvyVar2.c.b;
            if (idoVar2 == null) {
                return true;
            }
            String b = idoVar2.b();
            if (!lfd.e(b)) {
                bvyVar2.b.c(b);
                return true;
            }
            ((ltd) bvy.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessor", "processCounterMetrics", 63, "ClipboardMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar2);
            return true;
        } else if (bwa.ENTITY_CHIP_CLICKED == idoVar) {
            Object obj4 = objArr[0];
            if (obj4 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 51, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj4).intValue());
            return true;
        } else if (bwa.ENTITY_CHIP_SHOWN_UNIQUE == idoVar) {
            Object obj5 = objArr[0];
            if (obj5 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 58, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj5).intValue());
            return true;
        } else if (bwa.ENTITY_NUMBER_IN_ORIGINAL_TEXT == idoVar) {
            Object obj6 = objArr[0];
            if (obj6 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 65, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj6).intValue());
            return true;
        } else if (bwa.ITEM_BOARD_OPERATION == idoVar) {
            Object obj7 = objArr[0];
            if (obj7 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 72, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj7).intValue());
            return true;
        } else if (bwa.PASTE_ACTION_SOURCE == idoVar) {
            Object obj8 = objArr[0];
            if (obj8 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 79, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj8).intValue());
            return true;
        } else if (bwa.PASTE_EDIT_BOX_TYPE == idoVar) {
            Object obj9 = objArr[0];
            if (obj9 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 86, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj9).intValue());
            return true;
        } else if (bwa.PASTE_ITEM_TYPE == idoVar) {
            Object obj10 = objArr[0];
            if (obj10 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 93, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj10).intValue());
            return true;
        } else if (bwa.PIN_ITEM_TIME == idoVar) {
            Object obj11 = objArr[0];
            if (obj11 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 100, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            bvy bvyVar3 = this.g;
            bvyVar3.b.e("Clipboard.pinItem-time", ((Number) obj11).longValue());
            return true;
        } else if (bwa.SCREENSHOT_EVENT == idoVar) {
            Object obj12 = objArr[0];
            if (obj12 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 107, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj12).intValue());
            return true;
        } else if (bwa.TOP_LEVEL_OPERATION == idoVar) {
            Object obj13 = objArr[0];
            if (obj13 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 114, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj13).intValue());
            return true;
        } else if (bwa.UI_CLOSE == idoVar) {
            Object obj14 = objArr[0];
            if (obj14 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 121, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj14).intValue());
            return true;
        } else if (bwa.UI_OPEN == idoVar) {
            Object obj15 = objArr[0];
            if (obj15 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 128, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj15).intValue());
            return true;
        } else if (bwa.UNPINNED_ITEM_PASTE_TIME == idoVar) {
            Object obj16 = objArr[0];
            if (obj16 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 135, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            bvy bvyVar4 = this.g;
            bvyVar4.b.e("Clipboard.unpinnedItemPaste-time", ((Number) obj16).longValue());
            return true;
        } else if (bwa.USER_OPT_IN == idoVar) {
            Object obj17 = objArr[0];
            if (obj17 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 142, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj17).intValue());
            return true;
        } else if (bwa.USER_RETENTION == idoVar) {
            Object obj18 = objArr[0];
            if (obj18 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 149, "ClipboardMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Number) obj18).intValue());
            return true;
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessorHelper", "doProcessMetrics", 155, "ClipboardMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
    }
}
