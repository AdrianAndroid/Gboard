package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: opb  reason: default package */
/* loaded from: classes2.dex */
public final class opb {
    private static final String k = "OkHttp-Sent-Millis";
    private static final String l = "OkHttp-Received-Millis";
    public final String a;
    public final opx b;
    public final String c;
    public final oqe d;
    public final int e;
    public final String f;
    public final opx g;
    public final opw h;
    public final long i;
    public final long j;

    static {
        otu otuVar = otu.c;
    }

    public opb(oql oqlVar) {
        this.a = oqlVar.a.a.e;
        this.b = orq.f(oqlVar);
        this.c = oqlVar.a.b;
        this.d = oqlVar.b;
        this.e = oqlVar.c;
        this.f = oqlVar.d;
        this.g = oqlVar.f;
        this.h = oqlVar.e;
        this.i = oqlVar.k;
        this.j = oqlVar.l;
    }

    private final boolean b() {
        return this.a.startsWith("https://");
    }

    private static final List c(out outVar) {
        int a = opc.a(outVar);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(a);
            for (int i = 0; i < a; i++) {
                String p = outVar.p();
                our ourVar = new our();
                ouu ouuVar = ouu.a;
                byte[] a2 = ovs.a(p);
                ourVar.I(a2 != null ? new ouu(a2) : null);
                arrayList.add(certificateFactory.generateCertificate(ourVar.k()));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    private static final void d(ous ousVar, List list) {
        try {
            ousVar.Z(list.size());
            ousVar.X(10);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ousVar.aa(ouu.i(((Certificate) list.get(i)).getEncoded()).c());
                ousVar.X(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final void a(oqy oqyVar) {
        ous d = oix.d(oqyVar.a(0));
        d.aa(this.a);
        d.X(10);
        d.aa(this.c);
        d.X(10);
        d.Z(this.b.a());
        d.X(10);
        int a = this.b.a();
        for (int i = 0; i < a; i++) {
            d.aa(this.b.c(i));
            d.aa(": ");
            d.aa(this.b.d(i));
            d.X(10);
        }
        d.aa(new oru(this.d, this.e, this.f).toString());
        d.X(10);
        d.Z(this.g.a() + 2);
        d.X(10);
        int a2 = this.g.a();
        for (int i2 = 0; i2 < a2; i2++) {
            d.aa(this.g.c(i2));
            d.aa(": ");
            d.aa(this.g.d(i2));
            d.X(10);
        }
        d.aa(k);
        d.aa(": ");
        d.Z(this.i);
        d.X(10);
        d.aa(l);
        d.aa(": ");
        d.Z(this.j);
        d.X(10);
        if (b()) {
            d.X(10);
            d.aa(this.h.b.t);
            d.X(10);
            d(d, this.h.c);
            d(d, this.h.d);
            d.aa(this.h.a.f);
            d.X(10);
        }
        d.close();
    }

    public opb(ovp ovpVar) {
        oqp oqpVar;
        try {
            out e = oix.e(ovpVar);
            this.a = e.p();
            this.c = e.p();
            mlu mluVar = new mlu((byte[]) null);
            int a = opc.a(e);
            for (int i = 0; i < a; i++) {
                mluVar.E(e.p());
            }
            this.b = mluVar.D();
            oru a2 = oru.a(e.p());
            this.d = a2.a;
            this.e = a2.b;
            this.f = a2.c;
            mlu mluVar2 = new mlu((byte[]) null);
            int a3 = opc.a(e);
            for (int i2 = 0; i2 < a3; i2++) {
                mluVar2.E(e.p());
            }
            String str = k;
            String C = mluVar2.C(str);
            String str2 = l;
            String C2 = mluVar2.C(str2);
            mluVar2.G(str);
            mluVar2.G(str2);
            long j = 0;
            this.i = C != null ? Long.parseLong(C) : 0L;
            this.j = C2 != null ? Long.parseLong(C2) : j;
            this.g = mluVar2.D();
            if (b()) {
                String p = e.p();
                if (p.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + p + "\"");
                }
                opj b = opj.b(e.p());
                List c = c(e);
                List c2 = c(e);
                if (!e.C()) {
                    oqpVar = oqp.b(e.p());
                } else {
                    oqpVar = oqp.SSL_3_0;
                }
                if (oqpVar != null) {
                    this.h = new opw(oqpVar, b, oqs.l(c), oqs.l(c2));
                } else {
                    throw new NullPointerException("tlsVersion == null");
                }
            } else {
                this.h = null;
            }
        } finally {
            ovpVar.close();
        }
    }
}
