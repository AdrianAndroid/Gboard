package defpackage;

/* compiled from: PG */
/* renamed from: oad  reason: default package */
/* loaded from: classes2.dex */
public final class oad extends ocz {
    private boolean b;
    private final nvu c;
    private final nyv d;
    private final nxp[] e;

    public oad(nvu nvuVar, nyv nyvVar, nxp[] nxpVarArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        jdg.w(!nvuVar.k(), "error must not be OK");
        this.c = nvuVar;
        this.d = nyvVar;
        this.e = nxpVarArr;
    }

    @Override // defpackage.ocz, defpackage.nyu
    public final void b(oau oauVar) {
        oauVar.b("error", this.c);
        oauVar.b("progress", this.d);
    }

    @Override // defpackage.ocz, defpackage.nyu
    public final void m(nyw nywVar) {
        jdg.G(!this.b, "already started");
        this.b = true;
        for (nxp nxpVar : this.e) {
            nxpVar.c(this.c);
        }
        nywVar.a(this.c, this.d, new num());
    }

    public oad(nvu nvuVar, nxp[] nxpVarArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(nvuVar, nyv.PROCESSED, nxpVarArr, null, null, null);
    }
}
