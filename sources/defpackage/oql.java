package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* renamed from: oql  reason: default package */
/* loaded from: classes2.dex */
public final class oql implements Closeable {
    public final oqi a;
    public final oqe b;
    public final int c;
    public final String d;
    public final opw e;
    public final opx f;
    public final oqn g;
    public final oql h;
    public final oql i;
    public final oql j;
    public final long k;
    public final long l;
    private volatile ope m;

    public oql(oqk oqkVar) {
        this.a = oqkVar.a;
        this.b = oqkVar.b;
        this.c = oqkVar.c;
        this.d = oqkVar.d;
        this.e = oqkVar.e;
        this.f = oqkVar.l.D();
        this.g = oqkVar.f;
        this.h = oqkVar.g;
        this.i = oqkVar.h;
        this.j = oqkVar.i;
        this.k = oqkVar.j;
        this.l = oqkVar.k;
    }

    public final String a(String str) {
        String b = this.f.b(str);
        if (b != null) {
            return b;
        }
        return null;
    }

    public final ope b() {
        ope opeVar = this.m;
        if (opeVar != null) {
            return opeVar;
        }
        ope a = ope.a(this.f);
        this.m = a;
        return a;
    }

    public final oqk c() {
        return new oqk(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        oqn oqnVar = this.g;
        if (oqnVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        oqnVar.close();
    }

    public final boolean d() {
        int i = this.c;
        return i >= 200 && i < 300;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        int i = this.c;
        String str = this.d;
        String valueOf2 = String.valueOf(this.a.a);
        return "Response{protocol=" + valueOf + ", code=" + i + ", message=" + str + ", url=" + valueOf2 + "}";
    }
}
