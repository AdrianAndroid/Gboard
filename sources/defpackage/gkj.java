package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gkj  reason: default package */
/* loaded from: classes.dex */
public final class gkj {
    private static final RejectedExecutionHandler a = new ThreadPoolExecutor.DiscardPolicy();

    public static Executor a() {
        return new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), a);
    }
}
