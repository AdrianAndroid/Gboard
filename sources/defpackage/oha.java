package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* renamed from: oha  reason: default package */
/* loaded from: classes2.dex */
final class oha extends ohb {
    private final Method d;
    private final Method e;
    private final Method f;
    private final Class g;
    private final Class h;

    public oha(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = cls;
        this.h = cls2;
    }

    @Override // defpackage.ohb
    public final String a(SSLSocket sSLSocket) {
        try {
            ots otsVar = (ots) Proxy.getInvocationHandler(this.e.invoke(null, sSLSocket));
            int i = ots.c;
            if (otsVar.a) {
                return null;
            }
            String str = otsVar.b;
            if (str != null) {
                return str;
            }
            a.logp(Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
            return null;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // defpackage.ohb
    public final void b(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ohc ohcVar = (ohc) list.get(i);
            if (ohcVar != ohc.HTTP_1_0) {
                arrayList.add(ohcVar.e);
            }
        }
        try {
            this.d.invoke(null, sSLSocket, Proxy.newProxyInstance(ohb.class.getClassLoader(), new Class[]{this.g, this.h}, new ots(arrayList, 1)));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.ohb
    public final int c() {
        return 1;
    }

    @Override // defpackage.ohb
    public final void d(SSLSocket sSLSocket) {
        try {
            this.f.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e) {
            a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "afterHandshake", "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
        }
    }
}
