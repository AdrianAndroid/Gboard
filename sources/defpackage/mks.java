package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: mks  reason: default package */
/* loaded from: classes.dex */
public interface mks extends ScheduledExecutorService, mkr {
    mkq a(Runnable runnable, long j, TimeUnit timeUnit);

    mkq b(Callable callable, long j, TimeUnit timeUnit);

    mkq c(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    mkq d(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
