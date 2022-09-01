package defpackage;

/* compiled from: PG */
/* renamed from: obn  reason: default package */
/* loaded from: classes2.dex */
final class obn extends nua {
    final /* synthetic */ Throwable a;
    private final ntw b;

    public obn(Throwable th) {
        this.a = th;
        this.b = ntw.a(nvu.k.f("Panic! This is a bug!").e(th));
    }

    @Override // defpackage.nua
    public final ntw a() {
        return this.b;
    }

    public final String toString() {
        lfa R = jdg.R(obn.class);
        R.b("panicPickResult", this.b);
        return R.toString();
    }
}
