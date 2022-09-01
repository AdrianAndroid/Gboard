package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ade  reason: default package */
/* loaded from: classes.dex */
public final class ade {
    private static final ThreadLocal j = new ThreadLocal();
    public add g;
    public final bek h;
    public final qv a = new qv();
    public final ArrayList b = new ArrayList();
    public final opu i = new opu(this);
    public final Runnable c = new od(this, 10);
    public long d = 0;
    public boolean e = false;
    public float f = 1.0f;

    public ade(bek bekVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.h = bekVar;
    }

    public static ade a() {
        ThreadLocal threadLocal = j;
        if (threadLocal.get() == null) {
            threadLocal.set(new ade(new bek((byte[]) null, (byte[]) null), null, null, null));
        }
        return (ade) threadLocal.get();
    }

    public final boolean b() {
        return Thread.currentThread() == ((Looper) this.h.b).getThread();
    }
}
