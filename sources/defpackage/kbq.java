package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kbq  reason: default package */
/* loaded from: classes.dex */
final class kbq implements Executor, kcd {
    private final kcl a;
    private Runnable b;
    private boolean c;
    private boolean d;

    public kbq(kcl kclVar) {
        this.a = kclVar;
    }

    private final void b(Runnable runnable) {
        if (this.d) {
            return;
        }
        this.d = true;
        runnable.run();
    }

    @Override // defpackage.kcd
    public final void a(Activity activity) {
        this.a.b(this);
        synchronized (this) {
            Runnable runnable = this.b;
            if (runnable != null) {
                b(runnable);
                this.b = null;
            } else {
                this.c = true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this) {
            if (!this.c) {
                Object obj = ((kdg) this.a.a).a;
                int i = kcm.c;
                if (((kcm) obj).b.get() <= 0) {
                    this.b = runnable;
                }
            }
            b(runnable);
        }
    }
}
