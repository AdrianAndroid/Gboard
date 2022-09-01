package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ger  reason: default package */
/* loaded from: classes.dex */
public final class ger extends gen {
    public boolean b;
    public volatile boolean c;
    public Object d;
    public Exception e;
    public final Object a = new Object();
    public final odv f = new odv((byte[]) null);

    private final void q() {
        String str;
        if (this.b) {
            if (d()) {
                Exception b = b();
                if (b != null) {
                    str = "failure";
                } else if (!e()) {
                    str = this.c ? "cancellation" : "unknown issue";
                } else {
                    str = "result ".concat(String.valueOf(String.valueOf(c())));
                }
                throw new geg("Complete with: ".concat(str), b);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    @Override // defpackage.gen
    public final gen a(Executor executor, ged gedVar) {
        ger gerVar = new ger();
        this.f.e(new gef(executor, gedVar, gerVar));
        m();
        return gerVar;
    }

    @Override // defpackage.gen
    public final Exception b() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // defpackage.gen
    public final Object c() {
        Object obj;
        synchronized (this.a) {
            fyb.aE(this.b, "Task is not yet complete");
            if (this.c) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.e;
            if (exc == null) {
                obj = this.d;
            } else {
                throw new gem(exc);
            }
        }
        return obj;
    }

    @Override // defpackage.gen
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.gen
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.e == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.gen
    public final void f(Executor executor, geh gehVar) {
        this.f.e(new gei(executor, gehVar, 1));
        m();
    }

    @Override // defpackage.gen
    public final void g(Executor executor, gej gejVar) {
        this.f.e(new gei(executor, gejVar, 0));
        m();
    }

    @Override // defpackage.gen
    public final void h(Executor executor, gek gekVar) {
        this.f.e(new gei(executor, gekVar, 2));
        m();
    }

    @Override // defpackage.gen
    public final void i(gej gejVar) {
        g(gep.a, gejVar);
    }

    @Override // defpackage.gen
    public final void j(gek gekVar) {
        h(gep.a, gekVar);
    }

    @Override // defpackage.gen
    public final void k(gel gelVar) {
        l(gep.a, gelVar);
    }

    @Override // defpackage.gen
    public final void l(Executor executor, gel gelVar) {
        this.f.e(new gei(executor, gelVar, 3));
        m();
    }

    public final void m() {
        synchronized (this.a) {
            if (!this.b) {
                return;
            }
            this.f.f(this);
        }
    }

    public final void n(Exception exc) {
        fyb.aH(exc, "Exception must not be null");
        synchronized (this.a) {
            q();
            this.b = true;
            this.e = exc;
        }
        this.f.f(this);
    }

    public final void o(Object obj) {
        synchronized (this.a) {
            q();
            this.b = true;
            this.d = obj;
        }
        this.f.f(this);
    }

    public final void p() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
            this.f.f(this);
        }
    }
}
