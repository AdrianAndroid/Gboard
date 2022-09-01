package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* renamed from: anf  reason: default package */
/* loaded from: classes.dex */
final class anf extends FutureTask {
    final /* synthetic */ ang a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anf(ang angVar, Callable callable) {
        super(callable);
        this.a = angVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (isCancelled()) {
            return;
        }
        try {
            this.a.c((ane) get());
        } catch (InterruptedException | ExecutionException e) {
            this.a.c(new ane(e));
        }
    }
}
