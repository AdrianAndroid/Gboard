package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: kqg  reason: default package */
/* loaded from: classes.dex */
public final class kqg {
    public Object a;
    private boolean b;
    private byte c;
    private Object d;
    private Object e;
    private Object f;
    private Object g;
    private Object h;

    public kqg() {
    }

    public kqg(cjo cjoVar) {
        ldu lduVar = ldu.a;
        this.g = lduVar;
        this.a = lduVar;
        chy chyVar = (chy) cjoVar;
        this.h = chyVar.a;
        this.f = chyVar.c;
        this.e = chyVar.d;
        this.d = chyVar.e;
        this.g = chyVar.f;
        this.a = chyVar.g;
        this.b = chyVar.h;
        this.c = (byte) 1;
    }

    public kqg(byte[] bArr) {
        ldu lduVar = ldu.a;
        this.g = lduVar;
        this.a = lduVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ngz, java.lang.Object] */
    public final kqh a() {
        Object obj;
        ?? r3;
        Object obj2;
        Object obj3;
        Object obj4 = this.g;
        if (obj4 != null) {
            this.h = ((llk) obj4).g();
        } else if (this.h == null) {
            this.h = llp.q();
        }
        if (this.c != 3 || (obj = this.d) == null || (r3 = this.e) == 0 || (obj2 = this.f) == null || (obj3 = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" uri");
            }
            if (this.e == null) {
                sb.append(" schema");
            }
            if (this.f == null) {
                sb.append(" handler");
            }
            if (this.a == null) {
                sb.append(" variantConfig");
            }
            if ((this.c & 1) == 0) {
                sb.append(" useGeneratedExtensionRegistry");
            }
            if ((this.c & 2) == 0) {
                sb.append(" enableTracing");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new kqh((Uri) obj, r3, (kqb) obj2, (llp) this.h, (kvj) obj3, this.b, null, null, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Iterable] */
    public final void b(kqd kqdVar) {
        if (this.g == null) {
            if (this.h == null) {
                this.g = llp.e();
            } else {
                llk e = llp.e();
                this.g = e;
                e.j(this.h);
                this.h = null;
            }
        }
        ((llk) this.g).h(kqdVar);
    }

    public final void c() {
        this.c = (byte) (this.c | 2);
    }

    public final void d(kqb kqbVar) {
        if (kqbVar != null) {
            this.f = kqbVar;
            return;
        }
        throw new NullPointerException("Null handler");
    }

    public final void e(ngz ngzVar) {
        if (ngzVar != null) {
            this.e = ngzVar;
            return;
        }
        throw new NullPointerException("Null schema");
    }

    public final void f(Uri uri) {
        if (uri != null) {
            this.d = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public final void g(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 1);
    }

    public final cjo h() {
        if (this.c != 1 || this.h == null || this.f == null || this.e == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.h == null) {
                sb.append(" candidate");
            }
            if (this.f == null) {
                sb.append(" image");
            }
            if (this.e == null) {
                sb.append(" glideModel");
            }
            if (this.d == null) {
                sb.append(" candidateRequest");
            }
            if (this.c == 0) {
                sb.append(" isExpressionMoment");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.g;
        lfb lfbVar = (lfb) obj5;
        ats atsVar = (ats) obj4;
        cqp cqpVar = (cqp) obj2;
        chy chyVar = new chy((mse) obj, cqpVar, obj3, atsVar, lfbVar, (lfb) this.a, this.b);
        dau.i(!chyVar.a.o.isEmpty() || !chyVar.a.d.isEmpty(), "candidate is empty");
        dau.i(!chyVar.c.r().equals(""), "image has no tag");
        dau.i(true, "sticker pack id is empty");
        return chyVar;
    }

    public final void i(mse mseVar) {
        if (mseVar != null) {
            this.h = mseVar;
            return;
        }
        throw new NullPointerException("Null candidate");
    }

    public final void j(ats atsVar) {
        if (atsVar != null) {
            this.d = atsVar;
            return;
        }
        throw new NullPointerException("Null candidateRequest");
    }

    public final void k(Object obj) {
        if (obj != null) {
            this.e = obj;
            return;
        }
        throw new NullPointerException("Null glideModel");
    }

    public final void l(cqp cqpVar) {
        if (cqpVar != null) {
            this.f = cqpVar;
            return;
        }
        throw new NullPointerException("Null image");
    }

    public final void m(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
