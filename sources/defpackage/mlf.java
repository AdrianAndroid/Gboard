package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: mlf  reason: default package */
/* loaded from: classes.dex */
public final class mlf implements Runnable {
    Object a;
    private final /* synthetic */ int b;

    public mlf(int i) {
        this.b = i;
    }

    public mlf(RuntimeException runtimeException, int i) {
        this.b = i;
        this.a = runtimeException;
    }

    public mlf(mlh mlhVar, int i) {
        this.b = i;
        this.a = mlhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mko mkoVar;
        if (this.b == 0) {
            Object obj = this.a;
            if (obj == null || (mkoVar = ((mlh) obj).a) == null) {
                return;
            }
            this.a = null;
            if (mkoVar.isDone()) {
                ((mik) obj).p(mkoVar);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = ((mlh) obj).b;
                ((mlh) obj).b = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                }
                ((mik) obj).n(new mlg(str + ": " + mkoVar));
                return;
            } finally {
                mkoVar.cancel(true);
            }
        }
        throw ((Throwable) this.a);
    }
}
