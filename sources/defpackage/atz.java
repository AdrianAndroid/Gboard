package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: atz  reason: default package */
/* loaded from: classes.dex */
final class atz implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
