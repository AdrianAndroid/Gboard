package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* renamed from: odm  reason: default package */
/* loaded from: classes2.dex */
final class odm implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw nvu.d(th).f("Uncaught exception in the SynchronizationContext. Re-thrown.").h();
    }
}
