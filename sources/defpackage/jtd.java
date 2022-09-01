package defpackage;

import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: jtd  reason: default package */
/* loaded from: classes.dex */
public final class jtd {
    public static final mks a;

    static {
        nzv nzvVar = new nzv((byte[]) null);
        nzvVar.c("superpacks-control-%d");
        a = kcu.D(Executors.newSingleThreadScheduledExecutor(nzv.d(nzvVar)));
    }
}
