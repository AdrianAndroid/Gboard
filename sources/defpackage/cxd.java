package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: cxd  reason: default package */
/* loaded from: classes.dex */
public final class cxd {
    public llp a;
    public lfb b;
    public lfb c;
    public int d;
    private llp e;
    private llp f;
    private llp g;
    private lfb h;
    private boolean i;
    private lfb j;
    private byte k;

    public cxd() {
    }

    public cxd(cxe cxeVar) {
        ldu lduVar = ldu.a;
        this.b = lduVar;
        this.h = lduVar;
        this.c = lduVar;
        this.j = lduVar;
        this.a = cxeVar.b;
        this.e = cxeVar.c;
        this.f = cxeVar.d;
        this.g = cxeVar.e;
        this.b = cxeVar.f;
        this.h = cxeVar.g;
        this.i = cxeVar.h;
        this.c = cxeVar.i;
        this.j = cxeVar.j;
        this.d = cxeVar.k;
        this.k = (byte) 1;
    }

    public cxd(byte[] bArr) {
        ldu lduVar = ldu.a;
        this.b = lduVar;
        this.h = lduVar;
        this.c = lduVar;
        this.j = lduVar;
    }

    public final cxe a() {
        lgb n = jdg.n(new boh(this, 15));
        this.h = ldu.a;
        if (this.k != 0) {
            if (this.i) {
                lfb f = lfb.f((cxc) ((llw) n.a()).get(this.b.a()));
                if (f.e() && !b().contains(f.a())) {
                    this.h = f;
                }
            }
            if (this.c.e()) {
                llk e = llp.e();
                llp llpVar = (llp) this.c.a();
                int size = llpVar.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    cxc cxcVar = (cxc) ((llw) n.a()).get((String) llpVar.get(i2));
                    if (cxcVar != null && !b().contains(cxcVar)) {
                        e.h(cxcVar);
                        i++;
                        if (i >= ((Long) cwz.m.c()).intValue()) {
                            break;
                        }
                    }
                }
                this.j = dip.n(e.g());
            }
            if (this.k != 1 || this.a == null || this.e == null || this.f == null || this.g == null || this.d == 0) {
                StringBuilder sb = new StringBuilder();
                if (this.a == null) {
                    sb.append(" all");
                }
                if (this.e == null) {
                    sb.append(" promos");
                }
                if (this.f == null) {
                    sb.append(" unfavorites");
                }
                if (this.g == null) {
                    sb.append(" favorites");
                }
                if (this.k == 0) {
                    sb.append(" shouldShowFeatureHeader");
                }
                if (this.d == 0) {
                    sb.append(" featuredModelType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            return new cxe(this.a, this.e, this.f, this.g, this.b, this.h, this.i, this.c, this.j, this.d);
        }
        throw new IllegalStateException("Property \"shouldShowFeatureHeader\" has not been set");
    }

    public final llp b() {
        llp llpVar = this.g;
        if (llpVar != null) {
            return llpVar;
        }
        throw new IllegalStateException("Property \"favorites\" has not been set");
    }

    public final void c(List list) {
        this.g = llp.o(list);
    }

    public final void d(List list) {
        this.e = llp.o(list);
    }

    public final void e(boolean z) {
        this.i = z;
        this.k = (byte) 1;
    }

    public final void f(List list) {
        this.f = llp.o(list);
    }

    public final void g(List list) {
        this.a = llp.o(list);
    }

    public final void h(List list, dpe dpeVar) {
        llp f = dpeVar.f(list);
        llp d = cxe.d(list, lmz.p(f));
        g(llp.o(list));
        f(d);
        c(f);
    }
}
