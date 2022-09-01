package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: gix  reason: default package */
/* loaded from: classes.dex */
public final class gix {
    public static final boolean a;

    static {
        boolean z;
        try {
            SystemClock.elapsedRealtimeNanos();
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }
}
