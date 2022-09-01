package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mio  reason: default package */
/* loaded from: classes.dex */
public abstract class mio extends mju implements Runnable {
    mko a;
    Object b;

    public mio(mko mkoVar, Object obj) {
        jdg.u(mkoVar);
        this.a = mkoVar;
        jdg.u(obj);
        this.b = obj;
    }

    public static mko g(mko mkoVar, leq leqVar, Executor executor) {
        jdg.u(leqVar);
        min minVar = new min(mkoVar, leqVar);
        mkoVar.d(minVar, kcu.F(executor, minVar));
        return minVar;
    }

    public static mko h(mko mkoVar, miy miyVar, Executor executor) {
        jdg.u(executor);
        mim mimVar = new mim(mkoVar, miyVar);
        mkoVar.d(mimVar, kcu.F(executor, mimVar));
        return mimVar;
    }

    @Override // defpackage.mik
    protected final void a() {
        m(this.a);
        this.a = null;
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mik
    public final String b() {
        String str;
        mko mkoVar = this.a;
        Object obj = this.b;
        String b = super.b();
        if (mkoVar != null) {
            str = "inputFuture=[" + mkoVar + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (b == null) {
                return null;
            }
            return str.concat(b);
        }
        return str + "function=[" + obj + "]";
    }

    public abstract Object e(Object obj, Object obj2);

    public abstract void f(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        mko mkoVar = this.a;
        Object obj = this.b;
        boolean z = true;
        boolean isCancelled = isCancelled() | (mkoVar == null);
        if (obj != null) {
            z = false;
        }
        if (isCancelled || z) {
            return;
        }
        this.a = null;
        if (mkoVar.isCancelled()) {
            p(mkoVar);
            return;
        }
        try {
            try {
                Object e = e(obj, kcu.S(mkoVar));
                this.b = null;
                f(e);
            } catch (Throwable th) {
                try {
                    kcu.A(th);
                    n(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e2) {
            n(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e3) {
            n(e3);
        } catch (ExecutionException e4) {
            n(e4.getCause());
        }
    }
}
