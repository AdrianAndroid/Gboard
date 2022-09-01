package defpackage;

/* compiled from: PG */
/* renamed from: oqk  reason: default package */
/* loaded from: classes2.dex */
public final class oqk {
    public oqi a;
    public oqe b;
    public int c;
    public String d;
    public opw e;
    public oqn f;
    oql g;
    oql h;
    public oql i;
    public long j;
    public long k;
    public mlu l;

    public oqk() {
        this.c = -1;
        this.l = new mlu((byte[]) null);
    }

    private static final void g(String str, oql oqlVar) {
        if (oqlVar.g == null) {
            if (oqlVar.h == null) {
                if (oqlVar.i == null) {
                    if (oqlVar.j != null) {
                        throw new IllegalArgumentException(str.concat(".priorResponse != null"));
                    }
                    return;
                }
                throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
            }
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        }
        throw new IllegalArgumentException(str.concat(".body != null"));
    }

    public final oql a() {
        if (this.a != null) {
            if (this.b != null) {
                int i = this.c;
                if (i >= 0) {
                    if (this.d == null) {
                        throw new IllegalStateException("message == null");
                    }
                    return new oql(this);
                }
                throw new IllegalStateException("code < 0: " + i);
            }
            throw new IllegalStateException("protocol == null");
        }
        throw new IllegalStateException("request == null");
    }

    public final void b(String str) {
        this.l.I("Warning", str);
    }

    public final void c(oql oqlVar) {
        if (oqlVar != null) {
            g("cacheResponse", oqlVar);
        }
        this.h = oqlVar;
    }

    public final void d(String str, String str2) {
        this.l.H(str, str2);
    }

    public final void e(opx opxVar) {
        this.l = opxVar.h();
    }

    public final void f(oql oqlVar) {
        if (oqlVar != null) {
            g("networkResponse", oqlVar);
        }
        this.g = oqlVar;
    }

    public oqk(oql oqlVar) {
        this.c = -1;
        this.a = oqlVar.a;
        this.b = oqlVar.b;
        this.c = oqlVar.c;
        this.d = oqlVar.d;
        this.e = oqlVar.e;
        this.l = oqlVar.f.h();
        this.f = oqlVar.g;
        this.g = oqlVar.h;
        this.h = oqlVar.i;
        this.i = oqlVar.j;
        this.j = oqlVar.k;
        this.k = oqlVar.l;
    }
}
