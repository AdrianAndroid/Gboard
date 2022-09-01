package defpackage;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: goc  reason: default package */
/* loaded from: classes.dex */
public final class goc implements goe {
    public static final ltg a = ltg.j("com/google/android/libraries/gsa/s3/PairHttpConnection");
    private final mpa b;
    private final bmc c;
    private final blq d;
    private goa e;
    private gob f;
    private int g;
    private final fxa h;

    public goc(fxa fxaVar, mpa mpaVar, bmc bmcVar, blq blqVar, byte[] bArr) {
        this.h = fxaVar;
        this.b = mpaVar;
        this.c = bmcVar;
        this.d = blqVar;
    }

    public static void b(mko mkoVar) {
        mkoVar.cancel(true);
        if (!mkoVar.isCancelled()) {
            try {
                ((bmj) bvq.g(mkoVar)).a().c();
            } catch (blb | bmd | InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // defpackage.goe
    public final synchronized void a() {
        gob gobVar = this.f;
        if (gobVar != null) {
            gobVar.c();
            this.f = null;
        }
        goa goaVar = this.e;
        if (goaVar != null) {
            goaVar.c();
            this.e = null;
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [gpa, java.lang.Object] */
    @Override // defpackage.goe
    public final synchronized void c(gnx gnxVar, lgb lgbVar) {
        d(0);
        String uuid = UUID.randomUUID().toString();
        goa goaVar = new goa(this, this.b, uuid, this.c, this.d, gnxVar);
        this.e = goaVar;
        goaVar.f(this.h);
        ?? r7 = ((etm) lgbVar).a;
        if (r7 instanceof gpb) {
            gpb gpbVar = (gpb) r7;
            mox moxVar = this.b.c;
            if (moxVar == null) {
                moxVar = mox.g;
            }
            this.f = new gny(this, moxVar, uuid, this.c, this.d, r7, gpbVar, gnxVar);
        } else {
            mox moxVar2 = this.b.c;
            if (moxVar2 == null) {
                moxVar2 = mox.g;
            }
            this.f = new gob(this, moxVar2, uuid, this.c, this.d, r7, gnxVar);
        }
        this.f.f(this.h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized boolean d(int i) {
        if (i == 0) {
            this.g = 0;
            return true;
        } else if (i == 1) {
            if (this.g == 2) {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/gsa/s3/PairHttpConnection", "setResponseState", 238, "PairHttpConnection.java")).t("The response is sent in the up and down");
                return false;
            }
            this.g = 1;
            return true;
        } else if (i == 2) {
            jdg.F(this.g != 3);
            if (this.g == 1) {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/gsa/s3/PairHttpConnection", "setResponseState", 250, "PairHttpConnection.java")).t("The response is sent in the up and down");
                return false;
            }
            this.g = 2;
            return true;
        } else {
            int i2 = this.g;
            if (i2 == 2) {
                this.g = 3;
                return false;
            } else if (i2 == 1) {
                return true;
            } else {
                this.g = 3;
                return true;
            }
        }
    }
}
