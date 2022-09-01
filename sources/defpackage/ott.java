package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* renamed from: ott  reason: default package */
/* loaded from: classes2.dex */
final class ott extends otu {
    private final Method a;
    private final Method b;
    private final Method d;
    private final Class e;
    private final Class f;

    public ott(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.a = method;
        this.b = method2;
        this.d = method3;
        this.e = cls;
        this.f = cls2;
    }

    @Override // defpackage.otu
    public final String a(SSLSocket sSLSocket) {
        try {
            ots otsVar = (ots) Proxy.getInvocationHandler(this.b.invoke(null, sSLSocket));
            if (otsVar.a) {
                return null;
            }
            String str = otsVar.b;
            if (str != null) {
                return str;
            }
            otu.c.h(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw oqs.g("unable to get selected protocol", e);
        }
    }

    @Override // defpackage.otu
    public final void f(SSLSocket sSLSocket, String str, List list) {
        try {
            this.a.invoke(null, sSLSocket, Proxy.newProxyInstance(otu.class.getClassLoader(), new Class[]{this.e, this.f}, new ots(o(list), 0)));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw oqs.g("unable to set alpn", e);
        }
    }

    @Override // defpackage.otu
    public final void m(SSLSocket sSLSocket) {
        try {
            this.d.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw oqs.g("unable to remove alpn", e);
        }
    }
}
