package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: axl  reason: default package */
/* loaded from: classes.dex */
final class axl implements awk, awj {
    public final awl a;
    public final awj b;
    public volatile Object c;
    public volatile awi d;
    private volatile int e;
    private volatile awh f;
    private volatile fws g;

    public axl(awl awlVar, awj awjVar) {
        this.a = awlVar;
        this.b = awjVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [avj, java.lang.Object] */
    @Override // defpackage.awk
    public final void a() {
        fws fwsVar = this.g;
        if (fwsVar != null) {
            fwsVar.a.fh();
        }
    }

    @Override // defpackage.awj
    public final void b() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [avj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [avj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [avj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [avj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [avj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [avj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [auw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [auw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [avj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [auw, java.lang.Object] */
    @Override // defpackage.awk
    public final boolean c() {
        boolean z;
        boolean z2 = false;
        if (this.c != null) {
            Object obj = this.c;
            this.c = null;
            try {
                bge.b();
                try {
                    avl b = this.a.c.b().b(obj);
                    Object a = b.a();
                    auo d = ((aqr) this.a.c.b().g).d(a.getClass());
                    if (d != null) {
                        fws fwsVar = new fws(d, a, this.a.h);
                        ?? r5 = this.g.c;
                        awl awlVar = this.a;
                        awi awiVar = new awi(r5, awlVar.m);
                        aye d2 = awlVar.d();
                        d2.b(awiVar, fwsVar);
                        if (d2.a(awiVar) == null) {
                            try {
                                this.b.e(this.g.c, b.a(), this.g.a, this.g.a.g(), this.g.c);
                                return true;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                if (!z) {
                                    this.g.a.d();
                                }
                                throw th;
                            }
                        }
                        this.d = awiVar;
                        this.f = new awh(Collections.singletonList(this.g.c), this.a, this);
                        this.g.a.d();
                    } else {
                        throw new atp(a.getClass());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f == null || !this.f.c()) {
            this.f = null;
            this.g = null;
            while (!z2 && this.e < this.a.f().size()) {
                List f = this.a.f();
                int i = this.e;
                this.e = i + 1;
                this.g = (fws) f.get(i);
                if (this.g != null && (this.a.o.c(this.g.a.g()) || this.a.h(this.g.a.a()))) {
                    this.g.a.f(this.a.n, new axk(this, this.g, null, null));
                    z2 = true;
                }
            }
            return z2;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [avj, java.lang.Object] */
    @Override // defpackage.awj
    public final void d(auw auwVar, Exception exc, avj avjVar, int i) {
        this.b.d(auwVar, exc, avjVar, this.g.a.g());
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [avj, java.lang.Object] */
    @Override // defpackage.awj
    public final void e(auw auwVar, Object obj, avj avjVar, int i, auw auwVar2) {
        this.b.e(auwVar, obj, avjVar, this.g.a.g(), auwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(fws fwsVar) {
        fws fwsVar2 = this.g;
        return fwsVar2 != null && fwsVar2 == fwsVar;
    }
}
