package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: ldt  reason: default package */
/* loaded from: classes.dex */
public final class ldt {
    public static final lgh a;

    static {
        lgh ldsVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            ldsVar = new ldr();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            ldsVar = new lds();
        }
        a = ldsVar;
    }
}
