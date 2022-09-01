package defpackage;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: kgl  reason: default package */
/* loaded from: classes.dex */
public final class kgl extends ker implements kdt, kch {
    private static final ltg a = ltg.j("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl");
    private final kcl b;

    public kgl(kcl kclVar) {
        super((byte[]) null);
        new AtomicBoolean();
        this.b = kclVar;
    }

    @Override // defpackage.kdt
    public final void ad() {
        this.b.a(this);
    }

    @Override // defpackage.kch
    public final void c(Activity activity) {
        this.b.b(this);
        kgk kgkVar = kgk.a;
        long j = kgkVar.b;
        long j2 = kgkVar.c;
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl", "onAppToBackground", 256, "StartupMetricServiceImpl.java")).t("missing firstDraw timestamp");
    }
}
