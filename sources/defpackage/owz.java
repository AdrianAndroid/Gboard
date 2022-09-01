package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: owz  reason: default package */
/* loaded from: classes2.dex */
final class owz implements Executor {
    public final Executor a;
    public final Runnable b = new owv(this, 4);
    public final ArrayDeque c = new ArrayDeque();
    public boolean d;

    public owz(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            this.c.addLast(runnable);
            try {
                this.a.execute(this.b);
            } catch (RejectedExecutionException unused) {
                this.c.removeLast();
            }
        }
    }
}
