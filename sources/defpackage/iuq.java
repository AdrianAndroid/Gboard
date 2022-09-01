package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: iuq  reason: default package */
/* loaded from: classes.dex */
public final class iuq implements itt {
    private final ixi a;
    private ipu b;
    private int c = 100;

    public iuq(ixi ixiVar) {
        this.a = ixiVar;
    }

    @Override // defpackage.itt
    public final llp a() {
        llk e = llp.e();
        for (int i = 0; i < this.c && this.b.hasNext(); i++) {
            e.h(new jls((byte[]) null, ((ips) this.b).next().q()));
        }
        llp g = e.g();
        int i2 = ((lrl) g).c;
        return g;
    }

    @Override // defpackage.itt
    public final void b(int i) {
    }

    @Override // defpackage.itt
    public final void c(String str, byte[] bArr, byte[] bArr2) {
        try {
            nem nemVar = ((ndy) nfm.z(ndy.c, bArr, nfb.b())).b;
            nfb b = nfb.b();
            myj myjVar = myj.c;
            ner l = nemVar.l();
            nfm nfmVar = (nfm) myjVar.N(4);
            try {
                try {
                    nho b2 = nhh.a.b(nfmVar);
                    b2.h(nfmVar, nes.p(l), b);
                    b2.f(nfmVar);
                    try {
                        l.z(0);
                        nfm.O(nfmVar);
                        myj myjVar2 = (myj) nfmVar;
                        String str2 = myjVar2.a;
                        this.c = myjVar2.b;
                        nbw nbwVar = nbw.a;
                        oll.e(str2, "input");
                        nbg nbgVar = (nbg) nbw.d.a(str2);
                        this.b = this.a.c(str2);
                    } catch (ngd e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof ngd) {
                        throw ((ngd) e2.getCause());
                    }
                    throw new ngd(e2);
                } catch (nhz e3) {
                    throw e3.a();
                }
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof ngd) {
                    throw ((ngd) e4.getCause());
                }
                throw e4;
            } catch (ngd e5) {
                if (e5.a) {
                    throw new ngd(e5);
                }
            }
        } catch (ngd e6) {
            throw new IllegalArgumentException("Failed to parse criteria", e6);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
