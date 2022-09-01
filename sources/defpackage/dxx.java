package defpackage;

/* compiled from: PG */
/* renamed from: dxx  reason: default package */
/* loaded from: classes.dex */
public final class dxx extends idb {
    public static final ido[] a = {dda.SHARED_PREFERENCE_CHANGED};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/pinyin/PinyinMetricsProcessorHelper");
    private final dxw g;

    public dxx(dxw dxwVar) {
        this.g = dxwVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (dda.SHARED_PREFERENCE_CHANGED == idoVar) {
            dxw dxwVar = this.g;
            if (dxwVar.b.contains((String) objArr[0])) {
                int i = ((mcc) dxwVar.c.b).L;
                dxwVar.a();
                if (i != ((mcc) dxwVar.c.b).L) {
                    nfh t = mbh.aT.t();
                    nfh nfhVar = dxwVar.c;
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mbh mbhVar = (mbh) t.b;
                    mcc mccVar = (mcc) nfhVar.cz();
                    mccVar.getClass();
                    mbhVar.e = mccVar;
                    mbhVar.a |= 1;
                    idi idiVar = dxwVar.a;
                    idb idbVar = dxwVar.d;
                    idiVar.f((mbh) t.cz(), 2, idbVar.c, idbVar.d);
                }
            }
            return true;
        }
        ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/pinyin/PinyinMetricsProcessorHelper", "doProcessMetrics", 29, "PinyinMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
        return false;
    }
}
