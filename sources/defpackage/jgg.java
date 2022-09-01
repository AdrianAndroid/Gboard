package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jgg  reason: default package */
/* loaded from: classes.dex */
public final class jgg {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/zwieback/ZwiebackFetcher");
    private static final hiz b = hiz.m(new IllegalStateException("ZwiebackFetcher: unable to obtain Zwieback"));
    private static final lgb c = jdg.n(jgf.a);
    private final lfb d;
    private final mks e;
    private hiz f = b;

    public jgg(lfb lfbVar, mks mksVar) {
        this.d = lfbVar;
        this.e = mksVar;
    }

    public static jgg b() {
        return (jgg) c.a();
    }

    public final hiz a() {
        hiz hizVar = this.f;
        if (hizVar.C() || hizVar.D() || !this.d.e() || !jai.b.b()) {
            return hizVar;
        }
        mks mksVar = this.e;
        fqf b2 = fqg.b();
        b2.a = gey.a;
        b2.c = 3901;
        hiz u = hiz.k(gni.c(((fnz) this.d.a()).g(b2.a()))).w(1000L, TimeUnit.MILLISECONDS, mksVar).u(iuu.o, mjl.a);
        this.f = u;
        return u;
    }
}
