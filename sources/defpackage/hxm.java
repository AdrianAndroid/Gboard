package defpackage;

import android.text.TextUtils;
import java.util.EnumSet;

/* compiled from: PG */
/* renamed from: hxm  reason: default package */
/* loaded from: classes.dex */
public final class hxm extends idc implements idm {
    private static final ltg b = ltg.j("com/google/android/libraries/inputmethod/keythrottler/KeyThrotterMetricsProcessor");
    private idb c;

    public hxm(idi idiVar) {
        super(idiVar);
    }

    private final idb g() {
        if (this.c == null) {
            this.c = new hxn(this);
        }
        return this.c;
    }

    @Override // defpackage.idr
    public final lmz a() {
        return lmz.p(EnumSet.allOf(hxr.class));
    }

    public final void c(int i) {
        ido idoVar = g().b;
        if (idoVar != null) {
            String b2 = idoVar.b();
            if (!TextUtils.isEmpty(b2)) {
                this.a.d(b2, i);
            } else {
                ((ltd) b.a(hip.a).k("com/google/android/libraries/inputmethod/keythrottler/KeyThrotterMetricsProcessor", "processIntegerHistogramMetrics", 81, "KeyThrotterMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    public final void d() {
        ido idoVar = g().b;
        if (idoVar == null) {
            return;
        }
        String b2 = idoVar.b();
        if (!TextUtils.isEmpty(b2)) {
            this.a.c(b2);
        } else {
            ((ltd) b.a(hip.a).k("com/google/android/libraries/inputmethod/keythrottler/KeyThrotterMetricsProcessor", "processKeyIgnored", 66, "KeyThrotterMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
        }
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        g().b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idm
    public final ido[] t() {
        g();
        return hxn.a;
    }
}
