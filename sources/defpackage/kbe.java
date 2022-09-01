package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: kbe  reason: default package */
/* loaded from: classes.dex */
public final class kbe implements Executor {
    public final mks a;
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    private volatile boolean c = false;
    private final AtomicBoolean d = new AtomicBoolean();

    public kbe(mks mksVar, kcl kclVar) {
        this.a = mksVar;
        kbq kbqVar = new kbq(kclVar);
        kclVar.a(kbqVar);
        kbqVar.execute(new joq(this, 2));
    }

    private final void b() {
        while (true) {
            Runnable runnable = (Runnable) this.b.poll();
            if (runnable != null) {
                this.a.execute(runnable);
            } else {
                return;
            }
        }
    }

    public final void a() {
        this.c = true;
        b();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.c) {
            this.a.execute(runnable);
            return;
        }
        this.b.add(runnable);
        if (this.c) {
            b();
        } else if (this.d.getAndSet(true)) {
        } else {
            this.a.b(new jiz(this, 4), 7000L, TimeUnit.MILLISECONDS);
        }
    }
}
