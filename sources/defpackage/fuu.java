package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: fuu  reason: default package */
/* loaded from: classes.dex */
public final class fuu {
    long a = -1;
    long b = -1;

    public final long a() {
        fyb.ay(this.b != -1);
        return TimeUnit.NANOSECONDS.toMillis(b() - this.b);
    }

    public final long b() {
        if (this.a == -1) {
            return System.nanoTime();
        }
        this.a = -1L;
        return 0L;
    }

    public final void c() {
        this.b = b();
    }
}
