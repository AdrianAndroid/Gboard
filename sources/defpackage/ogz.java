package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* renamed from: ogz  reason: default package */
/* loaded from: classes2.dex */
final class ogz extends ohb {
    private final Method d;
    private final Method e;

    public ogz(Provider provider, Method method, Method method2) {
        super(provider);
        this.d = method;
        this.e = method2;
    }

    @Override // defpackage.ohb
    public final String a(SSLSocket sSLSocket) {
        try {
            return (String) this.e.invoke(sSLSocket, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.ohb
    public final void b(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ohc ohcVar = (ohc) it.next();
            if (ohcVar != ohc.HTTP_1_0) {
                arrayList.add(ohcVar.e);
            }
        }
        try {
            this.d.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.ohb
    public final int c() {
        return 1;
    }
}
