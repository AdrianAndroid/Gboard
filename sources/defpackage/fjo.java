package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* renamed from: fjo  reason: default package */
/* loaded from: classes.dex */
public final class fjo {
    public final fkd a;
    public final fke b;
    public final mld c = mld.e();

    private fjo(fkd fkdVar, fke fkeVar) {
        fkdVar.getClass();
        this.a = fkdVar;
        this.b = fkeVar;
    }

    public static fjo c(fkd fkdVar, fke fkeVar) {
        return new fjo(fkdVar, fkeVar);
    }

    public static void d(mko mkoVar, kcq kcqVar) {
        kcu.U(mkh.q(mkoVar), new fkb(kcqVar, 0, null), mjl.a);
    }

    public final void a(Bundle bundle) {
        b(fgy.b(bundle));
    }

    public final void b(Throwable th) {
        this.c.n(th);
    }
}
