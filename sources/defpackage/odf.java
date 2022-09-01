package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: odf  reason: default package */
/* loaded from: classes2.dex */
public final class odf implements nvi {
    public final InetSocketAddress b;
    public static final Logger a = Logger.getLogger(odf.class.getName());
    private static final nxo d = new nxo();
    private static final lgb c = new hvm(3);

    public odf() {
        lgb lgbVar = c;
        nxo nxoVar = d;
        String str = System.getenv("GRPC_PROXY_EXP");
        jdg.u(lgbVar);
        jdg.u(nxoVar);
        if (str == null) {
            this.b = null;
            return;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.b = new InetSocketAddress(split[0], parseInt);
    }

    public static final nvh a(InetSocketAddress inetSocketAddress) {
        String str = null;
        try {
            try {
                URI uri = new URI("https", null, oao.c(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = ProxySelector.getDefault();
                if (proxySelector == null) {
                    a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication b = nxo.b(oao.c(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                ntf a2 = nte.a();
                a2.e(inetSocketAddress);
                a2.d(inetSocketAddress2);
                if (b == null) {
                    return a2.c();
                }
                a2.c = b.getUserName();
                if (b.getPassword() != null) {
                    str = new String(b.getPassword());
                }
                a2.b = str;
                return a2.c();
            } catch (URISyntaxException e) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
                return null;
            }
        } catch (Throwable th) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
