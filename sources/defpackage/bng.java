package defpackage;

import android.os.Build;

/* compiled from: PG */
/* renamed from: bng  reason: default package */
/* loaded from: classes.dex */
public final class bng {
    public static volatile blc a;
    private static final boolean b;

    static {
        boolean z = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        b = z;
        a = (z || ("goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE))) ? new bld(1) : new bld(0);
    }
}
