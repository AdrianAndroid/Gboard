package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oca  reason: default package */
/* loaded from: classes2.dex */
public final class oca extends nzo {
    final nsu c;
    final nuq d;
    final nsa e;
    final /* synthetic */ ocb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oca(ocb ocbVar, nsu nsuVar, nuq nuqVar, nsa nsaVar) {
        super(ocbVar.c.f(nsaVar), ocbVar.c.j, nsaVar.b);
        this.f = ocbVar;
        this.c = nsuVar;
        this.d = nuqVar;
        this.e = nsaVar;
    }

    @Override // defpackage.nzo
    protected final void f() {
        this.f.c.m.execute(new obv(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        kvl kvlVar;
        nsu a = this.c.a();
        try {
            nsd c = this.f.c(this.d, this.e);
            synchronized (this) {
                if (this.b != null) {
                    kvlVar = null;
                } else {
                    super.i(c);
                    kvlVar = new kvl(this, 18);
                }
            }
            if (kvlVar == null) {
                this.f.c.m.execute(new obv(this, 4));
            } else {
                this.f.c.f(this.e).execute(new nzm(this, kvlVar, 14));
            }
        } finally {
            this.c.f(a);
        }
    }
}
