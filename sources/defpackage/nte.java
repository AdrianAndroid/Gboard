package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: nte  reason: default package */
/* loaded from: classes2.dex */
public final class nte extends nvh {
    private static final long serialVersionUID = 0;
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;

    public nte(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        jdg.Q(socketAddress, "proxyAddress");
        jdg.Q(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            jdg.J(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }

    public static ntf a() {
        return new ntf();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nte)) {
            return false;
        }
        nte nteVar = (nte) obj;
        return jdg.W(this.a, nteVar.a) && jdg.W(this.b, nteVar.b) && jdg.W(this.c, nteVar.c) && jdg.W(this.d, nteVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("proxyAddr", this.a);
        S.b("targetAddr", this.b);
        S.b("username", this.c);
        S.h("hasPassword", this.d != null);
        return S.toString();
    }
}
