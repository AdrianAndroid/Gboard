package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbm  reason: default package */
/* loaded from: classes.dex */
public final class dbm implements mka {
    final /* synthetic */ int a;
    final /* synthetic */ dbn b;

    public dbm(dbn dbnVar, int i) {
        this.b = dbnVar;
        this.a = i;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) dbn.b.a(hip.a).i(th)).k("com/google/android/apps/inputmethod/libs/extension/AbstractOpenableExtension$1", "onFailure", 147, "AbstractOpenableExtension.java")).z("failed to parse keyboard group def : %d -> %s. ", this.a, this.b.c.getResources().getResourceEntryName(this.a));
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ibw ibwVar = (ibw) obj;
    }
}
