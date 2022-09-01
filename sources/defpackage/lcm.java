package defpackage;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: lcm  reason: default package */
/* loaded from: classes.dex */
final class lcm {
    public static final lcm a;
    private final UUID b;
    private final AtomicLong c;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            a = new lcm(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public lcm(UUID uuid, long j) {
        this.b = uuid;
        this.c = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    final long a() {
        long j;
        long j2;
        long j3;
        do {
            j = this.c.get();
            long j4 = ((j * 25214903917L) + 11) & 281474976710655L;
            j2 = ((25214903917L * j4) + 11) & 281474976710655L;
            j3 = (((int) (j4 >>> 16)) << 32) + ((int) (j2 >>> 16));
        } while (!this.c.compareAndSet(j, j2));
        return j3;
    }

    public final UUID b() {
        long a2 = a();
        return new UUID((a2 & (-61441)) ^ this.b.getMostSignificantBits(), (a() >>> 2) ^ this.b.getLeastSignificantBits());
    }
}
