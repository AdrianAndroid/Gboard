package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* renamed from: oqd  reason: default package */
/* loaded from: classes2.dex */
public final class oqd implements Cloneable {
    static final List a = oqs.m(oqe.HTTP_2, oqe.HTTP_1_1);
    static final List b = oqs.m(opm.a, opm.b);
    public final opr c;
    public final Proxy d;
    public final List e;
    public final List f;
    final List g;
    final List h;
    public final ProxySelector i;
    public final opq j;
    public final opc k;
    public final SocketFactory l;
    public final SSLSocketFactory m;
    final oty n;
    public final HostnameVerifier o;
    public final opi p;
    public final oow q;
    final oow r;
    public final opk s;
    public final opt t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    final opu z;

    public oqd() {
        this(new oqc());
    }

    private static SSLSocketFactory b(X509TrustManager x509TrustManager) {
        try {
            SSLContext b2 = otu.c.b();
            b2.init(null, new TrustManager[]{x509TrustManager}, null);
            return b2.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw oqs.g("No System TLS", e);
        }
    }

    public final oqc a() {
        return new oqc(this);
    }

    public oqd(oqc oqcVar) {
        boolean z;
        this.c = oqcVar.a;
        this.d = oqcVar.b;
        this.e = oqcVar.c;
        List<opm> list = oqcVar.d;
        this.f = list;
        this.g = oqs.l(oqcVar.e);
        this.h = oqs.l(oqcVar.f);
        this.z = oqcVar.x;
        this.i = oqcVar.g;
        this.j = oqcVar.h;
        this.k = oqcVar.i;
        this.l = oqcVar.j;
        loop0: while (true) {
            z = false;
            for (opm opmVar : list) {
                z = (z || opmVar.c) ? true : z;
            }
        }
        SSLSocketFactory sSLSocketFactory = oqcVar.k;
        if (sSLSocketFactory != null || !z) {
            this.m = sSLSocketFactory;
            this.n = oqcVar.l;
        } else {
            X509TrustManager p = oqs.p();
            this.m = b(p);
            this.n = otu.c.d(p);
        }
        if (this.m != null) {
            otu.c.l(this.m);
        }
        this.o = oqcVar.m;
        opi opiVar = oqcVar.n;
        oty otyVar = this.n;
        this.p = !oqs.t(opiVar.c, otyVar) ? new opi(opiVar.b, otyVar) : opiVar;
        this.q = oqcVar.o;
        this.r = oqcVar.p;
        this.s = oqcVar.q;
        this.t = oqcVar.r;
        this.u = oqcVar.s;
        this.v = oqcVar.t;
        this.w = oqcVar.u;
        this.x = oqcVar.v;
        this.y = oqcVar.w;
        if (this.g.contains(null)) {
            throw new IllegalStateException("Null interceptor: ".concat(String.valueOf(String.valueOf(this.g))));
        }
        if (this.h.contains(null)) {
            throw new IllegalStateException("Null network interceptor: ".concat(String.valueOf(String.valueOf(this.h))));
        }
    }
}
