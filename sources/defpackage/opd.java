package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: opd  reason: default package */
/* loaded from: classes2.dex */
public final class opd {
    boolean a;
    public int b = -1;
    int c = -1;
    boolean d;

    public final ope a() {
        return new ope(this);
    }

    public final void b(int i, TimeUnit timeUnit) {
        long seconds = timeUnit.toSeconds(i);
        this.c = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
    }
}
