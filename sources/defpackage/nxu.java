package defpackage;

/* compiled from: PG */
/* renamed from: nxu  reason: default package */
/* loaded from: classes2.dex */
public abstract class nxu implements ocr {
    public nzi a;
    public final ofo c;
    public final ocu d;
    public int e;
    public boolean f;
    public boolean g;
    public final ofg h;
    public nyw i;
    public Runnable l;
    public volatile boolean m;
    public boolean n;
    public boolean o;
    private boolean p;
    public final Object b = new Object();
    public nsy j = nsy.b;
    public boolean k = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public nxu(int i, ofg ofgVar, ofo ofoVar) {
        this.c = ofoVar;
        ocu ocuVar = new ocu(this, nsh.a, i, ofgVar, ofoVar);
        this.d = ocuVar;
        this.a = ocuVar;
        this.h = ofgVar;
    }

    @Override // defpackage.ocr
    public final void a(ofi ofiVar) {
        this.i.d(ofiVar);
    }

    public final void b() {
        boolean c;
        synchronized (this.b) {
            c = c();
        }
        if (c) {
            this.i.e();
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.f && this.e < 32768 && !this.g) {
                z = true;
            }
        }
        return z;
    }

    public final void d(nvu nvuVar, nyv nyvVar, num numVar) {
        if (!this.p) {
            this.p = true;
            this.h.e(nvuVar);
            this.i.a(nvuVar, nyvVar, numVar);
            ofo ofoVar = this.c;
            if (nvuVar.k()) {
                ofoVar.c++;
            } else {
                ofoVar.d++;
            }
        }
    }

    @Override // defpackage.ocr
    public void e(boolean z) {
        throw null;
    }

    public final void f(nvu nvuVar, boolean z, num numVar) {
        g(nvuVar, nyv.PROCESSED, z, numVar);
    }

    public final void g(nvu nvuVar, nyv nyvVar, boolean z, num numVar) {
        jdg.Q(nvuVar, "status");
        jdg.Q(numVar, "trailers");
        if (!this.n || z) {
            this.n = true;
            this.o = nvuVar.k();
            synchronized (this.b) {
                this.g = true;
            }
            if (this.k) {
                this.l = null;
                d(nvuVar, nyvVar, numVar);
                return;
            }
            this.l = new bvr(this, nvuVar, nyvVar, numVar, 3);
            if (z) {
                this.a.close();
                return;
            }
            ocu ocuVar = (ocu) this.a;
            if (ocuVar.b()) {
                return;
            }
            if (ocuVar.c()) {
                ocuVar.close();
            } else {
                ocuVar.f = true;
            }
        }
    }
}
