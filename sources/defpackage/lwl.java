package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: lwl  reason: default package */
/* loaded from: classes.dex */
public final class lwl extends lwh {
    public static final lwl a = new lwl();

    private lwl() {
    }

    @Override // defpackage.lwh
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public final String toString() {
        return "Default millisecond precision clock";
    }
}
