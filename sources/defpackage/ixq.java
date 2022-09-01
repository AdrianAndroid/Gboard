package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ixq  reason: default package */
/* loaded from: classes.dex */
public final class ixq extends ifu {
    final /* synthetic */ ixs a;

    public ixq(ixs ixsVar) {
        this.a = ixsVar;
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        ifv ifvVar = (ifv) ijgVar;
        synchronized (this.a) {
            for (Class cls : ifvVar.e(ixo.class)) {
                if (this.a.e.add(cls)) {
                    ifw b = igr.d(this.a.b).b(cls);
                    ixo ixoVar = b instanceof ixo ? (ixo) b : null;
                    if (ixoVar != null) {
                        lta listIterator = ixoVar.c().listIterator();
                        while (listIterator.hasNext()) {
                            ixn ixnVar = (ixn) listIterator.next();
                            this.a.d.put(ixnVar.c(), ixnVar);
                            ixs ixsVar = this.a;
                            ixnVar.c();
                            if (!ixnVar.d().isEmpty()) {
                                hhq.q(ixsVar);
                                for (hhl hhlVar : ixnVar.d()) {
                                    ixsVar.f.v(hhlVar, ixnVar.c());
                                }
                                hhq.o(ixsVar, ixsVar.f.A());
                            }
                            iiy b2 = ixnVar.b();
                            if (ixsVar.h.add(b2)) {
                                ija c = ijf.c(new idx(ixsVar, b2, 14), bsd.q, b2);
                                c.e(ixsVar.c);
                                ixsVar.i.put(b2, c);
                            }
                            ixnVar.f();
                            ixsVar.f(ixnVar);
                        }
                    }
                }
            }
        }
    }
}
