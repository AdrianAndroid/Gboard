package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oud  reason: default package */
/* loaded from: classes2.dex */
public final class oud extends oui {
    final our a;
    long b = -1;

    public oud(long j) {
        our ourVar = new our();
        this.a = ourVar;
        d(ourVar, j);
    }

    @Override // defpackage.oui, defpackage.oqj
    public final long a() {
        return this.b;
    }

    @Override // defpackage.oqj
    public final void b(ous ousVar) {
        our ourVar = this.a;
        ourVar.G(((ovh) ousVar).b, 0L, ourVar.b);
    }

    @Override // defpackage.oui
    public final oqi c(oqi oqiVar) {
        if (oqiVar.a("Content-Length") != null) {
            return oqiVar;
        }
        this.e.close();
        this.b = this.a.b;
        osr d = oqiVar.d();
        d.f("Transfer-Encoding");
        d.c("Content-Length", Long.toString(this.a.b));
        return d.a();
    }
}
