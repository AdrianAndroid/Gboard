package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkp  reason: default package */
/* loaded from: classes.dex */
public final class jkp implements jlk {
    public final jln a;
    public final jla b;
    public final Executor c;
    public final jhy d;
    private final jla e;
    private final Uri f;
    private final Uri g;
    private final kcq h;
    private final boe i;

    public jkp(jln jlnVar, jla jlaVar, jla jlaVar2, Uri uri, Uri uri2, boe boeVar, kcq kcqVar, Executor executor, jhy jhyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = jlnVar;
        this.b = jlaVar;
        this.e = jlaVar2;
        this.f = uri;
        this.g = uri2;
        this.i = boeVar;
        this.h = kcqVar;
        this.c = executor;
        this.d = jhyVar;
    }

    private static mko i() {
        return kcu.J(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void j(Uri uri) {
        if (this.h.v(uri)) {
            this.h.t(uri);
        }
    }

    @Override // defpackage.jlk
    public final mko a() {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(b(this.a.a()), new jke(this, 12), this.c);
            }
            if (ordinal == 3) {
                return this.e.a();
            }
            return i();
        }
        return this.a.a();
    }

    public final mko b(mko mkoVar) {
        return jco.g(jco.i(mkoVar, jkc.d, this.c), Exception.class, jkc.e, this.c);
    }

    @Override // defpackage.jlk
    public final mko c() {
        jpf jpfVar = jpf.b;
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(b(this.a.c()), new jko(this, jpfVar, 8), this.c);
            }
            if (ordinal == 3) {
                return this.e.c();
            }
            return i();
        }
        return this.a.c();
    }

    @Override // defpackage.jlk
    public final mko d() {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal == 1) {
            try {
                j(this.f);
                j(this.g);
                return this.a.d();
            } catch (IOException e) {
                return kcu.J(e);
            }
        } else if (ordinal == 2) {
            try {
                j(this.g);
                return jco.j(this.a.d(), new jke(this, 13), this.c);
            } catch (IOException e2) {
                return kcu.J(e2);
            }
        } else if (ordinal == 3) {
            try {
                j(this.f);
                return this.e.d();
            } catch (IOException e3) {
                return kcu.J(e3);
            }
        } else {
            return i();
        }
    }

    @Override // defpackage.jlk
    public final mko e(jit jitVar) {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(b(this.a.e(jitVar)), new jko(this, jitVar, 3), this.c);
            }
            if (ordinal == 3) {
                return this.e.e(jitVar);
            }
            return i();
        }
        return this.a.e(jitVar);
    }

    @Override // defpackage.jlk
    public final mko f(jit jitVar) {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(b(this.a.f(jitVar)), new jko(this, jitVar, 7), this.c);
            }
            if (ordinal == 3) {
                return this.e.f(jitVar);
            }
            return i();
        }
        return this.a.f(jitVar);
    }

    @Override // defpackage.jlk
    public final mko g(jit jitVar, jiu jiuVar) {
        jic jicVar = jic.UNDEFINED;
        int ordinal = this.i.p().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return jco.j(b(this.a.g(jitVar, jiuVar)), new jkg(this, jitVar, jiuVar, 10), this.c);
            }
            if (ordinal == 3) {
                return this.e.g(jitVar, jiuVar);
            }
            return i();
        }
        return this.a.g(jitVar, jiuVar);
    }

    public final mko h(jmp jmpVar, jmp jmpVar2) {
        this.d.y();
        if (jmk.i()) {
            jmpVar.equals(jmpVar2);
        }
        if (jmpVar.a) {
            return kcu.K(jmpVar.c());
        }
        return kcu.J((Throwable) jmpVar.d());
    }
}
