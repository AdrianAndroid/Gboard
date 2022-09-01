package defpackage;

import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mjd  reason: default package */
/* loaded from: classes.dex */
public final class mjd extends IdentityHashMap implements Closeable {
    public final kdg a = new kdg(this);
    private volatile boolean b;
    private volatile CountDownLatch c;

    public final void a(Closeable closeable, Executor executor) {
        jdg.u(executor);
        if (closeable == null) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                put(closeable, executor);
            } else {
                mjf.f(closeable, executor);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            for (Map.Entry entry : entrySet()) {
                mjf.f((Closeable) entry.getKey(), (Executor) entry.getValue());
            }
            clear();
        }
    }
}
