package defpackage;

import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* renamed from: otu  reason: default package */
/* loaded from: classes2.dex */
public class otu {
    private static final Logger a;
    public static final otu c;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
        if (r0 != null) goto L37;
     */
    static {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otu.<clinit>():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object n(Object obj, Class cls, String str) {
        Object n;
        for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null && cls.isInstance(obj2)) {
                    return cls.cast(obj2);
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
            }
        }
        if (str.equals("delegate") || (n = n(obj, Object.class, "delegate")) == null) {
            return null;
        }
        return n(n, cls, str);
    }

    public static List o(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            oqe oqeVar = (oqe) list.get(i);
            if (oqeVar != oqe.HTTP_1_0) {
                arrayList.add(oqeVar.g);
            }
        }
        return arrayList;
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public SSLContext b() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public X509TrustManager c(SSLSocketFactory sSLSocketFactory) {
        try {
            Object n = n(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (n != null) {
                return (X509TrustManager) n(n, X509TrustManager.class, "trustManager");
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public oty d(X509TrustManager x509TrustManager) {
        return new otw(e(x509TrustManager));
    }

    public oua e(X509TrustManager x509TrustManager) {
        return new otx(x509TrustManager.getAcceptedIssuers());
    }

    public void f(SSLSocket sSLSocket, String str, List list) {
    }

    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void h(int i, String str, Throwable th) {
        a.logp(i == 5 ? Level.WARNING : Level.INFO, "okhttp3.internal.platform.Platform", "log", str, th);
    }

    public void i(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        h(5, str, (Throwable) obj);
    }

    public boolean j(String str) {
        return true;
    }

    public Object k() {
        if (a.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void l(SSLSocketFactory sSLSocketFactory) {
    }

    public void m(SSLSocket sSLSocket) {
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
