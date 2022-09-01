package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jza  reason: default package */
/* loaded from: classes.dex */
public final class jza {
    public static final jza a = new jza(TimeUnit.HOURS.toSeconds(1));
    public static final Random b = new Random();
    public final long c;

    public jza(long j) {
        jtq.r("expBackoffMinDelaySeconds", 30L);
        jtq.r("expBackoffMaxDelaySeconds", j);
        this.c = j;
    }
}
