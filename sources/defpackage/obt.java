package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: obt  reason: default package */
/* loaded from: classes2.dex */
final class obt implements Executor {
    private final oda a;
    private Executor b;

    public obt(oda odaVar) {
        this.a = odaVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    final synchronized Executor a() {
        if (this.b == null) {
            ?? a = this.a.a();
            jdg.O(a, "%s.getObject()", this.b);
            this.b = a;
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        Executor executor = this.b;
        if (executor != null) {
            this.a.b(executor);
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a().execute(runnable);
    }
}
