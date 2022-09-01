package defpackage;

/* compiled from: PG */
/* renamed from: nyr  reason: default package */
/* loaded from: classes2.dex */
public final class nyr implements nso {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nyr(nsn nsnVar, int i) {
        this.b = i;
        this.a = nsnVar;
    }

    public nyr(nyt nytVar, int i) {
        this.b = i;
        this.a = nytVar;
    }

    public nyr(oej oejVar, int i) {
        this.b = i;
        this.a = oejVar;
    }

    public nyr(oer oerVar, int i) {
        this.b = i;
        this.a = oerVar;
    }

    @Override // defpackage.nso
    public final void a(nsu nsuVar) {
        int i = this.b;
        if (i == 0) {
            ((nyt) this.a).e.c(nxp.P(nsuVar));
        } else if (i == 1) {
            ((nsn) this.a).j(nsuVar.c());
        } else if (i == 2) {
            if (nsuVar.c() == null) {
                return;
            }
            ((oej) this.a).a.g = true;
        } else {
            nvu P = nxp.P(nsuVar);
            if (!nvu.e.o.equals(P.o)) {
                return;
            }
            ((oer) this.a).d.c(P);
        }
    }
}
