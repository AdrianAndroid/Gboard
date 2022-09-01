package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bga  reason: default package */
/* loaded from: classes.dex */
public final class bga implements Executor {
    private final /* synthetic */ int a;

    public bga(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            runnable.run();
        } else if (i != 1) {
            runnable.run();
        } else {
            bgj.k(runnable);
        }
    }
}
