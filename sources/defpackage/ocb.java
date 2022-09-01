package defpackage;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: ocb  reason: default package */
/* loaded from: classes2.dex */
public final class ocb extends nsb {
    public final String b;
    final /* synthetic */ oce c;
    public final AtomicReference a = new AtomicReference(oce.f);
    private final nsb d = new oby(this);

    public ocb(oce oceVar, String str) {
        this.c = oceVar;
        jdg.Q(str, "authority");
        this.b = str;
    }

    @Override // defpackage.nsb
    public final nsd a(nuq nuqVar, nsa nsaVar) {
        if (this.a.get() != oce.f) {
            return c(nuqVar, nsaVar);
        }
        this.c.m.execute(new obv(this, 3));
        if (this.a.get() != oce.f) {
            return c(nuqVar, nsaVar);
        }
        if (this.c.z.get()) {
            return new obz();
        }
        oca ocaVar = new oca(this, nsu.k(), nuqVar, nsaVar);
        this.c.m.execute(new nzm(this, ocaVar, 13));
        return ocaVar;
    }

    @Override // defpackage.nsb
    public final String b() {
        return this.b;
    }

    public final nsd c(nuq nuqVar, nsa nsaVar) {
        ntk ntkVar = (ntk) this.a.get();
        if (ntkVar == null) {
            return this.d.a(nuqVar, nsaVar);
        }
        if (ntkVar instanceof ocn) {
            ocm b = ((ocn) ntkVar).b.b(nuqVar);
            if (b != null) {
                nsaVar = nsaVar.d(ocm.a, b);
            }
            return this.d.a(nuqVar, nsaVar);
        }
        return new obr(ntkVar, this.d, this.c.k, nuqVar, nsaVar);
    }

    public final void d(ntk ntkVar) {
        Collection<oca> collection;
        ntk ntkVar2 = (ntk) this.a.get();
        this.a.set(ntkVar);
        if (ntkVar2 != oce.f || (collection = this.c.v) == null) {
            return;
        }
        for (oca ocaVar : collection) {
            ocaVar.j();
        }
    }
}
