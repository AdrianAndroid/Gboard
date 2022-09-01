package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: bes  reason: default package */
/* loaded from: classes.dex */
public final class bes implements beo, bet {
    private Object a;
    private bep b;
    private boolean c;
    private boolean d;
    private boolean e;
    private axd f;

    private final synchronized Object i(Long l) {
        if (!isDone() && !bgj.n()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (!this.c) {
            if (!this.e) {
                if (this.d) {
                    return this.a;
                }
                if (l == null) {
                    wait(0L);
                } else if (l.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        wait(longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.e) {
                        if (!this.c) {
                            if (!this.d) {
                                throw new TimeoutException();
                            }
                            return this.a;
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.f);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.f);
        }
        throw new CancellationException();
    }

    @Override // defpackage.bfh
    public final synchronized void a(Drawable drawable) {
    }

    @Override // defpackage.bet
    public final synchronized boolean b(Object obj, bfh bfhVar, boolean z) {
        this.d = true;
        this.a = obj;
        notifyAll();
        return false;
    }

    @Override // defpackage.bfh
    public final synchronized void c(Object obj, bfp bfpVar) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.c = true;
            notifyAll();
            bep bepVar = null;
            if (z) {
                bep bepVar2 = this.b;
                this.b = null;
                bepVar = bepVar2;
            }
            if (bepVar != null) {
                bepVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.bfh
    public final synchronized bep d() {
        return this.b;
    }

    @Override // defpackage.bfh
    public final void e(bfg bfgVar) {
        bfgVar.g(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.bfh
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.bfh
    public final void fg(Drawable drawable) {
    }

    @Override // defpackage.bet
    public final synchronized boolean fi(axd axdVar, bfh bfhVar, boolean z) {
        this.e = true;
        this.f = axdVar;
        notifyAll();
        return false;
    }

    @Override // defpackage.bfh
    public final void g(bfg bfgVar) {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return i(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.bfh
    public final synchronized void h(bep bepVar) {
        this.b = bepVar;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        if (!this.c && !this.d) {
            if (!this.e) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bdj
    public final void m() {
    }

    @Override // defpackage.bdj
    public final void n() {
    }

    @Override // defpackage.bdj
    public final void o() {
    }

    public final String toString() {
        bep bepVar;
        String str;
        String concat = String.valueOf(super.toString()).concat("[status=");
        synchronized (this) {
            bepVar = null;
            if (this.c) {
                str = "CANCELLED";
            } else if (this.e) {
                str = "FAILURE";
            } else if (this.d) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                bepVar = this.b;
            }
        }
        if (bepVar != null) {
            String obj = bepVar.toString();
            return concat + str + ", request=[" + obj + "]]";
        }
        return concat + str + "]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return i(Long.valueOf(timeUnit.toMillis(j)));
    }
}
