package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* compiled from: PG */
/* renamed from: otq  reason: default package */
/* loaded from: classes2.dex */
public final class otq extends otu {
    private static final Provider p() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // defpackage.otu
    public final String a(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.otu
    public final SSLContext b() {
        try {
            return SSLContext.getInstance("TLSv1.3", p());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", p());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Override // defpackage.otu
    public final X509TrustManager c(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.c(sSLSocketFactory);
        }
        try {
            Object n = n(sSLSocketFactory, Object.class, "sslParameters");
            if (n == null) {
                return null;
            }
            return (X509TrustManager) n(n, X509TrustManager.class, "x509TrustManager");
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    @Override // defpackage.otu
    public final void f(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) otu.o(list).toArray(new String[0]));
        }
    }

    @Override // defpackage.otu
    public final void l(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
