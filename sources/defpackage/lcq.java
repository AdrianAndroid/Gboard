package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* renamed from: lcq  reason: default package */
/* loaded from: classes.dex */
public final class lcq implements Runnable, Closeable {
    private lcx a;
    private final boolean b = kki.l();
    private boolean c;
    private boolean d;

    public lcq(lcx lcxVar) {
        this.a = lcxVar;
    }

    private final void b() {
        this.c = true;
        if (!this.b || this.d) {
            return;
        }
        kki.l();
    }

    public final void a(mko mkoVar) {
        if (!this.c) {
            if (!this.d) {
                this.d = true;
                mkoVar.d(this, mjl.a);
                return;
            }
            throw new IllegalStateException("Signal is already attached to future");
        }
        throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c || !this.d) {
            kki.j(bsd.s);
        } else {
            b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        lcx lcxVar = this.a;
        this.a = null;
        try {
            if (!this.d) {
                if (this.c) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
        } finally {
            ldh.h(lcxVar);
        }
    }
}
