package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* compiled from: PG */
/* renamed from: osc  reason: default package */
/* loaded from: classes2.dex */
public final class osc implements orn {
    final oqd a;
    final orj b;
    final out c;
    final ous d;
    int e = 0;
    private long f = 262144;

    public osc(oqd oqdVar, orj orjVar, out outVar, ous ousVar) {
        this.a = oqdVar;
        this.b = orjVar;
        this.c = outVar;
        this.d = ousVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void k(oux ouxVar) {
        ovr ovrVar = ouxVar.a;
        ouxVar.a = ovr.h;
        ovrVar.k();
        ovrVar.l();
    }

    private final String l() {
        String q = this.c.q(this.f);
        this.f -= q.length();
        return q;
    }

    @Override // defpackage.orn
    public final oqk a(boolean z) {
        int i = this.e;
        if (i == 1 || i == 3) {
            try {
                oru a = oru.a(l());
                oqk oqkVar = new oqk();
                oqkVar.b = a.a;
                oqkVar.c = a.b;
                oqkVar.d = a.c;
                oqkVar.e(h());
                if (z && a.b == 100) {
                    return null;
                }
                if (a.b == 100) {
                    this.e = 3;
                    return oqkVar;
                }
                this.e = 4;
                return oqkVar;
            } catch (EOFException e) {
                IOException iOException = new IOException("unexpected end of stream on ".concat(String.valueOf(String.valueOf(this.b))));
                iOException.initCause(e);
                throw iOException;
            }
        }
        throw new IllegalStateException("state: " + i);
    }

    @Override // defpackage.orn
    public final oqn b(oql oqlVar) {
        orj orjVar = this.b;
        opv opvVar = orjVar.e;
        opf opfVar = orjVar.d;
        String a = oqlVar.a("Content-Type");
        if (!orq.h(oqlVar)) {
            return new ors(a, 0L, oix.e(i(0L)));
        }
        if ("chunked".equalsIgnoreCase(oqlVar.a("Transfer-Encoding"))) {
            opz opzVar = oqlVar.a.a;
            int i = this.e;
            if (i == 4) {
                this.e = 5;
                return new ors(a, -1L, oix.e(new ory(this, opzVar)));
            }
            throw new IllegalStateException("state: " + i);
        }
        long d = orq.d(oqlVar);
        if (d != -1) {
            return new ors(a, d, oix.e(i(d)));
        }
        int i2 = this.e;
        if (i2 == 4) {
            orj orjVar2 = this.b;
            if (orjVar2 != null) {
                this.e = 5;
                orjVar2.d();
                return new ors(a, -1L, oix.e(new osb(this)));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + i2);
    }

    @Override // defpackage.orn
    public final ovn c(oqi oqiVar, long j) {
        if ("chunked".equalsIgnoreCase(oqiVar.a("Transfer-Encoding"))) {
            int i = this.e;
            if (i == 1) {
                this.e = 2;
                return new orx(this);
            }
            throw new IllegalStateException("state: " + i);
        } else if (j != -1) {
            int i2 = this.e;
            if (i2 != 1) {
                throw new IllegalStateException("state: " + i2);
            }
            this.e = 2;
            return new orz(this, j);
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // defpackage.orn
    public final void d() {
        orf b = this.b.b();
        if (b != null) {
            b.a();
        }
    }

    @Override // defpackage.orn
    public final void e() {
        this.d.flush();
    }

    @Override // defpackage.orn
    public final void f() {
        this.d.flush();
    }

    @Override // defpackage.orn
    public final void g(oqi oqiVar) {
        Proxy.Type type = this.b.b().b.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(oqiVar.b);
        sb.append(' ');
        if (oqiVar.c() || type != Proxy.Type.HTTP) {
            sb.append(ofb.c(oqiVar.a));
        } else {
            sb.append(oqiVar.a);
        }
        sb.append(" HTTP/1.1");
        j(oqiVar.c, sb.toString());
    }

    public final opx h() {
        mlu mluVar = new mlu((byte[]) null);
        while (true) {
            String l = l();
            if (l.length() != 0) {
                mluVar.E(l);
            } else {
                return mluVar.D();
            }
        }
    }

    public final ovp i(long j) {
        int i = this.e;
        if (i != 4) {
            throw new IllegalStateException("state: " + i);
        }
        this.e = 5;
        return new osa(this, j);
    }

    public final void j(opx opxVar, String str) {
        int i = this.e;
        if (i != 0) {
            throw new IllegalStateException("state: " + i);
        }
        ous ousVar = this.d;
        ousVar.aa(str);
        ousVar.aa("\r\n");
        int a = opxVar.a();
        for (int i2 = 0; i2 < a; i2++) {
            ous ousVar2 = this.d;
            ousVar2.aa(opxVar.c(i2));
            ousVar2.aa(": ");
            ousVar2.aa(opxVar.d(i2));
            ousVar2.aa("\r\n");
        }
        this.d.aa("\r\n");
        this.e = 1;
    }
}
