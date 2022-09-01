package defpackage;

/* compiled from: PG */
/* renamed from: izy  reason: default package */
/* loaded from: classes.dex */
public final class izy extends idb {
    public static final ido[] a = {izw.a};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCacheStatsMetricsProcessorHelper");
    private final dxn g;

    public izy(dxn dxnVar, byte[] bArr) {
        this.g = dxnVar;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, idi] */
    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (izw.a != idoVar) {
            ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCacheStatsMetricsProcessorHelper", "doProcessMetrics", 30, "UserFeatureCacheStatsMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        dxn dxnVar = this.g;
        ido idoVar2 = ((idb) dxnVar.b).b;
        if (idoVar2 == null || idoVar2.b() == null) {
            return true;
        }
        dxnVar.a.c(idoVar2.b());
        return true;
    }
}
