package defpackage;

/* compiled from: PG */
/* renamed from: bsu  reason: default package */
/* loaded from: classes.dex */
public final class bsu implements idm {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/autotranslate/AutoTranslateMetricsProcessor");
    private final idi b;
    private final idb c = new bsv(this);

    public bsu(idi idiVar) {
        this.b = idiVar;
    }

    public final void a() {
        ido idoVar = this.c.b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.b.c(b);
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/autotranslate/AutoTranslateMetricsProcessor", "processCounterMetrics", 56, "AutoTranslateMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.c.b(idoVar, iduVar, j, j2, objArr);
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
        return bsv.a;
    }
}
