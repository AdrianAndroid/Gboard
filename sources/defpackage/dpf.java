package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: dpf  reason: default package */
/* loaded from: classes.dex */
final class dpf extends hsw {
    final /* synthetic */ dpi a;

    public dpf(dpi dpiVar) {
        this.a = dpiVar;
    }

    @Override // defpackage.hsw
    public final void a(hsk hskVar) {
        dpi dpiVar = this.a;
        ((ltd) ((ltd) dpi.a.b()).k("com/google/android/apps/inputmethod/libs/lstm/LstmExtension", "onCreateServiceInternal", 124, "LstmExtension.java")).t("onCreateServiceInternal()");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        dpiVar.c();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        dpiVar.c.g(dpo.LSTM_EXTENSION_ON_CREATE_SERVICE, elapsedRealtime2);
        ((ltd) ((ltd) dpi.a.b()).k("com/google/android/apps/inputmethod/libs/lstm/LstmExtension", "onCreateServiceInternal", 131, "LstmExtension.java")).v("onCreateServiceInternal(): Finished in %d ms", elapsedRealtime2);
    }
}
