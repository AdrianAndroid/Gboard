package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: goo  reason: default package */
/* loaded from: classes.dex */
public final class goo implements ThreadFactory {
    private final /* synthetic */ int a;
    private final Number b;

    public goo(int i, byte[] bArr) {
        this.a = i;
        this.b = new AtomicInteger(0);
    }

    public goo(int i) {
        this.a = i;
        this.b = new AtomicLong(0L);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.a == 0) {
            long andIncrement = ((AtomicLong) this.b).getAndIncrement();
            return new Thread(runnable, "S3LibThread-" + andIncrement);
        }
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + ((AtomicInteger) this.b).getAndIncrement());
        return thread;
    }
}
