package defpackage;

/* compiled from: PG */
/* renamed from: czw  reason: default package */
/* loaded from: classes.dex */
public final class czw implements itt {
    private static final czv a = new czv();
    private final ixi b;
    private ixh c;

    public czw(ixi ixiVar) {
        this.b = ixiVar;
    }

    @Override // defpackage.itt
    public final llp a() {
        ixh ixhVar = this.c;
        if (ixhVar == null || !ixhVar.hasNext()) {
            return llp.q();
        }
        oxo oxoVar = ((eeu) ((ixg) this.c.next()).b()).c;
        if (oxoVar == null) {
            oxoVar = oxo.b;
        }
        return llp.r(new jls((byte[]) null, oxoVar.q()));
    }

    @Override // defpackage.itt
    public final void b(int i) {
    }

    @Override // defpackage.itt
    public final void c(String str, byte[] bArr, byte[] bArr2) {
        try {
            nfb b = nfb.b();
            nfb b2 = nfb.b();
            lfb a2 = jzy.a.a((ndy) nfm.z(ndy.c, bArr, b), b2);
            if (a2.e()) {
                this.c = this.b.g(iuy.b, (jzx) a2.a(), a);
                return;
            }
            throw new IllegalArgumentException("Failed to get the example selection criteria.");
        } catch (ngd e) {
            throw new IllegalArgumentException("Failed to parse criteria.", e);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ixh ixhVar = this.c;
        if (ixhVar != null) {
            ixhVar.close();
            this.c = null;
        }
    }
}
