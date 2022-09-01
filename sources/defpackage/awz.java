package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: awz  reason: default package */
/* loaded from: classes.dex */
public final class awz implements awm, bgo {
    public auw b;
    public boolean c;
    public boolean d;
    public axh e;
    public boolean f;
    axd g;
    public boolean h;
    axb i;
    public volatile boolean j;
    int k;
    public final kdr m;
    public final kdr n;
    private final xx o;
    private final ayp p;
    private final ayp q;
    private final ayp r;
    private boolean t;
    private awo u;
    final awy a = new awy(new ArrayList(2));
    public final jrr l = jrr.d();
    private final AtomicInteger s = new AtomicInteger();

    public awz(ayp aypVar, ayp aypVar2, ayp aypVar3, kdr kdrVar, kdr kdrVar2, xx xxVar, byte[] bArr, byte[] bArr2) {
        this.p = aypVar;
        this.q = aypVar2;
        this.r = aypVar3;
        this.n = kdrVar;
        this.m = kdrVar2;
        this.o = xxVar;
    }

    private final ayp j() {
        return this.t ? this.r : this.q;
    }

    private final boolean k() {
        return this.h || this.f || this.j;
    }

    @Override // defpackage.awm
    public final void a(awo awoVar) {
        j().execute(awoVar);
    }

    public final synchronized void b(bev bevVar, Executor executor) {
        this.l.c();
        this.a.a.add(new awx(bevVar, executor));
        if (this.f) {
            d(1);
            executor.execute(new aww(this, bevVar, 0));
        } else if (this.h) {
            d(1);
            executor.execute(new aww(this, bevVar, 1));
        } else {
            ce.n(!this.j, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        axb axbVar;
        synchronized (this) {
            this.l.c();
            ce.n(k(), "Not yet complete!");
            int decrementAndGet = this.s.decrementAndGet();
            ce.n(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                axbVar = this.i;
                e();
            } else {
                axbVar = null;
            }
        }
        if (axbVar != null) {
            axbVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(int i) {
        axb axbVar;
        ce.n(k(), "Not yet complete!");
        if (this.s.getAndAdd(i) != 0 || (axbVar = this.i) == null) {
            return;
        }
        axbVar.d();
    }

    public final synchronized void e() {
        if (this.b == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.b = null;
        this.i = null;
        this.e = null;
        this.h = false;
        this.j = false;
        this.f = false;
        awo awoVar = this.u;
        if (awoVar.b.d()) {
            awoVar.a();
        }
        this.u = null;
        this.g = null;
        this.k = 0;
        this.o.b(this);
    }

    @Override // defpackage.bgo
    public final jrr f() {
        return this.l;
    }

    public final synchronized void g(bev bevVar) {
        this.l.c();
        this.a.a.remove(awy.b(bevVar));
        if (this.a.e()) {
            if (!k()) {
                this.j = true;
                awo awoVar = this.u;
                awoVar.o = true;
                awk awkVar = awoVar.n;
                if (awkVar != null) {
                    awkVar.a();
                }
                this.n.n(this, this.b);
            }
            if ((this.f || this.h) && this.s.get() == 0) {
                e();
            }
        }
    }

    public final synchronized void h(awo awoVar) {
        ayp aypVar;
        this.u = awoVar;
        int c = awoVar.c(1);
        if (c != 2 && c != 3) {
            aypVar = j();
            aypVar.execute(awoVar);
        }
        aypVar = this.p;
        aypVar.execute(awoVar);
    }

    public final synchronized void i(auw auwVar, boolean z, boolean z2, boolean z3) {
        this.b = auwVar;
        this.c = z;
        this.t = z2;
        this.d = z3;
    }
}
