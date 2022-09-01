package defpackage;

/* compiled from: PG */
/* renamed from: gls  reason: default package */
/* loaded from: classes.dex */
public final class gls implements gma {
    public String a;
    private final bmi b;
    private final nox c;
    private final gmb d;
    private blw e;
    private boolean f = false;
    private String g;

    public gls(bmi bmiVar, blw blwVar, nox noxVar, gmb gmbVar) {
        this.b = bmiVar;
        this.e = blwVar;
        this.c = noxVar;
        this.d = gmbVar;
    }

    private static void d(bmj bmjVar) {
        try {
            bmjVar.a().c();
        } catch (blb | bmd unused) {
        }
    }

    @Override // defpackage.miy
    /* renamed from: b */
    public final synchronized mko a(bmj bmjVar) {
        String b;
        try {
            if (!this.b.j || this.f || (b = bmjVar.c().b("X-Hallmonitor-Challenge", null)) == null) {
                return kcu.K(bmjVar);
            }
            this.f = true;
            this.g = b;
            mko a = ((bmb) this.c.a()).a();
            this.e.c();
            this.e = this.e.d();
            d(bmjVar);
            return mio.h(a, new eoi(this, 16), mjl.a);
        } catch (blb e) {
            d(bmjVar);
            return kcu.K(new bln(e));
        }
    }

    @Override // defpackage.gma
    public final synchronized mko c() {
        bmi bmiVar;
        bmiVar = this.b;
        String str = this.g;
        String str2 = this.a;
        if (str != null && str2 != null) {
            bmh bmhVar = new bmh(bmiVar);
            bmhVar.c("X-Hallmonitor-Challenge", str);
            bmhVar.c("X-Hallmonitor-Response", str2);
            this.g = null;
            this.a = null;
            bmiVar = bmhVar.a();
        }
        return mio.h(this.d.a(bmiVar, this.e).c(), this, mjl.a);
    }
}
