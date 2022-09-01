package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: mjl  reason: default package */
/* loaded from: classes.dex */
public final class mjl extends Enum implements Executor {
    public static final mjl a;
    private static final /* synthetic */ mjl[] b;

    static {
        mjl mjlVar = new mjl();
        a = mjlVar;
        b = new mjl[]{mjlVar};
    }

    private mjl() {
    }

    public static mjl[] values() {
        return (mjl[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
