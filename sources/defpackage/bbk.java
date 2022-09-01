package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bbk  reason: default package */
/* loaded from: classes.dex */
public final class bbk {
    public static final boolean a;
    public static final boolean b;
    public static volatile int c;
    private static final File e;
    private static volatile bbk f;
    private final boolean g;
    private final int h;
    private final int i;
    private int j;
    private boolean k = true;
    public final AtomicBoolean d = new AtomicBoolean(false);

    static {
        boolean z = true;
        a = Build.VERSION.SDK_INT < 29;
        if (Build.VERSION.SDK_INT < 26) {
            z = false;
        }
        b = z;
        e = new File("/proc/self/fd");
        c = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0112, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x010f, code lost:
        if (java.util.Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(android.os.Build.MODEL) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bbk() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbk.<init>():void");
    }

    public static bbk a() {
        if (f == null) {
            synchronized (bbk.class) {
                if (f == null) {
                    f = new bbk();
                }
            }
        }
        return f;
    }

    private final synchronized boolean d() {
        boolean z = true;
        int i = this.j + 1;
        this.j = i;
        if (i >= 50) {
            this.j = 0;
            int length = e.list().length;
            long j = c != -1 ? c : this.h;
            if (length >= j) {
                z = false;
            }
            this.k = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j);
            }
        }
        return this.k;
    }

    public final void b() {
        bgj.j();
        this.d.set(true);
    }

    public final boolean c(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (z && this.g && b) {
            return (!a || this.d.get()) && !z2 && i >= (i3 = this.i) && i2 >= i3 && d();
        }
        return false;
    }
}
