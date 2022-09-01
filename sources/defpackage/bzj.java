package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzj  reason: default package */
/* loaded from: classes.dex */
public final class bzj extends byr {
    final /* synthetic */ String a;
    final /* synthetic */ bzr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzj(bzr bzrVar, String str, String str2) {
        super(str);
        this.b = bzrVar;
        this.a = str2;
    }

    @Override // defpackage.byr
    protected final void c(boolean z, Throwable th) {
        ((ltd) ((ltd) ((ltd) bzr.c.c()).i(th)).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksManagerImpl$18", "onSyncFailure", 947, "SuperpacksManagerImpl.java")).w("onFailure(): %s.sync failed", this.a);
    }

    @Override // defpackage.byr
    protected final void d(jre jreVar) {
        this.b.h.e(irk.STATE_REACHED, bzr.p(this.a), 3);
    }
}
