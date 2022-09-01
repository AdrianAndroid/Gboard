package defpackage;

/* compiled from: PG */
/* renamed from: bvy  reason: default package */
/* loaded from: classes.dex */
public final class bvy implements idm {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessor");
    public final idi b;
    public idb c;

    public bvy(idi idiVar) {
        this.b = idiVar;
    }

    private final idb b() {
        if (this.c == null) {
            this.c = new bvz(this);
        }
        return this.c;
    }

    public final void a(int i) {
        ido idoVar = this.c.b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.b.d(b, i);
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardMetricsProcessor", "processIntegerHistogramMetrics", 93, "ClipboardMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
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
        b().b(idoVar, iduVar, j, j2, objArr);
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
        b();
        return bvz.a;
    }
}
