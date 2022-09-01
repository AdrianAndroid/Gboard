package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: nvb  reason: default package */
/* loaded from: classes2.dex */
public final class nvb {
    private static final Logger c = Logger.getLogger(nvb.class.getName());
    private static nvb d;
    public final nut a = new nuz(this);
    public String b = "unknown";
    private final LinkedHashSet e = new LinkedHashSet();
    private llw f = lrq.b;

    public static synchronized nvb a() {
        nvb nvbVar;
        synchronized (nvb.class) {
            if (d == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("oab"));
                } catch (ClassNotFoundException e) {
                    c.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
                }
                List<nuy> N = nxp.N(nuy.class, Collections.unmodifiableList(arrayList), nuy.class.getClassLoader(), new nva(0));
                if (N.isEmpty()) {
                    c.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                d = new nvb();
                for (nuy nuyVar : N) {
                    Logger logger = c;
                    Level level = Level.FINE;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Service loader found ");
                    sb.append(nuyVar);
                    logger.logp(level, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(nuyVar)));
                    nuyVar.c();
                    d.c(nuyVar);
                }
                d.d();
            }
            nvbVar = d;
        }
        return nvbVar;
    }

    private final synchronized void c(nuy nuyVar) {
        nuyVar.c();
        jdg.w(true, "isAvailable() returned false");
        this.e.add(nuyVar);
    }

    private final synchronized void d() {
        HashMap hashMap = new HashMap();
        Iterator it = this.e.iterator();
        String str = "unknown";
        char c2 = 0;
        while (it.hasNext()) {
            nuy nuyVar = (nuy) it.next();
            String b = nuyVar.b();
            if (((nuy) hashMap.get(b)) == null) {
                hashMap.put(b, nuyVar);
            } else {
                nuyVar.d();
            }
            nuyVar.d();
            if (c2 < 5) {
                nuyVar.d();
                str = nuyVar.b();
            }
            c2 = 5;
        }
        this.f = llw.k(hashMap);
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Map b() {
        return this.f;
    }
}
