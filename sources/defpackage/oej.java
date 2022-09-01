package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: oej  reason: default package */
/* loaded from: classes2.dex */
final class oej implements oex {
    public final oek a;
    private final nsn b;
    private final nxo c;

    public oej(oek oekVar, nxo nxoVar, nsn nsnVar, byte[] bArr, byte[] bArr2) {
        this.a = oekVar;
        this.c = nxoVar;
        this.b = nsnVar;
        nsnVar.d(new nyr(this, 2), mjl.a);
    }

    @Override // defpackage.oex
    public final void a(nvu nvuVar) {
        int i = oiw.a;
        if (!nvuVar.k()) {
            oek.d(this.a);
            this.c.j();
        }
        this.b.j(null);
    }

    @Override // defpackage.oex
    public final void b() {
        int i = oiw.a;
        if (this.a.g) {
            return;
        }
        this.c.k();
    }

    @Override // defpackage.ofj
    public final void d(ofi ofiVar) {
        int i = oiw.a;
        if (this.a.g) {
            oao.e(ofiVar);
            return;
        }
        while (true) {
            InputStream g = ofiVar.g();
            if (g == null) {
                return;
            }
            this.c.l(this.a.b.d.b(g));
            g.close();
        }
    }

    @Override // defpackage.ofj
    public final void e() {
        int i = oiw.a;
        if (this.a.g) {
            return;
        }
        this.c.m();
    }
}
