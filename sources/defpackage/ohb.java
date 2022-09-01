package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* renamed from: ohb  reason: default package */
/* loaded from: classes2.dex */
public class ohb {
    public final Provider c;
    public static final Logger a = Logger.getLogger(ohb.class.getName());
    private static final String[] d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public static final ohb b = f();

    public ohb(Provider provider) {
        this.c = provider;
    }

    public static byte[] e(List list) {
        our ourVar = new our();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ohc ohcVar = (ohc) list.get(i);
            if (ohcVar != ohc.HTTP_1_0) {
                ourVar.N(ohcVar.e.length());
                ourVar.W(ohcVar.e);
            }
        }
        return ourVar.E();
    }

    private static ohb f() {
        Provider provider;
        int i;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            if (i2 < length) {
                Provider provider2 = providers[i2];
                String[] strArr = d;
                int length2 = strArr.length;
                for (int i3 = 0; i3 < 5; i3++) {
                    String str = strArr[i3];
                    if (str.equals(provider2.getClass().getName())) {
                        a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                        provider = provider2;
                        break loop0;
                    }
                }
                i2++;
            } else {
                a.logp(Level.WARNING, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Unable to find Conscrypt");
                provider = null;
                break;
            }
        }
        if (provider != null) {
            mnl mnlVar = new mnl((Class) null, "setUseSessionTickets", Boolean.TYPE);
            mnl mnlVar2 = new mnl((Class) null, "setHostname", String.class);
            mnl mnlVar3 = new mnl(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            mnl mnlVar4 = new mnl((Class) null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    ohb.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e);
                    try {
                        ohb.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        i = 2;
                    } catch (ClassNotFoundException e2) {
                        a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e2);
                        i = 3;
                    }
                }
            }
            i = 1;
            return new ogy(mnlVar, mnlVar2, mnlVar3, mnlVar4, provider, i, null, null);
        }
        try {
            Provider provider3 = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new ogx(0))).invoke(sSLContext.createSSLEngine(), new Object[0]);
                    return new ogz(provider3, (Method) AccessController.doPrivileged(new ogx(2)), (Method) AccessController.doPrivileged(new ogx(3)));
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new oha(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                return new ohb(provider3);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void b(SSLSocket sSLSocket, String str, List list) {
    }

    public int c() {
        return 3;
    }

    public void d(SSLSocket sSLSocket) {
    }
}
