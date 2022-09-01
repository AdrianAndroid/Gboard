package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jjp  reason: default package */
/* loaded from: classes.dex */
public final class jjp implements Executor {
    private final Executor a;
    private final Object b = new Object();
    private int c = 0;
    private final Queue d = new ArrayDeque();

    public jjp(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        synchronized (this.b) {
            Runnable runnable = (Runnable) this.d.poll();
            if (runnable == null) {
                this.c--;
                return;
            }
            try {
                this.a.execute(new aww(this, runnable, 2));
            } catch (Throwable th) {
                jmk.e(th, "%s: Task submission failed: %s", "ThrottlingExecutor", runnable);
                synchronized (this.b) {
                    this.c--;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        jdg.u(runnable);
        synchronized (this.b) {
            int i = this.c;
            if (i < 2) {
                this.c = i + 1;
                try {
                    this.a.execute(new aww(this, runnable, 2));
                    return;
                } catch (Throwable th) {
                    synchronized (this.b) {
                        this.c--;
                        throw th;
                    }
                }
            }
            this.d.add(runnable);
        }
    }
}
