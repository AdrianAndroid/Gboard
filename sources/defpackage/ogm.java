package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* renamed from: ogm  reason: default package */
/* loaded from: classes2.dex */
final class ogm {
    static final List a = Collections.unmodifiableList(Arrays.asList(ohc.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, ogu oguVar) {
        ohc ohcVar;
        jdg.Q(socket, "socket");
        jdg.Q(oguVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        List list = null;
        String[] strArr = oguVar.c != null ? (String[]) ohe.b(String.class, oguVar.c, sSLSocket.getEnabledCipherSuites()) : null;
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        opl oplVar = new opl(oguVar);
        oplVar.i(strArr);
        oplVar.l((String[]) ohe.b(String.class, oguVar.d, enabledProtocols));
        ogu g = oplVar.g();
        sSLSocket.setEnabledProtocols(g.d);
        String[] strArr2 = g.c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        ogk ogkVar = ogk.b;
        if (oguVar.e) {
            list = a;
        }
        String b = ogkVar.b(sSLSocket, str, list);
        List list2 = a;
        if (b.equals(ohc.HTTP_1_0.e)) {
            ohcVar = ohc.HTTP_1_0;
        } else if (b.equals(ohc.HTTP_1_1.e)) {
            ohcVar = ohc.HTTP_1_1;
        } else if (b.equals(ohc.HTTP_2.e)) {
            ohcVar = ohc.HTTP_2;
        } else if (!b.equals(ohc.SPDY_3.e)) {
            throw new IOException("Unexpected protocol: ".concat(b));
        } else {
            ohcVar = ohc.SPDY_3;
        }
        boolean contains = list2.contains(ohcVar);
        String valueOf = String.valueOf(list2);
        jdg.J(contains, "Only " + valueOf + " are supported, but negotiated protocol is %s", b);
        if (ogw.a.verify((!str.startsWith("[") || !str.endsWith("]")) ? str : str.substring(1, str.length() - 1), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(String.valueOf(str)));
    }
}
