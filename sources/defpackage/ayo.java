package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: ayo  reason: default package */
/* loaded from: classes.dex */
public final class ayo implements ThreadFactory {
    public final boolean a;
    private final ThreadFactory b;
    private final String c;
    private final AtomicInteger d = new AtomicInteger();

    public ayo(ThreadFactory threadFactory, String str, boolean z) {
        this.b = threadFactory;
        this.c = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new bw(this, runnable, 17));
        String str = this.c;
        int andIncrement = this.d.getAndIncrement();
        newThread.setName("glide-" + str + "-thread-" + andIncrement);
        return newThread;
    }
}
