package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* renamed from: lyu  reason: default package */
/* loaded from: classes.dex */
public final class lyu implements Closeable {
    private static final lyt b;
    final lyt a;
    private final Deque c = new ArrayDeque(4);
    private Throwable d;

    static {
        lyt lytVar;
        try {
            lytVar = new lys(Throwable.class.getMethod("addSuppressed", Throwable.class));
        } catch (Throwable unused) {
            lytVar = null;
        }
        if (lytVar == null) {
            lytVar = lyr.a;
        }
        b = lytVar;
    }

    public lyu(lyt lytVar) {
        jdg.u(lytVar);
        this.a = lytVar;
    }

    public static lyu a() {
        return new lyu(b);
    }

    public final RuntimeException b(Throwable th) {
        this.d = th;
        lgf.d(th, IOException.class);
        throw new RuntimeException(th);
    }

    public final RuntimeException c(Throwable th, Class cls) {
        this.d = th;
        lgf.d(th, IOException.class);
        lgf.d(th, cls);
        throw new RuntimeException(th);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.d;
        while (!this.c.isEmpty()) {
            Closeable closeable = (Closeable) this.c.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.a.a(closeable, th, th2);
                }
            }
        }
        if (this.d != null || th == null) {
            return;
        }
        lgf.d(th, IOException.class);
        throw new AssertionError(th);
    }

    public final void d(Closeable closeable) {
        if (closeable != null) {
            this.c.addFirst(closeable);
        }
    }
}
