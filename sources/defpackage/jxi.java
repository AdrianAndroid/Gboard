package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jxi  reason: default package */
/* loaded from: classes.dex */
public final class jxi {
    private static final long a = TimeUnit.SECONDS.toMillis(60);
    private static final long b = TimeUnit.SECONDS.toMillis(60);
    private static final long c = TimeUnit.SECONDS.toMillis(60);

    public static oqd a() {
        oqc oqcVar = new oqc();
        oqcVar.x = opv.c(jxh.a);
        oqcVar.b(a, TimeUnit.MILLISECONDS);
        oqcVar.c(b, TimeUnit.MILLISECONDS);
        oqcVar.d(c, TimeUnit.MILLISECONDS);
        oqcVar.t = true;
        return oqcVar.a();
    }
}
