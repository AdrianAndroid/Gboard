package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: nhh  reason: default package */
/* loaded from: classes2.dex */
public final class nhh {
    public static final nhh a = new nhh();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final ngs c = new ngs();

    private nhh() {
    }

    public final nho a(Class cls) {
        ngb.i(cls, "messageType");
        nho nhoVar = (nho) this.b.get(cls);
        if (nhoVar == null) {
            ngs ngsVar = this.c;
            nhp.p(cls);
            ngw a2 = ngsVar.a.a(cls);
            if (!a2.b()) {
                if (nfm.class.isAssignableFrom(cls)) {
                    if (ngs.a(a2)) {
                        nhoVar = nhb.m(a2, nhe.b, ngo.b, nhp.c, nfc.a, ngv.b);
                    } else {
                        nhoVar = nhb.m(a2, nhe.b, ngo.b, nhp.c, null, ngv.b);
                    }
                } else if (ngs.a(a2)) {
                    nhoVar = nhb.m(a2, nhe.a, ngo.a, nhp.a, nfc.a(), ngv.a);
                } else {
                    nhoVar = nhb.m(a2, nhe.a, ngo.a, nhp.b, null, ngv.a);
                }
            } else if (!nfm.class.isAssignableFrom(cls)) {
                nhoVar = nhc.c(nhp.a, nfc.a(), a2.a());
            } else {
                nhoVar = nhc.c(nhp.c, nfc.a, a2.a());
            }
            ngb.i(cls, "messageType");
            ngb.i(nhoVar, "schema");
            nho nhoVar2 = (nho) this.b.putIfAbsent(cls, nhoVar);
            if (nhoVar2 != null) {
                return nhoVar2;
            }
        }
        return nhoVar;
    }

    public final nho b(Object obj) {
        return a(obj.getClass());
    }
}
