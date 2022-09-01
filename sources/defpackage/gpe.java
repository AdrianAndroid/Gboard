package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: gpe  reason: default package */
/* loaded from: classes.dex */
public final class gpe {
    public final long a;

    public gpe() {
        this.a = SystemClock.elapsedRealtime() + 5000;
    }

    public gpe(long j) {
        this.a = j;
    }

    public static gpe b(long j) {
        return new gpe(j);
    }

    public final Object a(Future future) {
        try {
            long max = Math.max(0L, this.a - SystemClock.elapsedRealtime());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (max > 0 && !future.isDone()) {
                bvq bvqVar = bnn.a;
            }
            return future.get(max, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(e);
        } catch (CancellationException e2) {
            throw new IOException(e2);
        } catch (ExecutionException e3) {
            throw new IOException(e3);
        } catch (TimeoutException e4) {
            throw new IOException("Timed out waiting for task :", e4);
        }
    }
}
