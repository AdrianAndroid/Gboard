package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: kbs  reason: default package */
/* loaded from: classes.dex */
public final class kbs implements ThreadFactory {
    public final int a;
    private final AtomicInteger b;
    private final String c;
    private final /* synthetic */ int d;

    public kbs(String str, int i, int i2) {
        this.d = i2;
        this.c = str;
        this.a = i;
        this.b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.d == 0) {
            idx idxVar = new idx(this, runnable, 19);
            String str = this.c;
            int andIncrement = this.b.getAndIncrement();
            Thread thread = new Thread(idxVar, str + "-" + andIncrement);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            return thread;
        }
        String str2 = this.c;
        int incrementAndGet = this.b.incrementAndGet();
        gxq gxqVar = new gxq(this, runnable, str2 + "-" + incrementAndGet, null);
        gxqVar.setDaemon(false);
        return gxqVar;
    }

    public kbs(int i, int i2) {
        this.d = i2;
        this.b = new AtomicInteger(1);
        this.a = i;
        this.c = "Primes";
    }
}
