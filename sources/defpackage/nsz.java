package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: nsz  reason: default package */
/* loaded from: classes2.dex */
public final class nsz {
    public static final nrx a = nrx.a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List b;
    public final nry c;
    private final int d;

    public nsz(SocketAddress socketAddress) {
        this(Collections.singletonList(socketAddress), nry.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nsz)) {
            return false;
        }
        nsz nszVar = (nsz) obj;
        if (this.b.size() != nszVar.b.size()) {
            return false;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (!((SocketAddress) this.b.get(i)).equals(nszVar.b.get(i))) {
                return false;
            }
        }
        return this.c.equals(nszVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "[" + this.b + "/" + this.c + "]";
    }

    public nsz(List list, nry nryVar) {
        jdg.w(!list.isEmpty(), "addrs is empty");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.b = unmodifiableList;
        jdg.Q(nryVar, "attrs");
        this.c = nryVar;
        this.d = unmodifiableList.hashCode();
    }
}
