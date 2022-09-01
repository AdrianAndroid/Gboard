package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: ifh  reason: default package */
/* loaded from: classes.dex */
public final class ifh {
    public final String f;
    public final boolean g;
    public final ibz h;
    public final ibz i;
    public static final ifh a = new ifh("KeyboardLatency.Open");
    public static final ifh b = new ifh("KeyboardLatency.SwitchLanguage");
    public static final ifh c = new ifh("KeyboardLatency.SwitchToNextLanguage");
    private static ifh j = null;
    private static long k = 0;
    public static ifh d = null;
    public static long e = 0;

    public ifh(String str) {
        this(str, true, null, null);
    }

    public ifh(String str, boolean z, ibz ibzVar, ibz ibzVar2) {
        this.f = str;
        this.g = z;
        this.h = ibzVar;
        this.i = ibzVar2;
    }

    public static void a() {
        synchronized (ifh.class) {
            j = null;
            k = 0L;
            d = null;
            e = 0L;
        }
    }

    public static void b(ifh ifhVar) {
        synchronized (ifh.class) {
            if (j != null && !ifhVar.g) {
                return;
            }
            k = SystemClock.elapsedRealtime();
            j = ifhVar;
        }
    }

    public static void c() {
        synchronized (ifh.class) {
            if (d != null && e > 0) {
                ieh.j().e(ifg.KEYBOARD_SHOWN_LATENCY, d, Long.valueOf(SystemClock.elapsedRealtime() - e));
            }
            d = null;
            e = 0L;
        }
    }

    public static void d() {
        synchronized (ifh.class) {
            if (j != null && k > 0) {
                ieh.j().e(ifg.KEYBOARD_SHOWN_LATENCY, j, Long.valueOf(SystemClock.elapsedRealtime() - k));
            }
            j = null;
            k = 0L;
        }
    }
}
