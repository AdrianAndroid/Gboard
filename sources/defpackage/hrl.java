package defpackage;

import com.google.android.apps.inputmethod.libs.latin5.PeriodicStatsRunner;

/* compiled from: PG */
/* renamed from: hrl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hrl implements geh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hrl(PeriodicStatsRunner periodicStatsRunner, int i) {
        this.b = i;
        this.a = periodicStatsRunner;
    }

    public /* synthetic */ hrl(rj rjVar, int i) {
        this.b = i;
        this.a = rjVar;
    }

    @Override // defpackage.geh
    public final void c() {
        if (this.b == 0) {
            Object obj = this.a;
            ltg ltgVar = hrx.a;
            ((rj) obj).c(llp.q());
            return;
        }
        Object obj2 = this.a;
        ((ltd) ((ltd) PeriodicStatsRunner.a.c()).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicStatsRunner", "lambda$call$2", 241, "PeriodicStatsRunner.java")).t("ULP getLanguagePreferences canceled.");
        PeriodicStatsRunner periodicStatsRunner = (PeriodicStatsRunner) obj2;
        periodicStatsRunner.c(periodicStatsRunner.d);
    }
}
