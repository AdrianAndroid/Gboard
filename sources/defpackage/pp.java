package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* renamed from: pp  reason: default package */
/* loaded from: classes2.dex */
public final class pp extends fy {
    private static volatile pp b;
    public final fy a;
    private final fy c;

    private pp() {
        pq pqVar = new pq();
        this.c = pqVar;
        this.a = pqVar;
    }

    public static pp b() {
        if (b != null) {
            return b;
        }
        synchronized (pp.class) {
            if (b == null) {
                b = new pp();
            }
        }
        return b;
    }

    public static final boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
