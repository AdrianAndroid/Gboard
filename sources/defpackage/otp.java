package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* renamed from: otp  reason: default package */
/* loaded from: classes2.dex */
final class otp extends otu {
    private final Class a;
    private final dsl b;
    private final dsl d;
    private final dsl e;
    private final dsl f;
    private final dsl g;

    public otp(Class cls, dsl dslVar, dsl dslVar2, dsl dslVar3, dsl dslVar4, byte[] bArr) {
        Method method;
        Method method2;
        Method method3;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            method = cls2.getMethod("get", new Class[0]);
            method3 = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", new Class[0]);
        } catch (Exception unused) {
            method = null;
            method2 = null;
            method3 = null;
        }
        this.g = new dsl(method, method3, method2);
        this.a = cls;
        this.b = dslVar;
        this.d = dslVar2;
        this.e = dslVar3;
        this.f = dslVar4;
    }

    @Override // defpackage.otu
    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        dsl dslVar = this.e;
        if (dslVar == null || !dslVar.m(sSLSocket) || (bArr = (byte[]) this.e.l(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, oqs.i);
    }

    @Override // defpackage.otu
    public final SSLContext b() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    @Override // defpackage.otu
    public final X509TrustManager c(SSLSocketFactory sSLSocketFactory) {
        Object n = n(sSLSocketFactory, this.a, "sslParameters");
        if (n == null) {
            try {
                n = n(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.c(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) n(n, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) n(n, X509TrustManager.class, "trustManager");
    }

    @Override // defpackage.otu
    public final oty d(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new otn(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // defpackage.otu
    public final oua e(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new oto(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.e(x509TrustManager);
        }
    }

    @Override // defpackage.otu
    public final void f(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.b.n(sSLSocket, true);
            this.d.n(sSLSocket, str);
        }
        dsl dslVar = this.f;
        if (dslVar == null || !dslVar.m(sSLSocket)) {
            return;
        }
        Object[] objArr = new Object[1];
        our ourVar = new our();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            oqe oqeVar = (oqe) list.get(i);
            if (oqeVar != oqe.HTTP_1_0) {
                ourVar.N(oqeVar.g.length());
                ourVar.W(oqeVar.g);
            }
        }
        objArr[0] = ourVar.E();
        this.f.l(sSLSocket, objArr);
    }

    @Override // defpackage.otu
    public final void g(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!oqs.u(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    @Override // defpackage.otu
    public final void h(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + "\n" + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    @Override // defpackage.otu
    public final void i(String str, Object obj) {
        dsl dslVar = this.g;
        if (obj != null) {
            try {
                ((Method) dslVar.c).invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        h(5, str, null);
    }

    @Override // defpackage.otu
    public final boolean j(String str) {
        try {
            try {
                Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                try {
                    try {
                        return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(invoke, str)).booleanValue();
                    } catch (NoSuchMethodException unused) {
                        return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(invoke, new Object[0])).booleanValue();
                    }
                } catch (NoSuchMethodException unused2) {
                    return true;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                return true;
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw oqs.g("unable to determine cleartext support", e);
        }
    }

    @Override // defpackage.otu
    public final Object k() {
        dsl dslVar = this.g;
        Object obj = dslVar.a;
        if (obj != null) {
            try {
                Object invoke = ((Method) obj).invoke(null, new Object[0]);
                ((Method) dslVar.b).invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
