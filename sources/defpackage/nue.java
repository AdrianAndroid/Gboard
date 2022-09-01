package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: nue  reason: default package */
/* loaded from: classes2.dex */
public final class nue {
    private static final Logger a = Logger.getLogger(nue.class.getName());
    private static nue b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("ode"));
        } catch (ClassNotFoundException e) {
            a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("oiu"));
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        c = Collections.unmodifiableList(arrayList);
    }

    public static synchronized nue b() {
        nue nueVar;
        synchronized (nue.class) {
            if (b == null) {
                List<nud> N = nxp.N(nud.class, c, nud.class.getClassLoader(), new nva(1));
                b = new nue();
                for (nud nudVar : N) {
                    Logger logger = a;
                    Level level = Level.FINE;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Service loader found ");
                    sb.append(nudVar);
                    logger.logp(level, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(nudVar)));
                    nudVar.d();
                    b.c(nudVar);
                }
                b.d();
            }
            nueVar = b;
        }
        return nueVar;
    }

    private final synchronized void c(nud nudVar) {
        nudVar.d();
        jdg.w(true, "isAvailable() returned false");
        this.d.add(nudVar);
    }

    private final synchronized void d() {
        this.e.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            nud nudVar = (nud) it.next();
            String b2 = nudVar.b();
            if (((nud) this.e.get(b2)) == null) {
                this.e.put(b2, nudVar);
            } else {
                nudVar.c();
            }
        }
    }

    public final synchronized nud a(String str) {
        return (nud) this.e.get(str);
    }
}
