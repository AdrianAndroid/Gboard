package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: pbj  reason: default package */
/* loaded from: classes2.dex */
public final class pbj extends AtomicLong implements ThreadFactory {
    public static final ThreadFactory a = new kjh(4);
    private static final long serialVersionUID = -8841098858898482335L;
    final String b;

    public pbj(String str) {
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.b + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
