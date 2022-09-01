package defpackage;

import j$.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mis  reason: default package */
/* loaded from: classes.dex */
public abstract class mis extends miw {
    private static final Logger c = Logger.getLogger(mis.class.getName());
    public llg a;
    private final boolean d;
    private final boolean e;

    public mis(llg llgVar, boolean z, boolean z2) {
        super(llgVar.size());
        jdg.u(llgVar);
        this.a = llgVar;
        this.d = z;
        this.e = z2;
    }

    private final void t(Throwable th) {
        jdg.u(th);
        if (this.d && !n(th)) {
            Set set = this.seenExceptions;
            if (set == null) {
                Set n = lvw.n();
                e(n);
                miw.b.b(this, n);
                set = (Set) Objects.requireNonNull(this.seenExceptions);
            }
            if (v(set, th)) {
                u(th);
                return;
            }
        }
        if (th instanceof Error) {
            u(th);
        }
    }

    private static void u(Throwable th) {
        c.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean v(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // defpackage.mik
    protected final void a() {
        llg llgVar = this.a;
        s(mir.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (llgVar != null)) {
            boolean o = o();
            lsz it = llgVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mik
    public final String b() {
        llg llgVar = this.a;
        if (llgVar != null) {
            new StringBuilder("futures=").append(llgVar);
            return "futures=".concat(llgVar.toString());
        }
        return super.b();
    }

    @Override // defpackage.miw
    public final void e(Set set) {
        jdg.u(set);
        if (!isCancelled()) {
            v(set, (Throwable) Objects.requireNonNull(j()));
        }
    }

    public abstract void f(int i, Object obj);

    public final void g(int i, Future future) {
        try {
            f(i, kcu.S(future));
        } catch (Error e) {
            e = e;
            t(e);
        } catch (RuntimeException e2) {
            e = e2;
            t(e);
        } catch (ExecutionException e3) {
            t(e3.getCause());
        }
    }

    public final void h(llg llgVar) {
        int a = miw.b.a(this);
        int i = 0;
        jdg.G(a >= 0, "Less than 0 remaining futures");
        if (a == 0) {
            if (llgVar != null) {
                lsz it = llgVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        g(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptions = null;
            q();
            s(mir.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    public abstract void q();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        Objects.requireNonNull(this.a);
        if (this.a.isEmpty()) {
            q();
        } else if (this.d) {
            lsz it = this.a.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final mko mkoVar = (mko) it.next();
                mkoVar.d(new Runnable() { // from class: mip
                    @Override // java.lang.Runnable
                    public final void run() {
                        mis misVar = mis.this;
                        mko mkoVar2 = mkoVar;
                        int i2 = i;
                        try {
                            if (mkoVar2.isCancelled()) {
                                misVar.a = null;
                                misVar.cancel(false);
                            } else {
                                misVar.g(i2, mkoVar2);
                            }
                        } finally {
                            misVar.h(null);
                        }
                    }
                }, mjl.a);
                i++;
            }
        } else {
            final llg llgVar = this.e ? this.a : null;
            Runnable runnable = new Runnable() { // from class: miq
                @Override // java.lang.Runnable
                public final void run() {
                    mis.this.h(llgVar);
                }
            };
            lsz it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((mko) it2.next()).d(runnable, mjl.a);
            }
        }
    }

    public void s(mir mirVar) {
        jdg.u(mirVar);
        this.a = null;
    }
}
