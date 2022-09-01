package defpackage;

import com.google.android.apps.inputmethod.libs.latin5.PeriodicStatsRunner;
import com.google.android.apps.inputmethod.libs.latin5.PeriodicTaskRunner;

/* compiled from: PG */
/* renamed from: dor  reason: default package */
/* loaded from: classes.dex */
public final class dor implements mka {
    final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public dor(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        if (this.b == 0) {
            PeriodicTaskRunner.c(isa.ON_FAILURE, this.a);
            ((ltd) ((ltd) ((ltd) PeriodicTaskRunner.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicTaskRunner$1", "onFailure", (char) 168, "PeriodicTaskRunner.java")).t("Failed to run PeriodicTask.");
            return;
        }
        PeriodicStatsRunner.d(isa.ON_FAILURE, this.a);
        ((ltd) ((ltd) ((ltd) PeriodicStatsRunner.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicStatsRunner$1", "onFailure", (char) 148, "PeriodicStatsRunner.java")).t("Failed to run PeriodicTask.");
    }

    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        if (this.b == 0) {
            isb isbVar = (isb) obj;
            PeriodicTaskRunner.c(isa.ON_SUCCESS, this.a);
            return;
        }
        isb isbVar2 = (isb) obj;
        PeriodicStatsRunner.d(isa.ON_SUCCESS, this.a);
    }
}
