package defpackage;

/* compiled from: PG */
/* renamed from: hgh  reason: default package */
/* loaded from: classes.dex */
final class hgh implements gek {
    final /* synthetic */ String a = "tenoranimation_feature_split";
    final /* synthetic */ hgj b;
    final /* synthetic */ iiy c;

    public hgh(hgj hgjVar, iiy iiyVar) {
        this.b = hgjVar;
        this.c = iiyVar;
    }

    @Override // defpackage.gek
    public final void d(Exception exc) {
        lau lauVar = exc instanceof lau ? (lau) exc : null;
        int b = lauVar != null ? lauVar.b() : -100;
        if (b == -5) {
            ((ltd) hgj.a.b()).j(ltp.e("com/google/android/libraries/inputmethod/featuresplit/FeatureSplitObservationModule$requestDeferredInstall$2", "onFailure", 92, "")).w("API_NOT_AVAILABLE: Pretend to successfully call deferredInstall for %s, but explicit startInstall() is required to install it.", this.a);
            this.b.g(this.c);
            return;
        }
        ((ltd) ((ltd) hgj.a.d()).i(exc)).j(ltp.e("com/google/android/libraries/inputmethod/featuresplit/FeatureSplitObservationModule$requestDeferredInstall$2", "onFailure", 99, "")).w("Failed in installing %s.", this.a);
        ieh.j().e(hgu.DEFERRED_INSTALL_FAILED, nxp.n(this.a), Integer.valueOf(b));
    }
}
