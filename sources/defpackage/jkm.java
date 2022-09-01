package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkm  reason: default package */
/* loaded from: classes.dex */
public final class jkm implements jkl {
    public final jkw a;
    public final Executor b;
    private final jll c;
    private final jkw d;
    private final Uri e;
    private final Uri f;
    private final jhy g;
    private final kcq h;
    private final boe i;

    public jkm(jll jllVar, jkw jkwVar, jkw jkwVar2, Uri uri, Uri uri2, boe boeVar, kcq kcqVar, Executor executor, jhy jhyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = jllVar;
        this.d = jkwVar2;
        this.a = jkwVar;
        this.e = uri;
        this.f = uri2;
        this.i = boeVar;
        this.h = kcqVar;
        this.b = executor;
        this.g = jhyVar;
    }

    private static mko q() {
        return kcu.J(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void r(Uri uri) {
        if (this.h.v(uri)) {
            this.h.t(uri);
        }
    }

    @Override // defpackage.jkl
    public final mko a(jig jigVar) {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(n(this.c.a(jigVar)), new jki(this, jigVar, 7), this.b);
            }
            if (ordinal == 3) {
                return this.d.a(jigVar);
            }
            return q();
        }
        return this.c.a(jigVar);
    }

    @Override // defpackage.jkl
    public final mko b() {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(n(this.c.b()), new jke(this, 9), this.b);
            }
            if (ordinal == 3) {
                return this.d.b();
            }
            return q();
        }
        return this.c.b();
    }

    @Override // defpackage.jkl
    public final mko c() {
        xr xrVar = xr.t;
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(n(this.c.c()), new jki(this, xrVar, 8), this.b);
            }
            if (ordinal == 3) {
                return this.d.c();
            }
            return q();
        }
        return this.c.c();
    }

    @Override // defpackage.jkl
    public final mko d() {
        xr xrVar = xr.u;
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(n(this.c.d()), new jki(this, xrVar, 17), this.b);
            }
            if (ordinal == 3) {
                return this.d.d();
            }
            return q();
        }
        return this.c.d();
    }

    @Override // defpackage.jkl
    public final mko e() {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(n(this.c.e()), new jke(this, 10), this.b);
            }
            if (ordinal == 3) {
                return this.d.e();
            }
            return q();
        }
        return this.c.e();
    }

    @Override // defpackage.jkl
    public final mko f() {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal == 1) {
            try {
                r(this.e);
                r(this.f);
                return mkk.a;
            } catch (IOException e) {
                return kcu.J(e);
            }
        } else if (ordinal == 2) {
            try {
                r(this.f);
                return mkk.a;
            } catch (IOException e2) {
                return kcu.J(e2);
            }
        } else if (ordinal == 3) {
            try {
                r(this.e);
                return mkk.a;
            } catch (IOException e3) {
                return kcu.J(e3);
            }
        } else {
            return q();
        }
    }

    @Override // defpackage.jkl
    public final mko g(jiq jiqVar) {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(n(this.c.g(jiqVar)), new jki(this, jiqVar, 18), this.b);
            }
            if (ordinal == 3) {
                return this.d.g(jiqVar);
            }
            return q();
        }
        return this.c.g(jiqVar);
    }

    @Override // defpackage.jkl
    public final mko h(jiq jiqVar) {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(n(this.c.h(jiqVar)), new jki(this, jiqVar, 11), this.b);
            }
            if (ordinal == 3) {
                return this.d.h(jiqVar);
            }
            return q();
        }
        return this.c.h(jiqVar);
    }

    @Override // defpackage.jkl
    public final mko i(jiq jiqVar) {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(n(this.c.i(jiqVar)), new jki(this, jiqVar, 14), this.b);
            }
            if (ordinal == 3) {
                return this.d.i(jiqVar);
            }
            return q();
        }
        return this.c.i(jiqVar);
    }

    @Override // defpackage.jkl
    public final mko j(List list) {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(n(this.c.j(list)), new jki(this, list, 15), this.b);
            }
            if (ordinal == 3) {
                return this.d.j(list);
            }
            return q();
        }
        return this.c.j(list);
    }

    @Override // defpackage.jkl
    public final mko k() {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(n(this.c.k()), new jke(this, 11), this.b);
            }
            if (ordinal == 3) {
                return this.d.k();
            }
            return q();
        }
        return this.c.k();
    }

    @Override // defpackage.jkl
    public final mko l(jiq jiqVar, jig jigVar) {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(n(this.c.l(jiqVar, jigVar)), new jkg(this, jiqVar, jigVar, 5), this.b);
            }
            if (ordinal == 3) {
                return this.d.l(jiqVar, jigVar);
            }
            return q();
        }
        return this.c.l(jiqVar, jigVar);
    }

    @Override // defpackage.jkl
    public final mko m(List list) {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(n(this.c.m(list)), new jki(this, list, 19), this.b);
            }
            if (ordinal == 3) {
                return this.d.m(list);
            }
            return q();
        }
        return this.c.m(list);
    }

    public final mko n(mko mkoVar) {
        return jco.g(jco.i(mkoVar, jkc.b, this.b), Exception.class, jkc.c, this.b);
    }

    public final mko o(jmp jmpVar, jmp jmpVar2) {
        this.g.y();
        if (jmk.i()) {
            jmpVar.equals(jmpVar2);
        }
        if (jmpVar.a) {
            return kcu.K(jmpVar.c());
        }
        return kcu.J((Throwable) jmpVar.d());
    }

    public final mko p(jmp jmpVar, jmp jmpVar2, Comparator comparator) {
        this.g.y();
        if (jmk.i()) {
            jmp.g(jmpVar, jmpVar2, comparator);
        }
        if (jmpVar.a) {
            List list = (List) jmpVar.c();
            jdg.u(list);
            return kcu.K(list);
        }
        Object d = jmpVar.d();
        jdg.u(d);
        return kcu.J((Throwable) d);
    }
}
