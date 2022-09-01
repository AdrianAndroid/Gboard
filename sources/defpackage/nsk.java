package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: nsk  reason: default package */
/* loaded from: classes2.dex */
public final class nsk {
    public static final nsk a = new nsk(new nsh(1), nsh.a);
    private final ConcurrentMap b = new ConcurrentHashMap();

    public nsk(nsj... nsjVarArr) {
        for (nsj nsjVar : nsjVarArr) {
            this.b.put(nsjVar.b(), nsjVar);
        }
    }

    public static nsk a() {
        return new nsk(new nsj[0]);
    }
}
