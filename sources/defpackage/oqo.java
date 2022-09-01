package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: PG */
/* renamed from: oqo  reason: default package */
/* loaded from: classes2.dex */
public final class oqo {
    public final oou a;
    public final Proxy b;
    public final InetSocketAddress c;

    public oqo(oou oouVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (proxy != null) {
            if (inetSocketAddress != null) {
                this.a = oouVar;
                this.b = proxy;
                this.c = inetSocketAddress;
                return;
            }
            throw new NullPointerException("inetSocketAddress == null");
        }
        throw new NullPointerException("proxy == null");
    }

    public final boolean a() {
        return this.a.i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oqo) {
            oqo oqoVar = (oqo) obj;
            return oqoVar.a.equals(this.a) && oqoVar.b.equals(this.b) && oqoVar.c.equals(this.c);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String obj = this.c.toString();
        return "Route{" + obj + "}";
    }
}
