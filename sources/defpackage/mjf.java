package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: mjf  reason: default package */
/* loaded from: classes.dex */
public final class mjf {
    public static final Logger a = Logger.getLogger(mjf.class.getName());
    public final mkh c;
    private final AtomicReference d = new AtomicReference(mje.OPEN);
    public final mjd b = new mjd();

    public mjf(opu opuVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        mlk f = mlk.f(new mja(this, opuVar, 0, null, null, null));
        executor.execute(f);
        this.c = f;
    }

    @Deprecated
    public static mjf a(mko mkoVar, Executor executor) {
        jdg.u(executor);
        mjf mjfVar = new mjf(kcu.L(mkoVar));
        kcu.U(mkoVar, new miz(mjfVar, executor), mjl.a);
        return mjfVar;
    }

    public static mjf b(mko mkoVar) {
        return new mjf(mkoVar);
    }

    public static void f(Closeable closeable, Executor executor) {
        if (closeable != null) {
            try {
                executor.execute(new kvl(closeable, 8));
            } catch (RejectedExecutionException e) {
                Logger logger = a;
                if (logger.isLoggable(Level.WARNING)) {
                    logger.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
                }
                f(closeable, mjl.a);
            }
        }
    }

    private final boolean i(mje mjeVar, mje mjeVar2) {
        AtomicReference atomicReference = this.d;
        while (!atomicReference.compareAndSet(mjeVar, mjeVar2)) {
            if (atomicReference.get() != mjeVar) {
                return false;
            }
        }
        return true;
    }

    public final mjf c(mjc mjcVar, Executor executor) {
        jdg.u(mjcVar);
        return g((mkh) mio.h(this.c, new mjb(this, mjcVar, 2), executor));
    }

    public final void d(mjd mjdVar) {
        e(mje.OPEN, mje.SUBSUMED);
        mjdVar.a(this.b, mjl.a);
    }

    public final void e(mje mjeVar, mje mjeVar2) {
        jdg.L(i(mjeVar, mjeVar2), "Expected state to be %s, but it was %s", mjeVar, mjeVar2);
    }

    protected final void finalize() {
        if (((mje) this.d.get()).equals(mje.OPEN)) {
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            h();
        }
    }

    public final mjf g(mkh mkhVar) {
        mjf mjfVar = new mjf(mkhVar);
        d(mjfVar.b);
        return mjfVar;
    }

    public final mkh h() {
        if (i(mje.OPEN, mje.WILL_CLOSE)) {
            a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", this);
            this.c.d(new kvl(this, 9), mjl.a);
        } else {
            int ordinal = ((mje) this.d.get()).ordinal();
            if (ordinal == 0) {
                throw new AssertionError();
            }
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (ordinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return this.c;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("state", this.d.get());
        S.a(this.c);
        return S.toString();
    }

    private mjf(mko mkoVar) {
        this.c = mkh.q(mkoVar);
    }
}
