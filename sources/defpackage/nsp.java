package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: nsp  reason: default package */
/* loaded from: classes2.dex */
final class nsp extends Enum implements Executor {
    public static final nsp a;
    private static final /* synthetic */ nsp[] b;

    static {
        nsp nspVar = new nsp();
        a = nspVar;
        b = new nsp[]{nspVar};
    }

    private nsp() {
    }

    public static nsp[] values() {
        return (nsp[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Context.DirectExecutor";
    }
}
