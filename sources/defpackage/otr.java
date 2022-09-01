package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* renamed from: otr  reason: default package */
/* loaded from: classes2.dex */
final class otr extends otu {
    final Method a;
    final Method b;

    public otr(Method method, Method method2) {
        this.a = method;
        this.b = method2;
    }

    @Override // defpackage.otu
    public final String a(SSLSocket sSLSocket) {
        try {
            String str = (String) this.b.invoke(sSLSocket, new Object[0]);
            if (str == null) {
                return null;
            }
            if (!str.equals("")) {
                return str;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw oqs.g("unable to get selected protocols", e);
        }
    }

    @Override // defpackage.otu
    public final X509TrustManager c(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    @Override // defpackage.otu
    public final void f(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List o = o(list);
            this.a.invoke(sSLParameters, o.toArray(new String[o.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw oqs.g("unable to set ssl parameters", e);
        }
    }
}
