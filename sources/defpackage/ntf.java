package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: PG */
/* renamed from: ntf  reason: default package */
/* loaded from: classes2.dex */
public final class ntf {
    public Object a;
    public Object b;
    public Object c;
    private Object d;

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, ntr] */
    public final nth a() {
        jdg.Q(this.a, "description");
        jdg.Q(this.b, "severity");
        jdg.Q(this.d, "timestampNanos");
        jdg.G(true, "at least one of channelRef and subchannelRef must be null");
        Object obj = this.a;
        return new nth((String) obj, (ntg) this.b, ((Long) this.d).longValue(), this.c);
    }

    public final void b(long j) {
        this.d = Long.valueOf(j);
    }

    public final nte c() {
        Object obj = this.a;
        Object obj2 = this.d;
        return new nte((SocketAddress) obj, (InetSocketAddress) obj2, (String) this.c, (String) this.b);
    }

    public final void d(SocketAddress socketAddress) {
        jdg.Q(socketAddress, "proxyAddress");
        this.a = socketAddress;
    }

    public final void e(InetSocketAddress inetSocketAddress) {
        jdg.Q(inetSocketAddress, "targetAddress");
        this.d = inetSocketAddress;
    }
}
