package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mli  reason: default package */
/* loaded from: classes.dex */
public final class mli extends mkn {
    final /* synthetic */ mlk a;
    private final mix b;

    public mli(mlk mlkVar, mix mixVar) {
        this.a = mlkVar;
        jdg.u(mixVar);
        this.b = mixVar;
    }

    @Override // defpackage.mkn
    public final /* bridge */ /* synthetic */ Object a() {
        mko a = this.b.a();
        jdg.O(a, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.b);
        return a;
    }

    @Override // defpackage.mkn
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.mkn
    public final void d(Throwable th) {
        this.a.n(th);
    }

    @Override // defpackage.mkn
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.p((mko) obj);
    }

    @Override // defpackage.mkn
    public final boolean g() {
        return this.a.isDone();
    }
}
