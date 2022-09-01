package defpackage;

import java.net.SocketAddress;

/* compiled from: PG */
/* renamed from: nws  reason: default package */
/* loaded from: classes2.dex */
public final class nws extends SocketAddress {
    private static final long serialVersionUID = 0;
    private final int a;

    public nws(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nws) && this.a == ((nws) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return "BoundClientAddress[" + i + "]";
    }
}
