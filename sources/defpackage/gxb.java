package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gxb  reason: default package */
/* loaded from: classes.dex */
final class gxb extends mjy implements mkq {
    private final long a;

    public gxb(mko mkoVar, long j, TimeUnit timeUnit) {
        super(mkoVar);
        this.a = System.nanoTime() + timeUnit.toNanos(j);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        if (delayed2 instanceof gxb) {
            return mhq.c(this.a, ((gxb) delayed2).a);
        }
        return mhq.c(getDelay(TimeUnit.NANOSECONDS), delayed2.getDelay(TimeUnit.NANOSECONDS));
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.a - System.nanoTime(), TimeUnit.NANOSECONDS);
    }
}
