package defpackage;

/* compiled from: PG */
/* renamed from: dqs  reason: default package */
/* loaded from: classes.dex */
final class dqs extends hsw {
    final /* synthetic */ dqt a;

    public dqs(dqt dqtVar) {
        this.a = dqtVar;
    }

    @Override // defpackage.hsw
    public final void a(hsk hskVar) {
        dqt dqtVar = this.a;
        ((ltd) ((ltd) dqt.a.b()).k("com/google/android/apps/inputmethod/libs/mozc/extension/JapaneseMozcExtension", "onCreateServiceInternal", 72, "JapaneseMozcExtension.java")).t("onCreateServiceInternal()");
        dqtVar.c = new dri(hskVar.getApplicationContext(), dqtVar.b);
    }

    @Override // defpackage.hsw
    public final void d() {
        dqt dqtVar = this.a;
        ((ltd) ((ltd) dqt.a.b()).k("com/google/android/apps/inputmethod/libs/mozc/extension/JapaneseMozcExtension", "onDestroyServiceInternal", 79, "JapaneseMozcExtension.java")).t("onDestroyServiceInternal()");
        dri driVar = dqtVar.c;
        if (driVar != null) {
            driVar.f.e();
            driVar.c();
        }
        dqtVar.c = null;
    }
}
