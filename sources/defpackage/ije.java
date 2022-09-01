package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ije  reason: default package */
/* loaded from: classes.dex */
public final class ije extends ija {
    public boolean a;
    private final ijd b;

    public ije(boolean z, Runnable runnable, Runnable runnable2, Class cls) {
        super(z, runnable, runnable2);
        this.b = new ijd(this, cls);
    }

    @Override // defpackage.ija
    public final synchronized void d(Executor executor) {
        super.a();
        ijd ijdVar = this.b;
        ijl.b().h(ijdVar, ijdVar.a, ijf.e(executor));
    }

    @Override // defpackage.ija
    public final synchronized void e(Executor executor) {
        super.a();
        this.b.d(ijf.e(executor));
    }

    @Override // defpackage.ija
    public final synchronized void f() {
        super.f();
        this.b.e();
    }
}
