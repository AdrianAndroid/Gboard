package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: oup  reason: default package */
/* loaded from: classes2.dex */
public class oup extends ovr {
    public static final long b;
    public static final long c;
    public static oup d;
    public boolean e;
    public oup f;
    public long g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        b = millis;
        c = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
    }

    public final long c(long j) {
        return this.g - j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public IOException d(IOException iOException) {
        throw null;
    }

    public final void e() {
        oup oupVar;
        long n = n();
        boolean h = h();
        if (n == 0) {
            if (!h) {
                return;
            }
            n = 0;
        }
        synchronized (oup.class) {
            if (this.e) {
                throw new IllegalStateException("Unbalanced enter/exit");
            }
            this.e = true;
            if (d == null) {
                d = new oup();
                new oum().start();
            }
            long nanoTime = System.nanoTime();
            if (n != 0 && h) {
                this.g = Math.min(n, j() - nanoTime) + nanoTime;
            } else if (n != 0) {
                this.g = n + nanoTime;
            } else if (!h) {
                throw new AssertionError();
            } else {
                this.g = j();
            }
            long c2 = c(nanoTime);
            oup oupVar2 = d;
            oll.b(oupVar2);
            while (true) {
                oupVar = oupVar2.f;
                if (oupVar == null || c2 < oupVar.c(nanoTime)) {
                    break;
                }
                oupVar2 = oupVar;
            }
            this.f = oupVar;
            oupVar2.f = this;
            if (oupVar2 == d) {
                oup.class.notify();
            }
        }
    }
}
