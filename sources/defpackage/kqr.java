package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kqr  reason: default package */
/* loaded from: classes.dex */
public final class kqr {
    public final String a;
    public final kqs b;
    public final lcg c;
    private final mko f;
    private final lcg g = new lcg(new kqq(this), mjl.a);
    public final Object d = new Object();
    public List e = new ArrayList();
    private final ndi h = ndi.c();

    public kqr(kqs kqsVar, mko mkoVar) {
        this.b = kqsVar;
        this.f = mkoVar;
        this.a = ((kqp) kqsVar).a;
        this.c = new lcg(new clc((kqp) kqsVar, 10), mjl.a);
        d(new jzh(this, 11));
    }

    public final mko a() {
        mko mkoVar;
        if (this.g.c.isDone()) {
            mkoVar = ((kqp) this.b).a();
        } else {
            lcq l = jco.l("Get ".concat(String.valueOf(this.a)), ldi.a);
            try {
                mko h = mio.h(this.g.c(), ldd.c(new jzh(this, 10)), mjl.a);
                l.a(h);
                l.close();
                mkoVar = h;
            } catch (Throwable th) {
                try {
                    l.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        kcu.L(this.f);
        return kcu.L(mkoVar);
    }

    public final mko b(leq leqVar, Executor executor) {
        return c(ldd.c(new jzh(leqVar, 12)), executor);
    }

    public final mko c(miy miyVar, Executor executor) {
        lcq l = jco.l("Update ".concat(String.valueOf(this.a)), ldi.a);
        try {
            mko c = this.g.c();
            this.h.b(new clc(c, 12), mjl.a);
            mko b = this.h.b(ldd.b(new iiq(this, c, miyVar, executor, 7)), mjl.a);
            jdg.u(b);
            if (!c.isDone()) {
                if (b.isDone()) {
                    kcu.V(b, c);
                } else {
                    mkc mkcVar = new mkc(b, c, 0);
                    b.d(mkcVar, mjl.a);
                    c.d(mkcVar, mjl.a);
                }
            }
            kcu.L(this.f);
            l.a(b);
            l.close();
            return b;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    public final void d(miy miyVar) {
        synchronized (this.d) {
            this.e.add(miyVar);
        }
    }
}
