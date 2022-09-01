package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* renamed from: oou  reason: default package */
/* loaded from: classes2.dex */
public final class oou {
    public final opz a;
    public final opt b;
    public final SocketFactory c;
    final oow d;
    public final List e;
    public final List f;
    public final ProxySelector g;
    public final Proxy h;
    public final SSLSocketFactory i;
    public final HostnameVerifier j;
    public final opi k;

    public oou(String str, int i, opt optVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, opi opiVar, oow oowVar, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        opy opyVar = new opy();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            opyVar.a = "http";
        } else if (!str2.equalsIgnoreCase("https")) {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        } else {
            opyVar.a = "https";
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String b = opy.b(str, 0, str.length());
        if (b != null) {
            opyVar.d = b;
            if (i <= 0) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            opyVar.e = i;
            this.a = opyVar.c();
            this.b = optVar;
            if (socketFactory != null) {
                this.c = socketFactory;
                this.d = oowVar;
                if (list == null) {
                    throw new NullPointerException("protocols == null");
                }
                this.e = oqs.l(list);
                if (list2 == null) {
                    throw new NullPointerException("connectionSpecs == null");
                }
                this.f = oqs.l(list2);
                if (proxySelector != null) {
                    this.g = proxySelector;
                    this.h = proxy;
                    this.i = sSLSocketFactory;
                    this.j = hostnameVerifier;
                    this.k = opiVar;
                    return;
                }
                throw new NullPointerException("proxySelector == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public final boolean a(oou oouVar) {
        return this.b.equals(oouVar.b) && this.d.equals(oouVar.d) && this.e.equals(oouVar.e) && this.f.equals(oouVar.f) && this.g.equals(oouVar.g) && oqs.t(this.h, oouVar.h) && oqs.t(this.i, oouVar.i) && oqs.t(this.j, oouVar.j) && oqs.t(this.k, oouVar.k) && this.a.c == oouVar.a.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oou) {
            oou oouVar = (oou) obj;
            return this.a.equals(oouVar.a) && a(oouVar);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        Proxy proxy = this.h;
        int i = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        opi opiVar = this.k;
        if (opiVar != null) {
            i = opiVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.a.b);
        sb.append(":");
        sb.append(this.a.c);
        if (this.h != null) {
            sb.append(", proxy=");
            sb.append(this.h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.g);
        }
        sb.append("}");
        return sb.toString();
    }
}
