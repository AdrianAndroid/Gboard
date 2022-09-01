package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jxf  reason: default package */
/* loaded from: classes.dex */
public final class jxf implements kau {
    final /* synthetic */ jxg a;

    public jxf(jxg jxgVar) {
        this.a = jxgVar;
    }

    @Override // defpackage.kau
    public final void c() {
    }

    @Override // defpackage.kau
    public final void d() {
        lug lugVar = jsh.a;
        if (this.a.a.compareAndSet(true, false)) {
            this.a.b.a(jqp.a);
        }
    }

    @Override // defpackage.kau
    public final void e() {
        ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/packs/HttpDownloadProtocol$LifecycleCallbackImpl", "pausedForConnectivity", 301, "HttpDownloadProtocol.java")).t("All downloads are paused waiting for connectivity.");
        if (this.a.a.compareAndSet(false, true)) {
            this.a.b.a(jqp.a);
        }
    }
}
