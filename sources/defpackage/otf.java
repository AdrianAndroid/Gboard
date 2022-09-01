package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* renamed from: otf  reason: default package */
/* loaded from: classes2.dex */
public final class otf {
    long b;
    final int c;
    final osz d;
    public final Deque e;
    public boolean f;
    public final otd g;
    final otc h;
    long a = 0;
    final ote i = new ote(this);
    final ote j = new ote(this);
    int k = 0;

    public otf(int i, osz oszVar, boolean z, boolean z2, opx opxVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.c = i;
        this.d = oszVar;
        this.b = oszVar.m.c();
        otd otdVar = new otd(this, oszVar.l.c());
        this.g = otdVar;
        otc otcVar = new otc(this);
        this.h = otcVar;
        otdVar.e = z2;
        otcVar.b = z;
        if (opxVar != null) {
            arrayDeque.add(opxVar);
        }
        if (!h() || opxVar == null) {
            if (!h() && opxVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
            return;
        }
        throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
    }

    private final boolean m(int i) {
        synchronized (this) {
            if (this.k != 0) {
                return false;
            }
            if (this.g.e && this.h.b) {
                return false;
            }
            this.k = i;
            notifyAll();
            this.d.c(this.c);
            return true;
        }
    }

    public final synchronized opx a() {
        this.i.e();
        while (this.e.isEmpty() && this.k == 0) {
            g();
        }
        this.i.b();
        if (!this.e.isEmpty()) {
        } else {
            throw new otk(this.k);
        }
        return (opx) this.e.removeFirst();
    }

    public final ovn b() {
        synchronized (this) {
            if (!this.f && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j) {
        this.b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        boolean z;
        boolean i;
        synchronized (this) {
            otd otdVar = this.g;
            z = false;
            if (!otdVar.e && otdVar.d) {
                otc otcVar = this.h;
                if (otcVar.b || otcVar.a) {
                    z = true;
                }
            }
            i = i();
        }
        if (z) {
            j(9);
        } else if (i) {
        } else {
            this.d.c(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        otc otcVar = this.h;
        if (otcVar.a) {
            throw new IOException("stream closed");
        }
        if (!otcVar.b) {
            int i = this.k;
            if (i != 0) {
                throw new otk(i);
            }
            return;
        }
        throw new IOException("stream finished");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        boolean i;
        synchronized (this) {
            this.g.e = true;
            i = i();
            notifyAll();
        }
        if (!i) {
            this.d.c(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final boolean h() {
        int i = this.c;
        boolean z = this.d.b;
        return (i & 1) == 1;
    }

    public final synchronized boolean i() {
        if (this.k != 0) {
            return false;
        }
        otd otdVar = this.g;
        if (otdVar.e || otdVar.d) {
            otc otcVar = this.h;
            if (otcVar.b || otcVar.a) {
                if (this.f) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void j(int i) {
        if (!m(i)) {
            return;
        }
        this.d.m(this.c, i);
    }

    public final void k(int i) {
        if (!m(i)) {
            return;
        }
        this.d.n(this.c, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void l(int i) {
        if (this.k == 0) {
            this.k = i;
            notifyAll();
        }
    }
}
