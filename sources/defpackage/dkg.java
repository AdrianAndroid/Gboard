package defpackage;

/* compiled from: PG */
/* renamed from: dkg  reason: default package */
/* loaded from: classes.dex */
public final class dkg extends byr {
    public final /* synthetic */ dkh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(dkh dkhVar, String str) {
        super(str);
        this.a = dkhVar;
    }

    @Override // defpackage.byr
    protected final void c(boolean z, Throwable th) {
        ((ltd) ((ltd) ((ltd) dkh.c.c()).i(th)).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/SuperpacksManagerBase$2", "onSyncFailure", (char) 206, "SuperpacksManagerBase.java")).t("sync()");
    }

    @Override // defpackage.byr
    protected final void d(jre jreVar) {
        ((ltd) ((ltd) dkh.c.b()).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/SuperpacksManagerBase$2", "onSyncSuccess", 186, "SuperpacksManagerBase.java")).w("sync(): complete %s", jreVar);
        dkh dkhVar = this.a;
        kcu.U(dkhVar.d.b(dkhVar.e), new buo(this, 14), this.a.h);
    }
}
