package defpackage;

/* compiled from: PG */
/* renamed from: bsv  reason: default package */
/* loaded from: classes.dex */
public final class bsv extends idb {
    public static final ido[] a = {bsw.FULL_SCREEN_TRANSLATE_DISABLED, bsw.FULL_SCREEN_TRANSLATE_ENABLED, bsw.PROMPT_SHOWN, bsw.USER_CLICK_NO, bsw.USER_OPT_IN};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/autotranslate/AutoTranslateMetricsProcessorHelper");
    private final bsu g;

    public bsv(bsu bsuVar) {
        this.g = bsuVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (bsw.FULL_SCREEN_TRANSLATE_DISABLED == idoVar) {
            this.g.a();
            return true;
        } else if (bsw.FULL_SCREEN_TRANSLATE_ENABLED == idoVar) {
            this.g.a();
            return true;
        } else if (bsw.PROMPT_SHOWN == idoVar) {
            this.g.a();
            return true;
        } else if (bsw.USER_CLICK_NO == idoVar) {
            this.g.a();
            return true;
        } else if (bsw.USER_OPT_IN == idoVar) {
            this.g.a();
            return true;
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/autotranslate/AutoTranslateMetricsProcessorHelper", "doProcessMetrics", 41, "AutoTranslateMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
    }
}
