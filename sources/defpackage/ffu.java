package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ffu  reason: default package */
/* loaded from: classes.dex */
public final class ffu extends gpd {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/s3/GboardS3RequestProducers");
    private final gpc d;
    private final lgb e;
    private final blc f;
    private final lga g;
    private final boolean h;
    private boolean k;
    private final int l;
    private final fxa m;
    private gpc i = null;
    private boolean j = true;
    public final CountDownLatch a = new CountDownLatch(1);

    public ffu(fxa fxaVar, lgb lgbVar, int i, blc blcVar, lga lgaVar, gpc gpcVar, boolean z, byte[] bArr, byte[] bArr2) {
        super(new gpc[0]);
        this.d = gpcVar;
        this.m = fxaVar;
        this.e = lgbVar;
        this.l = i;
        this.f = blcVar;
        this.g = lgaVar;
        this.h = z;
    }

    @Override // defpackage.gpd
    public final nks a() {
        nks nksVar;
        if (this.j) {
            this.j = false;
            nksVar = this.d.hK();
            this.d.close();
        } else if (this.h) {
            nksVar = null;
        } else {
            gpc gpcVar = this.i;
            if (gpcVar == null) {
                try {
                    this.a.await();
                } catch (InterruptedException e) {
                    ((ltd) ((ltd) ((ltd) c.d()).i(e)).k("com/google/android/apps/inputmethod/libs/voiceime/s3/GboardS3RequestProducers", "getRequest", 'T', "GboardS3RequestProducers.java")).t("Failed to receive heartbeat response from S3.");
                }
                gpcVar = this.m.i(((gog) this.e).a(), this.l);
                this.i = gpcVar;
            }
            nks hK = gpcVar.hK();
            if (hK == null) {
                gpcVar.close();
            }
            nksVar = hK;
        }
        if (nksVar == null) {
            if (this.k) {
                return null;
            }
            b();
            nfj nfjVar = (nfj) nks.f.t();
            if (nfjVar.c) {
                nfjVar.cD();
                nfjVar.c = false;
            }
            nks nksVar2 = (nks) nfjVar.b;
            nksVar2.a |= 2;
            nksVar2.c = true;
            nks.f(nksVar2);
            return (nks) nfjVar.cz();
        }
        nfh nfhVar = (nfh) nksVar.N(5);
        nfhVar.cG(nksVar);
        nfj nfjVar2 = (nfj) nfhVar;
        ngt ngtVar = nkl.g;
        ngt ngtVar2 = nkl.g;
        nksVar.e(ngtVar2);
        Object k = nksVar.d.k((nfl) ngtVar2.c);
        if (k == null) {
            k = ngtVar2.b;
        } else {
            ngtVar2.c(k);
        }
        nkl nklVar = (nkl) k;
        nfh nfhVar2 = (nfh) nklVar.N(5);
        nfhVar2.cG(nklVar);
        long a = this.g.a(TimeUnit.MILLISECONDS);
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        nkl nklVar2 = (nkl) nfhVar2.b;
        nklVar2.a |= 128;
        nklVar2.e = a;
        nfjVar2.d(ngtVar, (nkl) nfhVar2.cz());
        return (nks) nfjVar2.cz();
    }

    @Override // defpackage.gpd
    public final void b() {
        this.k = true;
        this.d.close();
        gpc gpcVar = this.i;
        if (gpcVar != null) {
            gpcVar.close();
        }
    }
}
