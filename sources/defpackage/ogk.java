package defpackage;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* renamed from: ogk  reason: default package */
/* loaded from: classes2.dex */
class ogk {
    public static final ogk b;
    protected final ohb c;
    public static final Logger a = Logger.getLogger(ogk.class.getName());
    private static final ohb d = ohb.b;

    static {
        ogk ogkVar;
        ClassLoader classLoader = ogk.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                ogkVar = new ogk(d);
            }
        }
        ogkVar = new ogj(d);
        b = ogkVar;
    }

    public ogk(ohb ohbVar) {
        jdg.Q(ohbVar, "platform");
        this.c = ohbVar;
    }

    public String a(SSLSocket sSLSocket) {
        return this.c.a(sSLSocket);
    }

    public String b(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String a2 = a(sSLSocket);
            if (a2 != null) {
                return a2;
            }
            String valueOf = String.valueOf(list);
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + valueOf);
        } finally {
            this.c.d(sSLSocket);
        }
    }

    protected void c(SSLSocket sSLSocket, String str, List list) {
        this.c.b(sSLSocket, str, list);
    }
}
