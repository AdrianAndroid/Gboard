package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mlj  reason: default package */
/* loaded from: classes.dex */
public final class mlj extends mkn {
    final /* synthetic */ mlk a;
    private final Callable b;

    public mlj(mlk mlkVar, Callable callable) {
        this.a = mlkVar;
        jdg.u(callable);
        this.b = callable;
    }

    @Override // defpackage.mkn
    public final Object a() {
        return this.b.call();
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
    public final void e(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.mkn
    public final boolean g() {
        return this.a.isDone();
    }
}
