package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: pba  reason: default package */
/* loaded from: classes2.dex */
public final class pba extends ozk implements pam {
    private final pay c;
    private final pbb d;
    private final pbx b = new pbx();
    final AtomicBoolean a = new AtomicBoolean();

    public pba(pay payVar) {
        pbb pbbVar;
        this.c = payVar;
        if (!payVar.d.a) {
            while (true) {
                if (!payVar.c.isEmpty()) {
                    pbbVar = (pbb) payVar.c.poll();
                    if (pbbVar != null) {
                        break;
                    }
                } else {
                    pbbVar = new pbb(payVar.a);
                    payVar.d.a(pbbVar);
                    break;
                }
            }
        } else {
            pbbVar = pbc.a;
        }
        this.d = pbbVar;
    }

    @Override // defpackage.pam
    public final void a() {
        pay payVar = this.c;
        pbb pbbVar = this.d;
        pbbVar.a = System.nanoTime() + payVar.b;
        payVar.c.offer(pbbVar);
    }

    @Override // defpackage.ozu
    public final void d() {
        if (this.a.compareAndSet(false, true)) {
            this.d.im(this);
        }
        this.b.d();
    }

    @Override // defpackage.ozu
    public final boolean e() {
        return this.b.a;
    }

    @Override // defpackage.ozk
    public final void im(pam pamVar) {
        if (this.b.a) {
            return;
        }
        pbh g = this.d.g(new paz(this, pamVar));
        this.b.a(g);
        g.a.a(new pbg(g, this.b));
    }
}
