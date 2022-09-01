package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: epn  reason: default package */
/* loaded from: classes.dex */
final class epn implements mka {
    final /* synthetic */ eqg a;
    final /* synthetic */ float b;
    final /* synthetic */ dlm c;
    final /* synthetic */ epo d;

    public epn(epo epoVar, eqg eqgVar, float f, dlm dlmVar) {
        this.d = epoVar;
        this.a = eqgVar;
        this.b = f;
        this.c = dlmVar;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) ((ltd) epo.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeBuilderBrightnessPage$1", "onFailure", (char) 186, "ThemeBuilderBrightnessPage.java")).t("get current input method entry failed.");
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        hqt hqtVar = (hqt) obj;
        if (hqtVar != null) {
            iav g = hqtVar.g();
            if (g == null) {
                ((ltd) ((ltd) epo.a.c()).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeBuilderBrightnessPage$1", "onSuccess", 157, "ThemeBuilderBrightnessPage.java")).w("no imeDef found for %s", hqtVar.i());
                return;
            }
            ibw ibwVar = g.f;
            int e = hyq.e(ibwVar.i, ibwVar.h);
            Context context = this.d.b;
            new dlq(context, new ess(context, this.a, e), dds.a, this.b).e(g, g.b, hqtVar, ibz.a, hqtVar.c(e), this.c);
        }
    }
}
