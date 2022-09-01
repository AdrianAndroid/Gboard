package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: dnq  reason: default package */
/* loaded from: classes.dex */
public final class dnq implements cbf {
    public static final dnq a = new dnq();
    private final AtomicLong b = new AtomicLong(0);

    @Override // defpackage.cbf
    public final long a() {
        return this.b.incrementAndGet();
    }
}
