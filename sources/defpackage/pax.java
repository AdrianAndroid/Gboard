package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: pax  reason: default package */
/* loaded from: classes2.dex */
final class pax implements ThreadFactory {
    final /* synthetic */ ThreadFactory a;

    public pax(ThreadFactory threadFactory) {
        this.a = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName(String.valueOf(newThread.getName()).concat(" (Evictor)"));
        return newThread;
    }
}
