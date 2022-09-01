package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* renamed from: opw  reason: default package */
/* loaded from: classes2.dex */
public final class opw {
    public final oqp a;
    public final opj b;
    public final List c;
    public final List d;

    public opw(oqp oqpVar, opj opjVar, List list, List list2) {
        this.a = oqpVar;
        this.b = opjVar;
        this.c = list;
        this.d = list2;
    }

    public static opw a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List emptyList;
        List emptyList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        opj b = opj.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        oqp b2 = oqp.b(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        if (certificateArr != null) {
            emptyList = oqs.m(certificateArr);
        } else {
            emptyList = Collections.emptyList();
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            emptyList2 = oqs.m(localCertificates);
        } else {
            emptyList2 = Collections.emptyList();
        }
        return new opw(b2, b, emptyList, emptyList2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof opw)) {
            return false;
        }
        opw opwVar = (opw) obj;
        return this.a.equals(opwVar.a) && this.b.equals(opwVar.b) && this.c.equals(opwVar.c) && this.d.equals(opwVar.d);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
