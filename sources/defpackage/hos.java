package defpackage;

/* compiled from: PG */
/* renamed from: hos  reason: default package */
/* loaded from: classes.dex */
public final class hos {
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    public final hpj e = new hpj();
    private final hoy f;
    private final hox g;

    public hos(hoy hoyVar, hox hoxVar) {
        this.f = hoyVar;
        this.g = hoxVar;
    }

    public final void a() {
        hpj hpjVar = this.e;
        boolean z = this.b != 0;
        if (!hpjVar.g) {
            return;
        }
        hpjVar.g = false;
        long a = hpjVar.a();
        if (!hpjVar.h || !hpjVar.c || hpjVar.f != 0 || hpjVar.k != a) {
            return;
        }
        if (hpjVar.i == -10033 && !hpjVar.j) {
            return;
        }
        hpjVar.c(a, z);
        hpjVar.j = false;
    }

    public final void b() {
        this.c = true;
    }

    public final void c() {
        this.e.b(this.b != 0);
    }

    public final void d() {
        if (!this.d && this.c) {
            f();
            this.c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(hsy hsyVar) {
        hpj hpjVar = this.e;
        hpjVar.c = false;
        hpjVar.d = false;
        hpjVar.e = false;
        hpjVar.f = 0;
        hpjVar.g = false;
        hpjVar.i = 0;
        hpjVar.j = false;
        hpjVar.k = 0L;
        hpjVar.l = -1L;
        hpjVar.b = hsyVar;
        if (hsyVar != null) {
            hpjVar.c = hsyVar.af(1L);
            hpjVar.d = hsyVar.af(3L);
            hpjVar.e = hsyVar.af(17592186044419L);
        }
    }

    public final void f() {
        int i = 0;
        if (this.a && this.g.p().X()) {
            i = this.f.z();
        }
        if (this.b != i) {
            this.b = i;
            hox hoxVar = this.g;
            if (hoxVar.g != 1) {
                return;
            }
            hoxVar.p().W(this.b);
        }
    }

    public final boolean g() {
        boolean z = false;
        if (!this.g.p().I()) {
            this.d = false;
            return false;
        }
        int gg = this.g.p().gg();
        this.b = gg;
        hpj hpjVar = this.e;
        if (gg != 0) {
            z = true;
        }
        hpjVar.b(z);
        this.d = true;
        return true;
    }
}
