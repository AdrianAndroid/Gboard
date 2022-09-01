package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: nfb  reason: default package */
/* loaded from: classes2.dex */
public class nfb {
    static final nfb a = new nfb(null);
    private static volatile boolean b = false;
    private static volatile nfb c;
    private static volatile nfb d;
    private final Map e;

    nfb() {
        this.e = new HashMap();
    }

    public static nfb a() {
        nfb nfbVar = c;
        if (nfbVar == null) {
            synchronized (nfb.class) {
                nfbVar = c;
                if (nfbVar == null) {
                    nfbVar = a;
                    c = nfbVar;
                }
            }
        }
        return nfbVar;
    }

    public ngt c(ngz ngzVar, int i) {
        return (ngt) this.e.get(new nfa(ngzVar, i));
    }

    public nfb(byte[] bArr) {
        this.e = Collections.emptyMap();
    }

    public static nfb b() {
        nfb nfbVar = d;
        if (nfbVar != null) {
            return nfbVar;
        }
        synchronized (nfb.class) {
            nfb nfbVar2 = d;
            if (nfbVar2 != null) {
                return nfbVar2;
            }
            nfb b2 = nfg.b(nfb.class);
            d = b2;
            return b2;
        }
    }
}
