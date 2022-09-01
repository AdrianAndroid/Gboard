package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: gom  reason: default package */
/* loaded from: classes.dex */
public final class gom {
    public static final mkr a;
    public static final mks b;
    public static final fxa c;
    private static final ThreadFactory d;

    static {
        goo gooVar = new goo(0);
        d = gooVar;
        mkr B = kcu.B(Executors.newCachedThreadPool(gooVar));
        a = B;
        b = kcu.D(Executors.newSingleThreadScheduledExecutor(gooVar));
        c = new fxa(B);
    }
}
