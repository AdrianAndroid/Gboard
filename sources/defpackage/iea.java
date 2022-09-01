package defpackage;

/* compiled from: PG */
/* renamed from: iea  reason: default package */
/* loaded from: classes.dex */
public final class iea implements ijj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iea(fbu fbuVar, int i) {
        this.b = i;
        this.a = fbuVar;
    }

    public iea(hyy hyyVar, int i) {
        this.b = i;
        this.a = hyyVar;
    }

    public iea(iez iezVar, int i) {
        this.b = i;
        this.a = iezVar;
    }

    @Override // defpackage.ijj
    public final void fe(Class cls) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ((hyy) this.a).h();
            } else {
                ((fbu) this.a).j(null);
            }
        }
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fd(ijg ijgVar) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                hza hzaVar = (hza) ijgVar;
                ((hyy) this.a).f();
                return;
            }
            jcg jcgVar = (jcg) ijgVar;
            if (jcgVar.a.isEmpty()) {
                return;
            }
            ((fbu) this.a).j((jbz) jcgVar.a.values().iterator().next());
            return;
        }
        idi idiVar = ((ieb) ijgVar).a;
        iez iezVar = (iez) this.a;
        if (iezVar.d != null) {
            ((ltd) ((ltd) iez.a.c()).k("com/google/android/libraries/inputmethod/metricsprocessormanager/MetricsProcessorProviderManager", "onClearcutAdapterReady", 97, "MetricsProcessorProviderManager.java")).t("Clearcut is already set.");
            return;
        }
        ((ltd) ((ltd) iez.a.b()).k("com/google/android/libraries/inputmethod/metricsprocessormanager/MetricsProcessorProviderManager", "onClearcutAdapterReady", 103, "MetricsProcessorProviderManager.java")).t("onClearcutAdapterReady");
        iezVar.d = idiVar;
        if (iezVar.e == null) {
            iezVar.e = new iey(iezVar);
            iezVar.e.a(mjl.a);
        }
        ((ltd) ((ltd) iez.a.b()).k("com/google/android/libraries/inputmethod/metricsprocessormanager/MetricsProcessorProviderManager", "onClearcutAdapterReady", 106, "MetricsProcessorProviderManager.java")).t("Stop caching metrics after clearcut and available modules ready.");
        iezVar.f.n();
    }
}
