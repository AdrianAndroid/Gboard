package defpackage;

/* compiled from: PG */
/* renamed from: fbq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fbq implements Runnable {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ fbq(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            boolean z = this.a;
            hsk b = hsx.b();
            if (b == null) {
                ((ltd) ((ltd) fbr.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeUtils", "toggleScreenAwakeInternal", 244, "VoiceImeUtils.java")).t("ServiceLifeCycleNotification does not have a GoogleInputMethodService instance. There is no way to get a Window instance to toggle FLAG_KEEP_SCREEN_ON.");
            } else if (z) {
                b.getWindow().getWindow().addFlags(128);
            } else {
                b.getWindow().getWindow().clearFlags(128);
            }
        } else if (i != 1) {
            boolean z2 = this.a;
            ((ltd) ((ltd) fcn.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoicePromoBanner", "lambda$showVoicePromoBanner$1", 65, "VoicePromoBanner.java")).t("voice promo banner displayed");
            ieh.j().e(fcn.a(z2), 1);
        } else {
            boolean z3 = this.a;
            ltg ltgVar = duz.a;
            dvf d = dvf.d();
            if (d == null) {
                return;
            }
            nfh t = bkp.b.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ((bkp) t.b).a = z3;
            bkp bkpVar = (bkp) t.cz();
            nfh t2 = fij.c.t();
            nfh t3 = fhi.b.t();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            bkpVar.getClass();
            ((fhi) t3.b).a = bkpVar;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            fij fijVar = (fij) t2.b;
            fhi fhiVar = (fhi) t3.cz();
            fhiVar.getClass();
            fijVar.b = fhiVar;
            fijVar.a = 4;
            d.e.c((fij) t2.cz());
        }
    }
}
