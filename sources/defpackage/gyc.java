package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gyc  reason: default package */
/* loaded from: classes.dex */
public final class gyc extends gxc {
    public static final gyc a = new gyc(false);
    public static final gyc b = new gyc(true);
    private final Handler c = new Handler(Looper.getMainLooper());
    private final boolean d;

    private gyc(boolean z) {
        this.d = z;
    }

    @Override // defpackage.gxc
    protected final void e(Runnable runnable, long j, TimeUnit timeUnit) {
        this.c.postDelayed(runnable, timeUnit.toMillis(j));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.d || !hjg.r()) {
            this.c.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.gxc, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("UiThreadExecutor cannot be terminated.");
    }

    @Override // defpackage.gxc, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("UiThreadExecutor cannot be terminated.");
    }
}
