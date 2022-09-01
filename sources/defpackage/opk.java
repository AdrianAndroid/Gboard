package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: opk  reason: default package */
/* loaded from: classes2.dex */
public final class opk {
    public static final Executor a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), oqs.o("OkHttp ConnectionPool", true));
    public final long c;
    public boolean f;
    public final Runnable d = new obv(this, 18);
    public final Deque e = new ArrayDeque();
    public final mlu g = new mlu();
    public final int b = 5;

    public opk() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.c = timeUnit.toNanos(5L);
    }

    public final void a(oou oouVar, orj orjVar, oqo oqoVar) {
        for (orf orfVar : this.e) {
            if (orfVar.e(oouVar, oqoVar)) {
                orjVar.c(orfVar, true);
                return;
            }
        }
    }
}
