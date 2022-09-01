package defpackage;

/* compiled from: PG */
/* renamed from: gnw  reason: default package */
/* loaded from: classes.dex */
public final class gnw {
    private final gnx a;
    private final bmc b;
    private final blq c;
    private final mpa d;
    private final lgb e;
    private boolean f;
    private god g;
    private goe h;
    private final fxa i;

    public gnw(fxa fxaVar, gnx gnxVar, bmc bmcVar, blq blqVar, mpa mpaVar, lgb lgbVar, byte[] bArr) {
        this.i = fxaVar;
        this.a = gnxVar;
        this.b = bmcVar;
        this.c = blqVar;
        this.d = mpaVar;
        this.e = lgbVar;
    }

    public final synchronized void a() {
        jdg.G(!this.f, "Duplicate call to start.");
        this.f = true;
        blq blqVar = this.c;
        lty ltyVar = luh.a;
        this.g = new god(this.a);
        goc gocVar = new goc(this.i, this.d, this.b, blqVar, null);
        this.h = gocVar;
        god godVar = this.g;
        jdg.u(godVar);
        gocVar.c(godVar, this.e);
    }

    public final synchronized void b() {
        jdg.G(this.f, "Call to close without start.");
        this.f = false;
        lty ltyVar = luh.a;
        god godVar = this.g;
        if (godVar != null) {
            godVar.a.set(true);
            this.g = null;
        }
        goe goeVar = this.h;
        if (goeVar != null) {
            goeVar.a();
            this.h = null;
        }
    }
}
