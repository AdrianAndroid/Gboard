package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: PG */
/* renamed from: otn  reason: default package */
/* loaded from: classes2.dex */
final class otn extends oty {
    private final Object a;
    private final Method b;

    public otn(Object obj, Method method) {
        this.a = obj;
        this.b = method;
    }

    @Override // defpackage.oty
    public final List a(List list, String str) {
        try {
            return (List) this.b.invoke(this.a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof otn;
    }

    public final int hashCode() {
        return 0;
    }
}
