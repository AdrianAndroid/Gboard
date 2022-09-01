package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: hjm  reason: default package */
/* loaded from: classes.dex */
public final class hjm implements avj {
    static final lgb a = jdg.n(cqg.l);
    public static final /* synthetic */ int c = 0;
    public final leq b;
    private final aze d;
    private final iil e;
    private final Class f;
    private volatile hiz g;
    private volatile boolean h;

    public hjm(aze azeVar, Class cls, leq leqVar) {
        this.h = false;
        this.d = azeVar;
        this.f = cls;
        this.b = leqVar;
        this.e = iil.a;
    }

    public hjm(hjo hjoVar, Class cls, leq leqVar) {
        this.h = false;
        this.d = hjoVar.b;
        this.e = hjoVar.c;
        this.f = cls;
        this.b = leqVar;
    }

    @Override // defpackage.avj
    public final Class a() {
        return this.f;
    }

    @Override // defpackage.avj
    public final void d() {
    }

    @Override // defpackage.avj
    public final void f(atk atkVar, avi aviVar) {
        int i;
        if (this.h) {
            aviVar.e(new CancellationException("Glide request already canceled"));
            return;
        }
        iig a2 = iih.a();
        a2.j(this.d.c());
        a2.i(this.d.d());
        a2.g();
        a2.e(this.e);
        atk atkVar2 = atk.IMMEDIATE;
        int ordinal = atkVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            i = 5;
        } else {
            i = 3;
            if (ordinal != 3) {
                i = 4;
            }
        }
        a2.f(i);
        iih a3 = a2.a();
        ehz ehzVar = new ehz(aviVar, 13);
        hiz k = hiz.k(((ihq) a.a()).c(a3));
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new eii(this, aviVar, 9));
        e2.h(ehzVar);
        e3.h(ehzVar);
        k.E(hjg.a(mjl.a, null, afpVar, z, e, e2, e3));
        this.g = k;
    }

    @Override // defpackage.avj
    public final void fh() {
        this.h = true;
        hiz hizVar = this.g;
        if (hizVar != null) {
            hizVar.cancel(true);
        }
    }

    @Override // defpackage.avj
    public final int g() {
        return 2;
    }
}
