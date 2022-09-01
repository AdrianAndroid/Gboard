package defpackage;

import java.net.SocketAddress;
import java.net.URI;

/* compiled from: PG */
/* renamed from: oci  reason: default package */
/* loaded from: classes2.dex */
final class oci extends nut {
    final SocketAddress a;
    final String b;

    public oci(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
    }

    @Override // defpackage.nut
    public final nux a(URI uri, nur nurVar) {
        return new och(this);
    }

    @Override // defpackage.nut
    public final String b() {
        return "directaddress";
    }
}
