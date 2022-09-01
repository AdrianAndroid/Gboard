package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* renamed from: orf  reason: default package */
/* loaded from: classes2.dex */
public final class orf extends ost {
    public final opk a;
    public final oqo b;
    public Socket c;
    public Socket d;
    public opw e;
    public oqe f;
    public osz g;
    public out h;
    public ous i;
    public boolean j;
    public int k;
    public int l = 1;
    public final List m = new ArrayList();
    public long n = Long.MAX_VALUE;

    public orf(opk opkVar, oqo oqoVar) {
        this.a = opkVar;
        this.b = oqoVar;
    }

    public final void a() {
        oqs.s(this.c);
    }

    public final void b(ore oreVar) {
        boolean z;
        SSLSocket sSLSocket;
        opm opmVar;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        oqe oqeVar;
        oou oouVar = this.b.a;
        SSLSocketFactory sSLSocketFactory = oouVar.i;
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            try {
                Socket socket = this.c;
                opz opzVar = oouVar.a;
                z = true;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, opzVar.b, opzVar.c, true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            int i = oreVar.b;
            int size = oreVar.a.size();
            while (true) {
                if (i >= size) {
                    opmVar = null;
                    break;
                }
                opmVar = (opm) oreVar.a.get(i);
                if (opmVar.a(sSLSocket)) {
                    oreVar.b = i + 1;
                    break;
                }
                i++;
            }
            if (opmVar != null) {
                int i2 = oreVar.b;
                while (true) {
                    if (i2 >= oreVar.a.size()) {
                        z = false;
                        break;
                    } else if (((opm) oreVar.a.get(i2)).a(sSLSocket)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                oreVar.c = z;
                boolean z2 = oreVar.d;
                if (opmVar.e != null) {
                    enabledCipherSuites = oqs.z(opj.a, sSLSocket.getEnabledCipherSuites(), opmVar.e);
                } else {
                    enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                }
                if (opmVar.f != null) {
                    enabledProtocols = oqs.z(oqs.o, sSLSocket.getEnabledProtocols(), opmVar.f);
                } else {
                    enabledProtocols = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int D = oqs.D(opj.a, supportedCipherSuites);
                if (z2 && D != -1) {
                    enabledCipherSuites = oqs.y(enabledCipherSuites, supportedCipherSuites[D]);
                }
                opl oplVar = new opl(opmVar);
                oplVar.b(enabledCipherSuites);
                oplVar.d(enabledProtocols);
                opm a = oplVar.a();
                String[] strArr = a.f;
                if (strArr != null) {
                    sSLSocket.setEnabledProtocols(strArr);
                }
                String[] strArr2 = a.e;
                if (strArr2 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr2);
                }
                if (opmVar.d) {
                    otu.c.f(sSLSocket, oouVar.a.b, oouVar.e);
                }
                sSLSocket.startHandshake();
                SSLSession session = sSLSocket.getSession();
                opw a2 = opw.a(session);
                if (oouVar.j.verify(oouVar.a.b, session)) {
                    oouVar.k.b(oouVar.a.b, a2.c);
                    if (opmVar.d) {
                        str = otu.c.a(sSLSocket);
                    }
                    this.d = sSLSocket;
                    this.h = oix.e(ovb.g(sSLSocket));
                    this.i = oix.d(ovb.d(this.d));
                    this.e = a2;
                    if (str != null) {
                        if (str.equals(oqe.HTTP_1_0.g)) {
                            oqeVar = oqe.HTTP_1_0;
                        } else if (str.equals(oqe.HTTP_1_1.g)) {
                            oqeVar = oqe.HTTP_1_1;
                        } else if (str.equals(oqe.H2_PRIOR_KNOWLEDGE.g)) {
                            oqeVar = oqe.H2_PRIOR_KNOWLEDGE;
                        } else if (str.equals(oqe.HTTP_2.g)) {
                            oqeVar = oqe.HTTP_2;
                        } else if (str.equals(oqe.SPDY_3.g)) {
                            oqeVar = oqe.SPDY_3;
                        } else if (!str.equals(oqe.QUIC.g)) {
                            throw new IOException("Unexpected protocol: ".concat(str));
                        } else {
                            oqeVar = oqe.QUIC;
                        }
                    } else {
                        oqeVar = oqe.HTTP_1_1;
                    }
                    this.f = oqeVar;
                    if (sSLSocket == null) {
                        return;
                    }
                    otu.c.m(sSLSocket);
                    return;
                }
                X509Certificate x509Certificate = (X509Certificate) a2.c.get(0);
                String str2 = oouVar.a.b;
                String a3 = opi.a(x509Certificate);
                String name = x509Certificate.getSubjectDN().getName();
                List a4 = otz.a(x509Certificate, 7);
                List a5 = otz.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a4.size() + a5.size());
                arrayList.addAll(a4);
                arrayList.addAll(a5);
                throw new SSLPeerUnverifiedException("Hostname " + str2 + " not verified:\n    certificate: " + a3 + "\n    DN: " + name + "\n    subjectAltNames: " + arrayList.toString());
            }
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + oreVar.d + ", modes=" + String.valueOf(oreVar.a) + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        } catch (AssertionError e2) {
            e = e2;
            if (!oqs.u(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                otu.c.m(sSLSocket2);
            }
            oqs.s(sSLSocket2);
            throw th;
        }
    }

    @Override // defpackage.ost
    public final void c(osz oszVar) {
        synchronized (this.a) {
            this.l = oszVar.a();
        }
    }

    @Override // defpackage.ost
    public final void d(otf otfVar) {
        otfVar.j(8);
    }

    public final boolean e(oou oouVar, oqo oqoVar) {
        if (this.m.size() < this.l && !this.j && this.b.a.a(oouVar)) {
            if (oouVar.a.b.equals(this.b.a.a.b)) {
                return true;
            }
            if (this.g != null && oqoVar != null && oqoVar.b.type() == Proxy.Type.DIRECT && this.b.b.type() == Proxy.Type.DIRECT && this.b.c.equals(oqoVar.c) && oqoVar.a.j == otz.a && h(oouVar.a)) {
                try {
                    oouVar.k.b(oouVar.a.b, this.e.c);
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                }
            }
        }
        return false;
    }

    public final boolean f(boolean z) {
        if (this.d.isClosed() || this.d.isInputShutdown() || this.d.isOutputShutdown()) {
            return false;
        }
        osz oszVar = this.g;
        if (oszVar != null) {
            return !oszVar.j();
        }
        if (z) {
            try {
                int soTimeout = this.d.getSoTimeout();
                try {
                    this.d.setSoTimeout(1);
                    return !this.h.C();
                } finally {
                    this.d.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        return this.g != null;
    }

    public final boolean h(opz opzVar) {
        int i = opzVar.c;
        opz opzVar2 = this.b.a.a;
        if (i == opzVar2.c) {
            if (opzVar.b.equals(opzVar2.b)) {
                return true;
            }
            opw opwVar = this.e;
            return opwVar != null && otz.b(opzVar.b, (X509Certificate) opwVar.c.get(0));
        }
        return false;
    }

    public final void i(int i, int i2) {
        Socket createSocket;
        oqo oqoVar = this.b;
        Proxy proxy = oqoVar.b;
        oou oouVar = oqoVar.a;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            createSocket = oouVar.c.createSocket();
        } else {
            createSocket = new Socket(proxy);
        }
        this.c = createSocket;
        InetSocketAddress inetSocketAddress = this.b.c;
        this.c.setSoTimeout(i2);
        try {
            otu.c.g(this.c, this.b.c, i);
            try {
                this.h = oix.e(ovb.g(this.c));
                this.i = oix.d(ovb.d(this.c));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to ".concat(this.b.c.toString()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j() {
        this.d.setSoTimeout(0);
        osr osrVar = new osr();
        Socket socket = this.d;
        String str = this.b.a.a.b;
        out outVar = this.h;
        ous ousVar = this.i;
        osrVar.a = socket;
        osrVar.e = str;
        osrVar.b = outVar;
        osrVar.c = ousVar;
        osrVar.d = this;
        osz oszVar = new osz(osrVar);
        this.g = oszVar;
        oszVar.p.b();
        oszVar.p.f(oszVar.l);
        int c = oszVar.l.c();
        if (c != 65535) {
            oszVar.p.g(0, c - 65535);
        }
        new Thread(oszVar.q).start();
    }

    public final String toString() {
        oqo oqoVar = this.b;
        opz opzVar = oqoVar.a.a;
        String str = opzVar.b;
        int i = opzVar.c;
        String obj = oqoVar.b.toString();
        String obj2 = this.b.c.toString();
        opw opwVar = this.e;
        String obj3 = (opwVar != null ? opwVar.b : "none").toString();
        String valueOf = String.valueOf(this.f);
        return "Connection{" + str + ":" + i + ", proxy=" + obj + " hostAddress=" + obj2 + " cipherSuite=" + obj3 + " protocol=" + valueOf + "}";
    }
}
