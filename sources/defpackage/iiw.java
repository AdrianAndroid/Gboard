package defpackage;

import android.net.TrafficStats;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* compiled from: PG */
/* renamed from: iiw  reason: default package */
/* loaded from: classes.dex */
final class iiw extends SocketFactory {
    private final SocketFactory a;

    public iiw(SocketFactory socketFactory) {
        this.a = socketFactory;
    }

    private static final void a() {
        TrafficStats.setThreadStatsTag(0);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        Socket createSocket = this.a.createSocket();
        a();
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.a.createSocket(str, i);
        a();
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.a.createSocket(str, i, inetAddress, i2);
        a();
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.a.createSocket(inetAddress, i);
        a();
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.a.createSocket(inetAddress, i, inetAddress2, i2);
        a();
        return createSocket;
    }
}
